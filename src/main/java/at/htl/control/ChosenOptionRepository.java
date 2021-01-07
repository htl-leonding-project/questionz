package at.htl.control;

import at.htl.model.ChosenOption;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ChosenOptionRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void delete(ChosenOption chosenOption) {
        em.remove(chosenOption);
    }

    @Transactional
    public void save(ChosenOption chosenOption){
        em.merge(chosenOption);
    }

    public List<ChosenOption> findAll() {
        return em
                .createNamedQuery("ChosenOption.findAll", ChosenOption.class)
                .getResultList();
    }
}
