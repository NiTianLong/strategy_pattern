package com.longye.strategypattern;

/**
 * 蓝宝石类 +10攻击/颗
 * Created by tianl on 2018/9/6.
 */
public class BlueGemstone implements IGemstone{

    /**
     * 每个装饰品都维护同一个装备
     */
    private IEquip equip;

    public BlueGemstone(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int countAttack() {
        return 10 + equip.countAttack();
    }

    @Override
    public String description() {
        return equip.description() + " + 蓝宝石";
    }
}
