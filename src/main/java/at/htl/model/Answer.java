package at.htl.model;

import javax.persistence.*;

@Entity
public class Answer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long a_id;
    @Column(name = "a_text")
    private String a_text;

    //TODO JPA FOREIGN KEYS
    @Column(name = "a_transaction")
    private Transaction a_transaction;
    @Column(name = "a_question")
    private Question a_question;

    public Answer() {
    }

    public Answer(String a_text, Transaction a_transaction, Question a_question) {
        this.a_text = a_text;
        this.a_transaction = a_transaction;
        this.a_question = a_question;
    }

    public Answer(Long a_id, String a_text, Transaction a_transaction, Question a_question) {
        this.a_id = a_id;
        this.a_text = a_text;
        this.a_transaction = a_transaction;
        this.a_question = a_question;
    }

    public Long getA_id() {
        return a_id;
    }

    public void setA_id(Long a_id) {
        this.a_id = a_id;
    }

    public String getA_text() {
        return a_text;
    }

    public void setA_text(String a_text) {
        this.a_text = a_text;
    }

    public Transaction getA_transaction() {
        return a_transaction;
    }

    public void setA_transaction(Transaction a_transaction) {
        this.a_transaction = a_transaction;
    }

    public Question getA_question() {
        return a_question;
    }

    public void setA_question(Question a_question) {
        this.a_question = a_question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "a_id=" + a_id +
                ", a_text='" + a_text + '\'' +
                ", a_transaction=" + a_transaction +
                ", a_question=" + a_question +
                '}';
    }
}
