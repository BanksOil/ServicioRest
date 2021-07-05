/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.rest;

import com.service.beans.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author BanksOil
 */
@Path("Cliente")
public class ProductoResource {
    @Context
    private UriInfo context;

    public ProductoResource() {
    }

    static final List<Cliente> lista = new ArrayList<>();
    
    @GET
    @Path("listar")
    @Produces("application/json")
    public List<Cliente> listarClientes() { 
        return lista;
    }
    //Almacenar objeto json
    @POST
    @Path("guardar")
    @Produces("application/json")
    @Consumes("application/json")
    public List<Cliente> guardarClientes(Cliente c) {
        lista.add(c);
        return lista;
    }
    //Buscar objeto json
    @POST
    @Produces("application/json")
    @Path("buscar/{id}")
    public Cliente buscar(@PathParam("id") String id) {
        Cliente resp = new Cliente();
        for(Cliente c:lista) {
            if(c.getId().equals(id)){
                resp.setStatus("true");
                resp.setMessage("Info. Correcta");
                resp.setError("Null");
            } else {
                resp.setStatus("false");
                resp.setMessage("Info. No encontrada");
                resp.setError("5018");
            }
        }
        
        return resp;
    }
}
