package at.htl.questionz.model;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TeacherTest {

    @Test
    @Order(10)
    void createTeacher_Test() {
        //arrange
        Teacher teacher = new Teacher("Max Mustermann");

        //assert
        assertThat(teacher.getName()).isEqualTo("Max Mustermann");
    }
}