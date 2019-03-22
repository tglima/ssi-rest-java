package edu.tglima.ssirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Category() {}
	
	public Category(Integer id, String title, String description, String url) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.url = url;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 4, max = 40)
	private String title;
	
	@Size(min = 4, max = 60)
	private String description;
	
	@Size(min = 4, max = 60)
	private String url;
	
	@JsonIgnore
	@OneToMany(mappedBy="category")
	private List<Ad> ads;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Ad> getAds() {
		return ads;
	}

	public void setAds(List<Ad> ads) {
		this.ads = ads;
	}
	
}
