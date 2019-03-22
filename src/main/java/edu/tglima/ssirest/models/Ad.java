package edu.tglima.ssirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Ad implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Ad() {}

	public Ad(String title, Category category, String description, 
			String phone, Boolean isWhatsapp, Boolean isPromoted, 
			Boolean isChecked, List<String> images) {
	
		this.title = title;
		this.category = category;
		this.description = description;
		this.phone = phone;
		this.isWhatsapp = isWhatsapp;
		this.isPromoted = isPromoted;
		this.isChecked = isChecked;
		this.images = images;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 4, max = 60)
	private String title;
	
	@ManyToOne
	@JoinColumn(name="id_category", referencedColumnName="id")
	@NotNull(message = "A categoria não pode ser nula")
	private Category category;
	
	@Size(min = 4, max = 255)
	private String description;
	
	@Size(min = 0, max = 16)
	private String phone;
	
	@NotNull(message = "isWhatsapp não pode ser nulo")
	private Boolean isWhatsapp;
	
	@NotNull(message = "isPromoted não pode ser nulo")
	private Boolean isPromoted;
	
	@NotNull(message = "isChecked não pode ser nulo")
	private Boolean isChecked;
	
	@ElementCollection(targetClass=String.class)
	private List<String> images;

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsWhatsapp() {
		return isWhatsapp;
	}

	public void setIsWhatsapp(Boolean isWhatsapp) {
		this.isWhatsapp = isWhatsapp;
	}

	public Boolean getIsPromoted() {
		return isPromoted;
	}

	public void setIsPromoted(Boolean isPromoted) {
		this.isPromoted = isPromoted;
	}

	public Boolean getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(Boolean isChecked) {
		this.isChecked = isChecked;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	
}
