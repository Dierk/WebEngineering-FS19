package mvc

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class RoomSpec extends Specification implements DomainUnitTest<Room> {

    def setup() {
        new Room(description: "1", capacity: 0).save()
        new Room(description: "2", capacity: 0).save()
    }

    def cleanup() {
        Room.list()*.delete()
    }

    void "toString formatting"() {

        when:
        Room classroom = new Room(
            description: "1.017",
            capacity:    70);

        then:
            classroom.toString() == "1.017 (70)"
    }

    void "we should have two Rooms in the fixture"() {

        when:
        List<Room> rooms = Room.list()

        then:
            rooms.size() == 2
    }
}
