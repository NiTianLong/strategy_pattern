package com.longye.strategypattern;

/**
 * 武器类 攻击力 100
 * Created by tianl on 2018/9/6.
 */
public class Wuqi implements IEquip {

    @Override
    public int countAttack() {
        return 100;
    }

    @Override
    public String description() {
        return "鬼王宗148级武器";
    }
}
