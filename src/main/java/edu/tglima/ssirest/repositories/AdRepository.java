package edu.tglima.ssirest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.tglima.ssirest.models.Ad;
import edu.tglima.ssirest.models.Category;

public interface AdRepository extends JpaRepository<Ad, Integer> {
	Optional<Ad> findByIdAndIsChecked(Integer id, Boolean isChecked);
	List<Ad> findByCategoryAndIsChecked(Category category, Boolean isChecked);
	List<Ad> findByDescriptionIgnoreCaseContainingAndIsChecked(String descricao, Boolean isChecked);
	List<Ad> findAllByIsChecked(Boolean isChecked);
	List<Ad> findAllByIsPromotedAndIsChecked(Boolean isPromoted, Boolean isChecked);
}
