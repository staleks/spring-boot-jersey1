/**
 * 
 */
package rs.in.staleksit.demo.jersey1.dto;

import java.io.Serializable;

/**
 *
 */
public class ManufacturerDTO implements Serializable {
	private static final long serialVersionUID = 191601652880201779L;
	
	private Integer id;
	
	private String name;
	
	private boolean active;
	
	public ManufacturerDTO(Integer id, String name, boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isActive() {
		return active;
	}

}
