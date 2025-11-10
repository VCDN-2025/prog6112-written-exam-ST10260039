
package question2;

public class ProductSales implements IProductSales  {

   // Stores the sales data for all products
private int[] productSales;

// Constructor initializes the productSales array with provided data
public ProductSales(int[] productSales) {
    this.productSales = productSales;
}

// Returns the array of product sales values
@Override
public int[] getProductSales() {
    return productSales;
}

// Calculates and returns the total sales across all products
@Override
public int getTotalSales() {
    int total = 0;
    // Loop through each sale and accumulate the total
    for (int sale : productSales) {
        total += sale;
    }
    return total;
}

// Calculates and returns the average sales value
@Override
public double getAverageSales() {
    // Divide total sales by number of products
    return (double) getTotalSales() / productSales.length;
}

// Returns the number of products with sales above the specified limit
@Override
public int getSalesOverLimit(int limit) {
    int count = 0;
    // Count how many sales exceed the limit
    for (int sale : productSales) {
        if (sale > limit) count++;
    }
    return count;
}

// Returns the number of products with sales below the specified limit
@Override
public int getSalesUnderLimit(int limit) {
    int count = 0;
    // Count how many sales are below the limit
    for (int sale : productSales) {
        if (sale < limit) count++;
    }
    return count;
}

// Returns the total number of products processed (i.e., number of sales entries)
@Override
public int getProductsProcessed() {
    return productSales.length;
}
}

