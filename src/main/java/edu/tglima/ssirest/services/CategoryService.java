package edu.tglima.ssirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tglima.ssirest.exceptions.ObjectNotFoundException;
import edu.tglima.ssirest.models.Category;
import edu.tglima.ssirest.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public CategoryService(CategoryRepository repository) {
		this.repository = repository;
	}
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException(
				"Categoria não encontrada! ID: " + id));
	}
	
	public Category findByUrl(String url){
		return repository.findByUrl(url)
				.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrada! URL: " + url));
	}
	
}
