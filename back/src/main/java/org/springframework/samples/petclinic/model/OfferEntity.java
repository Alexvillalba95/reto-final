package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.rest.JacksonCustomOwnerDeserializer;
import org.springframework.samples.petclinic.rest.JacksonCustomOwnerSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@Entity
@Table(name = "offers")
public class OfferEntity {
	@Id
	@Column
	@NotEmpty
	private Integer id;
	@Column
	@NotEmpty
	private String title;
	@Column
	@NotEmpty
	private String description;
	@Column
	@NotEmpty
	private Double discount;
	@Column
	@NotEmpty
	private Date expiredate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Date getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(Date expiredate) {
		this.expiredate = expiredate;
	}
}
