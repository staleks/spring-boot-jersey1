package rs.in.staleksit.jersey.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import rs.in.staleksit.jersey.model.dto.ManufacturerDTO;
import rs.in.staleksit.jersey.service.ManufacturerService;

@Controller
@Path("/manufacturer")
@Produces(MediaType.APPLICATION_JSON)
public class ManufacturerController {
	
	@Autowired
	private ManufacturerService manufacturerService;
	
	@GET
	@Path("{id}")
	public ManufacturerDTO findOne(@PathParam("id") Integer id) {
		return manufacturerService.findOne(id); 
	}

}
