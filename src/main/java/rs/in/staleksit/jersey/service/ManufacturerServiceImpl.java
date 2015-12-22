package rs.in.staleksit.jersey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import rs.in.staleksit.jersey.model.dto.ManufacturerDTO;

@Service("manufacturerService")
public class ManufacturerServiceImpl implements ManufacturerService {

	
	public ManufacturerDTO findOne(Integer id) {
		return new ManufacturerDTO(1, "Samsung", true);
	}

	@Override
	public List<ManufacturerDTO> findAll() {
		return listOfManufacturers();
	}
	
	private List<ManufacturerDTO> listOfManufacturers() {
		List<ManufacturerDTO> result = new ArrayList<ManufacturerDTO>();
		
		ManufacturerDTO manufacturer1 = new ManufacturerDTO(1, "Samsung", true);
		result.add(manufacturer1);
		
		ManufacturerDTO manufacturer2 = new ManufacturerDTO(2, "Alcatel", true);
		result.add(manufacturer2);
		
		return result;
	}

}
