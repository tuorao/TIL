const http = require('http');
const os = require('os');

console.log("start");

var handler = function(request, response) {
    console.log("recieve from " + request.connection.remoteAddress);  
    response.writeHead(200);
    response.end("hit " + os.hostname() + "\n"); 
}

var www = http.createServer(handler);
wwww.listen(8080);