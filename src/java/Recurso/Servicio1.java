/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recurso;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author hack123
 */
@Path("generic")
public class Servicio1 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Servicio1
     */
    public Servicio1() {
    }

    /**
     * Retrieves representation of an instance of Recurso.Servicio1
     * 
     * @param Parametros
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("Parametros")String Parametros) {
        ConsumoApi c = new ConsumoApi();
        String salida = c.API1(Parametros);
        return salida;        
    }

    /**
     * PUT method for updating or creating an instance of Servicio1
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
