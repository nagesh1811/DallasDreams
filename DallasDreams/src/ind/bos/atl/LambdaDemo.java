package ind.bos.atl;

interface A {
	 void show(int i); 
	
}

public class LambdaDemo {
	public static void main(String[] args) {

		A obj;
		obj = i -> System.out.println("Hello\t" + i);
		obj.show(9);
		

	}

}

