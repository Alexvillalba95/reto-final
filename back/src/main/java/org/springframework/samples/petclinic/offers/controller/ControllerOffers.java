package org.springframework.samples.petclinic.offers.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.samples.petclinic.model.OfferEntity;
import org.springframework.samples.petclinic.offers.service.IService;
import org.springframework.samples.petclinic.offers.service.ServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Offers")
public class ControllerOffers {

		@Autowired
		private IService ServicioOfertas;
		@Autowired
		private ServiceImpl serv2;
		private List <OfferEntity> prueba = new ArrayList<OfferEntity>();
	
		@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public List<OfferEntity> getOffers() {			
			return (List<OfferEntity>) ServicioOfertas.findAllOffer();
		}
		
		@GetMapping(path="/valid", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<OfferEntity> getValid() {			
			return (List<OfferEntity>) serv2.findActual();
		}
		
		@RequestMapping(path = "/{offerId}", method = RequestMethod.POST)
		public void addOffer(@PathVariable ("offerId") Integer id, @RequestBody OfferEntity offer) {			
			ServicioOfertas.createOffer(offer);
		}
		
		@RequestMapping(path = "/{offerId}", method = RequestMethod.DELETE)
		public void deleteOffers(@PathVariable ("offerId") Integer id) {

			ServicioOfertas.deleteOffer(id);
		}
		
		@RequestMapping(path = "/{offerId}", method = RequestMethod.PUT)
		public void modifyOffers(@PathVariable ("billId") Integer id, @RequestBody OfferEntity offer) {
			ServicioOfertas.updateOffer(offer);
		}
	
}
