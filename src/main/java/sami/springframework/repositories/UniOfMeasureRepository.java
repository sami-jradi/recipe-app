package sami.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sami.springframework.domain.UnitOfMeasure;

public interface UniOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
