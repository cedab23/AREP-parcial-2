# Parcial Corte 2
**Realizado por:** Nicolás Pachón Unibio

### Introducción

El ejercicio a realizar es de desplegar un servicio web que atienda problemas matematicos,
en este caso siendo problemas de *factores y primos*, el cual posee la siguiente estructura:

- **Input:** un numero entero (el proxy se encargara de definir si retorna factor o primo)
- **Output:** lista de valores asociados al numero (sus numeros factores o primos)

para esto se manejaran 3 instancias EC2, donde en 2 se alojaran los servicios de factores y primos respectivamente,
mientras que en la tercera se encontrara el proxy encargado de solicitar la operacion acorde a si es
factor o primo, con el cual el cliente se comunicara mediante un formulario realizado en HTML.
