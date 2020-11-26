package at.htl.questionz.model;

import java.sql.Blob;

public class Question {

    private Long q_id;
    private String q_text;
    private Blob q_image;
    private QuestionType q_type;
    private Questionnaire q_questionnaire;

    public Question() {

    }

    public Question(Long q_id, String q_text, Blob q_image, QuestionType q_type, Questionnaire q_questionnaire) {
        this.q_id = q_id;
        this.q_text = q_text;
        this.q_image = q_image;
        this.q_type = q_type;
        this.q_questionnaire = q_questionnaire;
    }

    public Long getQ_id() {
        return q_id;
    }

    public void setQ_id(Long q_id) {
        this.q_id = q_id;
    }

    public String getQ_text() {
        return q_text;
    }

    public void setQ_text(String q_text) {
        this.q_text = q_text;
    }

    public Blob getQ_image() {
        return q_image;
    }

    public void setQ_image(Blob q_image) {
        this.q_image = q_image;
    }

    public QuestionType getQ_type() {
        return q_type;
    }

    public void setQ_type(QuestionType q_type) {
        this.q_type = q_type;
    }

    public Questionnaire getQ_questionnaire() {
        return q_questionnaire;
    }

    public void setQ_questionnaire(Questionnaire q_questionnaire) {
        this.q_questionnaire = q_questionnaire;
    }

    @Override
    public String toString() {
        return "Question{" +
                "q_id=" + q_id +
                ", q_text='" + q_text + '\'' +
                ", q_image=" + q_image +
                ", q_type=" + q_type +
                ", q_questionnaire=" + q_questionnaire +
                '}';
    }
}
