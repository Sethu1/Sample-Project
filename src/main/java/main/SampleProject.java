package main;

public class SampleProject {
	//print  Hello World! in the console
	public static String printHello() {
		//print Hello world! in the console!
		String k = "Hello World!";
		return k;
	}
	public static int add(int p,int q) {
		int k;
		k = p+q;
		return k;
	}
	public static void main(String args[]) {
		System.out.println(printHello());
		System.out.println(add(23,45));
	}
}