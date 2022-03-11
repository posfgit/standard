dank-map
--------

Execute a function `fn` for each `key` or `index` in `obj`. 
Values returned from `fn` are appended to an array which is 
returned by the map function.

api
---

map(obj, fn, squash);

* _obj_ - the object for which `fn` will be called for each `key` or `index`.
	This can be an Array, Object, String, Number or whatever.
* _fn_  - callback function which is called for each `key` or `index`.
	Review the callback function section below.
* _squash_ - when true, don't push undefined or null values on to the final
	array.

the callback
------------

When `fn` is called it is passed the following arguments:

* _key_ - the `key`, `index`, or attribute name from the object which is being
	mapped.
* _value_ - the value of the current key, index or attribute.
* _emit_ *function* - call this `function` passing it a value to explicitly push
	a new value onto the final array.
* _end_ *function* - call this `function` to stop iterating over `obj`.

Any value returned from the callback function will be appended to the final array.
The only excpetion to this would be if `sqash` is set to true in which case any
undefined or null return value would NOT be appended to the final array.

example
-------

```javascript
a = [40,50,2,1];

b = map(a, function (key, val, emit, end) {
     //key is the index in the array

     if (val > 10) {
             return val; 
     }
});

// b = [40, 50, null, null];

//this time we will sqash falsy values
c = map(a, function (key, val, emit, end) {
     //key is the index in the array

     if (val > 10) {
             return val; 
     }
}, true); //turn on squash

// c = [40, 50]; 

//map over an object;

d = { customer_id : 1, name : 'Willy Wonka' };

e = map(d, function (key, val, emit, end) {
	emit(val);

	return key;
});

//e = [1, 'customer_id', 'Willy Wonka', 'name'];
```

These examples aren't that great. I typically use this function
to map over arrays of objects that come from a database query.

license
----------

### The MIT License (MIT)


Copyright (c) 2012 Daniel L. VerWeire

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
