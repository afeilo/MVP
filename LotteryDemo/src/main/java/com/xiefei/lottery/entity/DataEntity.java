package com.xiefei.lottery.entity;

import android.support.annotation.DrawableRes;

/**
 * Created by xiefei on 2016/3/16.
 */
public class DataEntity {
    private boolean isFinished;//项目是否完成
    private @DrawableRes int logoUrl;//项目图标
    private String title;//项目标题
    private String program;//项目类型
    private String data;//时间 方便测试用String
    private int number;//场次
    private float progress;//进度
    private int PersonNum;//参与人数
    private String reminder;//提示
    private String winner;//获奖者 在finish后才会参数
    private String finishData;//结束时间 为了方便直接String

    public boolean isFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public String getFinishData() {
        return finishData;
    }

    public void setFinishData(String finishData) {
        this.finishData = finishData;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public int getPersonNum() {
        return PersonNum;
    }

    public void setPersonNum(int personNum) {
        PersonNum = personNum;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(int logoUrl) {
        this.logoUrl = logoUrl;
    }
}
