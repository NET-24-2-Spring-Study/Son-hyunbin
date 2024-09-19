package org.example.ex2.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc;
AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.example.ex2.entity.TodoEntity;

import java.time.LocalDate;

@DataJapTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Transactional(propagation=Propagation.NOT_SUPPORTED)
public class TodoRepositoryTests{
    @Autowired
    private TodoRepository todoRepository;
}

@Test
public void testInsert(){
    TodoEntity todoEntity= TodoEntity.builder()
            .title("부트 끝내기")
            .writer("user00")
            .dueDate(LocalDate.of(2025,12,23))
            .build();
    todoRepository.save(todoEntity);
    System.out.printIn("New TodoEntity MNO:" + todoEntity.getMno());
}