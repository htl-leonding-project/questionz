package at.htl.questionz.model;

public class AnswerOption {

    private Long ao_id;
    private String ao_text;
    private int ao_value;
    private int ao_sequenceNumber;
    private Question ao_question;

    public AnswerOption() {
    }

    public AnswerOption(Long ao_id, String ao_text, int ao_value, int ao_sequenceNumber, Question ao_question) {
        this.ao_id = ao_id;
        this.ao_text = ao_text;
        this.ao_value = ao_value;
        this.ao_sequenceNumber = ao_sequenceNumber;
        this.ao_question = ao_question;
    }

    public Long getAo_id() {
        return ao_id;
    }

    public void setAo_id(Long ao_id) {
        this.ao_id = ao_id;
    }

    public String getAo_text() {
        return ao_text;
    }

    public void setAo_text(String ao_text) {
        this.ao_text = ao_text;
    }

    public int getAo_value() {
        return ao_value;
    }

    public void setAo_value(int ao_value) {
        this.ao_value = ao_value;
    }

    public int getAo_sequenceNumber() {
        return ao_sequenceNumber;
    }

    public void setAo_sequenceNumber(int ao_sequenceNumber) {
        this.ao_sequenceNumber = ao_sequenceNumber;
    }

    public Question getAo_question() {
        return ao_question;
    }

    public void setAo_question(Question ao_question) {
        this.ao_question = ao_question;
    }

    @Override
    public String toString() {
        return "AnswerOption{" +
                "ao_id=" + ao_id +
                ", ao_String='" + ao_text + '\'' +
                ", ao_value=" + ao_value +
                ", ao_question=" + ao_question +
                '}';
    }
}
