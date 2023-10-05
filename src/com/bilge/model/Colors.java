package com.bilge.model;

public enum Colors {
    PINK(10, 1.8),
    ORANGE(20, 1.5),
    WHITE(30, 1.2);

    private  int damage;
    private double attackSpeed;

    Colors(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }
}