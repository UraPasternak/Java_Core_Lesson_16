package ua.lviv.lgs.hw16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		// Завдання 1
		Class<Car> a = Car.class;
		System.out.println(a.getName());
		System.out.println(a.getSimpleName());
		System.out.println(Modifier.toString(a.getModifiers()));
		
		Constructor<?>[] cons = a.getConstructors();
		for(int i=0;i<cons.length;i++){
		System.out.println(cons[i]);
		}
		System.out.println();
		Field[] fil = a.getDeclaredFields();
		for(int i=0;i<fil.length;i++){
			System.out.println(fil[i]);
			}
		System.out.println();
		
		// Завдання 2
		Car car = a.getConstructor(String.class, int.class).newInstance("audi", 2015);
		System.out.println(car.toString());
		a.getField("shvydkyst").set(car, 120);
		System.out.println(car.toString());
		System.out.println();
		
		// Завдання 3
		Method[] metods = a.getMethods();
		metods[1].invoke(car, 2000);
		System.out.println(car.toString());
		//for(int i=0;i<metods.length;i++){
		//	System.out.println(metods[i]);
		//	}
		metods[7].invoke(car, "hello!!!");
		metods[6].invoke(car);
		
	}

}
