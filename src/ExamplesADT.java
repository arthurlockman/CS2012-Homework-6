import tester.Tester;

public class ExamplesADT
{
	Queue testQ = new Queue();
	Queue emptyQ = new Queue();
	Stack testSt = new Stack();
	Stack emptySt = new Stack();

	ExamplesADT()
	{
		testQ.enqueue(5);
		testQ.enqueue(6);

		testSt.push(6);
		testSt.push(7);
		testSt.push(1);

	}

	/**
	 * Test whether or not the queue is storing and processing data correctly.
	 * @param t The tester.
	 * @return Whether or not the tests are successful.
	 */
	boolean testQueue(Tester t)
	{
		return t.checkExpect(emptyQ.isEmpty(), true) &&
				t.checkExpect(testQ.enqueue(1).isEmpty(), false) &&
				t.checkExpect(testQ.enqueue(4).front(), 5) &&
				t.checkExpect(testQ.enqueue(1).dequeue().front(), 6) &&
				t.checkExpect(testQ.dequeue().front(), 1) &&
				t.checkExpect(testQ.dequeue().front(), 4);
	}

	/**
	 * Test whether or not the stack is storing and processing data correctly.
	 * @param t The tester.
	 * @return Whether or not the tests are successful.
	 */
	boolean testStack(Tester t)
	{
		return t.checkExpect(emptySt.isEmpty(), true) &&
				t.checkExpect(testSt.isEmpty(), false) &&
				t.checkExpect(testSt.pop().top(), 7) &&
				t.checkExpect(testSt.push(5).top(), 5) &&
				t.checkExpect(testSt.pop().top(), 7) &&
				t.checkExpect(testSt.pop(), 6);
	}

}
