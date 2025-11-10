

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import question2.ProductSales;

public class ProductSalesTest {
    
   
// Sample sales data for two years: Microphone, Speakers, Mixing Desk
int[] sampleData = {300, 150, 600, 250, 200, 600};

// Create an instance of ProductSales using the sample data
ProductSales sales = new ProductSales(sampleData);

@Test
public void GetSalesOverLimit_ReturnsNumberOfSales() {
    // Test that the method correctly counts sales over the limit of 300
    // Expected: 4 sales are over 300 (600, 600, 600, and 250 is not over)
    assertEquals(4, sales.getSalesOverLimit(300));
}

@Test
public void GetSalesUnderLimit_ReturnsNumberOfSales() {
    // Test that the method correctly counts sales under the limit of 300
    // Expected: 2 sales are under 300 (150 and 250)
    assertEquals(2, sales.getSalesUnderLimit(300));
}
}
