/**
 * This JavaScript environment contains several variables and utilities to help you route New Relic events:
 *
 * event: This will be a JavaScript object based on the JSON string sent by the New Relic alert webhook. You can
 * access it by simply calling event.alert_policy_name, event.message, or any other field covered in the webhook docs.
 *
 * utils: Several convenience functions, including...
 *
 *  - string : encodeBase64(string)
 *  - string : decodeBase64(string)
 *  - string : md5(string)
 *  - string : uuid()
 *  - string : sha1(string)
 *  - string : sha256(string)
 *
 * console: Similar to the console object you might find in Chrome Dev Tools. You an use this to do logging of strings
 * and JavaScript objects. Each log function can take 1 or more arguments. They are:
 *
 *  - void : log(obj, obj...)
 *  - void : info(obj, obj...)
 *  - void : warn(obj, obj...)
 *  - void : error(obj, obj...)
 *  - void : debug(obj, obj...)
 *
 *  This is very useful for debugging JavaScript objects directly, such as the event itself. For example, you can do:
 *
 *      console.log("Saw event", event);
 *
 *  And that will print out the entire event contents to the log.
 *
 * http: An HTTP client library that can make GET, HEAD, PUT, POST, and DELETE API calls capable. The functions are:
 *
 *  - void : get(url, headers (optional), callback)
 *  - void : head(url, headers (optional), callback)
 *  - void : put(url, data, headers (optional), callback)
 *  - void : post(url, data, headers (optional), callback)
 *  - void : del(url, headers (optional), callback)
 *
 *  When passing in data to put and post, it can be either a plain text string or a JavaScript object. If it's an
 *  object it will be converted to JSON format and the application/json Content-Type header will automatically be
 *  added to the request.
 *
 *  The callback function in all cases is of the form function(data, status, headers), where data is the string value
 *  of the HTTP response body (if it exists), status is the HTTP status code (ex: 200), and headers is a JSON structure
 *  containing the response headers of the request.
 */

console.log("Got event from policy", event);

var base64 = utils.encodeBase64("some value");

event.foo = "bar";

http.post("http://some-url/foo",
    event,
    {
        "Some-Header": base64
    },
    function (data, status, headers) {
        console.log("Got back " + status + " when submitting request");
    });