package peaksoft.englishtestjava16.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_gen")
    @SequenceGenerator(sequenceName = "test_seq", name = "test_gen")
    private Long id;
    private String title;
    private String shortDescription;
    private boolean isActive;
    @OneToMany
    private List<Question> questions;

    public Test(Long id, String title, String shortDescription, boolean isActive, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.isActive = isActive;
        this.questions = questions;
    }

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", isActive=" + isActive +
                ", questions=" + questions +
                '}';
    }
}
