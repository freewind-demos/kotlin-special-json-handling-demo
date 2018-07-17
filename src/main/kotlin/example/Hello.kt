package example

import kotlin.js.json

fun main(args: Array<String>) {
    jsonInLanguage()
    myCustomJson()
}

fun jsonInLanguage() {
    console.log("----------- jsonInLanguage ------------")
    val obj = json()
    obj["key1"] = "value1"
    obj.set("key2", "value2")
    console.log(obj)
}

fun myCustomJson() {
    console.log("----------- myCustomJson ------------")
    val obj = myJson()
    obj["key1"] = "value1"
    obj.set("key2", "value2")
    console.log(obj)
}
