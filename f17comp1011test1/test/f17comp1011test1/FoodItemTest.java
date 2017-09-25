package f17comp1011test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class FoodItemTest {

    FoodItem food;
    
    public FoodItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        food = new FoodItem("Chocolate Donut", 200, 6, 64, 13, 4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFoodName method, of class FoodItem.
     */
    @Test
    public void testGetFoodName() {
        System.out.println("getFoodName");
        String expResult = "Chocolate Donut";
        String result = food.getFoodName();
        assertEquals(expResult, result);
    }


    /**
     * Test of getCalories method, of class FoodItem.
     */
    @Test
    public void testGetCalories() {
        int expResult = 200;
        int result = food.getCalories();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCalories method, of class FoodItem.
     */
    @Test
    public void testSetCalories0() {
        int calories = 0;
        try{
            food.setCalories(calories);
        }
        catch (IllegalArgumentException e)
        {
            fail("Set calories with a value of 0 should not trigger an exception");
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Test of setCalories method, of class FoodItem.
     */
    @Test
    public void testSetCaloriesNegative() {
        int calories = -1;
        try{
            food.setCalories(calories);
            fail("Should have triggered an exception in the setCalories method with a negative number");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }        
    }
    
    /**
     * Test of setCalories method, of class FoodItem.
     */
    @Test
    public void testSetCaloriesNegativeWithConstructor() {
        try{
            FoodItem invalidFood = new FoodItem("non-food", -200, 6, 64, 13, 4);
            fail("Should have triggered an exception in the Constructor with a negative number for calories");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }        
    }

    /**
     * Test of setCalories method, of class FoodItem.
     */
    @Test
    public void testSetCaloriesPositive() {
        int calories = 100;
        try{
            food.setCalories(calories);            
        }
        catch (IllegalArgumentException e)
        {
            fail("Should have triggered an exception in the setCalories method with a negative number");
            System.out.println(e.getMessage());
        }        
    }
    
    /**
     * Test of getFat method, of class FoodItem.
     */
    @Test
    public void testGetFat() {
        int expResult = 6;
        int result = food.getFat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFat method, of class FoodItem.
     */
    @Test
    public void testSetFat0() {
        try{
            food.setFat(0);
        }
        catch (IllegalArgumentException e)
        {
            fail("setFat with a value of 0 should not trigger an exception");
        }            
    }

    /**
     * Test of setFat method, of class FoodItem.
     */
    @Test
    public void testSetFatPositive() {
        try{
            food.setFat(10);
        }
        catch (IllegalArgumentException e)
        {
            fail("setFat with a value of 10 should not trigger an exception");
        }            
    }
    
    
    /**
     * Test of setFat method, of class FoodItem.
     */
    @Test
    public void testSetFatNegative() {
        try{
            food.setFat(-1);
            fail("setFat with a value of -1 should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }            
    }

    /**
     * Test of setFat method, of class FoodItem.
     */
    @Test
    public void testSetFatNegativeInConstructor() {
        try{
            FoodItem invalidFood = new FoodItem("non-food", 200, -6, 64, 13, 4);
            fail("Constructor should have triggered an exception with negative fat value");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }            
    }


    /**
     * Test of getServingSize method, of class FoodItem.
     */
    @Test
    public void testGetServingSize() {
        int expResult = 64;
        int result = food.getServingSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setServingSize method, of class FoodItem.
     */
    @Test
    public void testSetServingSizeNegative() {
        try
        {
            food.setServingSize(-1);
            fail("setServingSize with a value of -1 should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Test of setServingSize method, of class FoodItem.
     */
    @Test
    public void testSetServingSizeNegativeInConstructor() {
        try
        {
            FoodItem invalidFood = new FoodItem("non-food", 200, 6, -64, 13, 4);
            fail("Constructor should have triggered an exception with negative serving size value");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Test of setServingSize method, of class FoodItem.
     */
    @Test
    public void testSetServingSize0() {
        try
        {
            food.setServingSize(0);            
        }
        catch (IllegalArgumentException e)
        {
            fail("setServingSize with a value of 0 should not trigger an exception");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Test of setServingSize method, of class FoodItem.
     */
    @Test
    public void testSetServingSizePositive() {
        try
        {
            food.setServingSize(50);            
        }
        catch (IllegalArgumentException e)
        {
            fail("setServingSize with a value of 50 should not trigger an exception");
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Test of getSugar method, of class FoodItem.
     */
    @Test
    public void testGetSugar() {
        int expResult = 13;
        int result = food.getSugar();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSugar method, of class FoodItem.
     */
    @Test
    public void testSetSugarNegative() {
        try{
            food.setSugar(-1);
            fail("setSugar with a value of -1 should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
     
    /**
     * Test of setSugar method, of class FoodItem.
     */
    @Test
    public void testSetSugarNegativeInConstructor() {
        try{
             FoodItem invalidFood = new FoodItem("non-food", 200, 6, 64, -13, 4);
             fail("Constructor should have triggered an exception with negative sugar value");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
            
            
    /**
     * Test of setSugar method, of class FoodItem.
     */
    @Test
    public void testSetSugar0() {
        try{
            food.setSugar(0);
        }
        catch (IllegalArgumentException e)
        {
            fail("setSugar with a value of 0 should not trigger an exception");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Test of setSugar method, of class FoodItem.
     */
    @Test
    public void testSetSugarPositive() {
        try{
            food.setSugar(10);
        }
        catch (IllegalArgumentException e)
        {
            fail("setSugar with a value of 10 should not trigger an exception");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Test of getProtein method, of class FoodItem.
     */
    @Test
    public void testGetProtein() {
        int expResult = 4;
        int result = food.getProtein();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProtein method, of class FoodItem.
     */
    @Test
    public void testSetProteinNegative() {
        try{
            food.setProtein(-1);
            fail("setProtein with a value of -1 should trigger an exception");                    
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Test of setProtein method, of class FoodItem.
     */
    @Test
    public void testSetProteinNegativeInConstructor() {
        try{
            FoodItem invalidFood = new FoodItem("non-food", 200, 6, 64, 13, -4);
            fail("Constructor should have triggered an exception with negative protein value");        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
             
             
    /**
     * Test of setProtein method, of class FoodItem.
     */
    @Test
    public void testSetProtein0() {
        try{
            food.setProtein(0);            
        }
        catch (IllegalArgumentException e)
        {
            fail("setProtein with a value of 0 should not trigger an exception");                    
            System.out.println(e.getMessage());
        }
    }
    /**
     * Test of setProtein method, of class FoodItem.
     */
    @Test
    public void testSetProteinPositive() {
        try{
            food.setProtein(10);
        }
        catch (IllegalArgumentException e)
        {
            fail("setProtein with a value of 10 should not trigger an exception");                    
            System.out.println(e.getMessage());
        }
    }
    
}