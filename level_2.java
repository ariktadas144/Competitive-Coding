import java.util.*;
class Interval 
{
    int start;
    int end;
    Interval(int start, int end)
  {
        this.start = start;
        this.end = end;
    }
    @Override
    public String toString() 
  {
        return "[" + start + ", " + end + "]";
    }
}
class IntervalMerger 
{
    Interval[] intervals;
    int size;
    int capacity;
    IntervalMerger(int capacity) 
  {
        this.capacity = capacity;
        this.intervals = new Interval[capacity];
        this.size = 0;
    }
    void addInterval(int start, int end) 
  {
        if (size == capacity) 
        {
            System.out.println("Interval storage full.");
            return;
        }
        intervals[size++] = new Interval(start, end);
        mergeIntervals();
    }
    Interval[] getIntervals() 
  {
        Interval[] result = new Interval[size];
        System.arraycopy(intervals, 0, result, 0, size);
        return result;
    }
    void mergeIntervals() 
  {
        if (size == 0) 
        {
            return;
        }
        for (int i = 1; i < size; i++) 
        {
            Interval key = intervals[i];
            int j = i - 1;
            while (j >= 0 && intervals[j].start > key.start) 
            {
                intervals[j + 1] = intervals[j];
                j--;
            }
            intervals[j + 1] = key;
        }
        Interval[] mergedIntervals = new Interval[capacity];
        int mergedSize = 0;
        mergedIntervals[mergedSize++] = intervals[0];
        for (int i = 1; i < size; i++) 
        {
            Interval currentInterval = intervals[i];
            Interval lastMergedInterval = mergedIntervals[mergedSize - 1];
            if (currentInterval.start <= lastMergedInterval.end) 
            {
                lastMergedInterval.end = Math.max(lastMergedInterval.end, currentInterval.end);
            } 
            else 
            {
                mergedIntervals[mergedSize++] = currentInterval;
            }
        }
        System.arraycopy(mergedIntervals, 0, intervals, 0, mergedSize);
        size = mergedSize;
    }
}
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter interval capacity: ");
        int capacity = scanner.nextInt();
        IntervalMerger merger = new IntervalMerger(capacity);
        while (true) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Interval");
            System.out.println("2. Get Intervals");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter start of interval: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end of interval: ");
                    int end = scanner.nextInt();
                    merger.addInterval(start, end);
                    System.out.println("Interval [" + start + ", " + end + "] added.");
                    break;
                case 2:
                    Interval[] result = merger.getIntervals();
                    System.out.print("Merged Intervals: ");
                    for (int i = 0; i < merger.size; i++) {
                        System.out.print(result[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("End of program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
