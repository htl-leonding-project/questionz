package at.htl.questionz.model;

import at.htl.model.Questionnaire;
import at.htl.model.Survey;
import at.htl.model.Teacher;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class SurveyTest {

    Teacher teacher = new Teacher("Max Mustermann");
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Survey survey = new Survey(LocalDate.of(2020, 8,1), teacher, questionnaire);

    @Test
    @Order(10)
    void createSurvey_Test() {
        //assert
        assertThat(survey.getDate()).isEqualTo(LocalDate.of(2020, 8,1));
    }

    @Test
    @Order(20)
    void toString_test() {
        assertThat(survey.toString()).isEqualTo("Survey{id=null, date=2020-08-01, teacher=Teacher{id=null, name='Max Mustermann'}, questionnaire=Questionnaire{id=null, name='Schüler zufriedenheit', desc='In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.'}}");
    }
}