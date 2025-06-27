
public class pallindrome {

	public boolean isPalindrome(int number) 
	{
        if (number < 0) 
         return false; 
        int original = number;
        int reversed = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if(original == reversed)
        	return true;
        else
        	return false;
    }

}
