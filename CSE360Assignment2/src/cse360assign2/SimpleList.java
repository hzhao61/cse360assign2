/**
 * Author: Henry Zhao
 * Class ID: 353
 * Assignment #: 2
 * Description: The SimpleList file creates a simple list (int array) and does operations on it
 * 				such as add elements to the array, remove elements from the array, count number of elements
 * 				in the array, return the list as a string, and search for elements in the list.
 * 
 * 				For assignment 2, in the first version, SimpleList can now increase the size of the list by 50% if the list
 * 				is full when adding to the list. Also, if the list has more than 25% empty places,
 * 				the size of the list is decreased by 25%.
 * 				For assignment 2, in the second version, SimpleList is now able to append the parameter to the end of the list
 * 				and increases the size of the list by 50% if full. It can also return the first element in the list
 * 				and the size of the list.
 */
package cse360assign2;

/**
 * 
 * The SimpleList class contains a constructor and a few methods that perform 
 * functions on an array of integers.
 * @param list the array that holds the list
 * @param count the int that holds the total number of list elements
 */

public class SimpleList 
{
	private int[] list;
	private int[] tempList;										//temp list created for assignment2 to hold old array before increasing by 50%
	private int count;
	private int arraySize;										//variable to keep track of the arraySizes
	
	/**
	 * SimpleList constructor creates an array, list, that holds 10 integers
	 * and sets the count equal to 0.
	 */
	
	public SimpleList()
	{
		list = new int[10];
		tempList = new int[10];
		count = 0;
		arraySize = 10;											//array size is initialized to 10
	}
	
	/**
	 * add adds the parameter item to the list at the beginning and moves 
	 * the other integers over so there's room.
	 * 
	 * For assignment2, an addition is made so that if the list is full,
	 * the size of the list is increased by 50%.
	 * @param listItem int to be added into the list
	 */
	
	public void add(int listItem)
	{
		if(count==0)											//empty array
		{	
			list[0] = listItem;									//add parameter int to beginning of array
			count++;											//increment count
		}
		else													//not an empty array
		{
			if(count==arraySize)
			{
				for(int index = count-1; index >= 0; index--)					//copy the old array into another array
				{
					tempList[index] = list[index];								//copy each element
				}
				
				arraySize = arraySize + arraySize/2;							//set new array size
				list = new int[arraySize];										//list is full, increase the size by 50%	
				
				for(int index = tempList.length; index > 0; index--)			//copy the temp array back into new array
				{
					list[index] = tempList[index-1];							//copy each element, shifted over one to the right in new array
				}
				
				tempList = new int[arraySize];									//increase tempList to same size as list for next time
				
				list[0] = listItem;												//add new item to larger array				
				count++;														//increment count
			}
			else
			{
				for(int index = count; index > 0; index--)						//array not full
				{
					list[index] = list[index-1];								//move the rest of the array elements over
				}
				list[0] = listItem;												//add new item to beginning of array
				count++;														//increment count for new item
			}
		}
	}
	
	/**
	 * remove removes the parameter item from the list and moves the other
	 * values in the list down if needed.
	 * 
	 * For assignment2, if the list has more than 25% empty places, 
	 * decrease the size of the list by 25%.
	 * @param removeItem int to be removed from the list
	 */
	
	public void remove(int removeItem)
	{
		int currentIndex = 0;									//track currentIndex in list
		int removeIndex = 0;									//track the index of item to be removed
		int removed = 0;										//track if an element has been removed
		
		while(currentIndex<count)								//test from index 0 to index count
		{
			if(list[currentIndex]==removeItem)					//once the first appearance of the removeItem is found
			{
				removeIndex = currentIndex;						//set the removeIndex equal to currentIndex		
				currentIndex = count;							//set the currentIndex to count so the loop will terminate
				count--;										//decrease count by 1, to exit while loop since we got the index to remove
				removed = 1;									//removed an element
			}
			currentIndex++;
		}
		if((removeIndex!=count)&&(removed==1))
		{
			for(int index = removeIndex; index < count; index++)			//if the removeIndex is not the last index, shift the elements down	
			{
				list[index] = list[index+1];
			}
			list[count] = 0;												//set the removed element to 0 in array
		}
		if((removeIndex==count)&&(removed==1))								//last index, since count was decremented above
		{
			list[count] = 0;												//remove last array element, set it to the default 0
		}
		
		if((arraySize-count) > (arraySize/4))								//if number of empty places is greater than 25%	
		{
			if((count>=1)&&(removed==1)&&(arraySize>1))						//at least 1 element left and only applies if an element has been removed
			{
				for(int index = count-1; index >= 0; index--)				//copy the old array into another array
				{
					tempList[index] = list[index];							//copy each element
				}
				
				arraySize = arraySize - arraySize/4;
				list = new int[arraySize];									//list is more than 25% empty, decrease size by 1/4 rounded down	
				
				for(int index = count-1; index >= 0; index--)				//copy the temp array back into new array
				{
					list[index] = tempList[index];							//copy each element back into the new smaller array
				}
			
				tempList = new int[arraySize];								//decrease tempList to same size as list for next time
			}
/*
			else															//remove shouldn't be called for an empty array or when nothing removed
			{
				arraySize = arraySize - arraySize/4;
				list = new int[arraySize];									//list is more than 25% empty, decrease size by 1/4 rounded down	
				tempList = new int[arraySize];								//decrease tempList to same size as list for next time
			}
*/
		}
	}
	
	/**
	 * count returns the number of elements stored in the list
	 * @return the final total number of elements in the list
	 */
	
	public int count()
	{
		return count;
	}
	
	/**
	 * toString returns the list as a String with elements separated by a space
	 * @return the final string answer with spaces separating elements
	 */
	
	public String toString()
	{
		String str = "";										//initlize string to hold final string list
		
		if(count!=0)
		{
			for(int index = 0; index < count-1; index++)
			{
				str = str + list[index] + " ";					//add the list elements + a space up until the last element
			}
			str = str + list[count-1];							//add the last list element so there is no extra space at the end
		}
		return str;
	}
	
	/**
	 * search looks for the parameter int and returns the index that it is found
	 * @param findItem the int to be looked for in the list
	 * @return the index of the int found, or -1 if it is not found in the list
	 */
	
	public int search(int findItem)
	{
		int found = -1;						
		for(int index = 0; index < count && found == -1; index++)
		{
			if(list[index]==findItem)
			{
				found = index;									//return the index if the item is found the first time
			}
		}
		return found;											//if found still = -1, not found 
	}
	
	/**
	 * append appends the parameter int to the end of the list.
	 * If the list is full, it increase the size of the list by 50%. It also 
	 * increments the count.
	 * @param appendItem the integer to be appended to the list
	 */
	
	public void append(int appendItem)
	{
		if(count==0)															//empty array
		{	
			list[0] = appendItem;												//add parameter int to beginning of array
			count++;															//increment count
		}
		else																	//not an empty array
		{
			if(count==arraySize)
			{
				for(int index = list.length-1; index >= 0; index--)				//copy the old array into another array
				{
					tempList[index] = list[index];								//copy each element
				}
				
				arraySize = arraySize + arraySize/2;							//set new array size
				list = new int[arraySize];										//list is full, increase the size by 50%	
				
				for(int index = 0; index < tempList.length; index++)			//copy the temp array back into new array
				{
					list[index] = tempList[index];								//copy each element, shifted over one to the right in new array
				}
				
				tempList = new int[arraySize];									//increase tempList to same size as list for next time
				
				list[count] = appendItem;										//add new item to larger array at end				
				count++;														//increment count
			}
			else
			{
				list[count] = appendItem;										//append new item to end of array
				count++;														//increment count for new item
			}
		}
	}
	
	/**
	 * first finds and returns the first element in the list.
	 * @return the first element (int) in the list
	 */
	
	public int first()
	{
		int firstElement = 0;
		if(count==0)
		{
			firstElement = -1;
		}
		else
		{
			firstElement = list[0];
		}
		return firstElement;
	}
	
	/**
	 * last finds and returns the last element in the list
	 * @return the last element (int) in the list
	 */
	
	public int last()
	{
		int lastElement = 0;
		if(count==0)
		{
			lastElement = -1;
		}
		else
		{
			lastElement = list[count-1];
		}
		return lastElement;
	}
	
	/**
	 * size returns the current number of possible locations.
	 * @return the number of possible locations in the list
	 */
	
	public int size()
	{
		return arraySize;										//arraySize holds the current number of possible locations
	}
}
