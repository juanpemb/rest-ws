package org.jp.ws.jersey;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

	@Path("/hello")
public class HelloWorldEndpoint {
 
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_JSON})
	public Response getMsg(@PathParam("param") String msg) {
 
		Message message = new Message();
		message.dateTime = new Date();
		message.id = "1";
		message.message = "Hello world message: " + msg;
		return Response.status(200).entity(message).build();
 
	}
	 
	
 
}