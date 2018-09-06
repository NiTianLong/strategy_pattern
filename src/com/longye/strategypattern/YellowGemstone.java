package com.longye.strategypattern;

/**
 * 黄宝石类 +20攻击/颗
 * Created by tianl on 2018/9/6.
 */
public class YellowGemstone implements IGemstone{

    /**
     * 每个装饰品都维护同一个装备
     */
    private IEquip equip;

    public YellowGemstone(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int countAttack() {
        return 20 + equip.countAttack();
    }

    @Override
    public String description() {
        return equip.description() + " + 黄宝石";
    }
}
