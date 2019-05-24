package org.springframework.samples.petclinic.offers.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.samples.petclinic.model.OfferEntity;
import org.springframework.samples.petclinic.offers.repository.RepositoryOffer;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private RepositoryOffer repositoryOffers;

    
    public ServiceImpl (
    	RepositoryOffer repositoryOffers) {
    	this.repositoryOffers = repositoryOffers;
    	}
    
    public void deleteOffer(OfferEntity offer) {
    	Integer id = offer.getId();
    	
    	repositoryOffers.delete(id);
    }
    
    public void createOffer(OfferEntity offer) {
    	
    	repositoryOffers.save(offer);
    }
    
    public void updateOffer(OfferEntity offer) {
    	repositoryOffers.save(findOneById(offer.getId()));
    }
    
    public OfferEntity findOneById(Integer id) {
    	
    	return repositoryOffers.findOne(id);
    	
    }
    
    public Collection<OfferEntity> findAllOffer() {
    	return repositoryOffers.findAll();
    }

    public List<OfferEntity> findActual() {
    	Date date = new Date();
    	return repositoryOffers.findByExpiredate(date);
    }
	@Override
	public OfferEntity findOfferById(int id) throws DataAccessException {
		OfferEntity offer = null;
		try {
			offer = repositoryOffers.findOne(id);
		} catch (ObjectRetrievalFailureException|EmptyResultDataAccessException e) {
		// just ignore not found exceptions for Jdbc/Jpa realization
			return null;
		}
		return offer;
	}


}
