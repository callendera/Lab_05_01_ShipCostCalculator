//  class ShippingCalculator
public class Main {
    //  main()
    public static void main(String[] args) {

     //  output “What is the price of your item?: “
        System.out.println("What is the price of your item?: ");
        //  input itemPrice
        // num itemPrice
        double itemPrice = 50.49;
        System.out.println("Simulated price: $" + itemPrice);

       //  if itemPrice >= 100
        if(itemPrice >= 100) {
            //  output “You get free shipping!”
            System.out.println("You get free shipping! Your total is: $" + itemPrice);
        } //  endif

        else {
            
            //  shippingCost = itemPrice * .02
            double shippingCost = itemPrice * 0.02;

            //  totalCost = shippingCost + itemPrice
            double totalCost = shippingCost + itemPrice;

            //  output “The shipping cost for your item is“ + shippingCost + “, With a   grand total of” + totalCost
            System.out.println("The shipping cost for your item is $" + shippingCost + ", With a grand total of $" + totalCost);

        }

    } //  return
}//  end class