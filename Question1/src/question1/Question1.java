
package question1;
public class Question1 {

// Main class to generate and display the product sales report
    public static void main(String[] args) {

    
        // Sales data: 2 years, 3 quarters each
        int[][] productSales = {
            {300, 150, 700}, // Year 1
            {250, 200, 600}  // Year 2
        };

        ProductSales sales = new ProductSales();

        // Generate report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------------------------");
        System.out.println("Total sales: " + sales.totalSales(productSales));
        System.out.printf("Average sales: %.0f\n", sales.averageSales(productSales));
        System.out.println("Maximum sale: " + sales.maxSale(productSales));
        System.out.println("Minimum sale: " + sales.minSale(productSales));
        System.out.println("---------------------------------------------");
    }
}
    

