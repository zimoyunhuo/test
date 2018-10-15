package com.zimo.custom.main;

public class WebJettyStart {
	
	public static void main(String[] args) {
		System.setProperty("org.apache.jasper.compiler.disablejsr199", "true");
		Integer a = 1000, b = 1000; 
		System.out.println(a == b);//1
		Integer c = 100, d = 100; 
		System.out.println(c == d);//2

		System.out.println("启动结束");
	}
}

