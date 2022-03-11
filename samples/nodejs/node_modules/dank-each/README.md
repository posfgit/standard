dank-each
--------

Execute a function `fn` for each `key` or `index` in `obj`.

api
---

each(obj, fn);

* _obj_ - the object for which `fn` will be called for each `key` or `index`.
	This can be an Array, Object, String, Number, Range or whatever.
* _fn_  - callback function which is called for each `key` or `index`.
	Review the callback function section below.

the callback
------------

When `fn` is called it is passed the following arguments:

* _key_ - the `key`, `index`, or attribute name from the object 
* _value_ - the value of the current key, index or attribute.
* _end_ *function* - call this `function` to stop iterating over `obj`.

example
-------

```javascript
a = [40,50,2,1];

each(a, function (key, val, end) {
     //key is the index in the array

     if (val > 10) {
             return val;
     }
});

/*
 * Ranges
 */

each(each.range(1, 10, 2), function (i) {
	//this function will be called based on this for loop
	//for (var x = 1; x <= 10; x += 2)
});
```

license
----------

### The MIT License (MIT)


Copyright (c) 2017 Daniel L. VerWeire

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
