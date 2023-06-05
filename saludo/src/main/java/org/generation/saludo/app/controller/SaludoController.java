package org.generation.saludo.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/saludo") // http://localhost:8080/api/saludo
public class SaludoController {
	
	@GetMapping("ch26") // http://localhost:8080/api/saludo/ch26
	public String saludoCh26() {
		return "Hola Mundo y Ch26";
	}
	
}
