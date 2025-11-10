
package question2;


public interface IProductSales {
   
    int[] getProductSales();
    int getTotalSales();
    double getAverageSales();
    int getSalesOverLimit(int limit);
    int getSalesUnderLimit(int limit);
    int getProductsProcessed();
}

