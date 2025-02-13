package peaksoft.englishtestjava16.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.englishtestjava16.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
