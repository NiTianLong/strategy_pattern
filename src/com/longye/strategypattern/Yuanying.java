package com.longye.strategypattern;

/**
 * 元婴类 攻击力 30
 * Created by tianl on 2018/9/6.
 */
public class Yuanying implements IEquip {

    @Override
    public int countAttack() {
        return 30;
    }

    @Override
    public String description() {
        return "三花聚顶元婴";
    }
}
