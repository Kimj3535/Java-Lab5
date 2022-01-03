package cst8284.genericTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTableLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = Arrays.asList(1, 2, 3);
		ArrayList<BasicShape> shape = new ArrayList<BasicShape>();
		shape.add(new Circle(5.64189583547756));
		shape.add(new Square(4.0));
		shape.add(new Triangle(6.078685485127));
		shape.add(new Square(5.0));
		
		List<String> strings = Arrays.asList("Larry","Moe","Curly");
		Table.outputTable(shape);
		Table.outputTable(ints);
		Table.outputTable(strings);
	}

}
