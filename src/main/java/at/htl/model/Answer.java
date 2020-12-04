package at.htl.model;

import javax.persistence.*;

@Entity
public class Answer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("a_id")
    private Long id;
    @Column("a_text")
    private String text;

    //TODO JPA FOREIGN KEYS
    @Column("a_transaction")
    private Transaction transaction;
    @Column("a_question")
    private Question question;

    public Answer() {
    }

    public Answer(Long id, String text, Transaction transaction, Question question) {
        this.id = id;
        this.text = text;
        this.transaction = transaction;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long a_id) {
        this.id = a_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String a_text) {
        this.text = a_text;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction a_transaction) {
        this.transaction = a_transaction;
    }

    public at.htl.questionz.model.Question getQuestion() {
        return question;
    }

    public void setQuestion(at.htl.questionz.model.Question a_question) {
        this.question = a_question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "a_id=" + id +
                ", a_text='" + text + '\'' +
                ", a_transaction=" + transaction +
                ", a_question=" + question +
                '}';
    }
}
