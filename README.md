# Lyft-Demo

This is springboot application with rest API along with swagger to test.
After starting springboot application, you can access the API at localhost:8080/swagger-ui.html#/


Accept a POST request to the route “/test”, which accepts one argument “string_to_cut”
Return a JSON object with the key “return_string” and a string containing every third letter from the original string
(e.g.) If you POST {"string_to_cut": "iamyourlyftdriver"}, it will return: {"return_string": "muydv"}.

