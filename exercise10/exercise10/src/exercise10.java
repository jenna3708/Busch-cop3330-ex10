import java.util.Scanner;


public class exercise10 {
    public static void main(String[] args)
    {
        //item 1 work
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the price of item 1:");
        String item1 = input.next();
        int convItem1 = Integer.parseInt(item1);

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter the quantity of item 1:");
        String item1Q = input2.next();
        int convItem1Q = Integer.parseInt(item1Q);

        int item1total = convItem1 * convItem1Q;

        //item 2 work
        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter the price of item 2:");
        String item2 = input3.next();
        int convItem2 = Integer.parseInt(item2);

        Scanner input4 = new Scanner (System.in);
        System.out.println("Enter the quantity of item 2:");
        String item2Q = input4.next();
        int convItem2Q = Integer.parseInt(item2Q);

        int item2total = convItem2 * convItem2Q;

        //item 3 work
        Scanner input5 = new Scanner (System.in);
        System.out.println("Enter the price of item 3:");
        String item3 = input5.next();
        int convItem3 = Integer.parseInt(item3);

        Scanner input6 = new Scanner (System.in);
        System.out.println("Enter the quantity of item 3:");
        String item3Q = input3.next();
        int convItem3Q = Integer.parseInt(item3Q);

        int item3total = convItem3 * convItem3Q;

        //calculating the subtotal
        double subtotal = item1total + item2total + item3total;
        double tax = subtotal * .055;
        double total = subtotal + tax;

        System.out.println("Subtotal: $"+String.format("%.2f",subtotal)+"\nTax: $"+tax+"\nTotal: $"+total);

    }
}

