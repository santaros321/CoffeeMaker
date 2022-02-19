import Input.Commands;

import java.util.*;

public class Main {
    private final String systemPrompt = "CoffeeMaker> ";
    final Scanner scanner = new Scanner(System.in);
    Commands commandExit = Commands.EXIT;
    Commands commandHello = Commands.HELLO;
    Commands commandMakeCoffee = Commands.MAKE_COFFEE;
    Commands commandStatus = Commands.STATUS;

    List <Commands> commandsList = new ArrayList<>(List.of(
            commandMakeCoffee,
            commandExit,
            commandHello,
            commandStatus
    ));

    private static void main(String command) {
        System.out.println("udało się");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mainLoop();
    }

    private void mainLoop(){
        String userCommand;
        do{
            userCommand = getUserCommand();
            userCommand = refactorCommand(userCommand);
            if(checkUserCommand(userCommand))
                main(userCommand);
            else System.out.println("Wrong Command");
        }while(!userCommand.equals("EXIT"));
    }

    String getUserCommand(){
        System.out.print(systemPrompt);
        return scanner.nextLine();
    }

    String refactorCommand(String command){
        return command.replace(' ','_').toUpperCase(Locale.ROOT);
    }

    boolean checkUserCommand(String command){
        for(Commands commands:commandsList){
            if (command.equals(commands.toString(commands))) return true;
        }
        return false;
    }
}
