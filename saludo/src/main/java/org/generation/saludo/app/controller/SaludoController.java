package org.generation.saludo.app.controller;

import org.springframework.web.bind.annotation.*;

/*
 * @RestController indica que la clase será un controlador API REST
 * Esta anotación combina @Controller y @ResponseBody
 * 
 * @Controller indica la clase como controlador MVC (Model-View-Controller).
 * Esta clase se encarga de manejar las solicitudes http y devuelve una respuesta
 * 
 * @ResponseBody indica que los métodos devuelven la respuesta en el cuerpo de la
 * respuesta HTTP. Los objetos devueltos por los métodos se serializan automáticamente
 * en el formato deseado. Por default la respuesta es en JSON.
 * 
 * @RequestMapping mapea una solicitud HTTP en la URL indicada.
 * Se puede aplicar a nivel de clase o método.
 * A nivel de clase define el prefijo común de la URL para todas las rutas
 * de los métodos.
 * 
 */

@RestController
@RequestMapping("api/saludo") // http://localhost:8080/api/saludo
public class SaludoController {
	
	/*
	 * @GetMapping mapea solicitudes HTTP GET
	 * Entre parentesis se indica la URL donde se mapeará. A esta ruta
	 * se incluye el prefijo definido con @RequestMapping en la clase
	 */
	
	@GetMapping("ch26") // http://localhost:8080/api/saludo/ch26
	public String saludoCh26() {
		return "Hola Mundo y Ch26";
	}
	
	
	
}
