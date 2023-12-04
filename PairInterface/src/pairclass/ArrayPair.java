package pairclass;
import pairs.PairInterface;

public class ArrayPair<T> implements PairInterface<T> {
	protected String[] array = new String [2];
	
	public ArrayPair(T first, T second){
		setFirst(first);		//Uses setFirst method created in ArrayPair and implemented from PairInterface
		setSecond(second);
		array[0] = (String) first;
		array[1] = (String) second;
		
	}

	@Override
	public T getFirst() {
		
		return (T) array[0];
	}

	@Override
	public T getSecond() {
		
		return (T) array[1];
	}

	@Override
	public void setFirst(T sfirst) {
		
		this.array[0] = (String) sfirst;
	
	}

	@Override
	public void setSecond(T ssecond) {
		
		this.array[1] = (String) ssecond;
	}
	
}
