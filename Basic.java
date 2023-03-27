public class Basic{
    
    public static void main(String[] args){

        int integer_variable ;// declaring a variable
        integer_variable = 2;// assigning a value to the variable 
        //or we can do it for same
        int var = 7;
        
        System.out.println(integer_variable+var);
        // boolean: represents a value of either true or false
        // byte: represents an 8-bit signed integer
        // short: represents a 16-bit signed integer
        // int: represents a 32-bit signed integer
        // long: represents a 64-bit signed integer
        // float: represents a 32-bit floating-point number
        // double: represents a 64-bit floating-point number
        // char: represents a single character or letter, enclosed in single quote


        // Q6->explain about increment and decreament operators with example?

        int a =3;
        a++;
        System.out.println(a);//output =4
        a--;

        
        System.out.println(a);//output =3
        int y = --a;
        System.out.println(y);// output 2  
        int z = a--;
        System.out.println(z);//output =2
        int k = a--;
        System.out.println(k);//output = 1



    }
}