package sec02.test;

public class Test3 {

	public static void main(String[] args) {
		int a,b;
		while(true) {
			a=(int)(Math.random()*6)+1;
			b=(int)(Math.random()*6)+1;
			if(a+b==5) {
				break;
			}
			System.out.println("("+a+","+b+")");
		}
	}

}
