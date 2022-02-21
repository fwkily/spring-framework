package com.fwkily.demo;

import com.fwkily.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: fuwk
 * @Description:
 * @Date: 15:47 2022/1/24
 */
public class Test {

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		User user = context.getBean(User.class);
//		System.out.println(user.toString());
//	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[10];
//		a[0] = 0;
//		a[1] = 1;
//		a[2] = 2;
//		a[3] = 3;
//		System.arraycopy(a, 2, a, 3, 3);
//		a[2]=99;
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
//	}

//	public static void main(String[] args) {
//		int[] a = new int[3];
//		a[0] = 0;
//		a[1] = 1;
//		a[2] = 2;
//		int[] b = Arrays.copyOf(a, 100);
//		System.out.println("b.length"+ " " + b.length);
//		for (int i = 0; i < b.length; i++) {
//			System.out.println("b[" + i + "]" + b[i]);
//		}
//	}

//	public static void main(String[] args) {
//		ArrayList<Object> list = new ArrayList<>();
//		final int N = 100000000;
//		long cur = System.currentTimeMillis();
//		for (int i = 0; i < N; i++) {
//			list.add(i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("时间:" + (end - cur));
//
//	}

//	public static void main(String[] args) {
//		ArrayList<Object> list = new ArrayList<>();
//		final int N = 100000000;
//		list.ensureCapacity(N);
//		long cur = System.currentTimeMillis();
//		for (int i = 0; i < N; i++) {
//			list.add(i);
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("时间:" + (end - cur));
//
//	}


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService) context.getBean("userService");
		userService.test();

//		System.out.println(userService);

//		AdminB adminB = (AdminB) context.getBean("adminB");
//		AdminB adminB2 = (AdminB) context.getBean("adminB");
//		AdminB adminB3 = (AdminB) context.getBean("adminB");
//		System.out.println(adminB);
//		System.out.println(adminB2);
//		System.out.println(adminB3);
//		AdminB adminB1 = (AdminB) context.getBean("adminB1");
//		System.out.println(adminB1);


	}

//	public void t(String b, String... a){}


}
