Kotlin Special Json Handling Demo
=================================

Kotlin-js provided a `kotlin.js.json` function and `Json` interface, and seems it has some special handling when generating JS code.

```
import kotlin.js.json

val obj = json()
obj["key1"] = "value1"
obj.set("key2", "value2")
console.log(obj)
```

will generate:

```
function jsonInLanguage() {
  var obj = json([]);
  obj['key1'] = 'value1';
  obj['key2'] = 'value2';
  console.log(obj);
}
```

Notice the `obj['key1'] = 'value1'` is correct JavaScript syntax for JS objects.

But if I copy the code from `kotlin.js.json` to my custom file, and write the almost the same code:

```
val obj = myJson()
obj["key1"] = "value1"
obj.set("key2", "value2")
console.log(obj)
```

It generates:

```
function myCustomJson() {
  var obj = myJson();
  obj.set('key1', 'value1');
  obj.set('key2', 'value2');
  console.log(obj);
}
```

The generated `obj.set('key1', 'value1')` is different, and there is no `set` method for JavaScript object.

That means, we can't define our code `Json` object, we have to reuse the provided one.

Run
---

```
./gradlew compileKotlin2Js
npm install
open index.html
```

You will see the output(and error) from browsers' console.


