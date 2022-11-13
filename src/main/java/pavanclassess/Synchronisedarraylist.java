package pavanclassess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.border.EmptyBorder;

public class Synchronisedarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method1---:Collections.synchronizedList(list)
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		nameslist.add("Java");
		nameslist.add("Java");
		nameslist.add("Python");
		synchronized (nameslist) {
			Iterator<String> it=nameslist.iterator();
			while(it.hasNext()){
				
				System.out.println(it.next());}
	}}
	




}
