/**
 * Author: Henry Zhao
 * Class ID: 353
 * Assignment #: 2
 * Description: The SimpleListTest file creates different Junit test cases for the methods
 * in SimpleList. All of the methods are tested using different test cases.
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * The SimpleListTest class includes a variety of junit tests
 * to test whether the SimpleList program is working correctly.
 * The tests with "Pass" at the end are intended to pass,
 * and the tests with "Fail" at the end are intended to fail.
 * Multiple tests are done for each method.
 */

class SimpleListTest 
{
	/**
	 * SimpleList tests the constructors.
	 * It makes sure that count is initialized to 0
	 * and the array is created correctly and empty.
	 */
	
	@Test
	public void SimpleListTestPass1() 
	{
		SimpleList tester = new SimpleList();
		assertEquals(0, tester.count());
	}
	
	@Test
	public void SimpleListTestFail1() 
	{
		SimpleList tester = new SimpleList();
		assertNotEquals(0, tester.count());
	}
	
	@Test
	public void SimpleListTestPass2() 
	{
		SimpleList tester = new SimpleList();
		assertEquals("", tester.toString());
	}
	
	@Test
	public void SimpleListTestFail2() 
	{
		SimpleList tester = new SimpleList();
		assertNotEquals("", tester.toString());
	}

	/**
	 * addTest tests that new elements are added into the array correctly
	 * It does does by checking that the count is correct and the toString
	 * is also correct (more of this testing is done below too). It also checks
	 * that if the list is full, increase the size of the list by 50%.
	 */
	
	@Test
	public void addTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		assertEquals(6, tester.count());
	}
	
	@Test
	public void addTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		assertNotEquals(6, tester.count());
	}
	
	@Test
	public void addTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		assertEquals(12, tester.count());
	}
	
	@Test
	public void addTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		assertNotEquals(12, tester.count());
	}
	
	@Test
	public void addTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		assertEquals(14, tester.count());
	}
	
	@Test
	public void addTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		assertNotEquals(14, tester.count());
	}
	
	@Test
	public void addTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		assertEquals(15, tester.count());
	}
	
	@Test
	public void addTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		assertNotEquals(15, tester.count());
	}

	@Test
	public void addTestPass5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertEquals(16, tester.count());
	}
	
	@Test
	public void addTestFail5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertNotEquals(16, tester.count());
	}
	
	@Test
	public void addTestPass6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertEquals(21, tester.count());
	}
	
	@Test
	public void addTestFail6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertNotEquals(21, tester.count());
	}
	
	@Test
	public void addTestPass7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertEquals(42, tester.count());
	}
	
	@Test
	public void addTestFail7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertNotEquals(42, tester.count());
	}
	
	@Test
	public void addTestPass8() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertEquals("3 3 3 1 3 1 5 3 1 5 3 1 5 2 3 5", tester.toString());
	}
	
	@Test
	public void addTestFail8() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(3);
		tester.add(3);
		tester.add(3);
		assertNotEquals("3 3 3 1 3 1 5 3 1 5 3 1 5 2 3 5", tester.toString());
	}
	
	/*
	 * removeTest tests to make sure that the parameter item is removed correctly
	 * if the item is found in the array. It does this by checking that the count is reduced
	 * correctly and the new toString matches the new array. It also checks if the list
	 * has more than 25% empty spaces, then decrease the size of the list by 25%.
	 */
	
	@Test
	public void removeTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.remove(10);
		assertEquals(0, tester.count());	
	}
	
	@Test
	public void removeTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.remove(10);
		assertNotEquals(0, tester.count());	
	}
	
	@Test
	public void removeTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.remove(10);
		assertEquals(5, tester.count());	
	}
	
	@Test
	public void removeTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.remove(10);
		assertNotEquals(5, tester.count());	
	}
	
	@Test
	public void removeTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(5);
		tester.add(6);
		tester.add(10);
		tester.add(2);
		tester.remove(10);
		assertEquals("2 6 5 10", tester.toString());	
	}
	
	@Test
	public void removeTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(5);
		tester.add(6);
		tester.add(10);
		tester.add(2);
		tester.remove(10);
		assertNotEquals("2 6 5 10", tester.toString());	
	}
	
	@Test
	public void removeTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(5);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(10);
		assertEquals("5 2 4 1 3 2 9 6 5", tester.toString());	
	}
	
	@Test
	public void removeTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(5);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(10);
		assertNotEquals("5 2 4 1 3 2 9 6 5", tester.toString());	
	}
	
	@Test
	public void removeTestPass5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(7);
		assertEquals("5 2 4 1 3 2 9 6 10", tester.toString());	
	}
	
	@Test
	public void removeTestFail5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(7);
		assertNotEquals("5 2 4 1 3 2 9 6 10", tester.toString());	
	}
	
	@Test
	public void removeTestPass6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(6);
		assertEquals("5 2 4 1 3 2 9 7", tester.toString());	
	}
	
	@Test
	public void removeTestFail6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(6);
		assertNotEquals("5 2 4 1 3 2 9 7", tester.toString());	
	}
	
	@Test
	public void removeTestPass7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(9);
		assertEquals("5 2 4 1 3 2 6 7", tester.toString());	
	}
	
	@Test
	public void removeTestFail7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(9);
		assertNotEquals("5 2 4 1 3 2 6 7", tester.toString());	
	}
	
	@Test
	public void removeTestPass8() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		tester.remove(3);
		assertEquals(2, tester.count());	
	}
	
	@Test
	public void removeTestFail8() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		tester.remove(3);
		assertNotEquals(2, tester.count());	
	}
	
	@Test
	public void removeTestPass9() 
	{
		SimpleList tester = new SimpleList();
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(9);
		tester.remove(10);
		assertEquals("5 2 4 1 3 2 6 7", tester.toString());	
	}
	
	@Test
	public void removeTestFail9() 
	{
		SimpleList tester = new SimpleList();
		tester.add(7);
		tester.add(6);
		tester.add(9);
		tester.add(2);
		tester.add(3);
		tester.add(1);
		tester.add(4);
		tester.add(2);
		tester.add(5);
		tester.remove(9);
		tester.remove(10);
		assertNotEquals("5 2 4 1 3 2 6 7", tester.toString());	
	}
	
	/**
	 * countTest makes sure that the count variable is changed correctly
	 * according to whether a new item is added or removed. Count also cannot
	 * be greater than 10
	 */
	
	@Test
	public void countTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(8);
		assertEquals(1, tester.count());
	}
	
	@Test
	public void countTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(8);
		assertNotEquals(1, tester.count());
	}
	
	@Test
	public void countTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		assertEquals(11, tester.count());
	}
	
	@Test
	public void countTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		assertNotEquals(11, tester.count());
	}
	
	@Test
	public void countTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		tester.remove(4);
		assertEquals(10, tester.count());
	}
	
	@Test
	public void countTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		tester.remove(4);
		assertNotEquals(10, tester.count());
	}
	
	@Test
	public void countTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		tester.remove(4);
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		assertEquals(21, tester.count());
	}
	
	@Test
	public void countTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		tester.remove(4);
		tester.add(5);
		tester.add(3);
		tester.add(2);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(4);
		tester.add(10);
		assertNotEquals(21, tester.count());
	}
	
	/**
	 * toStringTest tests to make sure that the elements in the array are printed correctly
	 * and what should be printed is printed.
	 */
	
	@Test
	public void toStringTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		assertEquals("5", tester.toString());
	}
	
	@Test
	public void toStringTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		assertNotEquals("5", tester.toString());
	}
	
	@Test
	public void toStringTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.add(5);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.add(2);
		assertEquals("2 3 1 4 5 6 9 8 6 10 5", tester.toString());			//5 should fall off
	}
	
	@Test
	public void toStringTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.add(5);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.add(2);
		assertNotEquals("2 3 1 4 5 6 9 8 6 10 5", tester.toString());
	}
	
	@Test
	public void toStringTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.add(5);
		tester.append(15);
		tester.append(69);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.add(2);
		tester.append(21);
		assertEquals("2 3 1 4 5 6 9 8 6 10 5 15 69 21", tester.toString());
	}
	
	@Test
	public void toStringTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.add(5);
		tester.append(15);
		tester.append(69);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.add(2);
		tester.append(21);
		assertNotEquals("2 3 1 4 5 6 9 8 6 10 5 15 69 21", tester.toString());
	}
	
	@Test
	public void toStringTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.remove(6);
		tester.remove(6);
		tester.add(5);
		tester.append(15);
		tester.append(69);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.remove(69);
		tester.add(2);
		tester.append(21);
		assertEquals("2 3 1 4 5 9 8 10 5 15 21", tester.toString());
	}
	
	@Test
	public void toStringTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.remove(6);
		tester.remove(6);
		tester.add(5);
		tester.append(15);
		tester.append(69);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.remove(69);
		tester.add(2);
		tester.append(21);
		assertNotEquals("2 3 1 4 5 9 8 10 5 15 21", tester.toString());
	}
	
	/**
	 * searchTest makes sure that the searched parameter is correctly returned
	 * if it is found in the array, otherwise -1 is returned.
	 */
	
	@Test
	public void searchTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertEquals(0, tester.search(8));
	}
	
	@Test
	public void searchTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertNotEquals(0, tester.search(8));
	}
	
	@Test
	public void searchTestPass2() 
	{
		SimpleList tester = new SimpleList();
		assertEquals(-1, tester.search(8));
	}
	
	@Test
	public void searchTestFail2() 
	{
		SimpleList tester = new SimpleList();
		assertNotEquals(-1, tester.search(8));
	}
	
	@Test
	public void searchTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertEquals(0, tester.search(8));
	}
	
	@Test
	public void searchTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertNotEquals(0, tester.search(8));
	}
	
	@Test
	public void searchTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertEquals(10, tester.search(2));								//2 should fall off
	}
	
	@Test
	public void searchTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertNotEquals(10, tester.search(2));
	}
	
	@Test
	public void searchTestPass5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertNotEquals(3, tester.search(2));								//2 should fall off
	}
	
	@Test
	public void searchTestFail5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		assertEquals(3, tester.search(2));
	}
	
	@Test
	public void searchTestPass6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.remove(4);
		assertNotEquals(3, tester.search(4));								//2 should fall off
	}
	
	@Test
	public void searchTestFail6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.remove(4);
		assertEquals(3, tester.search(4));
	}
	
	@Test
	public void searchTestPass7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.remove(8);
		tester.remove(4);
		assertEquals(5, tester.search(4));								//2 should fall off
	}
	
	@Test
	public void searchTestFail7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(2);
		tester.add(9);
		tester.add(8);
		tester.add(5);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.add(4);
		tester.add(8);
		tester.add(5);
		tester.add(8);
		tester.remove(8);
		tester.remove(4);
		assertNotEquals(5, tester.search(4));
	}
	
	/**
	 * appendTest makes sure that the parameter items are correctly appended
	 * to the end of the list, and if the list is full, the size of the array is 
	 * increased by 50%.
	 */
	
	@Test
	public void appendTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		assertEquals(1, tester.count());
	}
	
	@Test
	public void appendTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		assertNotEquals(1, tester.count());
	}
	
	@Test
	public void appendTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		assertEquals("4", tester.toString());
	}
	
	@Test
	public void appendTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		assertNotEquals("4", tester.toString());
	}
	
	@Test
	public void appendTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		assertEquals("4 2 5 3", tester.toString());
	}
	
	@Test
	public void appendTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		assertNotEquals("4 2 5 3", tester.toString());
	}
	
	@Test
	public void appendTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		assertEquals(12, tester.count());
	}
	
	@Test
	public void appendTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		assertNotEquals(12, tester.count());
	}
	
	@Test
	public void appendTestPass5() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(6);
		tester.append(9);
		tester.append(7);
		assertEquals("4 2 5 3 4 2 5 3 4 2 5 3 6 9 7", tester.toString());
	}
	
	@Test
	public void appendTestFail5() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(6);
		tester.append(9);
		tester.append(7);
		assertNotEquals("4 2 5 3 4 2 5 3 4 2 5 3 6 9 7", tester.toString());
	}

	@Test
	public void appendTestPass6() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(6);
		tester.append(9);
		tester.append(7);
		tester.remove(2);
		tester.remove(7);
		tester.append(9);
		tester.append(10);
		tester.remove(4);
		tester.remove(5);
		tester.remove(3);
		tester.remove(4);
		tester.remove(2);
		tester.remove(5);
		tester.append(11);
		assertEquals("3 4 2 5 3 6 9 9 10 11", tester.toString());
	}
	
	@Test
	public void appendTestFail6() 
	{
		SimpleList tester = new SimpleList();
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(6);
		tester.append(9);
		tester.append(7);
		tester.remove(2);
		tester.remove(7);
		tester.append(9);
		tester.append(10);
		tester.remove(4);
		tester.remove(5);
		tester.remove(3);
		tester.remove(4);
		tester.remove(2);
		tester.remove(5);
		tester.append(11);
		assertNotEquals("3 4 2 5 3 6 9 9 10 11", tester.toString());
	}
	
	/**
	 * firstTest makes sure that the first element of the list is returned
	 * correctly.
	 */
	
	@Test
	public void firstTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		assertEquals(10, tester.first());	
	}
	
	@Test
	public void firstTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		assertNotEquals(10, tester.first());	
	}
	
	@Test
	public void firstTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		assertEquals(3, tester.first());	
	}
	
	@Test
	public void firstTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		assertNotEquals(3, tester.first());	
	}
	
	@Test
	public void firstTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		tester.add(5);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		tester.add(5);
		tester.add(3);
		tester.add(5);
		tester.remove(3);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		tester.remove(3);
		assertEquals(10, tester.first());	
	}
	
	@Test
	public void firstTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		tester.add(5);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		tester.add(5);
		tester.add(3);
		tester.add(5);
		tester.remove(3);
		tester.add(10);
		tester.append(6);
		tester.add(3);
		tester.remove(3);
		assertNotEquals(10, tester.first());	
	}
	
	@Test
	public void firstTestPass4() 
	{
		SimpleList tester = new SimpleList();
		assertEquals(-1, tester.first());	
	}
	
	@Test
	public void firstTestFail4() 
	{
		SimpleList tester = new SimpleList();
		assertNotEquals(-1, tester.first());	
	}
	
	/*
	 * lastTest checks if the last element is returned correctly
	 */
	
	@Test
	public void lastTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		assertEquals(10, tester.last());	
	}
	
	@Test
	public void lastTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		assertNotEquals(10, tester.last());	
	}
	
	@Test
	public void lastTestPass2() 
	{
		SimpleList tester = new SimpleList();
		assertEquals(-1, tester.last());	
	}
	
	@Test
	public void lastTestFail2() 
	{
		SimpleList tester = new SimpleList();
		assertNotEquals(-1, tester.last());	
	}
	
	@Test
	public void lastTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.remove(6);
		tester.remove(6);
		tester.add(5);
		tester.append(15);
		tester.append(69);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.remove(69);
		tester.add(2);
		tester.append(21);
		assertEquals(21, tester.last());	
	}
	
	@Test
	public void lastTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(5);
		tester.add(10);
		tester.add(6);
		tester.add(8);
		tester.add(9);
		tester.add(6);
		tester.remove(6);
		tester.remove(6);
		tester.add(5);
		tester.append(15);
		tester.append(69);
		tester.add(4);
		tester.add(1);
		tester.add(3);
		tester.remove(69);
		tester.add(2);
		tester.append(21);
		assertNotEquals(21, tester.last());	
	}
	
	/**
	 * sizeTest makes sure that the current number of possible locations
	 * is the correct array size.
	 */
	
	@Test
	public void sizeTestPass1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		assertEquals(10, tester.size());	
	}
	
	@Test
	public void sizeTestFail1() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		assertNotEquals(10, tester.size());	
	}
	
	@Test
	public void sizeTestPass2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		assertEquals(10, tester.size());	
	}
	
	@Test
	public void sizeTestFail2() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		assertNotEquals(10, tester.size());	
	}
	
	@Test
	public void sizeTestPass3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.add(1);
		assertEquals(15, tester.size());	
	}
	
	@Test
	public void sizeTestFail3() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.add(1);
		assertNotEquals(15, tester.size());	
	}
	
	@Test
	public void sizeTestPass4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.add(1);
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.add(1);
		assertEquals(22, tester.size());	
	}
	
	@Test
	public void sizeTestFail4() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.add(1);
		tester.add(10);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.append(2);
		tester.append(5);
		tester.append(3);
		tester.append(4);
		tester.add(1);
		assertNotEquals(22, tester.size());	
	}
	
	@Test
	public void sizeTestPass5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(4);
		tester.remove(4);
		tester.remove(4);
		assertEquals(8, tester.size());	
	}
	
	@Test
	public void sizeTestFail5() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(4);
		tester.remove(4);
		tester.remove(4);
		assertNotEquals(8, tester.size());	
	}
	
	@Test
	public void sizeTestPass6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		assertEquals(6, tester.size());	
	}
	
	@Test
	public void sizeTestFail6() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		assertNotEquals(6, tester.size());	
	}
	
	@Test
	public void sizeTestPass7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		assertEquals(3, tester.size());	
	}
	
	@Test
	public void sizeTestFail7() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		assertNotEquals(3, tester.size());	
	}
	
	@Test
	public void sizeTestPass8() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		tester.remove(9);
		assertEquals(3, tester.size());	
	}
	
	@Test
	public void sizeTestFail8() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		tester.remove(9);
		assertNotEquals(3, tester.size());	
	}
	
	@Test
	public void sizeTestPass9() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		tester.remove(9);
		tester.remove(5);
		tester.remove(6);
		assertEquals(3, tester.size());	
	}
	
	@Test
	public void sizeTestFail9() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.add(3);
		tester.add(5);
		tester.add(1);
		tester.add(3);
		tester.add(1);
		tester.add(6);
		tester.remove(10);
		tester.remove(3);
		tester.remove(3);
		tester.remove(1);
		tester.remove(1);
		tester.remove(9);
		tester.remove(5);
		tester.remove(6);
		assertNotEquals(3, tester.size());	
	}
	
	@Test
	public void sizeTestPass10() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.remove(10);
		assertEquals(8, tester.size());	
	}
	
	@Test
	public void sizeTestFail10() 
	{
		SimpleList tester = new SimpleList();
		tester.add(10);
		tester.remove(10);
		assertNotEquals(8, tester.size());	
	}
}
