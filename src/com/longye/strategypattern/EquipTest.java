package com.longye.strategypattern;

/**
 * 测试类
 * Created by tianl on 2018/9/6.
 */
public class EquipTest {

    public static void main(String[] args) {

        System.err.println("下面是一个镶嵌了两颗红宝石,一颗蓝宝石的宠物");
        IEquip equip = new RedGemstone(new RedGemstone(new BlueGemstone(new Chongwu())));
        System.err.println("攻击力:" + equip.countAttack());
        System.err.println("描述:" + equip.description());

        System.out.println("---------------------------------------");
        IEquip equip1 = new Chongwu();
        equip1 = new RedGemstone(equip1);
        equip1 = new RedGemstone(equip1);
        equip1 = new BlueGemstone(equip1);
        System.err.println("攻击力:" + equip1.countAttack());
        System.err.println("描述:" + equip1.description());
    }
}
