package at.htl.model;

import javax.persistence.*;

@Entity
public class Answer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("a_id")
    private Long a_id;
    @Column("a_text")
    private String a_text;

    //TODO JPA FOREIGN KEYS
    @Column("a_transaction")
    private Transaction a_transaction;
    @Column("a_question")
    private at.htl.questionz.model.Question a_question;

    public Answer() {
    }

    public Answer(Long a_id, String a_text, Transaction a_transaction, at.htl.questionz.model.Question a_question) {
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

    public at.htl.questionz.model.Question getA_question() {
        return a_question;
    }

    public void setA_question(at.htl.questionz.model.Question a_question) {
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
