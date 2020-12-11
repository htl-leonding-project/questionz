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
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Question question = new Question("An diesem Lehrer gefällt mir...", 1, blob, QuestionType.FREETEXT, questionnaire);
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
}