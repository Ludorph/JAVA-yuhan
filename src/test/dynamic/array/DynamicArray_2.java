

/*
[0]�� ����
[1]�� ��
[2]�� ������
�̷� �ұ�Ģ���� �迭 ��� �����
*/

package test.dynamic.array;

public class DynamicArray_2 {

	public static void main(String[] args) {
		
		int[] num = {3, 1, 5}; //1�������� �ؾߵ�
		int[][] arr = new int[3][];
		int cnt = 0;
		
		//�ʱ�ȭ
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[num[i]];
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = ++cnt; 
			}
		}
		
		//���
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