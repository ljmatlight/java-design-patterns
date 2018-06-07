package com.github.ljmatlight.guides.behavioral.strategy;

/**
 * 学科策略上下文
 *
 * @author ljmatlight
 * @date 2018/6/7
 */
public class SubjectContext {

    private SubjectStrategy subjectStrategy;

    public void setSubjectStrategy(SubjectStrategy subjectStrategy) {
        this.subjectStrategy = subjectStrategy;
    }

    /**
     * 不同的学科选择不同的策略进行邮件的发送
     */
    public void sendEmail() {
        this.subjectStrategy.sendEmail();
    }

}
