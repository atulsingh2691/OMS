package ibm.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ibm.oms.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
