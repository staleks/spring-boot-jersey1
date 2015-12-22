/**
 * 
 */
package rs.in.staleksit.demo.jersey1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rs.in.staleksit.demo.jersey1.model.manufacturer.ManufacturerImpl;

/**
 *
 */
public interface ManufacturerRepository extends JpaRepository<ManufacturerImpl, Integer> {

}
