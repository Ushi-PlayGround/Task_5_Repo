import java.util.Scanner;

public class App3{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";


        final String DASHBOARD = "\u270B Welcome to Smart Banking System";
        final String CREATE_NEW_ACCOUNT = "➕ Create New Account";
        final String DEPOSITS = "\u1F4E5 Deposits";
        final String WITHDRAWALS = "\u1F4E4 Withdrawals";
        final String TRANSFER = "\u1F4E8 Transfer";
        final String CHECK_BALANCE = "\u1F4DD Check A/C Balance";
        final String DELETE_ACCOUNT = "\u274C Delete Accounts";
        

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String screen = DASHBOARD;

        mainloop:
        do{
            final String APP_TITLE = String.format("%s%s%s",COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){

                case DASHBOARD:

                    System.out.println("\t[1]. Create New Account ");
                    System.out.println("\t[2]. Deposits ");
                    System.out.println("\t[3]. Withdrawals");
                    System.out.println("\t[4]. Transfer");
                    System.out.println("\t[5]. Check A/C Balance");
                    System.out.println("\t[6]. Delete Account");
                    System.out.println("\t[7]. Exit");
        
                    System.out.print("\tEnter an Option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option){

                        case 1:screen = CREATE_NEW_ACCOUNT;break;
                        case 2:screen = DEPOSITS;break;
                        case 3:screen = WITHDRAWALS;break;
                        case 4:screen = TRANSFER;break;
                        case 5:screen = CHECK_BALANCE;break;
                        case 6:screen = DELETE_ACCOUNT;break;
                        default:continue;

                    }
                    break;


                    
            }

                




        }while (true);

    }
}