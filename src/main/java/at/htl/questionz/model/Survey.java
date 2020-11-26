package at.htl.questionz.model;

import java.time.LocalDate;

public class Survey {

    private Long s_id;
    private LocalDate s_date;
    private Teacher s_teacher;
    private Answer s_answer;

    public Survey() {
    }

    public Survey(Long s_id, LocalDate s_date, Teacher s_teacher, Answer s_answer) {
        this.s_id = s_id;
        this.s_date = s_date;
        this.s_teacher = s_teacher;
        this.s_answer = s_answer;
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public LocalDate getS_date() {
        return s_date;
    }

    public void setS_date(LocalDate s_date) {
        this.s_date = s_date;
    }

    public Teacher getS_teacher() {
        return s_teacher;
    }

    public void setS_teacher(Teacher s_teacher) {
        this.s_teacher = s_teacher;
    }

    public Answer getS_answer() {
        return s_answer;
    }

    public void setS_answer(Answer s_answer) {
        this.s_answer = s_answer;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "s_id=" + s_id +
                ", s_date=" + s_date +
                ", s_teacher=" + s_teacher +
                ", s_answer=" + s_answer +
                '}';
    }
}
