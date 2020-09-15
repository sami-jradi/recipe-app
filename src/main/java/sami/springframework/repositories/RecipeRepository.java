package sami.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sami.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
