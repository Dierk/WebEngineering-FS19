<%--
 Emitting a single row of a form with label and input field.
 Params:
   name  : name to use for id, name, labelFor
   model : the calculatorInstance to display
--%>

<div>
  <label for="${name}">${name} : </label>
<input id="${name}" name="${name}" value="${model[name]}"
class="${model[name +'_error']}"
title="${model[name+'_error_message']}"
>
</div>