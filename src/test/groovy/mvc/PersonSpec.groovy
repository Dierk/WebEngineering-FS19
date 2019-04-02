package mvc

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def setup() {
    }

    def cleanup() {
    }

    void "toString format"() {
        when:
        Person rf = new Person(
            firstName: "Roger",
            lastName: "Federer");

        then:
        rf.toString() == "Roger Federer"


    }
}
