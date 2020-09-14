package com.singleton.broke.byReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReflectionSingletonTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ExecutorService executorService = null;
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			Object object = constructor.newInstance();
			instance2 = (Singleton)object;
			break;
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		MyThread myThread = new MyThread();
		try {
			executorService = Executors.newFixedThreadPool(5);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null)
				executorService.shutdown();
		}

	}

}
