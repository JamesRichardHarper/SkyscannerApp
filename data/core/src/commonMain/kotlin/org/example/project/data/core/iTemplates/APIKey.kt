package org.example.project.data.core.iTemplates

interface APIKey{
    sealed class Key<T>(
        name: String,
        defaultValue: T?
    ): BaseKey<T>(name, defaultValue) {
        open class StringKey(name: String, defaultValue: String?): Key<String>(name, defaultValue)
        open class IntKey(name: String, defaultValue: Int?): StorageKey.Key<Int>(name, defaultValue)
    }
}