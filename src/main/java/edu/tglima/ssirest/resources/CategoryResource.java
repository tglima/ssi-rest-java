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

import edu.tglima.ssirest.models.Category;
import edu.tglima.ssirest.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
	
	@Autowired
	CategoryService service;
	
	public CategoryResource(CategoryService service) {
		this.service = service;
	}

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Category>> findAll(){
		return new ResponseEntity<List<Category>>(service.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value="/id={id}")
	@ResponseBody
	public ResponseEntity<Category> find(@PathVariable(value = "id") Integer id){
		return new ResponseEntity<Category>(service.findById(id), HttpStatus.OK);		
	}
	
	@GetMapping(value="/url={value}")
	@ResponseBody
	public ResponseEntity<?> findByURL(@PathVariable(value = "value") String value){
		return new ResponseEntity<Category>(service.findByUrl(value), HttpStatus.OK);
	}
	
}
