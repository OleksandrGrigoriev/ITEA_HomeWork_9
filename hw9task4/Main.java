package org.hw9task4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class tradeCenter = TradeCenter.class;

        Field[] fields = tradeCenter.getDeclaredFields();
        Constructor[] constructors = tradeCenter.getDeclaredConstructors();
        Method[] methods = tradeCenter.getDeclaredMethods();

        System.out.println("Fields of TradeCenter class:");
        for (Field field: fields) {
            System.out.println(field.getName() + " " + field.getType());
            int modifier = field.getModifiers();
            System.out.println("Final: " + Modifier.isFinal(modifier));
            System.out.println("Private: " + Modifier.isPrivate(modifier));
            System.out.println("Protected: " + Modifier.isProtected(modifier));
            System.out.println("Public: " + Modifier.isPublic(modifier));
            System.out.println("Static: " + Modifier.isStatic(modifier));
            System.out.println();
        }

        System.out.println("Constructors of TradeCenter class:");
        for (Constructor constructor: constructors) {
            System.out.println(constructor.getName());
            int modifier = constructor.getModifiers();

            System.out.println("Final: " + Modifier.isFinal(modifier));
            System.out.println("Private: " + Modifier.isPrivate(modifier));
            System.out.println("Protected: " + Modifier.isProtected(modifier));
            System.out.println("Public: " + Modifier.isPublic(modifier));
            System.out.println("Static: " + Modifier.isStatic(modifier));
            System.out.println();
        }

        System.out.println("Methods of TradeCenter class:");
        for (Method method: methods) {
            System.out.println(method.getName() + " " + method.getReturnType());
            int modifier = method.getModifiers();

            System.out.println("Final: " + Modifier.isFinal(modifier));
            System.out.println("Private: " + Modifier.isPrivate(modifier));
            System.out.println("Protected: " + Modifier.isProtected(modifier));
            System.out.println("Public: " + Modifier.isPublic(modifier));
            System.out.println("Static: " + Modifier.isStatic(modifier));
            System.out.println();
        }
    }
}
