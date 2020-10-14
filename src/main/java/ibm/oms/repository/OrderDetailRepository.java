package ibm.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ibm.oms.model.OrderDetail;
import ibm.oms.model.Product;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    Boolean existsByProduct(Product product);
}
