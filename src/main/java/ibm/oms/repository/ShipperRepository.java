package ibm.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ibm.oms.model.Shipper;

public interface ShipperRepository extends JpaRepository<Shipper, Long> {

}
