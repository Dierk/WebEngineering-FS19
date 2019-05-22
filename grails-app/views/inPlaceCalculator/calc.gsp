<%@ page import="mvc.CalculatorModel" %>
<html>
<head>
    <meta name="layout" content="form"/>
    <title>
        In-Place Calculator
    </title>
    <asset:stylesheet src="form.css"/>
</head>

<body>

<form action="/inPlaceCalculator/calc" method="get">
    <fieldset class="form padded">

        <input type="hidden" name="lang" value="en">

        <tmpl:form_row name="en"   model="${calculatorInstance}" />
        <tmpl:form_row name="exam" model="${calculatorInstance}" />


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

<script>
    const en = document.getElementById("en");
    en.onchange = function (evt) {
        if( Number(en.value) < 1.0) {
            alert("en value needs to be at least 1.0")
        }
        en.className = "error";
        en.focus();
    }


</script>

</body>
</html>

