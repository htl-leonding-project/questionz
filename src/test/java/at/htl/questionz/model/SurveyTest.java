package at.htl.questionz.model;

import at.htl.model.Questionnaire;
import at.htl.model.Survey;
import at.htl.model.Teacher;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class SurveyTest {

    Teacher teacher = new Teacher("Max Mustermann");
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Survey survey = new Survey(LocalDate.of(2020, 8,1), teacher, questionnaire);

    @Test
    void createSurvey_Test() {
        //assert
        assertThat(survey.getDate()).isEqualTo(LocalDate.of(2020, 8,1));
        assertThat(survey.getQuestionnaire().getName()).isEqualTo("Schüler zufriedenheit");
        assertThat(survey.getQuestionnaire().getDesc()).isEqualTo("In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
        assertThat(survey.getTeacher().getName()).isEqualTo("Max Mustermann");
    }
}