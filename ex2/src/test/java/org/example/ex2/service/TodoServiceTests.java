package org.example.ex2.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.example.ex2.dto.TodoDTO;
import java.time.LocalDate;

@SpringBootTest
public class TodoServiceTests{
    @Autowired
    private TodoService todoService;

    @Test
    public void testRegister(){
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setTitle("Test Todo");
        todoDTO.setWriter("user00");
        todoDTO.setDueDate(LocalDate.of(2025,12,23));
        TodoDTO resultDTO= todoService.register(todoDTO);

        System.out.println(resultDTO);

    }



}