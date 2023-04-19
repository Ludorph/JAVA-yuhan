package test.dynamic.array;

public class DynamicArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		int cnt = 0;
		
		//초기화
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) //행의 열의 개수만큼만 반복
			{
				arr[i][j] = ++cnt; 
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) //행의 열의 개수만큼만 반복
			{
				System.out.print(arr[i][j]); //i 0행일때 j 0열(1개), i 1행일때 j 1열(2개), i 2행일때 j 2열(3개)  
			}
			System.out.println();
		}

	}

}
