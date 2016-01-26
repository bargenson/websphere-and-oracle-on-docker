package com.clevertoday.bnc.rest;

import com.clevertoday.bnc.model.Visitor;
import com.clevertoday.bnc.service.VisitorService;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import java.util.List;

/**
 * Created by bargenson on 2016-01-23.
 */
@Path("/visitor")
public class VisitorResource {

    @EJB
    private VisitorService visitorService;

    @Context
    private HttpServletRequest request;

    @GET @Path("/")
    @Produces("application/json")
    public List<Visitor> getVisitors() {
        visitorService.addVisitor(request.getRemoteAddr(), request.getHeader("User-Agent"));
        return visitorService.getVisitors();
    }

}
