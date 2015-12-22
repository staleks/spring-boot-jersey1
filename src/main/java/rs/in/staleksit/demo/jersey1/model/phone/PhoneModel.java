/**
 * 
 */
package rs.in.staleksit.demo.jersey1.model.phone;

import rs.in.staleksit.demo.jersey1.model.manufacturer.Manufacturer;

/**
 *
 */
public interface PhoneModel {
	
	Integer getId();
	
	String getName();
	
	boolean isActive();
	
	Manufacturer getManufacturer();

}
