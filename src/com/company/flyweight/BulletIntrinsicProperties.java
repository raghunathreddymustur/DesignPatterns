package com.company.flyweight;

class BulletIntrinsicProperties {
    private final String texture;
    private final int damage;

    public BulletIntrinsicProperties(String texture, int damage) {
        this.texture = texture;
        this.damage = damage;
    }

    public String getTexture() {
        return texture;
    }

    public int getDamage() {
        return damage;
    }
}
