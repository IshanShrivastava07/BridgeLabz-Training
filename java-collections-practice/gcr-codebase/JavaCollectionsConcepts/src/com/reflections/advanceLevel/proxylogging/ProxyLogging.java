package com.reflections.advanceLevel.proxylogging;

import java.lang.reflect.*;

public class ProxyLogging {

    interface Greeting {
        void sayHello();
    }

    static class GreetingImpl implements Greeting {
        public void sayHello() {
            System.out.println("Hello, Welcome!");
        }
    }

    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (Object proxyObj, Method method, Object[] arguments) -> {

                    System.out.println("Calling method: " + method.getName());
                    return method.invoke(original, arguments);
                });

        proxy.sayHello();
    }
}

