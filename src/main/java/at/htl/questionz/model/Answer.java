package at.htl.questionz.model;

public class Answer {

    private Long a_id;
    private String a_text;
    private Transaction a_transaction;
    private Survey a_survey;
    private Question a_question;

    public Answer() {
    }

    public Answer(Long a_id, String a_text, Transaction a_transaction, Survey a_survey, Question a_question) {
        this.a_id = a_id;
        this.a_text = a_text;
        this.a_transaction = a_transaction;
        this.a_survey = a_survey;
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

    public Survey getA_survey() {
        return a_survey;
    }

    public void setA_survey(Survey a_survey) {
        this.a_survey = a_survey;
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
                ", a_survey=" + a_survey +
                ", a_question=" + a_question +
                '}';
    }
}
