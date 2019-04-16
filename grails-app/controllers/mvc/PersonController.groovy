package mvc

import grails.plugin.springsecurity.annotation.Secured

@Secured(SecRole.ROLE_ADMIN)
class PersonController {

    static scaffold = Person
}
