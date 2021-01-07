package at.htl.endpoints;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;


@ApplicationScoped
public class TeacherEndpoint {

    @Inject
    EntityManager em;



}
