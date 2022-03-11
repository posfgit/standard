/* author - Daniel VerWeire <dverweire@gmail.com>
 *
 * each - execute function fn for each key in obj.
 *
 * @param {Object} obj
 * @param {Function} fn
 *
 * obj can be an Array or an object.
 * fn is a callback function which should be used as described below
 *
 * When fn is called it is passed the following arguments:
 *
 * @arg {String} key
 * @arg {Object} value
 * @arg {Function} end
 *
 * Example:
 *
 * a = [40,50,2,1];
 *
 * each(a, function (key, val, end) {
 *	//key is the index in the array
 *
 * 	if (val > 10) {
 *		//do something
 * 	}
 * });
 *
 * Ranges:
 *
 * each(each.range(1, 20), function (i) {
 * 	//do something
 * });
 */

module.exports = each

each.range = function (start, stop, step) {
	return new Range(start, stop, step)
}


function each (obj, fn) {
	var key
		, keys
		, x
		, doBreak = false
		, fake
		;

	if (obj instanceof Range) {
		fake = {};

		for (key = obj.start; key <= obj.stop; key += obj.step) {
			doCall(key, fake)

			if (doBreak) {
				break;
			}
		}
	}
	else if (Array.isArray(obj)) {
		for (key = 0; key < obj.length; key++) {
			doCall(key, obj)

			if (doBreak) {
				break;
			}
		}
	}
	else if (obj !== null && typeof(obj) === 'object') {
		keys = Object.keys(obj);

		for (x = 0; x < keys.length; x++) {
			doCall(keys[x], obj);

			if (doBreak) {
				break;
			}
		}
	}
	else if (typeof(obj) === 'string') {
		for (key in obj) {
			doCall(key, obj);

			if (doBreak) {
				break;
			}
		}
	}

	function doCall(key, obj) {
		fn.call(
			  obj[key]
			, key
			, obj[key]
			, end
		);
	}

	function end() {
		doBreak = true;
	}
}

function Range (start, stop, step) {
	this.start = start || 0;
	this.stop = stop || 0;
	this.step = step || 1;
}
