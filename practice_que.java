//Create a Java program that calculates and displays the cost of purchasing a specified number of items, each priced at a
// certain amount, with a given tax rate and discount. The program should perform calculations using various operators in
// Java, without using objects and classes and without user input. The program should display the total cost, including tax
//and discount.

//code
public class Shopping {
    public static void main(String[] args){
        double itemPrice = 10.00;
        int numberOfitems = 5;
        double taxRate = 8.0;
        double discountPrice = 10.0;

        //calculations
        double subTotal = itemPrice * numberOfitems;
        double taxAmount = (subTotal * taxRate)/100;
        double discountAmount = (subTotal * discountPrice)/100;
        double totalCost = subTotal + taxAmount - discountAmount ;

        //display outcomes 
        System.out.println("the subtotal is:$ "+ subTotal);
        System.out.println("the taxAmount is:$" + taxAmount);
        System.out.println("the discount amount is:$" + discountAmount);
        System.out.println("the total cost to be paid is:$"+ totalCost);
    }
    
}
