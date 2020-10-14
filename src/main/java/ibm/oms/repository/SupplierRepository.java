package ibm.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ibm.oms.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
