/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */

import tester.Tester;

public class Examples
{
	Examples()
	{
		//Constructor
	}

	/**
	 * An example test.
	 * @param t The tester.
	 * @return Whether or not the test passed.
	 */
	boolean test1(Tester t)
	{
		return t.checkExpect(true, true);
	}
}
