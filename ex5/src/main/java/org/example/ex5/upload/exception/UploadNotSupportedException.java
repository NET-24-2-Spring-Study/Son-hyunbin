package org.example.ex5.upload.exception;

public class UploadNotSupportedException extends RuntimeException {
public UploadNotSupportedException(String message) {
    super(message);
}
public UploadNotSupportedException(String message, Throwable cause){
    super(message, cause);
}

}
