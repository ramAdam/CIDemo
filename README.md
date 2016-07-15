# CIDemo
[![Build Status](https://travis-ci.org/ramAdam/CIDemo.svg?branch=master)](https://travis-ci.org/ramAdam/CIDemo)
The project is a Travis CI demo with maven

From terminal run 
  mvn clean -Dtest=JunitTestSuite test

The command above runs the test suite. To run all junit tests
  mvn clean test


To run individual tests
  mvn -Dtest=HelloWorldTest test
  mvn -Dtest=ByWorldTest test
  
