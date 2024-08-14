package com.company.flyweight;

public class GameSimulator {
    public static void main(String[] args) {
        BulletFactory factory = new BulletFactory();

        // Simulate firing bullets
        BulletFlyweight bullet1 = factory.getBullet("BasicBullet.png", 10);
        bullet1.shoot(100, 200, 45, 300); // Position (100, 200), Direction 45 degrees, Speed 300

        BulletFlyweight bullet2 = factory.getBullet("BasicBullet.png", 10);
        bullet2.shoot(120, 210, 60, 300); // Different position and direction

        BulletFlyweight bullet3 = factory.getBullet("ArmorPiercingBullet.png", 20);
        bullet3.shoot(130, 220, 30, 350); // Position (130, 220), Direction 30 degrees, Speed 350

        // Since bullet1 and bullet2 share the same intrinsic properties, they are the same instance
        // Bullet3 is a different instance because it has different intrinsic properties (texture, damage)
    }
}

