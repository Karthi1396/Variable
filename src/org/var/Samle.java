package org.var;

public class Samle {
	 int id=10;
	private void k() {
		int id=100;
		System.out.println(id);
	}
	private void v() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		Samle a=new Samle();
		a.k();
		a.v();
		Samle b=new Samle();
		b.v();
		b.k();
		int no=20;
		int id1=30;
		
		
				

	}
	
}
