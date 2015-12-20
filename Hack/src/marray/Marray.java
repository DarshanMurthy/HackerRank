package marray;

public class Marray {

	public static void main(String[] args) {
		int array[][] ={{10,90,89},{89,89,9}}, sum =0;
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				sum = sum + array[i][j];
				System.out.println(array[i][j]);
			}
		}
	}

}
