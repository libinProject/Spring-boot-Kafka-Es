package com.itbin.springbootkafka.data.dao;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by LIBIN on 2019/1/11 15:43
 * Description:
 */
@Data
public class MessageDto {

    private String id;
    private String name;
    private Timestamp date;
}
