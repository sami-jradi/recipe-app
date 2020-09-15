package sami.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import sami.springframework.domain.UnitOfMeasure;

import java.util.Optional;

public interface UniOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
