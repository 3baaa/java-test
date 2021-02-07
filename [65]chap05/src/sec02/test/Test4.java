package sec02.test;

public class Test4 {

	public static void main(String[] args) {
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int n:array) {
			if(max<n) {
				max=n;
			}
		}
		
		System.out.println("max : "+max);
	}

}
