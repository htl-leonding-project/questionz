package at.htl.control;

import at.htl.model.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class TeacherRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void add(Teacher newTeacher) {
        em.persist(newTeacher);
    }

    @Transactional
    public void delete(Teacher teacher) {
        em.remove(teacher);
    }

    public void update(Teacher teacher){
        em.merge(teacher);
    }

    public List<Teacher> findAll(Teacher teacher) {
        return em
                .createNamedQuery("Teacher.findAll", Teacher.class)
                .getResultList();
    }




    
}

