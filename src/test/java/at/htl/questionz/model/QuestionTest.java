package at.htl.questionz.model;

import at.htl.model.Question;
import at.htl.model.QuestionType;
import at.htl.model.Questionnaire;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.sql.SQLException;

class QuestionTest {

    byte[] byteArray = {1, 2, 3};
    Blob blob = new SerialBlob(byteArray);
    Questionnaire questionnaire = new Questionnaire("Schüler zufriedenheit", "In diesem Fragebogen wird die zufriedenheit der Schüler abgefragt.");
    Question question = new Question("An diesem Lehrer gefällt mir...", 1, blob, QuestionType.FREETEXT, questionnaire);

    QuestionTest() throws SQLException {
    }
}