# WebEngineering Module, Services

## Goals

### Abilities
- Being able to use simple services from both client (smart view) and server (controller).
- Implementing the full range of REST services for a persistent Grails domain model.

### Knowledge
- Understanding REST principles on top of HTTP verbs.

## Resources

REST by Roy Fielding
http://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm

REST in Grails
http://docs.grails.org/3.3.8/guide/REST.html
http://docs.grails.org/3.3.8/guide/theWebLayer.html#restfulMappings

Rest docs usage
https://github.com/jlstrater/grails-spring-restdocs-example

## Demo / Live-coding

- Go to the static page Jokes.html
- Use it and look at the code.

- Go to the static page Pictures.html
- Work through the JavaScript solution to fetch flickr photos.

- Show how to expose Grails domain classes and controller actions.
  
- Use Http Client to interact with the remote service.  
 
## practical work

- Extend the solution to fetch the next 10 photos when needed.

## Homework 

Finish the practical work

By following the approach of the practical work from above,
change the search page for the Room reservation app such that
a click on a link shows the results not in a new page but
right in the search page itself.
You will also need to prepare the respective Booking controller
if you want to fetch the booking data as JSON.