package net.hb.day19;

public class Test {
	private static int m=50;
	static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test("홍길동");
		a = t.getM();
		t.bank();
		
	}
	public Test(String a){
		
	}

	public void bank(){
		int m =230;
		System.out.println("전연변수m필드 = "+m+"억");
	}
	public int getM() {
		return m;
	}
}
