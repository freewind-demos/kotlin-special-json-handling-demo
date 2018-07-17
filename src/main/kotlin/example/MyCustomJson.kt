@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package example

// The code is mainly copied from `kotlin.js.json`
external interface MyJson {
    operator fun get(propertyName: String): Any?
    operator fun set(propertyName: String, value: Any?)
}

fun myJson(): MyJson = js("({})") as MyJson