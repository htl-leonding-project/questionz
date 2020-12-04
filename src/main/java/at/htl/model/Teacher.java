package at.htl.model;

import javax.persistence.*;

@Entity
public class Teacher {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private Long id;
    @Column(name = "t_name")
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long t_id) {
        this.id = t_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String t_name) {
        this.name = t_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + id +
                ", t_name='" + name + '\'' +
                '}';
    }
}
