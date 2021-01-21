package at.htl.questionz.model;

import at.htl.model.Question;
import at.htl.model.QuestionType;
import at.htl.model.Questionnaire;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class QuestionTest {

    byte[] byteArray = {1, 2, 3};
    Blob blob = new SerialBlob(byteArray);
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    QuestionType questionType = new QuestionType(1L, "FREETEXT");
    Question question = new Question("An diesem Lehrer gefällt mir...", 1, blob, questionType, questionnaire);

    QuestionTest() throws SQLException {}

    @Test
    @Order(10)
    void createQuestion_Test() throws SQLException {
        assertThat(question.getText()).isEqualTo("An diesem Lehrer gefällt mir...");
        assertThat(question.getSeqNumber()).isEqualTo(1);
        assertThat(question.getImage()).isEqualTo(new SerialBlob(byteArray));
        assertThat(question.getType(1L)).isEqualTo(questionType.getMap().get(1L));
        assertThat(question.getQuestionnaire()).isEqualTo(questionnaire);
    }

    @Test
    @Order(20)
    void toString_Test() {
        assertThat(question.toString()).isEqualTo("Question{id=null, text='An diesem Lehrer gefällt mir...', sequenceNumber=1, image=javax.sql.rowset.serial.SerialBlob@1c458e0, type=FREETEXT, questionnaire=Questionnaire{id=null, name='Schüler zufriedenheit', desc='In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.'}}");
    }
}