@Tag
Feature: Iniciar sesion
	Scenario: Se Ingresa a la aplicacion y se inicia sesion
	Given Ingresar al sitio web
	When ingreso usuario "demo" 
	And ingreso clave "demo"
	Then Verifico que se inicio sesion