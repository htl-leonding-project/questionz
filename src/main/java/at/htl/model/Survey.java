package at.htl.model;

import javax.persistence.*;
import java.time.LocalDate;

@NamedQueries({

        @NamedQuery(
                name = "Answer.findAll",
                query = "select a from Answer a"
        )

})
@Entity
@Table(name = "Survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Long id;
    @Column(name = "s_date")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "s_teacher")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "s_questionnaire")
    private Questionnaire questionnaire;

    public Survey() {
    }

    public Survey(LocalDate date, Teacher teacher, Questionnaire questionnaire) {
        this.date = date;
        this.teacher = teacher;
        this.questionnaire = questionnaire;
    }

    public Survey(Long id, LocalDate date, Teacher teacher, Questionnaire questionnaire) {
        this.id = id;
        this.date = date;
        this.teacher = teacher;
        this.questionnaire = questionnaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long s_id) {
        this.id = s_id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate s_date) {
        this.date = s_date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher s_teacher) {
        this.teacher = s_teacher;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire s_questionnaire) {
        this.questionnaire = s_questionnaire;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", date=" + date +
                ", teacher=" + teacher +
                ", questionnaire=" + questionnaire +
                '}';
    }
}
