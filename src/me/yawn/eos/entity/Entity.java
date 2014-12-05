package me.yawn.eos.entity;

import me.yawn.eos.item.Item;

import java.util.HashMap;

/**
 * Created by yawn on 12/5/2014.
 */
public abstract class Entity {

    private Item[] drops;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    private int maxHealth;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public boolean isLiving() {
        return isLiving;
    }

    public void setLiving(boolean isLiving) {
        this.isLiving = isLiving;
    }

    private boolean isLiving;

    public Entity(String name, int health, int maxHealth, int damage, Item[] drops){
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.isLiving = health < 0;
    }

    public abstract void onDeath();

}
