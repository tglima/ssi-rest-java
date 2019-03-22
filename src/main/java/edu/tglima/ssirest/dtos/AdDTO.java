package edu.tglima.ssirest.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public AdDTO() {}
	
	public AdDTO(Integer id, String title, String category, String description,
			String phone, Boolean isWhatsapp, Boolean isPromoted, 
			Boolean isChecked, List<String> images) {
		
		this.id = id;
		this.title = title;
		this.category = category;
		this.description = description;
		this.phone = phone;
		this.isWhatsapp = isWhatsapp;
		this.isPromoted = isPromoted;
		this.isChecked = isChecked;
		this.images = images;
	}
	
	private Integer id;
	
	private String title;
	private String category;
	private String description;
	private String phone;
	private Boolean isWhatsapp;
	private Boolean isPromoted;
	private Boolean isChecked;
	private List<String> images = new ArrayList<>();
	
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
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
