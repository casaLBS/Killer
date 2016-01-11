package com.example.xuzhang.killer.domain;

public class Roles {
    private int killerNum;
    private int policerNum;
    private int villigerNum;
    private int judgeNum;

    public Roles(int killerNum, int policerNum, int villigerNum) {
        this.killerNum = killerNum;
        this.policerNum = policerNum;
        this.villigerNum = villigerNum;
        this.judgeNum = 1;
    }

    public int getKillerNum() {
        return killerNum;
    }

    public void setKillerNum(int killerNum) {
        this.killerNum = killerNum;
    }

    public int getPolicerNum() {
        return policerNum;
    }

    public void setPolicerNum(int policerNum) {
        this.policerNum = policerNum;
    }

    public int getVilligerNum() {
        return villigerNum;
    }

    public void setVilligerNum(int villigerNum) {
        this.villigerNum = villigerNum;
    }

    public int getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(int judgeNum) {
        this.judgeNum = judgeNum;
    }
}
