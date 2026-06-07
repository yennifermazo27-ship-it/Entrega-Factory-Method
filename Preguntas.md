1. ¿Qué problema busca solucionar el patrón Factory Method?

El patrón Factory Method busca solucionar el problema de crear objetos directamente en las clases usando new, porque cuando el sistema crece, esto genera mucho desorden y hace difícil hacer cambios. La fábrica centraliza toda la creación de objetos en un solo lugar.

2. ¿Por qué no es recomendable crear objetos directamente en todas las clases del sistema?

No es recomendable porque si se crea objetos con new en muchas partes del código, cuando se necesite cambiar algo hay que buscar y modificar en todos esos lugares. Esto genera errores, hace el código difícil de mantener y crea mucho acoplamiento entre las clases.

3. ¿Qué función cumple la fábrica dentro del patrón?

La fábrica es la clase encargada de decidir qué objeto crear según el tipo que se le indique. Es como un intermediario entre el cliente y los objetos concretos. El cliente no sabe cómo se crea el objeto, solo le pide a la fábrica que se lo entregue.

4. ¿Cuál es la diferencia entre el producto y los productos concretos?

El producto es la interfaz que define qué método deben tener todos los objetos, en este caso enviar(). Los productos concretos son las clases que implementan esa interfaz, como NotificacionEmail, NotificacionSMS y NotificacionWhatsApp, cada una con su propio comportamiento.

5. ¿Qué ventajas aporta Factory Method en aplicaciones desarrolladas con Spring Boot?

En Spring Boot permite mantener el código organizado por capas. El controlador no sabe cómo se crean los objetos, el servicio tampoco, solo le pide a la fábrica que los cree. Esto hace que el código sea más limpio, fácil de entender y fácil de ampliar cuando el proyecto crece.

6. ¿Qué ocurriría si fuera necesario agregar un nuevo tipo de objeto al sistema?

Solo habría que crear una nueva clase que implemente la interfaz, por ejemplo NotificacionTelegram, y agregar una condición en la fábrica para ese nuevo tipo. El controlador y el servicio quedan exactamente igual, sin necesidad de modificarlos.

7. ¿Cómo se relaciona Factory Method con el principio de bajo acoplamiento?

Se relaciona directamente porque el cliente no depende de las clases concretas, solo conoce la interfaz. Gracias a la fábrica, las clases no están tan conectadas entre sí, lo que significa que si se cambia o agrega una implementación, las demás clases no se ven afectadas.
