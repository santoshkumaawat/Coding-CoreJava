package BasicTasks;

/*2) create a method to accept n no of int values and
 find the highest no among the given values.*/
public class HighestNumber {

    public static void highest(int... v) {
        int j = 0;
        for (int i : v) {
            if (i >= j) {
                j = i;
            }
        }
        System.out.println(j);
    }

    public static void main(String[] args) {
        highest();
        highest(10, 20);
        highest(10, 20, 30);
        highest(10, 20, 30, 40);
        highest(10, 20, 30, 40, 50);
    }
}
