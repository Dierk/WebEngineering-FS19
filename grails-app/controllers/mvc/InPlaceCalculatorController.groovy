package mvc

import grails.validation.Validateable

class InPlaceCalculatorController {

    def calc(CalculatorModel calcModel) {
        calcModel.en = Math.round(calcModel.en * 10) / 10
        calcModel.exam = Math.round(calcModel.exam * 10) / 10
        calcModel.result = Math.round((calcModel.en + calcModel.exam) / 2)
        if (calcModel.errors.fieldErrors.any { it.field == "en" }) {
            calcModel.en_error = "error"
            calcModel.en_error_message = "value '$calcModel.en' is not valid, must be between 1.0 and 6.0."
        }
        if (calcModel.errors.fieldErrors.any { it.field == "exam" }) {
            calcModel.exam_error = "error"
            calcModel.exam_error_message = "value '$calcModel.exam' is not valid, must be between 1.0 and 6.0."
        }
        if (calcModel.hasErrors()) {
            calcModel.result = "Cannot calculate. Input data was invalid."
        }
        render view: 'calc', model: [calculatorInstance: calcModel]
    }

}

class CalculatorModel implements Validateable {

    double en = 0.0
    double exam = 0.0
    String result = ""

    String en_error = ""
    String en_error_message = ""
    String exam_error = ""
    String exam_error_message = ""

    static constraints = {
        en min: 1d, max: 6d, scale: 1
        exam min: 1d, max: 6d, scale: 1
        result nullable: true
    }
}
