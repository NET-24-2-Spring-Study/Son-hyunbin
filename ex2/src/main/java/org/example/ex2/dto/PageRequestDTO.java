package org.example.ex2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageRequestDTO{
    @Builder.Default
    @Min(1)
    private int page =1;
    @Builder.Default
    @Max(100)
    @Min(10)
    private int size=10;
    public Pageable getPageable(Sort sort){
        int pageNum= page <0 ? 1: page-1;
        int sizeNum=Size <=10? 10: size;
        return PageRequest.of(pageNum, sizeNum, sort);
    }

}