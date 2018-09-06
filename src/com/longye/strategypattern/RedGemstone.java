package com.longye.strategypattern;

/**
 * 红宝石类 +30攻击/颗
 * Created by tianl on 2018/9/6.
 */
public class RedGemstone implements IGemstone{

    /**
     * 每个装饰品都维护同一个装备
     */
    private IEquip equip;

    public RedGemstone(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int countAttack() {
        return 30 + equip.countAttack();
    }

    @Override
    public String description() {
        return equip.description() + " + 红宝石";
    }
}
