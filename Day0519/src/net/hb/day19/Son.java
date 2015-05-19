package net.hb.day19;

import java.awt.Frame;

public class Son extends Father implements Brother {
	public Son(){
		
	}
	public Son(String name){
		
	}

	public static void main(String[] args) {
		Son tom = new Son("톰소여의 모험");
		tom.game();

	}//main end

	public void game(){
		System.out.println("Son클래스 game()\n");
		super.bank( );//super class
		this.bank();// sub class
	}
	@Override
	public void bank() {
		String msg ="제로 상태유지, 상속포기 ";
		System.out.println(msg);
		
	}//end
	@Override
	public void note() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String book() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int car() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	//클래스 재정의 = OverRiding적용, OverLoading아닙니다.
	//오.버 => Source => Override Implement Methods....
	
}//class end
