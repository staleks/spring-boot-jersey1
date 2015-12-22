package rs.in.staleksit.jersey.service;

import java.util.List;

import rs.in.staleksit.jersey.model.dto.ManufacturerDTO;

public interface ManufacturerService {
	
	ManufacturerDTO findOne(Integer id);
	
	List<ManufacturerDTO> findAll();
}
