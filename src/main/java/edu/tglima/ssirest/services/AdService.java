package edu.tglima.ssirest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tglima.ssirest.dtos.AdDTO;
import edu.tglima.ssirest.exceptions.ObjectNotFoundException;
import edu.tglima.ssirest.models.Ad;
import edu.tglima.ssirest.models.Category;
import edu.tglima.ssirest.repositories.AdRepository;

@Service
public class AdService {

	@Autowired
	private AdRepository repository;
		
	public AdService(AdRepository repository) {
		this.repository = repository;
	}
	
	public AdDTO findById(Integer id) {
		Optional<Ad> obj = repository.findByIdAndIsChecked(id, true);
		return fromAd(obj.orElseThrow(() -> 
			new ObjectNotFoundException("Anuncio não encontrado! id: " + id)));
	}
	
	public List<AdDTO> findAll() {
		return fromAds(repository.findAllByIsChecked(true));
	}	

	public List<AdDTO> findByPromoted(Boolean value){
		return fromAds(repository.findAllByIsPromotedAndIsChecked(value, true));
	}
	
	public List<AdDTO> findByCategory(Category category) {
		return fromAds(repository.findByCategoryAndIsChecked(category, true));
	}	
	
	public List<AdDTO> findByDescription(String description){
		return fromAds(repository.
					findByDescriptionIgnoreCaseContainingAndIsChecked(description, true));	 
	};
	
	private AdDTO fromAd(Ad ad){
		AdDTO dto = new AdDTO(
				ad.getId(), ad.getTitle(), 
				ad.getCategory().getTitle(),
				ad.getDescription(), ad.getPhone(),
				ad.getIsWhatsapp(), ad.getIsPromoted(),
				ad.getIsChecked(), ad.getImages());
		return dto;
	}
	
	private List<AdDTO> fromAds(List<Ad> listAd){
		List<AdDTO> list = new ArrayList<AdDTO>();
		if (!listAd.isEmpty() || listAd != null) {
			listAd.forEach(e -> {
				list.add(new AdDTO(
						e.getId(), e.getTitle(), e.getCategory().getTitle(), 
						e.getDescription(), e.getPhone(), e.getIsWhatsapp(), 
						e.getIsPromoted(), e.getIsChecked(), e.getImages()));
			});			
		}
		return list;
	}	
	
}
