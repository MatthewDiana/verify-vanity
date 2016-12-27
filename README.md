# Verify Vanity

A web API written with the Spring framework that can be used to check that your favorite vanity 
license plate is available.

![Sample verify-vanity app](http://i.imgur.com/0JwcTEl.png)

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
java -jar target/verify-vanity-*.jar
```

## API

Using the API is as simple as sending a GET request to `/check` with the req parameters:

* `plateNum` - license plate number
* `state` - state to run check on
    * Support is only provided for `ny`

Example:
```
GET localhost:8080/check?plateNum=MATT&state=ny
```

Response object:

```
{
    "requestedPlate": "MATT",
    "checkTime": "2016-12-26T22:58:03.221Z"
    "valid": true,
    "available": false
}
```
* `requestedPlate` - plate number checked
* `checkTime` - time this plate check was performed
* `valid` - if the plate is a valid format
* `available` - if the plate is currently available

## Sample App

A sample application that uses the API can found
at the `/` route:

`localhost:8080/`

The source for this app can be found in `src/main/resources/public`.

## Run the Tests

The unit test suites can be run using Maven:

```
mvn test
```

## Built With
* [Spring](https://spring.io/) - App / web framework
* [Maven](https://maven.apache.org/) - Build tool
* [HtmlUnit](http://htmlunit.sourceforge.net/) - Browser emulator
* Bootstrap/jQuery/FontAwesome - The example page

