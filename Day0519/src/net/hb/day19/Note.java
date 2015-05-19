package net.hb.day19;

import  java.awt.Color;
import  java.awt.Font;
import  java.awt.Frame;
import  java.awt.Label;
import  java.awt.event.WindowAdapter;
import  java.awt.event.WindowEvent;
import  java.awt.event.WindowListener;
import  java.awt.*;

public class Note extends Frame implements  WindowListener  {
	private  Label  info = new Label("메세지: ", Label.RIGHT);
	private  TextField  tf = new TextField(20);
	private  Button  btnsend  = new Button("전송");
	private  Button  btnexit  = new Button("종료");
	
	private  Panel   pan = new Panel( ); //작은쟁반의역할
	private  TextArea  ta = new TextArea( );
	private  Font font = new Font("궁서체", Font.BOLD, 20);
	
	public  Note( ){  
			//1단계 - 판넬에  안내문,입력란, 버튼2개 붙이기
			pan.add(info);    pan.add(tf);  
			pan.add(btnsend); pan.add(btnexit);
		
			//2단계  Frame상속받은 Note바탕에 add("위치", TextArea )
			ta.setFont(font);
			this.add("Center", ta);
			this.add("South", pan); //현재화면 Note하단에 pan붙이기
		
			//3단계
			setTitle("메모장 다시만들기");
			setBackground(Color.YELLOW);
			setBounds(100, 100, 500, 450);
			setVisible( true );
			
			//4단계
			addWindowListener(this);
	}//end
	
	public static void main(String[] args) {
		Note  nt = new Note( );
	}//main end
	
	@Override
	public void windowActivated(WindowEvent e) {   }//end
	public void windowClosed(WindowEvent e) {  }//end

	@Override
	public void windowClosing(WindowEvent e){//Non-static=일반함수
		System.out.println("채팅메모장 프로그램이 종료됩니다");
		System.exit(1);
	}//end

	@Override
	public void windowDeactivated(WindowEvent e) {  }//end
	public void windowDeiconified(WindowEvent e) {  }//end
	public void windowIconified(WindowEvent e) {  }//end
	public void windowOpened(WindowEvent e) {  }//end
	
}//Note class END===============================
