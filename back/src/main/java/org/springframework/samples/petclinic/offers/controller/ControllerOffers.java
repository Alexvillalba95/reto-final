package org.springframework.samples.petclinic.offers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/personaController")
public class ControllerOffers {

		//@Autowired
		//private PersonaService personaService;

		//@GetMapping(path = "/getPersonas", produces = MediaType.APPLICATION_JSON_VALUE)
		//public List<PersonaDTO> getPersonas() {

			// Al igual que antes, necesito sacar los datos de la base de datos, para ello
			// accedo al service que este a su vez ira al repo
			//return personaService.obtenerPersonas();
		//}
	
}
