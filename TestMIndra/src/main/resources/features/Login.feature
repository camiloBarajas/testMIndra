# language: es

@Cucumber
Característica: Añadir un usuario en sitio web

  esta feature se trata de ingresar a sitio web Orange, ingresar a menú Admin y agregar usuarios, luego
  validar los resultados de esa operación.

  @Regresion
  Escenario: Iniciar sesion
    Dado El usuario ingresa al sitio web
    Cuando usuario ingresa datos y da click en boton de login
    Entonces Acceder a ventana administrador



