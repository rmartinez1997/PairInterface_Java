package apps;
import pairs.PairInterface;
import pairclass.ArrayPair;
import pairclass.BasicPair;

public class TestDriver {
	public static void main(String[] args) {
		
		PairInterface<String> myPair = new BasicPair<String>("Ricardo","Lopez"); //Creates instance of BasicPair method implemented from PairInterface
		System.out.print(myPair.getFirst() + " ");
		myPair.setSecond("Martinez");
		System.out.println(myPair.getSecond()+ " ");
		
		
		PairInterface<String> arrayPair = new ArrayPair<String>("Ricardo","Lopez"); //Creates instance of ArrayPair method implemented from PairInterface
		
		
		System.out.print(arrayPair.getFirst()+ " ");
		arrayPair.setSecond("Martinez");
		System.out.print(arrayPair.getSecond() + " ");

	}

}
