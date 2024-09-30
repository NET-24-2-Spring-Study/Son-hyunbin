package org.example.ex5.member.repository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> , ProductSearch {
}
