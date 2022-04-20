import java.util.Scanner;

class Banking{
    int amount = 1000;
    public void initiate()
    {
        Login login = new Login();
        try{
            login.acceptInput();
            login.verify();

        }catch(Exception e)
        {
            try{
                login.acceptInput();
                login.verify();

            }catch(Exception f)
            {
                System.out.println("--x--");
            }
        }
    }

    public int getBalance(){
        return amount;
    }

    public void add(int amt){
        amount = amount + amt;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }

    public void withdrw(int amt){
        System.out.println(" ");

        if(amount < amt)
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Total Balance: " +amount);
            System.out.println(" ");
        }
    }
}
class Login{
    int ac_number = 1111;
    int ac_pass = 1234;
    int ac;
    int pw;
    String cname;
    int cid;

    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        cname= scanner.nextLine();
        int flag=1;

        // cid exception:
        do {
            System.out.println("Enter Customer ID: ");
            cid = scanner.nextInt();

            try {
                if (cid < 1 || cid > 20) {
                    throw new ArithmeticException();
                }
                flag=0;
            } catch (ArithmeticException ae) {
                System.out.println("Range out of bounds");
            }
        }while(flag==1);

        System.out.println("Enter the account number:");
        ac = scanner.nextInt();
        System.out.println("Enter the Password:");
        pw = scanner.nextInt();


    }
    public void verify() throws Exception{

        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("Login Successfully!");
            Banking banking = new Banking();
            System.out.println(" ");
            System.out.println("Your Balance is: "+banking.getBalance()+"  Rupees");
            System.out.println(" ");
            Menu menu = new Menu();
            menu.showMenu();
        }else{
            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect login credentials");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }
}
class Menu{
    int selectedOption;
    Banking banking = new Banking();
    public void showMenu()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to Withdraw Amount.");
        System.out.println("Press 3 to View Balance");
        System.out.println("Press any key to Exit");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Press any key:");
        selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1:
                Deposit d = new Deposit();
                int depamt =  d.userInput();
                banking.add(depamt);
                showMenu();
                break;
            case 2:
                System.out.println("Please Enter the amount to withdraw:");
                int withamt=scanner.nextInt();
                banking.withdrw(withamt);
                showMenu();
                break;
            case 3:
                System.out.println("Your Account Balance is "+banking.getBalance()+" Rupees");
                System.out.println(" ");
                showMenu();
                break;

            default:
                System.out.println("Transaction Ended");
                System.exit(0);
                break;
        }
    }
}
class Deposit{
    int amt= 0;

    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amt = scanner.nextInt();

        if(amt<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
        }else{
            return amt;
        }
        return amt;

    }
}

class InvalidBankTransaction extends Exception
{
    String errorMessage;
    public InvalidBankTransaction(String message)
    {
        errorMessage = message;
    }

    public String getMessage()
    {
        return errorMessage;
    }
}