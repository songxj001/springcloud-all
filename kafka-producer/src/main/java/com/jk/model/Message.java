package com.jk.model;

import lombok.Data;

import java.util.Date;

@Data
public class Message {

    /**
     * id
     */
    private Long id;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 发送时间戳
     */
    private Date sendTime;
}
