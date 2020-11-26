package at.htl.questionz.model;

public class AnswerOption {

    private Long ao_id;
    private String ao_String;
    private int ao_value;
    private Question ao_question;

    public AnswerOption() {
    }

    public AnswerOption(Long ao_id, String ao_String, int ao_value, Question ao_question) {
        this.ao_id = ao_id;
        this.ao_String = ao_String;
        this.ao_value = ao_value;
        this.ao_question = ao_question;
    }

    public Long getAo_id() {
        return ao_id;
    }

    public void setAo_id(Long ao_id) {
        this.ao_id = ao_id;
    }

    public String getAo_String() {
        return ao_String;
    }

    public void setAo_String(String ao_String) {
        this.ao_String = ao_String;
    }

    public int getAo_value() {
        return ao_value;
    }

    public void setAo_value(int ao_value) {
        this.ao_value = ao_value;
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
                ", ao_String='" + ao_String + '\'' +
                ", ao_value=" + ao_value +
                ", ao_question=" + ao_question +
                '}';
    }
}
