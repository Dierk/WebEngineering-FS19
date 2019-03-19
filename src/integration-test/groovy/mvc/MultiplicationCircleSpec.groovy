package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class MultiplicationCircleSpec extends GebSpec {

    void "Changing segment count with JavaScript"() {
        when:
            browser.driver.javascriptEnabled = true
            go '/multiplicationCircle.html'
        then:
        	title == "Multiplication Circle"
            $("form").segmentCount == "10"

        when: "click to bump value up"
            $("#segmentCountUp").click()

        then: "the field is bumped up"
            $("form").segmentCount == "11"

        when: "click to bump value down"
            $("#segmentCountDown").click()

        then: "the field is bumped up"
            $("form").segmentCount == "10"
    }


//  add a test that checks the form for the table base

}
