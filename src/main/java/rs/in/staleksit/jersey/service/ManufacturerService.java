package rs.in.staleksit.jersey.service;

import rs.in.staleksit.jersey.model.dto.ManufacturerDTO;

public interface ManufacturerService {
	
	ManufacturerDTO findOne(Integer id);
}
