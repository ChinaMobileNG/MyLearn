package cd.cn;

import java.util.function.Function;
public class AnonymousClassExample 
{    
    Function format = new Function<String,String>() {      
            

		@Override
		public String apply(String input) {
			// TODO Auto-generated method stub
			return  Character.toUpperCase(input.charAt(0)) + input.substring(1);
		}
    };
}