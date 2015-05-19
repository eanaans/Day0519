package net.hb.day19;

class Box4 {
	private int width;
	private int height;
	private int depth;
	private int area;//리턴값 getter, setter(인자)
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDepth() {
		return depth;
	}
	
	public int area(){
		int hap =this.width*this.height * this.depth;
		return hap;
	}
	
	
	public Box4(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

}


public class Box4Test1  {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4(10,20,30);
		//Box4 mybox2= new Box4();
		int vol = mybox1.area();
		System.out.println("박스의 부피: " + vol);
	}//main end

}//class end
