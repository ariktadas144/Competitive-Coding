import java.util.*;
class Stack 
{
    int top, cap;
    int[] a;
    Stack(int cap) 
  {
        this.cap = cap;
        top = -1;
        a = new int[cap];
    }
    boolean push(int x) 
  {
        if (top >= cap - 1) 
        {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }
    int pop() 
  {
        if (top < 0) 
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }
    int peek() 
  {
        if (top < 0) 
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }
}

public class Main 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack capacity: ");
        int capacity = scanner.nextInt();
        Stack s = new Stack(capacity);
        while (true) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print all elements");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    if (s.push(element))
                    {
                        System.out.println("Pushed " + element);
                    }
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != 0) 
                    {
                        System.out.println("Popped: " + popped);
                    }
                    break;
                case 3:
                    int peeked = s.peek();
                    if (peeked != 0) 
                    {
                        System.out.println("Top element is: " + peeked);
                    }
                    break;
                case 4:
                    System.out.print("Elements present in stack: ");
                    Stack tempStack = new Stack(capacity); 
                    while (!s.isEmpty())
                      {
                        int elementToPrint = s.peek();
                        System.out.print(elementToPrint + " ");
                        tempStack.push(s.pop()); 
                    }
                    System.out.println();
                    while(!tempStack.isEmpty())
                    {
                        s.push(tempStack.pop());
                    }
                    break;
                case 5:
                    System.out.println("End of program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
