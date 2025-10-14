package org.example.project.data.core.storage

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import org.example.project.data.core.iTemplates.BaseKey
import org.example.project.data.core.iTemplates.StorageKey

class SplitDataStoreStorage(
    private val dataStore: DataStore<Preferences>
): StoragePreference{

    //TODO("Can change the name later, just want a test version")
    override fun <K : BaseKey<T>, T> getAsFlow(key: K): Flow<T?> {
        return dataStore.data.map{
            preferences ->
            preferences[getDataStoreKey(key)] ?: key.defaultValue
        }
    }

    override suspend fun <K : BaseKey<T>, T> get(key: K): T? {
        return getAsFlow(key).firstOrNull() ?: key.defaultValue
    }

    override suspend fun <K : BaseKey<T>, T> writeValue(key: K, value: T?) {
        dataStore.edit {
                preferences ->
            val dataStoreKey = getDataStoreKey(key)
            if (value == null){
                preferences.remove(dataStoreKey)
            }else{
                preferences[dataStoreKey] = value
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun<T> getDataStoreKey(key: BaseKey<T>): Preferences.Key<T>{
        return when (key){
            is StorageKey.Key.BooleanKey -> booleanPreferencesKey(key.name)
            is StorageKey.Key.DoubleKey -> doublePreferencesKey(key.name)
            is StorageKey.Key.FloatKey -> floatPreferencesKey(key.name)
            is StorageKey.Key.IntKey -> intPreferencesKey(key.name)
            is StorageKey.Key.LongKey -> longPreferencesKey(key.name)
            is StorageKey.Key.StringKey -> stringPreferencesKey(key.name)
            else -> {throw IllegalArgumentException("Invalid Key Type Found")}
        } as Preferences.Key<T>
        TODO("Look at if it's possible to make this without the supression")
    }
}