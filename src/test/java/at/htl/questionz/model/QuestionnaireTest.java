package at.htl.questionz.model;

import at.htl.model.Questionnaire;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuestionnaireTest {

    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");

    @Test
    @Order(10)
    void createQuestionnaire_Test() {
        //assert
        assertThat(questionnaire.getName()).isEqualTo("Schüler zufriedenheit");
        assertThat(questionnaire.getDesc()).isEqualTo("In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    }

    @Test
    @Order(20)
    void toString_Test() {
        assertThat(questionnaire.toString()).isEqualTo("Questionnaire{id=null, name='Schüler zufriedenheit', desc='In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.'}");
    }
}