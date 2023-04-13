class employee{
String employee_name;  // instance variable 
int eemployee_number;

int age;
int incentive;
String loging_password;


employee(String employee_name,int eemployee_number,int age,int incentive,String loging_password){

    this.employee_name = employee_name;
    this.eemployee_number = eemployee_number;
    this.age =age;
    this.incentive = incentive;
    this.loging_password = loging_password;

}
    void loging(int n ,String pass ){

        // int n and String pass are  parameter variable  
        String masseage = "These are the details of employee"; // local variable 
        if(pass == loging_password)
        System.out.println(masseage);
        System.out.println("Employee Name:"+ employee_name);
        System.out.println("Employee id:"+ eemployee_number);
        System.out.println("Employee salray:"+ incentive);
        System.out.println("Employee Age:"+ age);
    }
}

public class opps {
    public static void main(String[] args) {

        employee emp = new employee("Vikas Sharma ", 3423234, 23, 40000,"password");
// here the new key word is use for obj creation 

        emp.loging(3423234, "password");
        
    }
}
