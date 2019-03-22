package edu.tglima.ssirest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.tglima.ssirest.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	Optional<Category> findByUrl(String url);
}
