

/*
[0]행 □□□
[1]행 □
[2]행 □□□□□
이런 불규칙적인 배열 모양 만들시
*/

package test.dynamic.array;

public class DynamicArray_2 {

	public static void main(String[] args) {
		
		int[] num = {3, 1, 5}; //1차원으로 해야됨
		int[][] arr = new int[3][];
		int cnt = 0;
		
		//초기화
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[num[i]];
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = ++cnt; 
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+ "\n"); 
			}
			System.out.println();
		}

	}

}