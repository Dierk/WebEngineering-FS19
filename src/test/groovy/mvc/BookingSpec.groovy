package mvc

import grails.testing.gorm.DataTest
import spock.lang.Specification

/**
 * Example of a test that tests a relation (Booking) and the related domain classes (Person, Room)
 * as well as the dynamic finder methods.
 */
class BookingSpec extends Specification implements DataTest {

    Person  person
    Room    room
    Booking booking

    static today = new Date().clearTime()

    def setup() {
        mockDomain Person
        mockDomain Room
        mockDomain Booking

        person  = new Person(firstName: "fn",lastName: "ln").save()
        room    = new Room(description: "1", capacity: 0).save()
        booking = new Booking(booker: person, room: room, bookingDate: today, timeSlot: "AM").save()
    }

    def cleanup() {
        person.delete()
        room.delete()
        booking.delete()
    }

    void "find rooms booked by person"() {
        when:
        List<Room> result = Booking.findAllByBooker(person)*.room

        then:
        result == [room]
    }
}
