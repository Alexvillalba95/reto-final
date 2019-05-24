package org.springframework.samples.petclinic.offers.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.OfferEntity;


public interface IService {
	OfferEntity findOfferById(int id) throws DataAccessException;
	Collection<OfferEntity> findAllOffer() throws DataAccessException;
}
