package peaksoft.englishtestjava16.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questions_gen")
    @SequenceGenerator(sequenceName = "questions_seq", name = "questions_gen")
    private Long id;
    private String title;
    private int duration;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Option> options;

    public Question(Long id, String title, int duration, List<Option> options) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.options = options;
    }

    public Question() {
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", options=" + options +
                '}';
    }
}
