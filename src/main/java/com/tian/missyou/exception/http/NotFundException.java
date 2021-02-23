package com.tian.missyou.exception.http;

public class NotFundException extends HttpException {

    public NotFundException(int code) {
        this.code = code;
        this.httpStatusCode = 404;
    }

}
