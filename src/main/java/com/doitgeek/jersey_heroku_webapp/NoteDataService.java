package com.doitgeek.jersey_heroku_webapp;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("note")
public class NoteDataService {

	@POST
    @Path("/create/{note}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Note createNote(Long id,String title,String author) {
    	Note note = new Note(id,title,author);
    	return note;
    }
}
