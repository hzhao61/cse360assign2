/**
 * Author: Henry Zhao
 * Class ID: 353
 * Assignment #: 2
 * Description: The SimpleList file creates a simple list (int array) and does operations on it
 * 				such as add elements to the array, remove elements from the array, count number of elements
 * 				in the array, return the list as a string, and search for elements in the list.
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
	private int count;
	
	/**
	 * SimpleList constructor creates an array, list, that holds 10 integers
	 * and sets the count equal to 0.
	 */
	
	public SimpleList()
	{
		list = new int[10];
		count = 0;
	}
	
	/**
	 * add adds the parameter item to the list at the beginning and moves 
	 * the other integers over so there's room.
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
			if(count==10)
			{
				count = 9;
			}
			for(int index = 9; index > 0; index--)				//max hold 10 ints in array
			{
					list[index] = list[index-1];				//move the rest of the array elements over
			}
			list[0] = listItem;									//add new item to beginning of array
			count++;											//increment count for new item
		}
	}
	
	/**
	 * remove removes the parameter item from the list and moves the other
	 * values in the list down if needed.
	 * @param removeItem int to be removed from the list
	 */
	
	public void remove(int removeItem)
	{
		int currentIndex = 0;									//track currentIndex in list
		int removeIndex = 0;									//track the index of item to be removed
		
		while(currentIndex<count)								//test from index 0 to index count
		{
			if(list[currentIndex]==removeItem)					//once the first appearance of the removeItem is found
			{
				removeIndex = currentIndex;						//set the removeIndex equal to currentIndex		
				currentIndex = count;							//set the currentIndex to count so the loop will terminate
				count--;										//decrease count by 1 
			}
			currentIndex++;
		}
		if(removeIndex!=9)
		{
			if(removeIndex!=count)
			{
				for(int index = removeIndex; index < count; index++)		//if the removeIndex is not the last index, shift the elements down	
				{
					list[index] = list[index+1];
				}
			}
			if(removeIndex==count)											//if removing last element of a not full array
			{
				list[removeIndex] = list[removeIndex+1];
			}
		}
		if(removeIndex==9)										//last index
		{
			list[9] = 0;										//remove last array element by setting it to the default 0
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
		/*
		if(count==0)											DELETED, FOR TESTING
		{
			str = null;											//empty array, set equal to null for testing
		}
		*/
//		else
//		{
		if(count!=0)
		{
			for(int index = 0; index < count-1; index++)
			{
				str = str + list[index] + " ";					//add the list elements + a space up until the last element
			}
			str = str + list[count-1];							//add the last list element so there is no extra space at the end
		}
//		}
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
}
