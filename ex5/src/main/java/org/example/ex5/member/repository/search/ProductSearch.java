package org.example.ex5.member.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.example.ex5.product.dto.ProductListDTO;
public interface ProductSearch {
Page<ProductListDTO> list(Pageable pageable);
Page<ProductDTO>listWithAllImages(Pageable pageable);
}
