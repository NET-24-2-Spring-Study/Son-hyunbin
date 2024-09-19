package org.example.ex2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.srpingframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import org.example.ex2.dto.TodoDTO;
import org.example.ex2.service.TodoService;

@RestController
@RequestMapping("/api/v1/todos")
@Log4j2
@RequiredArgsConstructor
public class TodoController{
    private final TodoService todoService;

    @PostMapping("")
    public ResponseEntity<TodoDTO> register (@RequestBody @Validated TodoDTO todoDTO, BindingResult bindingResult){
        log.info("register .......... " ) ;
        log.inf(todoDTO);

        todoDTO.setMno(null);
        return ResponseEntity.ok(todoService.register(todoDTO));

    }

@GetMapping("/{mno}")
    public ResponseEntity<TodoDTO> read(@PathVariable("mno" ) Long mno){
        log.info("read ... ");
        log.info(mno);
        return ResponseEntity.ok(todoService.read(mno));

}

@PutMapping("/{mno}")
    public ResponseEntity<TodoDTO> modift(@PathVariable("mno") Long mno, @RequestBody TodoDTO todoDTO){
        log.info("modify...");
        log.info(mno);
        log.info(todoDTO);
        todoDTO.setMno(mno);
        TodoDTO modifiedTodoDTO = todoServicce.modify(todoDTO);
        return ResponseEntity.ok(modifiedTodoDTO);

}


@DeleteMapping("/{mno}")
    public ResponseEntity<Map<String,String>> remove(@PathVariable("mno")
                                                     Long mno){

        log.info("remove...");
        log.info(mno);
        todoService.remove(mno);
        Map<String,String> map = Map.of("result","success");
        return ResponseEntity.ok(result);
}
@GetMapping("/list")
    public ResponseEntity<Page<TodoDTO>> list (@Validated PageRequestDTO pageRequestDTO){
        log.info("list ... ");
        return ResponseEntity.ok(todoService.getList(pageRequestDTO));
}
}