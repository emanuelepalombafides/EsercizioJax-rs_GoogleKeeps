package com.doitgeek.jersey_heroku_webapp;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("myresource")
public class MyResource {
	
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello, Heroku!";
    }
    
//    @POST
//    @Path("/create/{note}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Note createNote(Long id,String title,String author) {
//    	Note note = new Note(id,title,author);
//    	return note;
//    }
    
}
