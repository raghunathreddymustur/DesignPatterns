package com.company.flyweight;

import java.util.HashMap;
import java.util.Map;

class BulletFactory {
    private final Map<String, BulletIntrinsicProperties> bulletPropertiesMap = new HashMap<>();
    private final Map<String, BulletFlyweight> bulletFlyweightMap = new HashMap<>();

    public BulletFlyweight getBullet(String texture, int damage) {
        String propertiesKey = texture + damage;
        BulletIntrinsicProperties properties = bulletPropertiesMap.computeIfAbsent(propertiesKey,
                key -> new BulletIntrinsicProperties(texture, damage));

        return bulletFlyweightMap.computeIfAbsent(propertiesKey,
                key -> new Bullet(properties));
    }
}

