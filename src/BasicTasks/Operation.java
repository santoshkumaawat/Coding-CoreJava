package BasicTasks;

/*3) create a method to accept n no of double values
 along with the operation to be performed.

 1st param will accept '+' for addition
 2st param will accept '*' for product

 calculation('+',10,20,30);  //60
 calculation('*',10,20,30);  //6000*/
public class Operation {

    public static void calculation(double... v) {
        double addition = 0;
        double product = 1;
        double divide = 1;
        double subtract = 0;
        double modulus = 1;
        char c = (char) v[0];
        System.out.println(c);

        for (double d2 : v) {
            if (c == (char) d2) {
            } else {
                if (c == '+') {
                    addition = addition + d2;
                } else if (c == '-') {
                    subtract = subtract - d2;
                } else if (c == '*') {
                    product = product * d2;
                } else if (c == '/') {
                    divide = divide / d2;
                } else if (c == '%') {
                    modulus = modulus % d2;
                }
            }
        }
        if (c == '+') {
            System.out.println(addition);
        } else if (c == '-') {
            System.out.println(subtract);
        } else if (c == '*') {
            System.out.println(product);
        } else if (c == '/') {
            System.out.println(divide);
        } else if (c == '%') {
            System.out.println(modulus);
        } else {
            System.out.println("Invalid Operator");
        }
    }

    public static void main(String[] args) {
        calculation('+', 10, 20, 30); 
        calculation('-', 10, 20, 30); 
        calculation('*', 10, 20, 60);
    }
}
