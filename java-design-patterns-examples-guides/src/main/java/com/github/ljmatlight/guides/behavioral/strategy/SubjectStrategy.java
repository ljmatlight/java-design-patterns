package com.github.ljmatlight.guides.behavioral.strategy;

/**
 * 学科策略接口定义
 *
 * @author ljmatlight
 * @date 2018/6/7
 */
public interface SubjectStrategy {

    /**
     * 不同的学科使用不同的邮件模板进行邮件的发送
     */
    void sendEmail();

}
