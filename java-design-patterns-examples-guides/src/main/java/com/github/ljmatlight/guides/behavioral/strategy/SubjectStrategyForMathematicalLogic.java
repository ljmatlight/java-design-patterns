package com.github.ljmatlight.guides.behavioral.strategy;

/**
 * 数理逻辑训练课程学科策略
 *
 * @author ljmatlight
 * @date 2018/6/7
 */
public class SubjectStrategyForMathematicalLogic implements SubjectStrategy {

    @Override
    public void sendEmail() {
        System.out.println("发送数理逻辑训练课程学科邮件！");
    }
}
