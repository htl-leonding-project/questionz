package at.htl.questionz.model;

import at.htl.model.Question;
import at.htl.model.QuestionType;
import at.htl.model.Questionnaire;
import org.junit.jupiter.api.Test;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class QuestionTest {

    byte[] byteArray = {1, 2, 3};
    Blob blob = new SerialBlob(byteArray);
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Question question = new Question("An diesem Lehrer gefällt mir...", 1, blob, QuestionType.FREETEXT, questionnaire);

    QuestionTest() throws SQLException {}

    @Test
    void createQuestion_Test() throws SQLException {
        assertThat(question.getText()).isEqualTo("An diesem Lehrer gefällt mir...");
        assertThat(question.getSequenceNumber()).isEqualTo(1);
        assertThat(question.getImage()).isEqualTo(new SerialBlob(byteArray));
        assertThat(question.getType()).isEqualTo(QuestionType.FREETEXT);
        assertThat(question.getQuestionnaire()).isEqualTo(questionnaire);
    }
}