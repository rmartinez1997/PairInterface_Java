package pairclass;
import pairs.PairInterface;

public class BasicPair<T> implements PairInterface<T>{		//class Basic Pair implements PairInterface
protected T first;											//Will need all methods from PairInterface
protected T second;
	
	
	public BasicPair(T first, T second) {
		setFirst(first);
		setSecond(second);
	}

	@Override
	public T getFirst() {
		return first;
	}

	@Override
	public T getSecond() {
		return second;
	}

	@Override
	public void setFirst(T sfirst) {
		this.first = sfirst;
		
	}

	@Override
	public void setSecond(T ssecond) {
		this.second = ssecond;
		
	}




}
