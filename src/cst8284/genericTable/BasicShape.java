package cst8284.genericTable;

import java.util.ArrayList;



public abstract class BasicShape implements Comparable<BasicShape> {
	
	private double width;
	//ArrayList<BasicShape> shape = new ArrayList<BasicShape>();
	
	
	protected BasicShape(double width) {setWidth(width);}
	
	public double getWidth(){return width;}
	public void setWidth(double width){this.width = width;}
	
	@Override
	public int compareTo(BasicShape obj2){
	if(this.getArea() < obj2.getArea())
	{return -1;}
	else if (this.getArea() == obj2.getArea()) {
		return 0;
	}else {
		return 1;}
	
	
	}
	
	
	
	
	
	@Override
	public String toString(){
		return (super.toString());
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
