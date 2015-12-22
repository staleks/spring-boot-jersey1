package rs.in.staleksit.jersey.service;

import org.springframework.stereotype.Service;

import rs.in.staleksit.jersey.model.dto.ManufacturerDTO;

@Service("manufacturerService")
public class ManufacturerServiceImpl implements ManufacturerService {

	
	public ManufacturerDTO findOne(Integer id) {
		return new ManufacturerDTO(1, "Samsung");
	}

}
