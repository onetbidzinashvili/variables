package variables;

public class Main {
	public static void main(String[] args) {
		int i = 102;
		byte b = 15;
		long l = 1111;
		short s = 1;
		float f = 1.2f;
		double d = 1.3222;
		boolean b1 = true;
		char c = 'b';
		
		System.out.println("int i = " + i);
		System.out.println("byte b = " + b);
		System.out.println("long l = " + l);
		System.out.println("short s = " + s);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("boolean b1 = " + b1);
		System.out.println("char c = " + c);
		
		Integer I = 10;
		Integer I1 = new Integer(100);
		Byte B = 1;
		Byte B1 = new Byte((byte) 2);
		Long L = 123L;
		Long L1 = new Long(122);
		Float F = 1.2f;
		Float F1 = new Float(1.1);
		Double D = 1.222;
		Double D1 = new Double(1.212);
		Character C = 'c';
		Character C1 = new Character('v');
		Boolean N = true;
		Boolean N1 = new Boolean(false);
		Short S = 4;
		Short S1 = new Short((short)3);
		
		System.out.println("Integer I = " + I);
		System.out.println("Integer I1 = " + I1);
		System.out.println("Byte B = " + B);
		System.out.println("Byte B1 = " + B1);
		System.out.println("Long L = " + L);
		System.out.println("Long L1 = " + L1);
		System.out.println("Float F = " + F);
		System.out.println("Float F1 = " + F1);
		System.out.println("Double D = " + D);
		System.out.println("Double D1 = " + D1);
		System.out.println("Character C = " + C);
		System.out.println("Character C1 = " + C1);
		System.out.println("Boolean N = " + N);
		System.out.println("Boolean N1 = " + N1);
		System.out.println("Short S = " + S);
		System.out.println("Short S1 = " + S1);
		
		String str = "Hello";
		String str1 = new String("World");
		
		System.out.println("String str = " + str);
		System.out.println("String str1 = " + str1);
		
		int[] arr =  new int[10];
		for(int z = 0; z < arr.length; z++) {
			arr[z] = (int)(Math.random()*100 - 50);
		}
		for (int in : arr)
			System.out.println(in);
	}
}
