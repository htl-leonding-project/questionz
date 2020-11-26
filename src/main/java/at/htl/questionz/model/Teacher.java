package at.htl.questionz.model;

public class Teacher {

    private Long t_id;
    private String t_name;

    public Teacher() {
    }

    public Teacher(Long t_id, String t_name) {
        this.t_id = t_id;
        this.t_name = t_name;
    }

    public Long getT_id() {
        return t_id;
    }

    public void setT_id(Long t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                '}';
    }
}
