package at.htl.model;

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
    private Blob image;

    //TODO JPA Enum
    @Enumerated(EnumType.ORDINAL)
    private QuestionType type;

    @ManyToOne
    @JoinColumn(name = "q_questionnaire")
    private Questionnaire questionnaire;

    public Question() {

    }

    public Question(String text, int sequenceNumber, Blob image, QuestionType type, Questionnaire questionnaire) {
        this.text = text;
        this.sequenceNumber = sequenceNumber;
        this.image = image;
        this.type = type;
        this.questionnaire = questionnaire;
    }

    public Question(Long id, String text, Blob image, int sequenceNumber, QuestionType type, Questionnaire questionnaire) {
        this.id = id;
        this.text = text;
        this.image = image;
        this.sequenceNumber = sequenceNumber;
        this.type = type;
        this.questionnaire = questionnaire;
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

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob q_image) {
        this.image = q_image;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int q_sequenceNumber) {
        this.sequenceNumber = q_sequenceNumber;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType q_type) {
        this.type = q_type;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire q_questionnaire) {
        this.questionnaire = q_questionnaire;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", image=" + image +
                ", type=" + type +
                ", questionnaire=" + questionnaire +
                '}';
    }
}
