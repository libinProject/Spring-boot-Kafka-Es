package com.itbin.springbootkafka.data.utils;

/**
 * Created by LIBIN on 2019/1/11 15:39
 * Description:
 */
public class Contants {

    /**
     * 通知是否有效
     */
    public static class NoticeIsEffective{
        /** 无效 */
        public static final String NO = "0";
        /** 有效 */
        public static final String YES = "1";
    }

    /**
     * 通知发送状态
     */
    public static class NoticeStatus{
        /**  初始 */
        public static final String INIT = "0";
        /**  发送成功 */
        public static final String SENDSUCCESS = "1";
        /**  发送失败 */
        public static final String SENDERROR = "2";
    }

    /**
     * 通知用户读取状态
     */
    public static class NoticeUserStatus{
        /**  未读取 */
        public static final String READERROR = "0";
        /**  已经读取 */
        public static final String READSUCCESS = "1";
    }
}
