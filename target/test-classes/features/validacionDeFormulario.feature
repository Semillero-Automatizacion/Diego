@Tag
Feature: Validacion de formulario
	@Tag2
	Scenario Outline: Se Ingresa a la aplicacion y se inicia sesion
	Given Ingresar al sitio web
	And Iniciar sesion <usuario> <contrasena>
	When diligenciar <requerido> <selectorDeporte> <selectorMultiple> <url> <clave> <confirmaClave> <minimoCampo> <maximoCampo> <numero> <direccionIP> <fecha> <cita>
	And enviar formulario
	Then verficar campos llenos
	
	Examples: 
	|usuario|contrasena|requerido|selectorDeporte|selectorMultiple|url|clave|confirmaClave|minimoCampo|maximoCampo|numero|direccionIP|fecha|cita|
	|"demo"|"demo"|"requerido"|"Football"|"Football"|"http://google.com"|"1234"|"1234"|"Manjula"|"Tyler"|"19.41"|"192.168.0.1"|"1990-12-19"|"2001/09/11"|
	
	
