### MediaMiser's pull model

[![Build Status](https://travis-ci.org/MediaMiser/pull-model.svg?branch=master)](https://travis-ci.org/MediaMiser/pull-model)
[![Coverage Status](https://coveralls.io/repos/MediaMiser/pull-model/badge.png)](https://coveralls.io/r/MediaMiser/pull-model)

MediaMiser's pull models are [Jersey 2.x](https://jersey.java.net/) domain objects and type adapters used to serialize/deserialize messages to/from MediaMiser's RESTful Pull APIs.  This library is used in the [pull model](http://mediamiser.github.io/pull-model/).

See [the library's API documentation](http://mediamiser.github.io/pull-model/apidocs/index.html) for examples on how to use each utility.


### Usage
You can include this project in your own by adding the following dependency to your project's `pom.xml` file:

```
<dependency>
  <groupId>com.mediamiser</groupId>
  <artifactId>pull-model</artifactId>
  <version>0.0.0</version>
</dependency>
```


### Development
To build this project, your development environment must have installed:

* [Oracle JDK 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.x](http://maven.apache.org/)

To test locally, check out the repository and use Maven to compile and run the tests:

```
user@localhost$ git clone https://github.com/MediaMiser/pull-model.git
user@localhost$ cd pull-model
user@localhost$ mvn clean test
```


### Licensing
The MediaMiser Pull Model is licensed under the [BSD 3-Clause license](LICENSE.md).


### Authors and Contributors
This project was authored by [@samer-albuhaisi](https://github.com/samer-albuhaisi) and [@cfournie](https://github.com/cfournie) at [MediaMiser](https://github.com/MediaMiser).
