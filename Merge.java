import java.io.*;
import java.util.*;

public class Merge{
	public static void main(String[] args){
		List<Integer> lst1 = new ArrayList<Integer>(Arrays.asList(-10, 1, 2, 3));
		List<Integer> lst2 = new ArrayList<Integer>(Arrays.asList(-9, -8, -7, 0, 0));
		System.out.println(func(lst1, lst2));
	}
	
	public static List<Integer> func(List<Integer> lst1, List<Integer> lst2){
		int i1 = 0, i2 = 0;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		while(true){
			//System.out.println("LST: " + tmp + ", index1: " + i1 + ", index2: " + i2);
			if(i1 > lst1.size() - 1 && i2 > lst2.size() - 1) break;			
			if(i1 > lst1.size() - 1){ tmp.add(lst2.get(i2++)); continue; }
			if(i2 > lst2.size() - 1){ tmp.add(lst1.get(i1++)); continue; }
			
			if(lst1.get(i1) > lst2.get(i2)) tmp.add(lst2.get(i2++));
			else tmp.add(lst1.get(i1++));		
		}
		return tmp;
	}
}