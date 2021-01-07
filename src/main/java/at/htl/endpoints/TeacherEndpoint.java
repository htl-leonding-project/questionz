package at.htl.endpoints;

import at.htl.control.TeacherRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;


@ApplicationScoped
@Path("teacher")
public class TeacherEndpoint {

    @Inject
    TeacherRepository teacherRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List findAll(){

        return teacherRepository.findAll();
    }

}
