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
	private  Label  info = new Label("�޼���: ", Label.RIGHT);
	private  TextField  tf = new TextField(20);
	private  Button  btnsend  = new Button("����");
	private  Button  btnexit  = new Button("����");
	
	private  Panel   pan = new Panel( ); //��������ǿ���
	private  TextArea  ta = new TextArea( );
	private  Font font = new Font("�ü�ü", Font.BOLD, 20);
	
	public  Note( ){  
			//1�ܰ� - �ǳڿ�  �ȳ���,�Է¶�, ��ư2�� ���̱�
			pan.add(info);    pan.add(tf);  
			pan.add(btnsend); pan.add(btnexit);
		
			//2�ܰ�  Frame��ӹ��� Note������ add("��ġ", TextArea )
			ta.setFont(font);
			this.add("Center", ta);
			this.add("South", pan); //����ȭ�� Note�ϴܿ� pan���̱�
		
			//3�ܰ�
			setTitle("�޸��� �ٽø����");
			setBackground(Color.YELLOW);
			setBounds(100, 100, 500, 450);
			setVisible( true );
			
			//4�ܰ�
			addWindowListener(this);
	}//end
	
	public static void main(String[] args) {
		Note  nt = new Note( );
	}//main end
	
	@Override
	public void windowActivated(WindowEvent e) {   }//end
	public void windowClosed(WindowEvent e) {  }//end

	@Override
	public void windowClosing(WindowEvent e){//Non-static=�Ϲ��Լ�
		System.out.println("ä�ø޸��� ���α׷��� ����˴ϴ�");
		System.exit(1);
	}//end

	@Override
	public void windowDeactivated(WindowEvent e) {  }//end
	public void windowDeiconified(WindowEvent e) {  }//end
	public void windowIconified(WindowEvent e) {  }//end
	public void windowOpened(WindowEvent e) {  }//end
	
}//Note class END===============================
