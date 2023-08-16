import java.util.Scanner;

public class App3{

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "Welcome To Smart Banking";
        final String CREATE_NEW_ACCOUNT = "Create New Account";
        final String DEPOSITS = "Deposits";
        final String WITHDRAWS = "Withdraws";
        final String TRANSFERS = "Transfers";
        final String CHECK_ACCOUNT_BALANCE = "Check Account Balance";
        final String DELETE_ACCOUNT = "Delete an Existing Account";
        
    }
}