package at.htl.questionz.model;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

class AnswerOptionTest {

    @Test
    @Order(10)
    void createAnswerOption_Test() {
        String text = "Ich denke, dieser Lehrer kennt mich persönlich schon sehr gut, sowohl in meinen Stärken wie in meinen Schwächen";
        AnswerOption answerOption = new AnswerOption(text)
    }
}