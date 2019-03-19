<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8"/>
  <title>
      <g:layoutTitle default="Form"/>
  </title>
  <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

  <asset:stylesheet src="form.css"/>

  %{--<asset:javascript src="form_validation.js"/>--}%

  <g:layoutHead/>
</head>
<body>

  <h1><g:layoutTitle default="Form"/></h1>

  <g:layoutBody/>

<g:if test="${grails.util.Environment.current == grails.util.Environment.DEVELOPMENT}">
  <footer>
  App version:
    <g:meta name="info.app.version"/>
  Grails version:
    <g:meta name="info.app.grailsVersion"/>
  Groovy version:
    ${GroovySystem.getVersion()}
  JVM version:
    ${System.getProperty('java.version')}
  Reloading:
    ${grails.util.Environment.reloadingAgentEnabled}
  </footer>
</g:if>
</body>
</html>
