package at.htl.questionz.model;

public class Transaction {

    private Long t_id;
    private String t_code;
    private String t_password;
    private boolean t_isUsed;
    private Survey t_survey;

    public Transaction() {
    }

    public Transaction(Long t_id, String t_code, String t_password, boolean t_isUsed, Survey t_survey) {
        this.t_id = t_id;
        this.t_code = t_code;
        this.t_password = t_password;
        this.t_isUsed = t_isUsed;
        this.t_survey = t_survey;
    }

    public Long getT_id() {
        return t_id;
    }

    public void setT_id(Long t_id) {
        this.t_id = t_id;
    }

    public String getT_code() {
        return t_code;
    }

    public void setT_code(String t_code) {
        this.t_code = t_code;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    public boolean isT_isUsed() {
        return t_isUsed;
    }

    public void setT_isUsed(boolean t_isUsed) {
        this.t_isUsed = t_isUsed;
    }

    public Survey getT_survey() {
        return t_survey;
    }

    public void setT_survey(Survey t_survey) {
        this.t_survey = t_survey;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "t_id=" + t_id +
                ", t_code='" + t_code + '\'' +
                ", t_password='" + t_password + '\'' +
                ", t_isUsed=" + t_isUsed +
                ", t_survey=" + t_survey +
                '}';
    }
}
