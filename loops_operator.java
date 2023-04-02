class loops_operator {
    public static void main(String[] args) {

        // Q1-What are the conditional operators in java?
        int a = 5;
        int b = 9;
        // And oprator
        if (a > 4 && b < 30) {
            System.out.println("a > 4 AND b < 30 is true and both condition is true");
        }
        // OR operator

        if (a > 4 || b < 3) {
            System.out.println("At least one condition is true");
        }

        // Ternary operator
        int x = 5;
        int result = (x > 0) ? ((x < 10) ? 1 : 2) : 3;
        System.out.println(result); // output 1

        // Q3-> what is the switch case in Java programming?

        // example

        char grade = 'B';
        String message;

        switch (grade) {
            case 'A':
                message = "Excellent!";
                break;
            case 'B':
                message = "vary good";
            case 'C':
                message = "Well done!";
                break;
            case 'D':
                message = "You passed.";
                break;
            case 'F':
                message = "Better try again.";
                break;
            default:
                message = "Invalid grade.";
                break;
        }

        System.out.println("Your grade is " + grade);
        System.out.println("Message: " + message);

        // example for if-else statment 
        System.out.println("example for if-else statment ");
        int budget =4500000;
        if(budget <= 2000000){
            System.out.println("buy Mahindra cars");
        }else if(budget<2000000){
            System.out.println(" go for Suzuki cars");
        }else{
            System.out.println("go for German brands");
        }


        // example for  do while loop  for condition variable<10:
        System.out.println("example for  do while loop  for condition variable<10:");
        int values = 0;
        do{
            System.out.println(values);
            values++;
        }
        while(values<10);
        //  example for   for loop :
        System.out.println("example for   for loop :");
        for(int i =0 ; i<10;i++){
            System.out.println(i);
        }

        //  example for while loop 
        System.out.println("example for while loop ");
        int j =0;
        while(j<10){
            System.out.println(j);
            j++;
        }

        // Q9 Write the program to print 1 to 10.
        System.out.println("Q9 Write the program to print 1 to 10.");

        for(int  i = 0 ; i<=10 ;i++){
            System.out.println(i);
        }

    }
}