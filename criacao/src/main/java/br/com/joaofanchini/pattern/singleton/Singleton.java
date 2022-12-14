package br.com.joaofanchini.pattern.singleton;

import java.util.Objects;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // If try to access using Reflection
        if (Objects.nonNull(instance)) {
            throw new RuntimeException("Private constructor can not be used. Use getInstance method");
        }
    }

    public synchronized static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton();
        }

        return instance;
    }
}
