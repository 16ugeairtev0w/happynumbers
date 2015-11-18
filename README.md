# Happy number program

This project is about building a program that will enumerate the Happy numbers
up to 1000. See https://en.wikipedia.org/wiki/Happy_number for the definition
of Happy numbers.

The project is built using Gradle and depend on
* Java 8
* Bash
* diff

## How to build

Run ./gradlew build in the project root.

## How to run the integration test

There's one integration test that verifies that the result of the program
is the same as the listing on the Wikipedia page.

## How to run the program

Either run ./gradlew run and get the extra Gradle printouts or run
java -cp ./build/libs/happynumbers-1.0.jar com.happynumbers.Main from the
project root.
