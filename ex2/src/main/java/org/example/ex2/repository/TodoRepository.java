package org.example.ex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.ex2.entity.TodoEntity;



public interface TodoRepository extends JpaRepository<TodoEntity,Long> {
}