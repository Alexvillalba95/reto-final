package org.springframework.samples.petclinic.offers.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.samples.petclinic.model.OfferEntity;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryOffersImpl implements RepositoryOffer{

	private OfferEntity offer;
	private EntityManager em;
	
	public List<OfferEntity> getValid(){
		
		Query query = this.em.createQuery("SELECT o FROM OfferEntity o WHERE expiredate > GETDATE()");
        return query.getResultList();
	}

	@Override
	public List<OfferEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OfferEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OfferEntity> findAll(Iterable<Serializable> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OfferEntity> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends OfferEntity> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<OfferEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OfferEntity getOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OfferEntity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OfferEntity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OfferEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OfferEntity> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OfferEntity findOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(OfferEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends OfferEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends OfferEntity> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OfferEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OfferEntity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends OfferEntity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OfferEntity> getValids() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
