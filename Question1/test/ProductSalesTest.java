
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import question1.ProductSales;


public class ProductSalesTest {

    int[][] sampleData = {
        {300, 150, 700},
        {250, 200, 600}
    };

    ProductSales sales = new ProductSales();

    @Test
    public void calculateTotalSales_ReturnsTotalSales() {
        int expected = 2200;
        assertEquals(expected, sales.totalSales(sampleData));
    }

    @Test
    public void averageSales_ReturnsAverageProductSales() {
        double expected = 366.67; // Rounded to 2 decimal places
        assertEquals(expected, Math.round(sales.averageSales(sampleData) * 100.0) / 100.0);
    }

    @Test
      public void maxSale_ReturnsMaximumSale() {
        assertEquals(700, sales.maxSale(sampleData));
    }

    @Test
    public void minSale_ReturnsMinimumSale() {
        assertEquals(150, sales.minSale(sampleData));
    }
}
