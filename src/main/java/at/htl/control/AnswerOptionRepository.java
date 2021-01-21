package at.htl.control;

import at.htl.model.Answer;
import at.htl.model.AnswerOption;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class AnswerOptionRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void delete(AnswerOption answerOption) {
        em.remove(answerOption);
    }

    @Transactional
    public void save(AnswerOption answerOption){
        em.merge(answerOption);
    }

    public List<AnswerOption> findAll() {
        return em
                .createNamedQuery("AnswerOption.findAll", AnswerOption.class)
                .getResultList();
    }

}
