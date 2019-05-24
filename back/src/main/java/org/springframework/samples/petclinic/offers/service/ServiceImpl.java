package org.springframework.samples.petclinic.offers.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.samples.petclinic.model.OfferEntity;
import org.springframework.samples.petclinic.offers.repository.RepositoryOffer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceImpl implements IService {
    private RepositoryOffer repositoryOffers;

    @Autowired
    public ServiceImpl (
    	RepositoryOffer repositoryOffers) {
    	this.repositoryOffers = repositoryOffers;
    	}
    
    @Override
	@Transactional(readOnly = true)
	public Collection<OfferEntity> findAllOffer() throws DataAccessException {
		return repositoryOffers.findAll();
	}

	@Override
	public OfferEntity findOfferById(int id) throws DataAccessException {
		OfferEntity offer = null;
		try {
			offer = repositoryOffers.findById(id);
		} catch (ObjectRetrievalFailureException|EmptyResultDataAccessException e) {
		// just ignore not found exceptions for Jdbc/Jpa realization
			return null;
		}
		return offer;
	}


}
