package com.longye.strategypattern;

/**
 * 宠物类 攻击力 50
 * Created by tianl on 2018/9/6.
 */
public class Chongwu implements IEquip {

    @Override
    public int countAttack() {
        return 50;
    }

    @Override
    public String description() {
        return "熔岩巨兽宠物";
    }
}
