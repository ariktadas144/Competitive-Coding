# Competitive-Coding 

## Level 0 Task: Basic Data Structure Implementation

## Description

This program implements a doubly linked list with the following functionalities:

* **Node Creation:** Creation of individual nodes to store data.
* **Insertion (Head and Tail):** Insertion of new nodes at the beginning (head) and end (tail) of the list.
* **Traversal (Forward and Backward):** Traversal and printing of the list in both forward and backward directions.

## Files

* `Node.java`: Contains the `Node` class, representing a node in the doubly linked list.
* `DoublyLinkedList.java`: Contains the `DoublyLinkedList` class, implementing the doubly linked list and its operations.
* `DoublyLinkedListImplementation.java`: Contains the `Main` class, demonstrating the usage of the doubly linked list.

## Code Explanation and Approach

**Node.java:**

* The `Node` class represents a node in the doubly linked list.
* It contains three fields:
    * `data`: Stores the data of the node.
    * `prev`: Points to the previous node in the list.
    * `next`: Points to the next node in the list.
* The constructor initializes a new node with the given data and sets `prev` and `next` to `null`.

**DoublyLinkedList.java:**

* The `DoublyLinkedList` class represents the doubly linked list.
* It contains two fields:
    * `head`: Points to the first node in the list.
    * `tail`: Points to the last node in the list.
* **insertAtHead(int data):**
    * Creates a new node with the given data.
    * If the list is empty, the new node becomes both the head and tail.
    * Otherwise, updates the `prev` and `next` pointers to insert the new node at the beginning.
* **insertAtTail(int data):**
    * Creates a new node with the given data.
    * If the list is empty, the new node becomes both the head and tail.
    * Otherwise, updates the `prev` and `next` pointers to insert the new node at the end.
* **printForward():**
    * Traverses the list from the head to the tail.
    * Prints the data of each node.
* **printBackward():**
    * Traverses the list from the tail to the head.
    * Prints the data of each node.

**DoublyLinkedListImplementation.java:**

* The `Main` class demonstrates the usage of the `DoublyLinkedList` class.
* It creates a `DoublyLinkedList` object and performs various operations, including insertion and traversal.
* It prints the results of the forward and backward traversals to the console.

**Approach:**

The doubly linked list is implemented using nodes that store data and pointers to the previous and next nodes. Insertion and traversal operations are implemented by manipulating these pointers.

### Time and Space Complexity

* **insertAtHead(int data):** O(1) time complexity (constant time).
* **insertAtTail(int data):** O(1) time complexity.
* **printForward():** O(n) time complexity, where n is the number of nodes in the list.
* **printBackward():** O(n) time complexity.
* **Space Complexity:** O(n), where n is the number of nodes in the list. This is because each node stores data and pointers to the previous and next nodes.

## Level 1 Task: Custom Data Structure Implementation

### Description

This task involves implementing a stack that supports the following operations in O(1) time complexity:

* **push(x):** Pushes element `x` onto the stack.
* **pop():** Removes the top element of the stack.
* **top():** Returns the top element without removing it.
* **getMin():** Returns the smallest element in the stack.
* **getMax():** Returns the largest element in the stack.

The implementation uses arrays to simulate stacks for the main stack, min stack, and max stack.

### Files

* `MinMaxArrayStack.java`: Contains the `MinMaxArrayStack` class implementation.
* `MinMaxArrayStackImplementation.java`: Contains the `Main` class with a menu-driven interface for user interaction.

### Code Explanation and Approach

**MinMaxArrayStack.java:**

* Uses three integer arrays: `mainStack`, `minStack`, and `maxStack`.
* `top` keeps track of the top element in the stack.
* `cap` stores the capacity of the stack.
* **push(x):** Pushes `x` onto `mainStack`. Updates `minStack` and `maxStack` to maintain the minimum and maximum values at each level.
* **pop():** Pops elements from all three stacks.
* **top():** Returns the top element of `mainStack`.
* **getMin():** Returns the top element of `minStack`.
* **getMax():** Returns the top element of `maxStack`.
* Error checking for stack overflow and underflow is included.

**MinMaxArrayStackImplementation.java:**

* Uses a `Scanner` for user input and provides a menu-driven interface.
* The stack is initialized with a user provided capacity.

**Approach:**

The approach uses auxiliary stacks (`minStack` and `maxStack`) to store the minimum and maximum elements seen so far. This ensures that `getMin()` and `getMax()` can be done in O(1) time.

### Time and Space Complexity

* **
* **top():** O(1) time complexity.
* **getMin():** O(1) time complexity.
* **getMax():** O(1) time complexity.
* **Space Complexity:** O(n), where n is the number of elements in the main stack. This is because we use three stacks, each with a maximum size of n.

## Level 2 Task: Composite Data Structure Implementation

### Description

This task involves implementing an interval merger. The program maintains a set of non-overlapping intervals and efficiently merges them when new intervals are added.

* **addInterval(start, end):** Adds a new interval `[start, end]`. If it overlaps with existing intervals, merge them into one. Ensures the set of intervals remains non-overlapping and sorted.
* **getIntervals():** Returns the current set of non-overlapping, merged intervals in ascending order.

The implementation uses arrays to store and manipulate the intervals.

### Files

* `Interval.java`: Contains the `Interval` class implementation.
* `IntervalMerger.java`: Contains the `IntervalMerger` class with the merging logic.
* `Main.java`: Contains the `Main` class with a menu-driven interface for user interaction.

### Code Explanation and Approach

**Interval.java:**

* Represents an interval with `start` and `end` values.

**IntervalMerger.java:**

* Uses an `Interval[]` array to store intervals.
* `size` and `capacity` are used to manage the array.
* **addInterval(start, end):** Adds a new interval and calls `mergeIntervals()`.
* **getIntervals():** Returns an array of merged intervals.
* **mergeIntervals():** Sorts the intervals using insertion sort (manual sorting), then merges overlapping intervals.

**Main.java:**

* Uses a `Scanner` for user input and provides a menu-driven interface.
* The interval merger is initialized with a user provided capacity.

**Approach:**

1.  **Sorting:** Uses insertion sort to sort intervals by their start values.
2.  **Merging:** Iterates through the sorted intervals, merging overlapping intervals into a single interval.
3.  **Array Storage:** Implements the interval collection using an array.

### Time and Space Complexity

* **addInterval(start, end):** O(n^2) worst case Time complexity. O(n log n) average case because of sorting with an array. In this specific case, insertion sort is used, adding the worst case complexity. Merging the intervals is O(n).
* **getIntervals():** O(n) time complexity.
* **Space Complexity:** O(n), where n is the maximum number of intervals that the array can hold. We use an array to hold the intervals. Also during the merge function, a temporary array is used that could also be of size n, so it maintains O(n) space complexity.
