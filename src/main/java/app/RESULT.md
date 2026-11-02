Microsoft Windows [Version 10.0.26300.9818]
(c) Корпорация Майкрософт (Microsoft Corporation). Все права защищены.

C:\Users\user\IdeaProjects\nordcodes-aqa-test>mvn clean test
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< me.kislyuk.aqa:NordCodesTest >--------------------
[INFO] Building NordCodesTest 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ NordCodesTest ---
[INFO] Deleting C:\Users\user\IdeaProjects\nordcodes-aqa-test\target
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ NordCodesTest ---
[INFO] skip non existing resourceDirectory C:\Users\user\IdeaProjects\nordcodes-aqa-test\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ NordCodesTest ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ NordCodesTest ---
[INFO] Copying 1 resource from src\test\resources to target\test-classes
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ NordCodesTest ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 8 source files with javac [debug target 21] to target\test-classes
[INFO]
[INFO] --- surefire:3.5.1:test (default-test) @ NordCodesTest ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running me.kislyuk.aqa.specs.ActionTests
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=BC0885F5283149CE9F5296FE3247EC6A
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:32 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=BC0885F5283149CE9F5296FE3247EC6A
action=ACTION
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:32 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=BC0885F5283149CE9F5296FE3247EC6A
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:32 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=5347BDD8ADA841AC8CEF383CC8093C9E
action=ACTION
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '5347BDD8ADA841AC8CEF383CC8093C9E' not found"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=5347BDD8ADA841AC8CEF383CC8093C9E
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '5347BDD8ADA841AC8CEF383CC8093C9E' not found"
}
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.344 s -- in me.kislyuk.aqa.specs.ActionTests
[INFO] Running me.kislyuk.aqa.specs.LoginTests
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=1B3EE10AD43248E3B1D95C197523DCA9
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=1B3EE10AD43248E3B1D95C197523DCA9
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 500
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Connection: close

{
"result": "ERROR",
"message": "Internal Server Error"
}
HTTP/1.1 500
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Connection: close

{
"result": "ERROR",
"message": "Internal Server Error"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=1B3EE10AD43248E3B1D95C197523DCA9
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=1B3EE10AD43248E3B1D95C197523DCA9
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '1B3EE10AD43248E3B1D95C197523DCA9' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '1B3EE10AD43248E3B1D95C197523DCA9' not found"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=5D618A15FD68402AB93E019D514908CB
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=5D618A15FD68402AB93E019D514908CB
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=5D618A15FD68402AB93E019D514908CB
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=5D618A15FD68402AB93E019D514908CB
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.228 s -- in me.kislyuk.aqa.specs.LoginTests
[INFO] Running me.kislyuk.aqa.specs.LogoutTests
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
HTTP/1.1 200
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "OK"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=ACTION
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=ACTION
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=ACTION
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '75799427F53A4703911AE98C8070CE5F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '75799427F53A4703911AE98C8070CE5F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '75799427F53A4703911AE98C8070CE5F' not found"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=75799427F53A4703911AE98C8070CE5F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '75799427F53A4703911AE98C8070CE5F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '75799427F53A4703911AE98C8070CE5F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '75799427F53A4703911AE98C8070CE5F' not found"
}
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.213 s -- in me.kislyuk.aqa.specs.LogoutTests
[INFO] Running me.kislyuk.aqa.specs.SecurityTests
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=12345ABC
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=12345ABC
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=12345ABC
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=12345ABC
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 400
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Connection: close

{
"result": "ERROR",
"message": "token: должно соответствовать \"^[0-9A-F]{32}$\""
}
HTTP/1.1 400
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Connection: close

{
"result": "ERROR",
"message": "token: должно соответствовать \"^[0-9A-F]{32}$\""
}
HTTP/1.1 400
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Connection: close

{
"result": "ERROR",
"message": "token: должно соответствовать \"^[0-9A-F]{32}$\""
}
HTTP/1.1 400
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:33 GMT
Connection: close

{
"result": "ERROR",
"message": "token: должно соответствовать \"^[0-9A-F]{32}$\""
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=wrong-key
Accept=*/*
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=wrong-key
Accept=*/*
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=wrong-key
Accept=*/*
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGIN
Path params:    <none>
Headers:                X-Api-Key=wrong-key
Accept=*/*
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 401
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Content-Length: 57
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Missing or invalid API Key"
}
HTTP/1.1 401
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Content-Length: 57
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Missing or invalid API Key"
}
HTTP/1.1 401
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Content-Length: 57
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Missing or invalid API Key"
}
HTTP/1.1 401
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Content-Length: 57
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Missing or invalid API Key"
}
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
Request method: POST
Request URI:    http://localhost:8080/endpoint
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    token=625A93C13B6E4DAABDD5735072745C8F
action=LOGOUT
Path params:    <none>
Headers:                X-Api-Key=qazWSXedc
Accept=application/json
Content-Type=application/x-www-form-urlencoded; charset=ISO-8859-1
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '625A93C13B6E4DAABDD5735072745C8F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '625A93C13B6E4DAABDD5735072745C8F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '625A93C13B6E4DAABDD5735072745C8F' not found"
}
HTTP/1.1 403
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
X-Content-Type-Options: nosniff
X-XSS-Protection: 0
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: application/json
Transfer-Encoding: chunked
Date: Mon, 02 Nov 2026 07:29:34 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
"result": "ERROR",
"message": "Token '625A93C13B6E4DAABDD5735072745C8F' not found"
}
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.965 s -- in me.kislyuk.aqa.specs.SecurityTests
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.084 s
[INFO] Finished at: 2026-11-02T10:29:34+03:00
[INFO] ------------------------------------------------------------------------

C:\Users\user\IdeaProjects\nordcodes-aqa-test>  
