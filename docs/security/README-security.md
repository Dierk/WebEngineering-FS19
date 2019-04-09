# WebEngineering Module, Spring Security

## Goals

### Abilities
Being able to identify the user and set up basic security.
Run tests with security enabled.

### Knowledge
Knowing the very basics of role-based security for web applications, incl.
- Annotation based
- url pattern based (config)
- url pattern based (from DB)

## Ressources

http://grails-plugins.github.io/grails-spring-security-core/3.2.x/index.html

Steps to follow:
https://github.com/Dierk/WebEngineering-HS18/commits/dk_security

Starting at commit:
https://github.com/Dierk/WebEngineering-HS18/commit/84d1dadc93d360981d85a691df03ccb41c70badf

Background:
- https://www.watson.ch/digital/online-sicherheit/521968741-eine-frage-an-den-t-mobile-kundendienst-endete-fuer-den-mobilfunkanbieter-im-fiasko
- http://guides.grails.org/grails-basicauth/guide/index.html 
- https://www.youtube.com/watch?v=nOxeKwGoMf4 

## Notes

Better not use "User" as a domain class or db table name.
That clashes with some DBMS e.g. Postgres.

## Steps that have been taken to set up the security

- add dependency to build.gradle: `compile 'org.grails.plugins:spring-security-core:3.2.3'`
- grailsw compile
- grailsw s2-quickstart mvs SecUser SecRole
- follow the steps of dk_security (see resources above)

- Optional:
  - beautify the login view
  - set up reference from SecUser to Person
  - display bookings for a logged in, regular user