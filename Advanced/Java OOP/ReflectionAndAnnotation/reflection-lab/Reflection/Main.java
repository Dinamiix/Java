package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> i : interfaces) {
            System.out.println(i);
        }

        Constructor<Reflection> ctor = clazz.getConstructor();
        Reflection reflection = ctor.newInstance();
        System.out.println(reflection);
    }
}