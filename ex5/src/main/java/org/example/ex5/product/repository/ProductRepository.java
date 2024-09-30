package org.example.ex5.product.repository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> , ProductSearch {
}
