<%@ page import="mvc.CalculatorModel" %>
<html>
<head>
    <meta name="layout" content="form"/>
    <title>
        In-Place Calculator
    </title>
    <style>
        .error {
            border-color: red;
        }
    </style>
</head>

<body>

<form action="/inPlaceCalculator/calc" method="get">
    <fieldset class="form padded">

        <input id="en" name="en" type="number" value="${calculatorInstance.en}"
        class="${calculatorInstance.en_error}"
        title="${calculatorInstance.en_error_message}"
        >
        <input id="exam" name="exam" value="${calculatorInstance.exam}"
        class="${calculatorInstance.exam_error}"
        title="${calculatorInstance.exam_error_message}"
        >

        <div>
            <label>&nbsp;</label>
            <input type="submit" value="Calculate"/>
        </div>
    </fieldset>
</form>


<div class="padded">
    <label>Result</label>
        <output>${calculatorInstance.result}</output>
</div>

</body>
</html>

