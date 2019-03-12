package mvc

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

/**
 * See the API for {@link ControllerUnitTest} for usage instructions.
 */
class InPlaceCalculatorControllerSpec extends Specification implements ControllerUnitTest<InPlaceCalculatorController> {

    void "average of #en and #exam should be #result"(en, exam, result) {
        when:
        def model = new CalculatorModel(en: en, exam: exam)
        controller.calc(model)
        then: "average calculation"
        model.result == result
        where:
        en  | exam | result
        0.0 | 0.0  | "0"
        1.0 | 2.0  | "2"
        2.0 | 1.0  | "2"
        1.0 | 1.9  | "1"
    }
}
