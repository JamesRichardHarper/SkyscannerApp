package org.example.project.data.core.iTemplates

interface APIKey{
    sealed class Key<T>(
        name: String,
        defaultValue: T?
    ): BaseKey<T>(name, defaultValue) {
        open class AllKey(name: String, defaultValue: String?): Key<String>(name, defaultValue)
        open class IDKey(name: String, defaultValue: Int?): StorageKey.Key<Int>(name, defaultValue)
        open class SearchKey(name: String, defaultValue: String?): StorageKey.Key<String>(name, defaultValue)
        open class SchemaKey(name: String, defaultValue: String?): StorageKey.Key<String>(name, defaultValue)
    }
}