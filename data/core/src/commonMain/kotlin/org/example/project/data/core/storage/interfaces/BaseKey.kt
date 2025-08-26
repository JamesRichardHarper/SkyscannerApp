package org.example.project.data.core.storage.interfaces

interface BaseKey{
    sealed class Key<T>(
        val name: String,
        val defaultValue: T?
    ){
        open class StringKey(name: String, defaultValue: String?): Key<String>(name, defaultValue)
        open class IntKey(name: String, defaultValue: Int?): Key<Int>(name, defaultValue)
        open class LongKey(name: String, defaultValue: Long?): Key<Long>(name, defaultValue)
        open class FloatKey(name: String, defaultValue: Float?): Key<Float>(name, defaultValue)
        open class DoubleKey(name: String, defaultValue: Double?): Key<Double>(name, defaultValue)
        open class BooleanKey(name: String, defaultValue: Boolean?): Key<Boolean>(name, defaultValue)
    }
}