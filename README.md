<h1>Llanquihue Tours - Sistema de Gestión de Servicios Turísticos</h1>
<p>Este programa es una aplicación de consola en Java diseñada para gestionar y desplegar diferentes tipos de servicios turísticos ofrecidos por la empresa Llanquihue Tours en el sur de Chile. El proyecto está estructurado aplicando los fundamentales de la programación orientada a objetos, como herencia, encapsulamiento, y polimorfismo con especial enfasis en la creacion de listas con polimorfos. Todo el proyecto corresponde a la actividad formativa de la Semana 7</p>
<h2>Características Principales.</h2>
<p>
<strong>•	Estructura Jerárquica: </strong>Utiliza una clase padre (ServicioTuristico) de la cual heredan distintos tipos de servicios.<br>
<strong>•	Polimorfismo:</strong> Permite almacenar diferentes tipos de servicios en una única lista (ArrayList<ServicioTuristico>) y procesarlos de manera dinámica.<br>
<strong>•	Separacion de funciones:</strong> Separa la lógica del modelo de datos (model), la persistencia/generación de datos en memoria (data) y el punto de entrada de la aplicación (app).<br>
</p>
<h2>Estructura del Proyecto</h2>
<p>El código se organiza en los siguientes paquetes y clases:</p>
<h3>model (Modelos de Datos)</h3>
<p>
<strong>•	ServicioTuristico: </strong> La superclase o clase padre. Contiene los atributos comunes para cualquier servicio: nombre y duracionHoras.<br>
<strong>•	RutaGastronomica: </strong> Clase hija que añade el atributo numeroDeParadas.<br>
<strong>•	PaseoLacustre: </strong> Clase hija que añade el atributo tipoEmbarcacion.<br>
<strong>•	ExcursionCultural: </strong> Clase hija que añade el atributo lugarHistorico.<br>
</p>

<h3>data (lógica)</h3>
<p><strong>•	GestorServicios:</strong> Clase encargada de simular la base de datos generando una lista polimórfica de servicios (generarServicios()) y de recorrerla con un bucle "for" para imprimir los detalles en consola (mostrarServicios()).</p>

<h3>app (Punto de Entrada)</h3>
<p><strong>•	LlanquihueToursAppS7: </strong>Contiene el método main que coordina la inicialización del gestor, la creación de la lista y el despliegue de la información.</p>

<h3>Autor</h3>
<p>Francisco Villa Duran</p>
