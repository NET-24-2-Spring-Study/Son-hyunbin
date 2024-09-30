package org.example.ex5.product.exception;
import lombok.Getter;
import lombok.ToString;
public class ProductTaskException extends RuntimeException {
private int code;
private String message;
public ProductTaskException(String message, int code){
    super(message);
    this.message=message;
    this.code=code;
}
}
