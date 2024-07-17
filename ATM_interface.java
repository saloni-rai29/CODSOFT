import java.util.Scanner;

class user_account{
    double balance = 1000000;
    float withdraw ;
    float deposit ;
    public void todeposit(){
        System.out.println("Amount deposited : " + deposit);
        balance = balance + deposit ;
        System.out.println("Your money has been successfully deposited ! ");
        System.out.println("current balance : "+ balance);
    }
    public void towithdraw(){
       if(withdraw>balance){
           System.out.println("Inefficient balance");
       }
       else
       { System.out.println("Amount withdraw : "+withdraw);{
            balance = balance - withdraw ;
           System.out.println("current balance : "+balance);
           System.out.println("Please collect your money !");}
        }
    }
    public void checkBalance(){
        System.out.println(" current Bank balance : "+ balance );
        System.out.println(" Thanks for coming !");
    }
 }
public class ATM_interface   {
public static void main(String []args){

   user_account user1 = new user_account();
    int choice;
   do {

       System.out.println("choose 1 for Deposit");
       System.out.println("choose 2 for Withdraw");
       System.out.println("choose 3 for CheckBalance");
       System.out.println("choose 4 for Exit");
       System.out.println("enter the choice :");
       Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
       switch(choice){
           case 1 :{
               System.out.println("Enter the amount to be deposited : ");
               user1.deposit= sc.nextFloat();
               user1.todeposit();
               break;
           }
           case 2 : {
               System.out.println("Enter the amount to be withdraw : ");
               user1.withdraw=sc.nextFloat();
               user1.towithdraw();
               break;
           }
           case 3: {
               user1.checkBalance();
               break;}
           case 4 :
           {   System.out.println("EXITING \n THANKS FOR VISITING");
               System.exit(0);
           }
           default :
               System.out.println("INVALID CHOICE ! TRY AGAIN ");
       }
   }while(choice!=4)  ;
}

}
