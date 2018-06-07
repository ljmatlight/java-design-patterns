package com.github.ljmatlight.guides.behavioral.strategy;

/**
 * 测试使用策略模式进行邮件的发送
 *
 * @author ljmatlight
 * @date 2018/6/7
 */
public class TestDemo {

    public static void main(String[] args) {

        SubjectContext subjectContext = new SubjectContext();
        subjectContext.setSubjectStrategy(new SubjectStrategyForMathematicalLogic());
        subjectContext.sendEmail();

    }

}
