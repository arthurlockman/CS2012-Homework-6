/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */

import tester.Tester;

public class Examples
{
	private MenuItem brie = new MenuItem("brie", 4);
	private MenuItem crackers = new MenuItem("crackers", 2);
	private MenuItem chips = new MenuItem("chips", 1);
	private MenuItem soup = new MenuItem("soup", 5);
	private MenuItem salad = new MenuItem("salad", 6);
	private MenuItem steak = new MenuItem("steak", 7);

	private DataHeap menuHeap = new DataHeap(brie, new MtHeap(), new MtHeap());
	private DataHeap fullHeap;

	Examples()
	{
		fullHeap = (DataHeap)menuHeap.addElt(crackers).addElt(chips).addElt(soup).addElt(salad).addElt(steak);
	}

	/**
	 * Test the addElt method on heaps.
	 * @param t The tester.
	 * @return Whether or not the test passed.
	 */
	boolean testAddElt(Tester t)
	{
		return t.checkExpect(menuHeap.addElt(steak).addElt(salad).findMinElt().equals(brie), true, "addSteak") &&
				t.checkExpect(menuHeap.addElt(soup).addElt(crackers).findMinElt().equals(crackers), true, "addCrackers") &&
				t.checkExpect(menuHeap.addElt(chips).addElt(crackers).findMinElt().equals(chips), true, "addChips");
	}

	/**
	 * Test the removeMinElt method on heaps.
	 * @param t The tester.
	 * @return Whether or not the test passed.
	 */
	boolean testRemoveMinElt(Tester t)
	{
		return t.checkExpect(fullHeap.removeMinElt().findMinElt().equals(crackers), true) &&
				t.checkExpect(fullHeap.removeMinElt().removeMinElt().findMinElt().equals(brie), true);
	}

	/**
	 * Test the height method on heaps.
	 * @param t The tester.
	 * @return Whether or not the test passed.
	 */
	boolean testHeight(Tester t)
	{
		return t.checkExpect(fullHeap.height(), 4) &&
				t.checkExpect(menuHeap.height(), 1) &&
				t.checkExpect(menuHeap.addElt(chips).height(), 2) &&
				t.checkExpect(fullHeap.removeMinElt().height(), 3);
	}

	/**
	 * Test the findMinElt method on heaps.
	 * @param t The tester.
	 * @return Whether or not the test passed.
	 */
	boolean testFindMinElt(Tester t)
	{
		return t.checkExpect(menuHeap.findMinElt().equals(brie), true) &&
				t.checkExpect(menuHeap.addElt(steak).findMinElt().equals(brie), true) &&
				t.checkExpect(fullHeap.findMinElt().equals(chips), true) &&
				t.checkExpect(fullHeap.removeMinElt().findMinElt().equals(crackers), true);
	}

}
