//Backend intern task solved with java
//this is a chaining calculator program which chains 3 times due to loop
//Designed by Mosouwer jamil

import java.util.Scanner;
class calc{
    
    static int num1=0,num2,opr;
    
    
    
    static void oprDisplay(){
        System.out.println("\n\nSelect a Operations :\n1. Add\n2. Subtract\n3. Multiply\n4. Devide");
         }
    
  
    static int calculate(int opr,int num2){
        
        switch(opr){
            case 1:
                num1+=num2;
                break;
            case 2:
                num1-=num2;
                break;
            case 3:
                num1*=num2;
                break;
            case 4:
                num1/=num2;
            
            default:
                System.out.println("Invalid operation");
        }
        
        return num1;
    }
    
    void myCalculator(){
         System.out.println("Enter first Number :");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
       
           for(int i=1;i<=3;i++){
            oprDisplay();
        System.out.println("\nEnter Your Option :");
        opr=s.nextInt();
        System.out.println("Enter Second Number :");
        num2=s.nextInt();
        int result=calculate(opr,num2);
        System.out.println("\n\nResult is : "+result);
       }
    }
    
    public static void main(String args[]){
        calc obj=new calc();
        obj.myCalculator();
        }
}