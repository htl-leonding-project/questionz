package at.htl.model;

import com.sun.xml.bind.v2.TODO;

import javax.persistence.*;
import java.sql.Blob;

@NamedQueries({

        @NamedQuery(
                name = "Question.findAll",
                query = "select q from Question q"
        )

})
@Entity
@Table(name = "Question")
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "q_id")
    private Long id;
    @Column(name = "q_text")
    private String text;
    @Column(name = "q_seqNumber")
    private int seqNumber;
    //If Blob fails use byte array
    @Lob
    @Column(name = "q_image")
    private Blob image;

    //TODO change to lookup table
    @ManyToOne
    @JoinColumn(name = "q_type")
    private QuestionType type;

    @ManyToOne
    @JoinColumn(name = "q_questionnaire")
    private Questionnaire questionnaire;

    public Question() {

    }

    public Question(String text, int seqNumber, Blob image, QuestionType type, Questionnaire questionnaire) {
        this.text = text;
        this.seqNumber = seqNumber;
        this.image = image;
        this.type = type;
        this.questionnaire = questionnaire;
    }

    public Question(Long id, String text, Blob image, int seqNumber, QuestionType type, Questionnaire questionnaire) {
        this.id = id;
        this.text = text;
        this.image = image;
        this.seqNumber = seqNumber;
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

    public int getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(int q_sequenceNumber) {
        this.seqNumber = q_sequenceNumber;
    }

    public String getType(Long id) {
        return type.getMap().get(id);
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
                ", sequenceNumber=" + seqNumber +
                ", image=" + image +
                ", type=" + type +
                ", questionnaire=" + questionnaire +
                '}';
    }
}
