package at.htl.questionz.model;

public class Questionnaire {

    private Long qn_id;
    private String qn_name;
    private String qn_desc;
    private Survey qn_survey;
    private Question qn_question;

    public Questionnaire() {
    }

    public Questionnaire(Long qn_id, String qn_name, String qn_desc, Survey qn_survey, Question qn_question) {
        this.qn_id = qn_id;
        this.qn_name = qn_name;
        this.qn_desc = qn_desc;
        this.qn_survey = qn_survey;
        this.qn_question = qn_question;
    }

    public Long getQn_id() {
        return qn_id;
    }

    public void setQn_id(Long qn_id) {
        this.qn_id = qn_id;
    }

    public String getQn_name() {
        return qn_name;
    }

    public void setQn_name(String qn_name) {
        this.qn_name = qn_name;
    }

    public String getQn_desc() {
        return qn_desc;
    }

    public void setQn_desc(String qn_desc) {
        this.qn_desc = qn_desc;
    }

    public Survey getQn_survey() {
        return qn_survey;
    }

    public void setQn_survey(Survey qn_survey) {
        this.qn_survey = qn_survey;
    }

    public Question getQn_question() {
        return qn_question;
    }

    public void setQn_question(Question qn_question) {
        this.qn_question = qn_question;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "qn_id=" + qn_id +
                ", qn_name='" + qn_name + '\'' +
                ", qn_desc='" + qn_desc + '\'' +
                ", qn_survey=" + qn_survey +
                ", qn_question=" + qn_question +
                '}';
    }
}
