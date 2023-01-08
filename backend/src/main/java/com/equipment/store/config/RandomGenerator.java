package com.equipment.store.config;

public class RandomGenerator {
    public static Integer randomInt(int limit){
        Double number = Math.random()*(limit+1);
        return number.intValue();
    }
}
