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
import org.example.project.data.core.storage.interfaces.BaseKey
import org.example.project.data.core.storage.interfaces.Readable
import org.example.project.data.core.storage.interfaces.Writable

class SplitDataStoreStorage(
    private val dataStore: DataStore<Preferences>
): StoragePreference{
    //TODO("Can change the name later, just want a test version")
    override fun <T> getAsFlow(key: BaseKey.Key<T>): Flow<T?> {
        return dataStore.data.map{
            preferences ->
            preferences[getDataStoreKey(key)] ?: key.defaultValue
        }
    }

    override suspend fun <T> get(key: BaseKey.Key<T>): T? {
        return getAsFlow(key).firstOrNull() ?: key.defaultValue
    }

    override suspend fun <T> writeValue(key: BaseKey.Key<T>, value: T?) {
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
    private fun<T> getDataStoreKey(key: BaseKey.Key<T>): Preferences.Key<T>{
        return when (key){
            is BaseKey.Key.BooleanKey -> booleanPreferencesKey(key.name)
            is BaseKey.Key.DoubleKey -> doublePreferencesKey(key.name)
            is BaseKey.Key.FloatKey -> floatPreferencesKey(key.name)
            is BaseKey.Key.IntKey -> intPreferencesKey(key.name)
            is BaseKey.Key.LongKey -> longPreferencesKey(key.name)
            is BaseKey.Key.StringKey -> stringPreferencesKey(key.name)
        } as Preferences.Key<T>
        TODO("Look at if it's possible to make this without the supression")
    }
}