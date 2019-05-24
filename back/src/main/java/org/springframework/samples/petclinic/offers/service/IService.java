package org.springframework.samples.petclinic.offers.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.OfferEntity;
import org.springframework.samples.petclinic.model.Pet;

public interface IService {
	OfferEntity findOfferById(int id) throws DataAccessException;
	Collection<OfferEntity> findAllOffer() throws DataAccessException;
	void createOffer(OfferEntity offer);
	void deleteOffer(Integer id);
	void updateOffer(OfferEntity offer);
}
