package at.htl.questionz.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ChosenOption {

    //TODO: JPA FOREIGN KEYS
    @Column(name = "co_answerOption")
    private AnswerOption answerOption;
    @Column(name = "co_answer")
    private Answer answer;

    public ChosenOption() {
    }

    public ChosenOption(AnswerOption answerOption, Answer answer) {
        this.answerOption = answerOption;
        this.answer = answer;
    }

    public AnswerOption getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(AnswerOption co_answerOption) {
        this.answerOption = co_answerOption;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer co_answer) {
        this.answer = co_answer;
    }


    @Override
    public String toString() {
        return "ChosenOption{" +
                "co_answerOption=" + answerOption +
                ", co_answer=" + answer +
                '}';
    }
}
