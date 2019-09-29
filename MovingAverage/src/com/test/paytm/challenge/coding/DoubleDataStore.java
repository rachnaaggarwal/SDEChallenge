package com.test.paytm.challenge.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: DoubleDataStore</p>
 * <p>Description: Implementation of DataStore for elements of type Double.</p>
 *
 * @author Rachna Aggarwal
 * @version 1.0
 */
public class DoubleDataStore implements DataStore<Double>
{
	private int n;
	private List<Double> dataList;
	private Double sum;
	
	/**
	 * Initialize with N as the subset size to calculate the moving average
	 */
	public DoubleDataStore(int n)
	{
		this.n = n;
		this.dataList = new ArrayList<>();
		this.sum = 0d;
	}
	
	/**
	 * Returns the moving average for last N elements, returns null if no element exists
	 */
	@Override
	public Double getMovingAverage()
	{
		/* If N is greater than zero and the list contains elements, return the average */
		if(n > 0 && dataList.size() > 0)
		{
			return (sum / n);
		}
		
		/* Else return null */
		return null;
	}

	/**
	 * Adds the specified element to the data store.
	 * @throws IllegalArgumentException if the specified element is null.
	 */
	@Override
	public void add(Double element)
	{
		/* Throw exception if null element is provided */
		if(element == null)
		{
			throw new IllegalArgumentException("Invalid Argument");
		}
		
		/* Add the data element in the list */
		dataList.add(element);
		
		/* Only maintain the sum to calculate the average if N is greater than zero */
		if(n > 0)
		{
			/* Add the element to the sum */
			sum += element;
			
			/* If the number of elements in the list exceeds the N, 
			 * subtract the first element from last N so as to only keep
			 * the sum of last N elements */
			if(dataList.size() > n)
			{
				sum -= dataList.get(dataList.size() - n - 1);
			}
		}
	}

	/**
	 * Returns the element from the datastore at the specified index.
	 * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
	 */
	@Override
	public Double get(int idx)
	{
		return dataList.get(idx);
	}
	
	/**
	 * Returns the size of the data store.
	 */
	public int getSize()
	{
		return dataList.size();
	}

}