package sami.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sami.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
