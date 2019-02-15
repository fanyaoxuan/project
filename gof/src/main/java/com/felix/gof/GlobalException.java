package com.felix.gof;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: GlobalException
 * @author: tang
 * @create: 2018年09月15日 19:39
 * @Description: 自定义异常
 * @version: V1.0
 */
@Builder
@Getter
@Setter
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String msg;
    private Integer code;

    public GlobalException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public GlobalException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public GlobalException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public GlobalException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
