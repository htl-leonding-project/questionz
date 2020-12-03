package at.htl.questionz.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "q_id")
    private Long id;
    @Column(name = "q_text")
    private String text;
    @Column(name = "q_sequenceNumber")
    private int sequenceNumber;

    //If Blob fails use byte array
    @Lob
    @Column(name = "q_image")
    private Blob q_image;

    //TODO JPA FOREIGN KEYS
    @Column(name = "q_type")
    private QuestionType q_type;
    @Column(name = "q_questionnaire")
    private Questionnaire q_questionnaire;

    public Question() {

    }

    public Question(String text, int sequenceNumber, Blob q_image, QuestionType q_type, Questionnaire q_questionnaire) {
        this.text = text;
        this.sequenceNumber = sequenceNumber;
        this.q_image = q_image;
        this.q_type = q_type;
        this.q_questionnaire = q_questionnaire;
    }

    public Question(Long id, String text, Blob q_image, int sequenceNumber, QuestionType q_type, Questionnaire q_questionnaire) {
        this.id = id;
        this.text = text;
        this.q_image = q_image;
        this.sequenceNumber = sequenceNumber;
        this.q_type = q_type;
        this.q_questionnaire = q_questionnaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long q_id) {
        this.id = q_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String q_text) {
        this.text = q_text;
    }

    public Blob getQ_image() {
        return q_image;
    }

    public void setQ_image(Blob q_image) {
        this.q_image = q_image;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int q_sequenceNumber) {
        this.sequenceNumber = q_sequenceNumber;
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
                "q_id=" + id +
                ", q_text='" + text + '\'' +
                ", q_image=" + q_image +
                ", q_type=" + q_type +
                ", q_questionnaire=" + q_questionnaire +
                '}';
    }
}
