# WebEngineering Module, Server Pages

## Goals

### Abilities
- Being able to use javascript for form validation
- Using javascript for client-side application logic
- Modularize javascript code in functions
- Integration testing of pages that use javascript

### Knowledge
- Understanding how to use event handling attributes and javascript code 
- Distinguishing between in-line, in-page, and .js-file code
- Understanding the idea of "scripting"
- Understanding the general differences between Java and JavaScript

## Resources

Basic JavaScript objects for use in the browser:

- http://www.cse.cuhk.edu.hk/~cjyuan/csc2720/slides/lec06b-javascript_dom.pdf
- https://www.w3schools.com/js/
- https://www.codecademy.com/learn/learn-javascript

## Demo/Code walkthrough 

### Revisit the InPlaceCalculator

- controller and model
- view: server page, template, taglib, layout (use of <asset:stylesheet>)
- grails-app/assets/stylesheets/form.css 
  (un-comment animation for some fun)

### Make the InPlaceCalculator validate on the client side with JavaScript

- let the tests run 
- uncomment lines in src/integration-test/groovy/mvc/InPlaceCalculatorSpec.groovy
- run the tests and see them failing
- onChange in-line solution such that the tests pass
- refactor into in-page solution with functions
- refactor into external .js file

## Practical work (may extend into homework)

Note that there is a solution for the TempConverter (last week's practical work).

### Direct-Manipulation JSTempConverter

- view: src/main/resources/public/Temperatures.html
  open the view either from file system or through the web app (http://localhost:8080/static/Temperatures.html)
- test: src/integration-test/groovy/mvc/JSTempConverterSpec.groovy
  fix TODO: make a new test method for fahrenheit to celsius conversion
- let the test run and see how it fails
- change the view until the test passes

## Homework 

- Finish the practical work
- Work through the resources (see above)