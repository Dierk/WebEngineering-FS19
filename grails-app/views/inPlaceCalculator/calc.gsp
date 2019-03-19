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

    <tmpl:form_row name="en"   label="EN"   model="${calculatorInstance}"/>

    <tmpl:form_row name="exam" label="Exam" model="${calculatorInstance}"/>


        <div>
            <label>&nbsp;</label>
            <input type="submit" value="Calculate"/>
        </div>
    </fieldset>
</form>


<div class="padded">
    <label>Result</label>
      <mvc:decorate grade="${calculatorInstance.result}">
        <output>${calculatorInstance.result}</output>
      </mvc:decorate>

</div>

</body>
</html>

