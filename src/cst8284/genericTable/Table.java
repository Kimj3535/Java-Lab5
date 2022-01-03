package cst8284.genericTable;


import java.lang.reflect.GenericArrayType;
import java.util.List;

//import cst8284.solidObject.BasicShape;
//import cst8284.solidObject.SolidObject;

public class Table {
	public static <E extends Comparable<E>> void outputTable(List <E> List) {

		// Print out column header
		//System.out.println("Compare the objects' volumes.  Are they equal?");
		System.out.print("\t\t");
		for (E columnHeader : List)
			System.out.print(columnHeader + "\t\t");


		for (E solidObjRow : List) {
			System.out.println(); // Next line
			System.out.print(solidObjRow);
			for (E solidObjColumn : List)
				System.out.print("\t\t" + (compareResults(solidObjColumn, solidObjRow)));
		}
		System.out.println("\n");
	}


public static <E extends Comparable<E>> String compareResults( E obj1, E obj2){
	 int compareInt = obj1.compareTo(obj2);
	 return(compareInt < 0 ? "<" : compareInt > 0 ? ">" : "=");
}
}
