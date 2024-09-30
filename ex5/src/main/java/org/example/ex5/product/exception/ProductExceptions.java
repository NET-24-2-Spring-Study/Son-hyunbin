package org.example.ex5.product.exception;

public enum ProductExceptions {
PRODUCT_NOT_FOUND("PRODUCT NOT FOUND", 404),
    PRODUCT_NOT_REGISTERED("PRODUCT NOT REGISTERED", 400),
    PRODUCT_NOT_MODIFIED("PRODUCT NOT MODIFIED", 400),
    PRODUCT_NOT_REMOVED("PRODUCT NOT REMOVED", 400),
    PRODUCT_NOT_FETCHED("PRODUCT NOT FETCHED", 400);

private ProductTaskException productTaskException;
ProductExceptions(String message, int code){
    this.productTaskException = new ProductTaskException(message, code);
}
public ProductTaskException get(){
    return productTaskException;
}
}
