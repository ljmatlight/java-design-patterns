package com.github.ljmatlight.guides.behavioral.strategy;

/**
 * 专注力训练课程学科策略
 *
 * @author ljmatlight
 * @date 2018/6/7
 */
public class SubjectStrategyForConcentration implements SubjectStrategy {

    @Override
    public void sendEmail() {
        System.out.println("发送专注力训练课程学科邮件！");

    }
}
