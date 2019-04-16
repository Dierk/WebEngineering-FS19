package mvc

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->

        if (Environment.current == Environment.PRODUCTION) return; // guard clause

        SecUser me = new SecUser(username: "me", password: "1234").save(flush:true);

        SecRole admin = new SecRole(authority: SecRole.ROLE_ADMIN).save(flush:true);

        new SecUserSecRole(secUser: me, secRole: admin).save(flush: true);

        Person dk = save(new Person(firstName: "Dierk",  lastName: "König"))
        Person dh = save(new Person(firstName: "Dieter", lastName: "Holz"))

        Room r1 = save(new Room(description: "1.017", capacity: 70))
        Room r2 = save(new Room(description: "5.A19", capacity: 40))

        Date today = new Date().clearTime()

        save(new Booking(room: r1, booker: dk, timeSlot: "PM1", bookingDate: today))
        save(new Booking(room: r1, booker: dk, timeSlot: "PM1", bookingDate: today + 1))
    }

    static <Domain> Domain save(Domain domainObject) {
        domainObject.save(failOnError: true, flush:true)
    }

    def destroy = {
    }
}
