package at.htl.questionz.model;

import at.htl.model.Questionnaire;
import at.htl.model.Survey;
import at.htl.model.Teacher;
import at.htl.model.Transaction;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionTest {

    Teacher teacher = new Teacher("Max Mustermann");
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Survey survey = new Survey(LocalDate.of(2020, 8,1), teacher, questionnaire);
    Transaction transaction = new Transaction("code", "password123", false, survey);

    @Test
    @Order(10)
    void createTransaction_Test() {
        //assert
        assertThat(transaction.getCode()).isEqualTo("code");
        assertThat(transaction.getPassword()).isEqualTo("password123");
        assertThat(transaction.isUsed).isEqualTo(false);
    }
}