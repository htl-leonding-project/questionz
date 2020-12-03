package at.htl.questionz.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ChosenOption {

    //TODO: JPA FOREIGN KEYS
    @Column(name = "co_answerOption")
    private AnswerOption co_answerOption;
    @Column(name = "co_answer")
    private Answer co_answer;

    public ChosenOption() {
    }

    public ChosenOption(AnswerOption co_answerOption, Answer co_answer, Question co_question) {
        this.co_answerOption = co_answerOption;
        this.co_answer = co_answer;
        this.co_question = co_question;
    }

    public AnswerOption getCo_answerOption() {
        return co_answerOption;
    }

    public void setCo_answerOption(AnswerOption co_answerOption) {
        this.co_answerOption = co_answerOption;
    }

    public Answer getCo_answer() {
        return co_answer;
    }

    public void setCo_answer(Answer co_answer) {
        this.co_answer = co_answer;
    }

    public Question getCo_question() {
        return co_question;
    }

    public void setCo_question(Question co_question) {
        this.co_question = co_question;
    }

    @Override
    public String toString() {
        return "ChosenOption{" +
                "co_answerOption=" + co_answerOption +
                ", co_answer=" + co_answer +
                ", co_question=" + co_question +
                '}';
    }
}
