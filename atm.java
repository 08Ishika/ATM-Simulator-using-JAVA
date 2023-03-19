import java.util.*;
public class atm {
    public static void main(String args[]){
        int card=6789,pin=1234,op,card1;
        int flag=0,flag1=0,flag2=0;
        double c = 100000, d=2000000;

        Scanner sc = new Scanner(System.in);
        zero : do {System.out.println("Enter the last 4 digits of your card : ");
        
            card1 = sc.nextInt();
            if(card1==card){
             do {
           first :  System.out.println("Enter the MPIN : ");
            int pin1 = sc.nextInt();
                if(pin1==pin){
                second : do{ System.out.println("\nSelect an option:");
                System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Change MPin\n5.Quit\n");
                op = sc.nextInt();
                switch(op){
                    case 1 :  System.out.println("\nEnter the account type :");
                               String type = sc.next();
                                if(type.equalsIgnoreCase("Current")){
                                System.out.println("Your current account balance is : "+c);
                                }
                                else if(type.equalsIgnoreCase("Savings")){
                                    
                                    System.out.println("Your Savings account balance is : "+d);
                                }
                                else{
                                    System.out.println("Invalid Account type");
                                }
                               break;
                    case 2 :  System.out.println("\nEnter the account type from which you want to withdraw :");
                                type = sc.next();
                                if(type.equalsIgnoreCase("Current")){
                                    System.out.println("Enter the Amount you want to withdraw : ");
                                    double camt = sc.nextDouble();
                                    if(camt>20000){
                                        System.out.println("Withdrawl limit exceeded");
                                    }
                                    else if (c<camt  || c==0){
                                        System.out.println("Insufficient Banalnce");
                                    }
                                    
                                    else if(camt%100!=0){
                                            System.out.println("The denomination should be a multiple of 100");
                                        }
                                        else{
                                             c = c-camt;
                                            System.out.println("Rs "+camt+" is debited from your account.\nThe available balance is "+c);
                                            flag++;
                                            
                                }}
                                else if(type.equalsIgnoreCase("savings")){
                                    System.out.println("Enter the Amount you want to withdraw : ");
                                    double samt = sc.nextDouble();
                                    if(samt>10000){
                                        System.out.println("Withdrawl limit exceeded");
                                    }
                                    else if (d<samt  || d==0){
                                        System.out.println("Insufficient Banalnce");
                                    }
                                    else if (samt%100!=0){
                                            System.out.println("The denomination should be a multiple of 100");
                                        }
                                        else{
                                             d = d-samt;
                                            System.out.println("Rs "+samt+" is debited from your account.\nThe available balance is "+d);
                                            flag++;
                                }}
                                else {
                                    System.out.println("Invalid account type");
                                }
                                break;
                    case 3 : System.out.println("\nEnter the account type to which you want to deposit :");
                                type = sc.next();
                                if(type.equalsIgnoreCase("Current")){
                                 System.out.println("Enter the Amount you want to deposit : ");
                                 double camt = sc.nextDouble();
                                    if(camt>5000){
                                    System.out.println("Deposit limit exceeded");
                                     }
                                    else if(camt%100!=0){
                                        System.out.println("The denomination should be a multiple of 100");
                                        }
                                         else{
                                         c = c+camt;
                                         System.out.println("Rs "+camt+" is credited to your account.\nThe available balance is "+c);
                                          flag++;
                                         }}

                                else if(type.equalsIgnoreCase("savings")){
                                    System.out.println("Enter the Amount you want to deposit : ");
                                    double samt = sc.nextDouble();
                                       if(samt>10000){
                                       System.out.println("Deposit limit exceeded");
                                        }
                                       else if(samt%100!=0){
                                        System.out.println("The denomination should be a multiple of 100");
                                        }
                                    else{
                                   d = d+samt;
                                   System.out.println("Rs "+samt+" is credited to your account.\nThe available balance is "+d);
                                     flag++;}}
                                     else {
                                        System.out.println("Invalid account type");
                                    }
                                        break;
                
                    case 4 : System.out.println("Enter the current Pin");
                             pin1 = sc.nextInt();
                             if(pin1 == pin){
                                System.out.println("Enter the new pin");
                                int newpin = sc.nextInt();
                                System.out.println("Confirm Pin");
                                int confirm = sc.nextInt();
                                if(newpin==confirm){
                                    System.out.println("MPin changed successfully\n");
                                    pin = newpin;}
                                else{
                                    System.out.println("Pins not matching");
                                    continue second;
                                }
                            }
                             
                             else{
                                System.out.println("Invalid MPin");
                                
                             }
                             break second;
                            
                case 5 :    System.out.println("Thank you for using our Service");
                            System.exit(0);
                             break;
                default : System.out.println("Invalid choice");
                }} while(flag<5 ); break zero;
        }
            else{
                System.out.println("Invalid Pin\n");
                flag1++;
               
                
            }
            }while(flag1<3); break zero; 

            }
            else{ 
                
            System.out.println("Invalid card\n");
            flag2++;
            
}}while(flag2<3);

if (flag1>=3){
    System.out.println("3 wrong attemps, Card blocked. Try after 24 hours");
    System.exit(0);
}
else if(flag>=5){
    System.out.println("Only 5 transactions allowed for a single card in a day");
    System.exit(0);
}
else if(flag2>=3){
    System.out.println("3 wrong attempts. Try again after 24 hours.");
    System.exit(0);
}
    
    }
}