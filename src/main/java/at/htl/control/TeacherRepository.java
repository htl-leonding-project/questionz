package at.htl.control;

import at.htl.model.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class TeacherRepository {

    @Inject
    EntityManager em;

    public void add(Teacher newTeacher) {
        em.persist(newTeacher);
    }

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

