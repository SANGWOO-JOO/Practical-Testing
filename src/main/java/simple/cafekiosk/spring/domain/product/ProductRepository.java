package simple.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import simple.cafekiosk.spring.domain.Product;
import simple.cafekiosk.spring.domain.ProductSellingStatus;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus>sellingStatuses);
}
