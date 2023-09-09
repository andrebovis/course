package com.andrebovis.course.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
	
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name ;
	private String  description ;
	private Double price ;

	@Transient 
	private Set<Category> categories = new HashSet<>();	
	private String umgUrl;public Product () {
		
	}

	public Product(Long id, String name, String description, Double price, String umgUrl) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.umgUrl = umgUrl;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	

	public String getUmgUrl() {
		return umgUrl;
	}

	public void setUmgUrl(String umgUrl) {
		this.umgUrl = umgUrl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Id, other.Id);
	}
		
	
 }
