package org.eclipse.che;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    private static List<String> helloMessages = Arrays.asList("hello", "hi");
    private static List<String> byeMessages = Arrays.asList("goodbye", "bye bye", "bye");
    private static String CONGRATULATION = "Nice to hear you!";
    private static String USER_BYE = "Buy. See You!";

    public static void main( String[] args ) {
        System.out.println( "Hello User! " );
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNext()) {
                String userInput = scanner.next();
                if (App.byeMessages.stream().anyMatch(byeMsg -> userInput.toLowerCase().contains(byeMsg))) {
                    System.out.println(App.USER_BYE);
                    break;
                }
                if (App.helloMessages.stream().anyMatch(helloMsg -> userInput.toLowerCase().contains(helloMsg))) {
                    System.out.println(App.CONGRATULATION);
                }
            }
        }
    }
}
