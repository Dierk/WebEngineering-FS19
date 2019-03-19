# WebEngineering Module, Server Pages

## Goals

### Abilities
- Being able to use dynamic content in server pages
- Using pages, templates, taglibs, and layouts
- Testing appropriately

### Knowledge
- Understanding the request-response cycle
- Understanding the four ways of composing server pages plus when to use which
- Where and how to validate
- Optional: using Grails internationalized error messages for generic error display

## Demo/Code walkthrough 

We are using git to walk through the code of InPlaceCalculator
incl. model, view, controller, tests.

Use `git checkout <branch-name>` to see the respective state of development.

You can always go back to the youngest state with `git checkout master`.

### Setup git to sync with latest upstream

`git remote add upstream https://github.com/Dierk/WebEngineering-FS19.git`

validate via

`git remote -v`

sync via

`git pull upstream master`

(or uses other branch than `master`)


## Practical work (may extend into homework)

Make a Fahrenheit to Celsius converter.

You best make a copy of each artifact that we used for the InPlaceCalculator
(model, view, controller, tests, form_row template).
Just copy the file into the same directory as the original and rename accordingly.

You can reuse the _form_ layout.

You can make use of the following conversion functions:

	double c2f(double c) { c * 1.8d + 32 }
	double f2c(double f) { (f-32) / 1.8d }

It is probably best to work with two input fields: one for fahrenheit, one for celsius,
and calculate a result for each of the inputs separately.

## Homework 

Watch http://guides.grails.org/grails-quickcasts-developing-grails-3-applications-with-intellij-idea/guide/index.html

It is a good 20 minutes introduction to Grails even when you do not use IDEA.
