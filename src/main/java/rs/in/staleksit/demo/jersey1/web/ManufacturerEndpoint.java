package rs.in.staleksit.demo.jersey1.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rs.in.staleksit.demo.jersey1.dto.ManufacturerDTO;
import rs.in.staleksit.demo.jersey1.service.ManufacturerService;

@Component
@Path("/manufacturers")
@Produces(MediaType.APPLICATION_JSON)
public class ManufacturerEndpoint {
	
	@Autowired
	private ManufacturerService manufacturerService;
	
	@GET
	@Path("{id}")
	public ManufacturerDTO findOne(@PathParam("id") Integer id) {
		return manufacturerService.findOne(id); 
	}
	
	@GET
	public List<ManufacturerDTO> findAll() {
		return manufacturerService.findAll(); 
	}
	

}
