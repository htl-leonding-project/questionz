package at.htl.questionz.model;

import at.htl.model.AnswerOption;
import at.htl.model.Question;
import at.htl.model.QuestionType;
import at.htl.model.Questionnaire;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class AnswerOptionTest {

    byte[] byteArray = {1, 2, 3};
    Blob blob = new SerialBlob(byteArray);
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Question question = new Question("An diesem Lehrer gefällt mir...", 1, blob, QuestionType.FREETEXT, questionnaire);
    String text = "Ich denke, dieser Lehrer kennt mich persönlich schon sehr gut, sowohl in meinen Stärken wie in meinen Schwächen";
    int value = 1;
    int sequenceNumber = 2;
    AnswerOption answerOption = new AnswerOption(text, value, sequenceNumber, question);

    AnswerOptionTest() throws SQLException {
    }

    @Test
    @Order(10)
    void createAnswerOption_Test() {
        assertThat(answerOption.getText()).isEqualTo(text);
        assertThat(answerOption.getValue()).isEqualTo(value);
        assertThat(answerOption.getSequenceNumber()).isEqualTo(sequenceNumber);
        assertThat(answerOption.getQuestion()).isEqualTo(question);
    }

    @Test
    @Order(20)
    void toString_Test() {
        assertThat(answerOption.toString()).isEqualTo("AnswerOption{id=null, text='Ich denke, dieser Lehrer kennt mich persönlich schon sehr gut, sowohl in meinen Stärken wie in meinen Schwächen', value=1, sequenceNumber=2, question=Question{id=null, text='An diesem Lehrer gefällt mir...', sequenceNumber=1, image=javax.sql.rowset.serial.SerialBlob@1c458e0, type=FREETEXT, questionnaire=Questionnaire{id=null, name='Schüler zufriedenheit', desc='In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.'}}}");
    }
}