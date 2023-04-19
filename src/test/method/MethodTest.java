package test.method;

public class MethodTest {
	
	static void printHead(char c, int num) { //같은 공유영역 (static)에 있어야지 에러 안나고 호출가능, 만약 다른방법은 참조변수로 객체생성 해서 호출할 수 있기도 함
		for (int i = 0; i < num; i++)
		{
			System.out.print(c);
		}
		System.out.println(); //줄바꿈 역할
	}

	public static void main(String[] args) {
		printHead('□', 10);
		System.out.println("사용자 정의 메소드 만듦");
		printHead('▽', 20);
		System.out.println("사용자 정의 메소드 호출하겠음");
		printHead('○', 30);

	}

}
