package test.dynamic.array;

public class DynamicArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		int cnt = 0;
		
		//�ʱ�ȭ
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) //���� ���� ������ŭ�� �ݺ�
			{
				arr[i][j] = ++cnt; 
			}
		}
		
		//���
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) //���� ���� ������ŭ�� �ݺ�
			{
				System.out.print(arr[i][j]); //i 0���϶� j 0��(1��), i 1���϶� j 1��(2��), i 2���϶� j 2��(3��)  
			}
			System.out.println();
		}

	}

}
