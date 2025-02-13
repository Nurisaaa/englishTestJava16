package peaksoft.englishtestjava16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.englishtestjava16.entities.Option;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
