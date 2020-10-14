package ibm.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ibm.oms.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
