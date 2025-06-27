import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {


    pallindrome ob = new pallindrome();

    @Test
    public void testPalindrome() {
    	
        assertEquals(true, ob.isPalindrome(121));    
        assertEquals(true, ob.isPalindrome(12321));
        assertEquals(false, ob.isPalindrome(123));    
        assertEquals(false, ob.isPalindrome(-121));  
        assertEquals(true, ob.isPalindrome(0));       
    }
}
