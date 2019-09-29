package com.test.paytm.challenge.coding;

/**
 * <p>Title: DataStore</p>
 * <p>Description: A Data structure that allows adding elements, retrieving them by their index
 * and providing the moving average of the last N elements added. The N should be specified when 
 * creating an instance of the implementation class.</p>
 *
 * @author Rachna Aggarwal
 * @version 1.0
 */
public interface DataStore<T>
{
	/**
	 * Returns the moving average of the last N elements added.
	 */
	public T getMovingAverage();

	/**
	 * Adds the specified element in the data store.
	 */
	public void add(T element);
	
	/**
	 * Returns the element at the specified index from the data store.
	 */
	public T get(int idx);
	
	/**
	 * Returns the size of the data store.
	 */
	public int getSize();
}