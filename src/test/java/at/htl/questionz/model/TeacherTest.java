package at.htl.questionz.model;

import at.htl.model.Teacher;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TeacherTest {

    Teacher teacher = new Teacher("Max Mustermann");

    @Test
    @Order(10)
    void createTeacher_Test() {
        //assert
        assertThat(teacher.getName()).isEqualTo("Max Mustermann");
    }

    @Test
    @Order(20)
    void toString_Test() {
        //assert
        assertThat(teacher.toString()).isEqualTo("Teacher{id=null, name='Max Mustermann'}");
    }
}