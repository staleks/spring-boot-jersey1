package rs.in.staleksit.demo.jersey1.service;

import java.util.List;

import rs.in.staleksit.demo.jersey1.dto.ManufacturerDTO;

public interface ManufacturerService {
	
	ManufacturerDTO findOne(Integer id);
	
	List<ManufacturerDTO> findAll();
}
