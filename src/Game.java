import java.util.Locale;
import java.util.Scanner;

public class Game {
    private Space[][] maze = new Space[7][7];
    Inventory inventory;
    Player player;

    public Game () {
        this.inventory = new Inventory();
        this.player = new Player();
    }

    public void wait(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void wait2seconds() {
        try {
            Thread.sleep(2000);  // 2000 milliseconds, or 2 seconds
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void waitASecond() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    public void start () {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        System.out.println(ConsoleUtility.PURPLE + "Welcome to Sound Moon!");
        System.out.println(ConsoleUtility.RED + "WARNING: DISTURBING CONTENT IS PRESENT, PLAY WITH CAUTION.");
        System.out.println(ConsoleUtility.RED + "PLEASE PLAY THE GAME IN THE TERMINAL FOR THE BEST EXPERIENCE.");
        wait(5);
        System.out.println(ConsoleUtility.PURPLE + "Remember to have fun! Starting game...");
        wait(3);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("In a distant future, where the world develops in turmoil and overpopulation...");
        System.out.println("...Lies a land full of viscous beasts and flying creatures.");
        System.out.println("He opens his dull eyes to the morning day.");
        System.out.println("The past was far away. He dwells in a time where he cannot seem to define himself.");
        System.out.println();
        wait(6);
        System.out.println("As he rises from his deathbed, the heart of delay beats in surmise,");
        System.out.println("He places the rim of his glasses gently upon his nose, his eyes coming into vision..");
        System.out.println("The morning daylight was in fact the dim, flourescent lights of the labratory room.");
        System.out.println("The man stumbles out of his bed, confused. Lost. But the sorrow begins to seep in.");
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait(6);
        System.out.println("He tries to find himself within the labrinyth of hallways.");
        System.out.println(ConsoleUtility.YELLOW + "Navigate through the labratory hallways. Your destination is O.");
        printMaze1();
        if (navigate()) {
            System.out.println(ConsoleUtility.YELLOW + "After a while, he finds the door to the lobby.");
        }
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(ConsoleUtility.YELLOW + "His eyes follow the dim lights upon the ceiling of the hallways, as he opens the door.");
        wait2seconds();
        System.out.println("\"Mornin'.\" Somebody's voice could be heard in the large room.");
        System.out.println("The man grips his forehead, the lights vibrating through his skull, the screams reminiscent. \"Who..\"");
        wait(3);
        System.out.println("The black haired boy turned his head to meet the eyes of the sickly man, smiling. \"That last fight done took ya' out well!\"");
        System.out.println("a. What happened?");
        System.out.println("b. Who are you?");
        userInput = scan.nextLine().toLowerCase(Locale.ROOT);
        if (userInput.equals("a")) {
            System.out.println("\"What... what happened?..\" he mumbles, his chest wrapping him in pain and discomfort.");
            System.out.println("\"Why, you'se was in a huge tangle, fightin' ties with the devil!\" the boy responded in a loud, Southern accent.");
            wait(2);
            System.out.println("\"When you'se was out there fightin' hell and beyond tryna protect that woman, you done end up fried like chicken in oil!\"");
            waitASecond();
            System.out.println("He gestured with his hands, expanding them to visualize the scene. \"You realeased this huge of a voltage shock, enough to deprive the whole area of it's current!\"");
            System.out.println("\"Yo' companions on the battlefield said you done went into cardiac arrest and died for 20 seconds... but by miracle, you'se is a back alive!-\"");
            wait(3);
            System.out.println("He realized the man was serious, his blue eyes were cunningly threatening under the glow of the dim lights. \"I- well... you lived is all. Just a minor heart attack in battle.\" Ash cleared his throat.");
        } else {
            System.out.println("\"Who are you?\" he groaned.");
            wait2seconds();
            System.out.println("\"Name's Ash! I work in the 7th Division, Tech and Coordination headquarters!\" He looked at the man, seeing how his blue eyes showed no passion nor emotion.");
            waitASecond();
            System.out.println("His glasses shined with an ominous glow under the dim lights, faintly hiding his piercing stare. He knew he was no longer the man he was 10 years ago.");
            wait2seconds();
            System.out.println("\"Yeesh! You ain't lookin' so jolly!\" Ash exclaimed. \"Musta been the huge electric attack you did last night on the battlefield. Shocked you into cardiac arrest...\"");
            wait2seconds();
        }
        System.out.println("The man with glasses shook his head, grabbing his Lancer and his armor from the armory stand. \"I'm leaving. I have duties to attend to.\"");
        System.out.println("\"WAIT!- But you'se ain't even recovered yet!!-\" Ash watched the man storm out the door, leaving him in the quietness of the room.");
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait(4);
        System.out.println(ConsoleUtility.PURPLE + "PART 1 COMPLETED.");
        System.out.println("Current Health: " + player.getH());
        inventory.printInv();
        System.out.println("Press q to begin Part 2.");
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("Starting...");
        waitASecond();
        System.out.print("Tip: ");
        randomTip();
        wait(5);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(ConsoleUtility.YELLOW + "He equipped his vibrantly bright armor, it's electric hue sparking with anticipation, with rage and grandeur.");
        waitASecond();
        System.out.println("The technology expanded itself into one over the mass of his torn body, the metal clinking together.");
        System.out.println("The Lancer charged with potential, it's sharp edges shimmering.");
        wait(3);
        System.out.println("The man sighed, tilting his glasses back onto the rim of his nose. He felt current seep through his veins; the charge was a feeling he couldn't erase.");
        wait(3);
        System.out.println("His receiver notified him of an incoming call. He groans, tapping the receiver to pick up the call.");
        wait2seconds();
        System.out.println("\"What, Dee?\" he responded in a deep, raspy breath.");
        System.out.println("\"Where have you been?! I have been calling you for the past 4 days! You have work to do!\" She yelled with a great annoyance in her tone.");
        wait(3);
        System.out.println("\"I was knocked out from a heavy battle. Shocked myself into cardiac arrest. I'm fine, thanks for asking.\" he mocked.");
        System.out.println("\"First of all, you are to treat your higher ups with a little more respect, Milford.\"");
        wait2seconds();
        System.out.println("She tried to keep her composure, holding her breath. \"And second, you are needed in the 31st division for an ongoing investigation.\"");
        waitASecond();
        System.out.println("Press q to respond.");
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        waitASecond();
        System.out.println("\"I'll be there. Call my assistant.\" He coughed, steam coming out of him in a faint hisss... The current in his body sparked a bit.");
        System.out.println("\"Don't be late.\" She cuts the call off.");
        System.out.println("He sighs, coughing. The receiver taps out.");
        wait(3);
        System.out.println("Press q to start your bike.");
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("He hops onto his bike, which connected to his armor by bluetooth. It hummed to life, the engines roaring.");
        System.out.println("He revved the bike and drove off into the foggy night, beginning his duties yet again.");
        wait(6);
        System.out.println("Press q to continue.");
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + "Teleporting....");
        wait2seconds();
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.YELLOW + "Maze should print, edit this later.");
        printMaze31stDivision();
        navigate();
        System.out.println(ConsoleUtility.YELLOW + "Player completed maze, edit this later.");
    }

    private void printMaze1 () {
        /* this is how the maze should be printed!
        ______O
        __|____
        ____|__
        ___|_$_
        ____|__
        _$_____
        X______
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("_");
            }
        }
        maze[6][0] = new Space("X");
        maze[0][6] = new Space("O");
        maze[5][1] = new Space("$");
        maze[4][4] = new Space("|");
        maze[3][3] = new Space("|");
        maze[3][5] = new Space("$");
        maze[2][4] = new Space("|");
        maze[1][2] = new Space("|");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    private void printMaze31stDivision () {
        /* this is how the maze should be printed!
        ______O
        ____|__
        ____|__
        ___|___
        __|____
        _|_____
        X|$____
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("_");
            }
        }
        maze[6][0] = new Space("X");
        maze[0][6] = new Space("O");
        maze[6][1] = new Space("|");
        maze[5][1] = new Space("|");
        maze[4][2] = new Space("|");
        maze[3][3] = new Space("|");
        maze[2][4] = new Space("|");
        maze[1][4] = new Space("|");
        maze[6][2] = new Space("$");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    private boolean navigate () {
        Scanner choice = new Scanner(System.in);
        String currentSymbol = "";
        String userInput = "";
        int row = 6;
        int col = 0;
        System.out.println(ConsoleUtility.YELLOW + "Press wasd to navigate. Use lowercase letters.");
        System.out.println(ConsoleUtility.YELLOW + "w for up, a for left, s for down, d for right.");
        while (!currentSymbol.equals("O")) {
            userInput = choice.nextLine();
            if (userInput.equals("w")) { //if user chooses to go UP by 1.
                if (row - 1 < 0) { // if user is along the edge of the maze and surpasses it.
                    System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border!");
                } else {
                    currentSymbol = maze[row - 1][col].getSymbol();
                    if (currentSymbol.equals("O")) {
                        return true;
                    }
                    if (currentSymbol.equals("$")) {
                        foodFind();
                        maze[row - 1][col] = new Space("X");
                        maze[row][col] = new Space("_");
                        row -= 1;
                    }
                    if (currentSymbol.equals("|")) {
                        System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border! (|)");
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row - 1][col] = new Space("X");
                        maze[row][col] = new Space("_");
                        row -= 1;
                    }
                } // end of else code
                for (int i = 0; i < maze.length; i++) { //print out result maze
                    for (int j = 0; j < maze.length; j++) {
                        System.out.print(maze[i][j].getSymbol());
                    }
                    System.out.println();
                }
            } // end of UP decision code
            if (userInput.equals("a")) { //if user chooses to go LEFT by 1.
                if (col - 1 < 0) { // if user is along the edge of the maze and surpasses it.
                    System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border!");
                } else {
                    currentSymbol = maze[row][col - 1].getSymbol();
                    if (currentSymbol.equals("O")) {
                        return true;
                    }
                    if (currentSymbol.equals("$")) {
                        foodFind();
                        maze[row][col - 1] = new Space("X");
                        maze[row][col] = new Space("_");
                        col -= 1;
                    }
                    if (currentSymbol.equals("|")) {
                        System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border! (|)");
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row][col - 1] = new Space("X");
                        maze[row][col] = new Space("_");
                        col -= 1;
                    }
                } //end of else code
                for (int i = 0; i < maze.length; i++) { //print out result maze
                    for (int j = 0; j < maze.length; j++) {
                        System.out.print(maze[i][j].getSymbol());
                    }
                    System.out.println();
                }
            } // end of LEFT decision code
            if (userInput.equals("d")) { //if user chooses to go RIGHT by 1.
                if (col + 1 > 6) { // if user is along the edge of the maze and surpasses it.
                    System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border!");
                } else {
                    currentSymbol = maze[row][col + 1].getSymbol();
                    if (currentSymbol.equals("O")) {
                        return true;
                    }
                    if (currentSymbol.equals("|")) {
                        System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border! (|)");
                    }
                    if (currentSymbol.equals("$")) {
                        foodFind();
                        maze[row][col + 1] = new Space("X");
                        maze[row][col] = new Space("_");
                        col += 1;
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row][col + 1] = new Space("X");
                        maze[row][col] = new Space("_");
                        col += 1;
                    }
                } // end of else code
                for (int i = 0; i < maze.length; i++) { //print out result maze
                    for (int j = 0; j < maze.length; j++) {
                        System.out.print(maze[i][j].getSymbol());
                    }
                    System.out.println();
                }
            }
            if (userInput.equals("s")) { //if user chooses to go DOWN by 1.
                if (row + 1 > 6) { // if user is along the edge of the maze and surpasses it.
                    System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border!");
                } else {
                    currentSymbol = maze[row + 1][col].getSymbol();
                    if (currentSymbol.equals("O")) {
                        return true;
                    }
                    if (currentSymbol.equals("|")) {
                        System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border! (|)");
                    }
                    if (currentSymbol.equals("$")) {
                        foodFind();
                        maze[row + 1][col] = new Space("X");
                        maze[row][col] = new Space("_");
                        row += 1;
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row + 1][col] = new Space("X");
                        maze[row][col] = new Space("_");
                        row += 1;
                    }
                } // end of else code
                for (int i = 0; i < maze.length; i++) { //print out result maze
                    for (int j = 0; j < maze.length; j++) {
                        System.out.print(maze[i][j].getSymbol());
                    }
                    System.out.println();
                }
            }
            if (!(userInput.equals("w") || userInput.equals("a") || userInput.equals("s") || userInput.equals("d"))) {
                System.out.println("INVALID INPUT.");
                System.out.println(ConsoleUtility.YELLOW + "Press wasd to navigate. USE LOWERCASE LETTERS.");
                System.out.println(ConsoleUtility.YELLOW + "w for up, a for left, s for down, d for right.");
            }
        }
        return false;
    }

    private void foodFind () {
        int chance = (int) (Math.random() * 15) + 1;
        if (chance <= 10) {
            Food cannedBeans = new Food("cannedBeans", 10);
            System.out.println(inventory.addToFoodInv(cannedBeans));
        } else if (chance > 10 && chance < 15) {
            Food cannedMeat = new Food("cannedFood", 15);
            System.out.println(inventory.addToFoodInv(cannedMeat));
        } else {
            Food herbs = new Food("herbs", 20);
            System.out.println(inventory.addToFoodInv(herbs));
        }
    }

    private void randomTip () {
        int chance = (int) (Math.random() * 10) + 1;
        if (chance <= 2) {
            System.out.println("Be sure to use your food wisely! They can really help out in boss fights!");
        } else if (chance > 2 && chance <= 4) {
            System.out.println("Be aware of bombs in the maze! Not all $ symbols are to be trusted!");
        } else if (chance > 4 && chance <= 6) {
            System.out.println("Careful! Wider range voltage shocks can fry yourself too! Be wise with these attacks!");
        } else if (chance > 6 && chance <= 8) {
            System.out.println("The choices you make matter! Take your time, and read through the story carefully!");
        } else if (chance > 8 && chance <= 10) {
            System.out.println("Note that there is a limit to your food inventory! You can only hold 2 food items at a time!");
        }
    }
}
