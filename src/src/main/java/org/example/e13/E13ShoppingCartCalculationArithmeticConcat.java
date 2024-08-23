package src.main.java.org.example.e13;

public class E13ShoppingCartCalculationArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare the float variables and assign values
        float item1=30F;
        float item2=20F;
        float item3=40F;

        // Step 2: Calculate the total cost
        float totalCost=item1+item2+item3;



        // Step 3: Apply the discount
        float discountRate=0.1F;

        float discountAmount=totalCost*discountRate;

        float finalPrice=totalCost-discountAmount;

        // Step 4: Print the results

        System.out.println("Total Cost: $"+ totalCost);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);

    }
}
