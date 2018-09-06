package com.longye.strategypattern;

/**
 * 法宝类 攻击力 20
 * Created by tianl on 2018/9/6.
 */
public class Fabao implements IEquip {

    @Override
    public int countAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "天琊剑法宝";
    }
}
