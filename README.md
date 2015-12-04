## PlayThriftStarterTemplate
This is a Scala Playframework starter template integrated with Apache Thrift and ReactJS library. The environment is built on top of JDK 1.8, Scala 2.11, Play 2.4.4, Apache Thrift 0.9.2, ReactJS 0.13.3

## Interface Definition

First install the Thrift compiler. Next update the interface defined in the "tutorial.thrift" under thrift folder.
This file is an interface definition made up of thrift types and Services. The services defined in 
this file are implemented by the server and are called by clients.

## Building Clients

The Thrift compiler is used to generate your Thrift File into source code which 
is used by the different client libraries and the server you write. 
To generate the source from a thrift file you need under the thrift folder and run command:

    thrift --gen java tutorial.thrift
	
Note that the server code is automatically generated by SBT using Scrooge from Twitter.
	
## Finagle

Finagle is an extensible RPC system for the JVM from Twitter. Finagle implements uniform 
client and server APIs for several protocols and can be used to construct high-concurrency servers.

<https://twitter.github.io/finagle/>

For documentation, see
[user guide](https://twitter.github.io/finagle/guide/) and
[API documentation](https://twitter.github.io/finagle/docs/#com.twitter.finagle.package)

