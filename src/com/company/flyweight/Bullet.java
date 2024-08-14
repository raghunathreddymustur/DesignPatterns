package com.company.flyweight;

class Bullet implements BulletFlyweight {
    private final BulletIntrinsicProperties properties;

    public Bullet(BulletIntrinsicProperties properties) {
        this.properties = properties;
    }

    @Override
    public void shoot(double positionX, double positionY, double direction, double speed) {
        System.out.println("Shooting bullet with texture: " + properties.getTexture() +
                ", damage: " + properties.getDamage() +
                " at position (" + positionX + ", " + positionY +
                ") in direction " + direction + " with speed " + speed);
    }
}

