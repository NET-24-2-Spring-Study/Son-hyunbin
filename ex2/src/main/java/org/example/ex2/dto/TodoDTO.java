package org.example.ex2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.ex2.TodoEntity;

import java.time.LocalDate;

@Data
@NoArgsConstructor

public class TodoDTO{
private Long mno;
@NotEmpty
private String title;

@NotEmpty
private String writer;

@FutureOrPresent
private LocalDate dueDate;

public TodoDTO(TodoEntity todoEntity){
    this.mno= todoEntity.getMno();
    this.title = todoEntity.getTitle();
    this.writer = todoEntity.getWriter();
    this.dueDate= todoDntity.getDueDate();
}
public TodoEntity toEntity(){
    return TodoEntity.builder()
            .mno(mno)
            .title(title)
            .writer(writer)
            .dueDate(dueDate)
            .build();

}

}