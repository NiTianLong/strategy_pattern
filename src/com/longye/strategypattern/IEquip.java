package com.longye.strategypattern;

/**
 * 装备的超类
 * Created by tianl on 2018/9/6.
 */
public interface IEquip {

    /**
     * 计算攻击
     * @return
     */
    public int countAttack();

    /**
     * 描述
     * @return
     */
    public String description();
}
