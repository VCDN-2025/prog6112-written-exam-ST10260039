
package question1;

    // Implements IProductSales to calculate sales metrics
public class ProductSales implements IProductSales {

    // Calculates total sales across all quarters and years
    @Override
    public int totalSales(int[][] productSales) {
        int total = 0;
        for (int[] year : productSales) {
            for (int quarter : year) {
                total += quarter;
            }
        }
        return total;
    }

    // Calculates average sales across all quarters and years
    @Override
    public double averageSales(int[][] productSales) {
        int total = totalSales(productSales);
        int count = productSales.length * productSales[0].length;
        return (double) total / count;
    }

    // Finds the maximum sale value
    @Override
    public int maxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int[] year : productSales) {
            for (int quarter : year) {
                if (quarter > max) {
                    max = quarter;
                }
            }
        }
        return max;
    }

    // Finds the minimum sale value
    @Override
    public int minSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int[] year : productSales) {
            for (int quarter : year) {
                if (quarter < min) {
                    min = quarter;
                }
            }
        }
        return min;
    }

}

