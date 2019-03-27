package edu.tglima.ssirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.tglima.ssirest.dtos.AdDTO;
import edu.tglima.ssirest.services.AdService;
import edu.tglima.ssirest.services.CategoryService;

@RestController
@RequestMapping("/ads")
public class AdResource {
	
	@Autowired
	AdService service;
	
	@Autowired
	CategoryService catService;
	
	public AdResource(AdService service, CategoryService catService) {
		this.service = service;
		this.catService = catService;
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<AdDTO>> findAll(){
		return new ResponseEntity<List<AdDTO>>(this.service.findAll(), HttpStatus.OK);
	}
	

	@GetMapping(value="/id={id}")
	@ResponseBody
	public ResponseEntity<AdDTO> findById(@PathVariable(value = "id") Integer id){
		return ResponseEntity.ok().body(service.findById(id));		
	}	

	@GetMapping(value= "/promoted={value}")
	@ResponseBody
	public ResponseEntity<List<AdDTO>> findByPromoted(@PathVariable(value = "value") Boolean value){
		return new ResponseEntity<List<AdDTO>>(service.findByPromoted(value), HttpStatus.OK);
	}
	
	@GetMapping(value= "/category={url}")
	@ResponseBody
	public ResponseEntity<List<AdDTO>> findByCategory(@PathVariable(value = "url") String url){
		return new ResponseEntity<List<AdDTO>>(service.findByCategory(catService.findByUrl(url)), HttpStatus.OK);			
	}
	
	@GetMapping(value= "/desc={value}")
	@ResponseBody
	public ResponseEntity<List<AdDTO>> findByDescription(@PathVariable(value = "value") String value){
		return new ResponseEntity<List<AdDTO>>(service.findByDescription(value), HttpStatus.OK);
	}
		
}
