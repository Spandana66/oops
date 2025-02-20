import java.util.Scanner;
class Banking 
{      
	 String username = "pavankalyan";
	 String password = "Pavan@123";
	 double balance =75000;
	 
	public static void main(String[] args) 
	    {  
		System.out.println("Main Method Start ");
        check();
        System.out.println("Main Method Ends");
		}

	public static void check()
		{
		
		Banking db = new Banking();
       
          int choices =0;
	     while (choices<3)

		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName");
		String uname = sc.next();
		System.out.println("Enter the Password");
		String pwd = sc.next();

		if((uname.equals(db.username))&&(pwd.equals(db.password)))
		{       
         System.out.println("Welcome to the Digital Banking");

			int repeat;
	  do{
			System.out.println("Please select the options");

			System.out.println("1.Deposit Amount");
			
			System.out.println("2.Withdrawl Amount");
			
			System.out.println("3.Check Balance is");

			System.out.println("4.Sent Amount");
            
     		
			int option  = sc.nextInt();
            
          
			switch(option)

				{

				case 1:{
					    
						System.out.println("Enter the Deposit Amount");
		                 double depositAmount = sc.nextDouble();

                        
						System.out.println("Deposit amount is:"+deposit( depositAmount));
				}break;

			    case 2:{

					 System.out.println("Enter the withdrawl Amount");
		            double  withdrawAmount = sc.nextDouble();  


					   
			     System.out.println("Withdraw amount is:"+ withdrawl( withdrawAmount));
                 
				}break;

				case 3:{
                   
				 System.out.println("Curerrent balance is:"+ db.balance);
             	}break;


				default:
				{
					System.out.println("select  the valid  option");
				}break;


				
		}
             
		System.out.println("If You Want Check Any Other Options Press1 Else Press 0");

              repeat = sc.nextInt();
		
	  } while(repeat ==1) ;
	  
		
	  	choices=4;
        
		             
		}
		else{
			System.out.println("Incorrect Password");
		

		
			System.out.println("Please re enter the password");
             
			 choices++;
			 if (choices>=3)
			{
				System.out.println("Your Account Block For today");
			}

		}
			 

		}
		      
	}

	 public static double deposit(double depositAmount){

		

        Banking db = new Banking();
		db.balance = db.balance +depositAmount;

	//	System.out.println("Current balance is:"+db.balance);
          
		  return depositAmount;
	}

	public static double withdrawl(double withdrawAmount){

        Banking db = new Banking();
		db.balance = db.balance-withdrawAmount;
		
		return withdrawAmount;

	}


	//public static double checkBalance(double balance,double depositAmount,double withdrawAmount){

	//	Digitalbanking db = new Digitalbanking();
    //    db.balance = db.balance+depositAmount-withdrawAmount;

	//	System.out.println("Your Current Balance is :"+ db.balance);


	//	return db.balance;

	//}




		

	}