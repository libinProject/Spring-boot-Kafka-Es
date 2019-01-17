package com.itbin.springbootkafka.data.utils;

import lombok.Data;

/**
 * Created by LIBIN on 2019/1/11 15:39
 * Description:
 */
@Data
public class ResultData {

    private Boolean success;
    private String code;
    private String message;
    private Object data;
}
