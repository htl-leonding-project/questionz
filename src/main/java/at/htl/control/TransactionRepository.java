package at.htl.control;

import at.htl.model.Transaction;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class TransactionRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void delete(Transaction transaction) {
        em.remove(transaction);
    }

    @Transactional
    public void save(Transaction transaction){
        em.merge(transaction);
    }

    public List<Transaction> findAll() {
        return em
                .createNamedQuery("Transaction.findAll", Transaction.class)
                .getResultList();
    }
}
