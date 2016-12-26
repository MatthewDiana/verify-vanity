# Verify Vanity

A web API written with the Spring framework that can be used to verify that your favorite vanity 
license plate is available.

## Getting Started

### Prerequisites

Along with Java, you need a semi-recent version of Maven for building. On Ubuntu, this is as simple as using `apt-get`:

```
sudo apt-get install maven
```

Verify your installation by checking for the version:

```
mvn -version
```

### Build and Run

Package up all the required dependencies and compile the code into a runnable jar:

```
mvn package
```

Start up the web server:

```
java -jar verify-vanity-*.jar
```

## API

todo

## Run the Tests

The unit test suites can be run using Maven:

```
mvn test
```

## Built With
* [Spring](https://spring.io/) - App / web framework
* [Maven](https://spring.io/) - Build tool
* [HtmlUnit](http://htmlunit.sourceforge.net/) - Browser emulator
* Bootstrap/jQuery/FontAwesome - The example page

