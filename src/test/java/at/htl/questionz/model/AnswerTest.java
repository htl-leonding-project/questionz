package at.htl.questionz.model;

import at.htl.model.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class AnswerTest {

    Teacher teacher = new Teacher("Max Mustermann");
    byte[] byteArray = {1, 2, 3};
    Blob blob = new SerialBlob(byteArray);
    QuestionType questionType = new QuestionType(1L, "FREETEXT");
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Question question = new Question("An diesem Lehrer gefällt mir...", 1, blob, questionType.getMap(), questionnaire);
    Survey survey = new Survey(LocalDate.of(2020, 8,1), teacher, questionnaire);
    Transaction transaction = new Transaction("code", "password123", false, survey);
    Answer answer = new Answer("Alles", transaction, question);

    AnswerTest() throws SQLException {}

    @Test
    @Order(10)
    void createAnswer_Test() {
        assertThat(answer.getText()).isEqualTo("Alles");
        assertThat(answer.getTransaction()).isEqualTo(transaction);
        assertThat(answer.getQuestion()).isEqualTo(question);
    }

    @Test
    @Order(20)
    void toString_Test() {
        assertThat(answer.toString()).isEqualTo("Answer{id=null, text='Alles', transaction=Transaction{id=null, code='code', password='password123', isUsed=false, survey=Survey{id=null, date=2020-08-01, teacher=Teacher{id=null, name='Max Mustermann'}, questionnaire=Questionnaire{id=null, name='Schüler zufriedenheit', desc='In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.'}}}, question=Question{id=null, text='An diesem Lehrer gefällt mir...', sequenceNumber=1, image=javax.sql.rowset.serial.SerialBlob@1c458e0, type=FREETEXT, questionnaire=Questionnaire{id=null, name='Schüler zufriedenheit', desc='In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.'}}}");
    }
}