<%--
 Emitting a single row of a form with label and input field with up-down buttons.
 Params:
   name  : name to use for id, name, labelFor
   label : what the user sees beneath the input field
   value : the value to show
 Depends on the "increase/decrease" js functions from outside.
--%>

<div>
  <label for="${name}">${label}:</label>
  <input type="submit" value=" up " onclick="increase('${name}')" id="${name}Up">
  <input type="number" name="${name}" id="${name}" value="${value}">
  <input type="submit" value="down" onclick="decrease('${name}')" id="${name}Down">
</div>