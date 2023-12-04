package pairs;

//this code will have PairInterface and classes: BasicPair,Arraypair, setter for 1 and 2 object, getter for 1 and 2 object. 

public interface PairInterface<T> {		//Interface has setters and getters for Classes Basic and Array Pair
	
	public T getFirst();
	public T getSecond();
	
	public void setFirst(T sfirst);
	public void setSecond(T ssecond);
	

}
