package peaksoft.englishtestjava16.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "option_gen")
    @SequenceGenerator(sequenceName = "option_seq", name = "option_gen")
    private Long id;
    private String title;
    private boolean isTrue;

    public Option(Long id, String title, boolean isTrue) {
        this.id = id;
        this.title = title;
        this.isTrue = isTrue;
    }

    public Option(String title, boolean isTrue) {
        this.title = title;
        this.isTrue = isTrue;
    }

    public Option() {
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

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isTrue=" + isTrue +
                '}';
    }
}
