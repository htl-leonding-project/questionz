package at.htl.questionz.model;

import at.htl.model.Questionnaire;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuestionnaireTest {

    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");

    @Test
    void createQuestionnaire_Test() {
        //assert
        assertThat(questionnaire.getName()).isEqualTo("Schüler zufriedenheit");
        assertThat(questionnaire.getDesc()).isEqualTo("In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    }
}