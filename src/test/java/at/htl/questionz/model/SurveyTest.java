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
}