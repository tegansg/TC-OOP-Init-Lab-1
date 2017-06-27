# Initialization Lab 1

## Objectives

1. In this lab students will practice writing and using constructors
2. After this lab students should be able to produce enumerated types.
3. This lab introduces the practice of writing unit tests for code being developed.


## Overview

This lab introduces constructors and enumerated types.	

## Unit Test

You are expected to write unit tests for the `getColor` method in this lab. Be sure to test that it returns the same color that was set in the constructor.

Remember to use Test Driven Development: create stubs of your methods and write your tests first, confirm that they run fail the tests, then implement your methods so that they pass the tests.

## Instructions

For this lab, create a java file called `InitializationLab1.Java`

### Part one = new Part();

1. In `InitializationLab1.java` create two classes, `BoringThing` and `ColorfulThing`
2. Create a constructor for `ColorfulThing` that takes one String as a parameter and stores it as an instance variable.
3. Provide a `getColor` method for `ColorfulThing`
4. Create the `InitializationLab1` class and add a `main` method.
5. In `main` declare and instantiate five `BoringThing`s and five `ColorfulThing`s (pick any colors you like).
6. Print out each `ColorfulThing`'s color.
7. Try creating another `ColorfulThing` using a default (no-argument) constructor. Notice that this causes an error.

### public enum Part {II;}

Letting a user specify any string and blindly assuming it's a color is a bit naïve. Let's specify what colors of `ColorfulThing`s are available.

1. Add an enumerated type called `Color` to `ColorfulThing` and give it at least three options
2. Refactor the `ColorfulThing` constructor and class to use the new enumerated type. Don't forget to refactor the getter you created earlier.
3. Adjust your `main` method to use the new enumerated type as well.
4. Run your program to make sure the new enumerated type works.
