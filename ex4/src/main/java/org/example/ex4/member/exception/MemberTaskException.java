package org.example.ex4.member.exception;

import lombok.Data;
import lombok.Getter;

@Getter
public class MemberTaskException extends RuntimeException {

private String msg;
private int code;

public MemberTaskException(String msg, int code) {
    this.msg = msg;
    this.code = code;
}
}
