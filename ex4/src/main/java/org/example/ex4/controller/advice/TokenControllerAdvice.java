package org.example.ex4.controller.advice;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.example.ex4.member.exception.MemberTaskException;

import java.util.Map;

@RestControllerAdvice
@Log4j2
public class TokenControllerAdvice {

@ExceptionHandler(MemberTaskException.class)
   public ResponseEntity<Map<String,String>> handleTaskException(MemberTaskException ex) {
    log.error(ex.getMessage());
    String msg=ex.getMsg();
    int status=ex.getCode();

    Map<String,String> map =Map.of("error", msg);

    return ResponseEntity.status(status).body(map);
}


@ExceptionHandler(AccessDeniedException.class)
 public ResponseEntity<?>
 handleAccessDeniedException(AccessDeniedExcpetion exception){
log.info("handleAccessDeniedException ... ");
Map<String,Object> errors= new HashMap<>();
errors.put("message", exception.getMessage());
return new ResponseEntity<>(errors, HttpStatus.FORBIDDEN);


}




}
