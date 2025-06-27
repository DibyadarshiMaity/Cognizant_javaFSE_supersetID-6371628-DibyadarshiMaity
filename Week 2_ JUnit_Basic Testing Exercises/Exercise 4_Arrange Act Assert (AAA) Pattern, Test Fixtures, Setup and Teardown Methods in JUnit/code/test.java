package login;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class test {

    private Login ob1;
   
    @Before
    public void setUp() {
        ob1 = new Login(); 
        System.out.println("Setup");
    }


    @After
    public void tearDown()
     {
        ob1 = null;
        System.out.println("Teardown");
    }

    @Test
    public void testSuccessfulLogin() {

        boolean result = ob1.login("admin", "password123");
        assertEquals(true, result);
    }

    @Test
    public void testLoginWithWrongPassword() {
        boolean result = ob1.login("admin", "wrongpass");
        assertEquals(false, result);
    }

    @Test
    public void testLoginWithNullUsername() {
        boolean result = ob1.login(null, "password123");
        assertFalse(result);
    }

    @Test
    public void testLoginWithNullPassword() {
        boolean result = ob1.login("admin", null);
        assertFalse(result);
    }

    @Test
    public void testValidUsername() {
        boolean result = ob1.isUsernameValid("admin1");
        assertTrue(result);
    }

    @Test
    public void testShortUsername() {
        boolean result = ob1.isUsernameValid("abc");
        assertFalse(result);
    }
}

