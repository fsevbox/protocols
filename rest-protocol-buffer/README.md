# Protocol buffer over HTTP

Running the test will send a HTTP request using protobuff.

If proto file is changed:

* protocol buffer compiler should be installed locally
> sudo apt-get install protobuf-compiler

* compile the proto file from the project root
> protoc --java_out=src/main/java  src/main/resources/api.proto
 
