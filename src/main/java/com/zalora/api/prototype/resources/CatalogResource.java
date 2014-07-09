package com.zalora.api.prototype.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.zalora.api.prototype.model.*;
import com.zalora.api.prototype.util.HibernateUtil;
import org.hibernate.Session;


/**
 * Created by zheng on 7/9/14.
 */
@Path("catalog_simple")
public class CatalogResource {
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Got it!";
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CatalogSimple getCatalogSimpleById(@PathParam("id") String id) {
        CatalogSimple catalogSimple = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            catalogSimple = (CatalogSimple) session.get(CatalogSimple.class, Integer.parseInt(id));
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return catalogSimple;
    }
}