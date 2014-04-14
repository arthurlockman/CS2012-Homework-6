
[Source](http://web.cs.wpi.edu/~cs2102/d14/hw6.html "Permalink to Homework 6 - More on ADTs and Data Structures; Programming with Generics")

# Homework 6 - More on ADTs and Data Structures; Programming with Generics

##  CS 2102 - D-term 14

##  Homework 6 - More on ADTs and Data Structures; Programming with Generics

###  Due: Tuesday, April 15 at 5pm


Read the [Expectations on Homework][1]. This, and all remaining assignments, are to be done with your homework partner.

## Assignment Goals

  * To understand the behavior of stacks and queues
  * To be able to implement the priority queue operations using a heap
  * To define a data structure (a heap) using Java generics

* * *

There are two sections of problems in this assignment:

### Part 1: Testing Implementations of ADTs

This section describes two fundamental ADTs that access elements of a collection in different orders. We have given you the types of operations for the ADT, a description of the ADT's properties, and an example sequence of operations. For this assignment, we will assume each ADT contains integers.

Your job is write a collection of test cases that would determine whether a supposed implementation of each ADT satisfies the ADT's properties. If we ran your tests against a correct implementation of the ADT, all of your tests should pass. More interestingly, if we ran your tests against an incorrect implementation of an ADT, then at least one of your tests should fail. Thus, this question is about how well your tests cover the expected behavior of the ADT; it is not about the sheer number of tests that you propose.

Provide a file `ExamplesADT.java` containing a single `ExamplesADT` class with all of your tests, written as `checkExpects` against the `Tester` library. The names of your test methods should indicate the data structure being tested: use method names `testQueue` and `testStack` for your test case names. Do not worry about tests on undefined cases that would yield errors (like trying to remove an element from an empty data structure).

Compile your `ExamplesADT.java` file against [this file][2] of interfaces and dummy classes to make sure you match the names we'll assume when grading your work. Note that the classes given in the dummy file are not correct implementations of the ADTs. Your test cases will fail against the dummy file. What matters is that your code _compiles_ when using the dummy file. (Note: When you compile your program, change the first line in the Main class to match the class name `ExamplesADT`:


    static ExamplesADT E = new ExamplesADT () ;


)

You are not being asked to implement any of these ADTs. You are merely defining test cases. The purpose of this assignment is to make sure you understand the operations, properties, and axioms for the queue and stack ADTs. Remember that axioms are statements about how operations interact to support properties. Figuring out the axioms for the ADTs will help you create your test cases. Here are the ADTs:

  1. Queue

A Queue is an ADT for accessing elements of a set in the order of least-recently added to most-recently added (otherwise known as "first in, first out", or FIFO-order). The operations on queues are:

            newQ: -&gt; Queue               // produces a Queue with no elements (constructor)

        enqueue: Queue, int -&gt; Queue // adds an element to the Queue

        dequeue: Queue -&gt; Queue      // removes the least recently-added element

        front: Queue -&gt; int          // returns, but doesn't remove, the least-recently added elt


Example: Assume that we added elements 7, 4, and 5 to a new queue (in that order). Calling dequeue would produce a queue containing 4 and 5. Calling front on that queue would produce 4. Calling dequeue on that queue again would produce a queue containing 5.
  2. Stack

A Stack is an ADT for accessing elements of a set in the order of most recently added to least-recently added (otherwise known as "last in, first out", or LIFO-order). The operations on stacks are:

            newStk: -&gt; Stack          // produces a Stack with no elements (constructor)

        push: Stack, int -&gt; Stack // adds an element to the Stack

        pop: Stack -&gt; Stack       // removes the most recently-added element

        top: Stack -&gt; int         // returns, but doesn't remove, the most-recently added elt


Example: Assume that we added elements 7, 4, and 5 to a new stack (in that order). Calling pop would produce a stack containing 4 and 7. Calling top on that stack would produce 4. Calling pop on that stack again would produce a stack containing 7.

### Part 2: Implementing a Heap using Java Generics

  1. In these exercises you will implement a Heap so that it can contain any type of data. Start by implementing a Heap of int's. You won't be turning in the Heap of int's for grading, but you need to make sure you can code the Heap operations correctly before proceeding to heaps of abstract data. Define an interface `IHeap` and classes `MtHeap` and `DataHeap`. Your Heap classes should implement the methods addElt(), findMinElt(), removeMinElt(), and height() (and any other methods needed to support these operations). These operations are described in the class notes on heaps. An algorithm for merging two heaps is also provided in the class notes. You should implement the merge algorithm using this signature:

            // merges this heap with the given heap
        IHeap merge (IHeap other);


In lecture, we saw how to use either Object or generics to abstract over classes that were similar except for their types. This same idea applies to whole data structures as well: although we have talked about lists, sets, trees, heaps, etc as containing numbers, in reality we often want to use these data structures over arbitrary data. This assignment makes sure that you can implement a multi-class data structure using parameterized datatypes (i.e. Java generics).
  2. Once you have the integer heap working, modify your heap by developing a version in which the type of the data are provided through a type parameter. (Hint: You will need to use a bounded generic parameter.)
  3. In an Examples class, create a heap of `MenuItem`s (from the class notes on data abstraction). MenuItems are prioritized according to price (the most inexpensive item is stored at the top of the heap). Provide tests for heaps of MenuItems.

## Grading

Here is the [general grading rubric][3] for the assignments in this course.

_Programs must compile in order to receive credit._ Programs must run in order to receive credit for Examples and Test Cases. Code that is commented out will not be graded.

## What to Turn In

Using [web-based turnin][4], submit .java files (as a .zip file) containing the final versions of all classes, interfaces, and examples developed for this assignment. Do not submit the .class files.

* * *

   [1]: http://www.cs.wpi.edu/~cs2102/common/hw-expectations.html
   [2]: http://www.cs.wpi.edu/~cs2102/d14/hw6-file.java
   [3]: http://web.cs.wpi.edu/common/general-design.txt
   [4]: https://turnin.cs.wpi.edu:8088/turnin.rkt
  