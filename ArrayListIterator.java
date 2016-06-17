import java.util.*;
public class ArrayListIterator {
	public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("WELCOME");
        arrl.add("TO");
        arrl.add("JAVA");
        arrl.add("PROGRAMMING");
        Iterator<String> itr = arrl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

	}
}
