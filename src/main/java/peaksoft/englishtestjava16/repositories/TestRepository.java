package peaksoft.englishtestjava16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.englishtestjava16.entities.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
}
