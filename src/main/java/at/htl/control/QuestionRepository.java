package at.htl.control;

import at.htl.model.Question;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class QuestionRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void delete(Question question) {
        em.remove(question);
    }

    @Transactional
    public void save(Question question){
        em.merge(question);
    }

    public List<Question> findAll() {
        return em
                .createNamedQuery("Question.findAll", Question.class)
                .getResultList();
    }
}
