# COMP 271 SU25 WEEK 03

This assignment has two parts: a coding part based on current material we discuss in class and a reflection part to evaluate work you have already submitted.


# Standing requirements

* **Programmers Pact:** Your work must be compliant with the [Programmers Pact](./ProgrammerPact.pdf). 
* **Comments:** Your code must be sufficiently documented with comments.
* **No imports:** You may not use the import statement in your code, with one exception: `import Arrays;` is allowed only for using `Arrays.toString()`. No other methods of class `Arrays` may be used.
* **Only `System.out` calls:** you may use `System.out` to print to the console. No other methods from `System` are allowed. Only `System.out.println`, `System.out.printf`, and `System.out.print`. 

# Finals week policy

There is no final exam for the course. There will be a final assignemnt that will be published the week before finals and will be due the week of finals. Additionally, 8 students in the course will be invited randomly to a brief meeting with the instructor during the course's final exam slot. The final exam slot for this course is on Tuesday, August 5, 2025 from 9 to 11 AM. If you are selected for a brief meeting, we'll spend about 15 minutes during the final exam slot to review your work. This interview will cover coding practices based on your past assignments. It is meant as a checkpoint to ensure that you have internalized the work you submitted.

# Code

You'll work with classes `Node.java` and `DoubleLinkedList.java`. 

## Complete `void add(Node node)` in `DoubleLinkedList`

This method takes a `Node` object and adds it to the end of the linked list. The method, as written, is incomplete. It only sets the newly added node's `next` pointer. Write code that takes care of the newly added notes `previous` pointer.

## Complete `void add(String value)` in `DoubleLinkedList`

The earlier method adds a `Node` to the list. This method adds a node to the list after it creates a new one based a given `value`.

## Modify `DoubleLinkedList` with a size field

## Complete `int compareTo(DoubleLinkedList other)` in `DoubleLinkedList`

Imagine two `DoubleLinkedList` objects, say `A` and `B`. How would you like to compare them? Rewrite method `compareTo` so that
```java
A.compareTo(B)
```
will return a negative integer number is `A` is smaller than `B`, a positive integer number if `A` is greater than `B`, and zero when `A` and `B` are the similar. You are free to define what a smaller/greater/similar list is. For consistency, if `A.compareTo(B)` is negative then `B.compareTo(A)` must be positive. *Ideally,* we want
$$
\texttt{A.compareTo(B)} = -\ \texttt{B.compareTo(A)}
$$
This identity applies even when `A` and `B` are similar because we can always claim that $0=-\ 0$.

# Study

From the BJP textbook Chapters 16.1, 16.2, and 16.3; or [Ch. 5 from Collins’ book](https://learning.oreilly.com/library/view/data-structures-and/9780470482674/14-chapter07.html). In addition, you should be up to speed with the following.

* Chapter 18.2 from the BJP textbook (or at the very least Leo’s notes titled “What’s Realistic”)
* Chapter 8 from the BJP textbook (or at the very least Java’s tutorial on Classes and Objects)
* Chapter 9 from the BJP textbook (or at the very least Java's tutorial on interfaces and inheritance)

# Reflect

Compare your code from the previous assignment with [Leo's posted solutions](./MinHeap.java#L191). 

Then write a brief reflection (100-300 words) discussing what you got right, what you got close but not quite, and where you may have missed the mark. Also discuss what you learned by comparing your code to the posted solutions. The reflection must be substantive. For example, you may find that you missed something in the assignment because you did not put enough time in it or because you did not start work early. It's fine to acknowledge these issues. It is also important to propose a plan to avoid them in the future. And, in later reflections, evaluate how that plan worked.

In the assignment for WEEK 02 you were given class `MinHeap`. The class had a dozen of methods in 300 lines of code. One of the methods (`heapifyUp`) was incomplete. You had to complete it. The solution presented here is very compact, practically implemented with 5 lines of code (shown as pseudocode here):

```java
int index = last used position in underlying array;
while (min-heap property is violated) {
    swap(parent(index), index);
    index = parent(index); }
```

* Was your code sufficiently documented with comments?.

* Did you test your code to verify that it compiles and returns correct results?

Your reflection should be submitted together with the current homework assignment due 6/11. Write your reflection as a *markdown* file called `reflection.md` in the current assignment's repository. **MarkDown** is a fairly simple markup (I know!) language that's worth learning. You can use a [simple cheat sheet](https://www.markdownguide.org/basic-syntax/) for MarkDown (.md) files or you can look at the course code of any `.md` file I share with you such as this one here. You can open any `.md` file on your CodeSpaces editor to see how it's written. 

If MarkDown is not your cup of tea that's ok too. Write your reflection in an email and send it to me with the header "reflection" in the subject line. But if you see yourself as a programmer/computer scientist down the road, it's worth the time to learn to write in MarkDown.
