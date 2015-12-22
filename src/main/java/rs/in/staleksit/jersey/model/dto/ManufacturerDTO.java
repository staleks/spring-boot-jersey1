/**
 * 
 */
package rs.in.staleksit.jersey.model.dto;

import java.io.Serializable;

/**
 *
 */
public class ManufacturerDTO implements Serializable {
	private static final long serialVersionUID = 191601652880201779L;
	
	private Integer id;
	
	private String name;
	
	public ManufacturerDTO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
