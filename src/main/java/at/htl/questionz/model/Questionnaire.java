package at.htl.questionz.model;

public class Questionnaire {

    private Long qn_id;
    private String qn_name;
    private String qn_desc;

    public Questionnaire() {
    }

    public Questionnaire(Long qn_id, String qn_name, String qn_desc) {
        this.qn_id = qn_id;
        this.qn_name = qn_name;
        this.qn_desc = qn_desc;
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

    @Override
    public String toString() {
        return "Questionnaire{" +
                "qn_id=" + qn_id +
                ", qn_name='" + qn_name + '\'' +
                ", qn_desc='" + qn_desc + '\'' +
                '}';
    }
}
