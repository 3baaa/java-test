package sec02.test;

public class Test5 {

	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg=0.0;
		
		int c=0;
		for(int i = 0;i<array.length;i++) {
			for(int j : array[i]) {
				c+=1;
				sum+=j;
			}
		}
		avg=(double)sum/c;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}

}
