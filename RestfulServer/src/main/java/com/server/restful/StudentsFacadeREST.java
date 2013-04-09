/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.restful;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author background05
 */
@Stateless
@Path("com.server.restful.students")
public class StudentsFacadeREST extends AbstractFacade<Students> {

    @PersistenceContext(unitName = "com.server._RestfulServer_war_1.0PU")
    private EntityManager em;

    public StudentsFacadeREST() {
        super(Students.class);
    }

    @GET
    @Path("/xml")
    @Produces({"application/xml"})
    public List<Students> findAllXml() {
        return super.findAll();
    }

    @GET
    @Path("/json")
    @Produces({"application/json"})
    public List<Students> findAllJson() {
        return super.findAll();
    }

    /**
     * *******************
     */
    @GET
    @Path("xml/{id}")
    @Produces({"application/xml"})
    public Students findXml(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("json/{id}")
    @Produces({"application/json"})
    public Students findJson(@PathParam("id") Integer id) {
        return super.find(id);
    }

    /**
     * **********
     */
    @GET
    @Path("search/xml/{name}")
    @Produces({"application/xml"})
    public List<Students> findNameXml(@PathParam("name") String name) {
        return super.search(name);
    }

    @GET
    @Path("search/json/{name}")
    @Produces({"application/json"})
    public List<Students> findNameJson(@PathParam("name") String name) {
        return super.search(name);
    }

    /**
     * ****
     */
    @DELETE
    @Path("remove/{id}")
    @Produces({"application/json"})
    public String remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
        return "OK";
    }

    /*-***********/
    @POST
    @Path("create/xml")
    @Consumes({"application/xml"})
    public Students createXml(Students entity) {

        System.out.println(entity.toString());
         super.create(entity);
        return entity;
    }

    @POST
    @Path("create/json")
    @Consumes({"application/json"})
    public Students createJson(Students entity) {
        super.create(entity);
        return entity;
    }

    /**
     * ******
     */
    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Students entity) {
        super.create(entity);
    }

    @PUT
    @Path("update/xml")
    @Consumes({"application/xml"})
    public Students editXml(Students entity) {
        super.edit(entity);
        return entity;
    }

    @PUT
    @Path("update/json")
    @Consumes({"application/json"})
    public Students editJson(Students entity) {
        super.edit(entity);
        return entity;
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Students find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Students> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
