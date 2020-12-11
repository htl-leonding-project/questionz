package at.htl.control;

import at.htl.model.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class TeacherRepository {

    @Inject
    EntityManager em;

    public void add(Teacher newTeacher) {
        em.persist(newTeacher);
    }


    
}

