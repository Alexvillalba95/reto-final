package org.springframework.samples.petclinic.offers.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.OfferEntity;
import org.springframework.stereotype.Repository;
//import org.springframework.samples.petclinic.model.Owner;

@Repository

public interface RepositoryOffer extends JpaRepository<OfferEntity, Serializable>{

	/*Collection<OfferEntity> findByAll() throws DataAccessException;
	
	void save(OfferEntity offer) throws DataAccessException;
	
	void delete(Integer id) throws DataAccessException;*/
	
	List<OfferEntity> findByExpiredate(Date now);
	
	
	
}
