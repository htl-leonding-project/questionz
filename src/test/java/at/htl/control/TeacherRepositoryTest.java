package at.htl.control;

import at.htl.model.Teacher;
import com.google.inject.Inject;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class TeacherRepositoryTest {

    @Inject
    TeacherRepository teacherRepository;
    @Inject
    Teacher teacher;

    @Test
    void t100_saveTeacherContains() {
        teacher.setId(1L);
        teacher.setName("Herr Lehrer");
        teacherRepository.save(teacher);
        int amount = teacherRepository.findAll().size();
        assertThat(amount).isEqualTo(1);
    }

}