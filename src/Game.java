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
        waitASecond();
        ConsoleUtility.clearScreen();
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
        System.out.println("\"First of all, you are to treat your higher ups with a little more respect, Milford.\" she scoffed.");
        wait2seconds();
        System.out.println("Dee tried to keep her composure, holding her breath. \"And second, you are needed in the 31st division for an ongoing investigation.\"");
        System.out.println("\"I've sent you the location's coordinates already.\"");
        waitASecond();
        System.out.println(ConsoleUtility.PURPLE + "Press q to respond." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        waitASecond();
        System.out.println("\"I'll be there. Call my assistant.\" He coughed, steam coming out of him in a faint hisss... The current in his body sparked a bit.");
        System.out.println("\"Don't be late.\" She cuts the call off.");
        System.out.println("He sighs, coughing again. The receiver taps out.");
        wait(3);
        System.out.println(ConsoleUtility.PURPLE + "Press q to start your bike." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("He hops onto his bike, which connected to his armor by bluetooth. It hummed to life, the engines roaring.");
        System.out.println("He revved the bike and drove off into the foggy night, beginning his duties yet again.");
        wait(6);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + "Teleporting....");
        wait2seconds();
        ConsoleUtility.clearScreen();
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(ConsoleUtility.YELLOW + "He hit the brakes, slowing to a halt in front of a dark alleyway.");
        System.out.println("With great suspicion, he equipped his Lancer from his back, armed and ready.");
        System.out.println(ConsoleUtility.PURPLE + "Press q to call an agent." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("He taps on his receiver, trying to reach the other agents by signal.");
        wait2seconds();
        System.out.println("No response. He squinted his eyes behind his glasses, trying to find the end of the dark labyrinths.");
        System.out.println("It was obvious that nothing was visible. He sighed, deciding he had no choice but to enter the mass darkness.");
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        ohThatsCompletelyNormal();
        printMaze31stDivision();
        if (navigateWithWeapons()) {
            System.out.println(ConsoleUtility.YELLOW + "He came to the end of the alleyway's path, finding a space between a bunch of heavily graffitied buildings.");
        }
        System.out.println("He looked around, gagging from the stench. Flies buzzed around. \"What the hell...\"");
        waitASecond();

        //trying out Emile's print line tactic

        System.out.println("""
        He made the last turn, finding a dead body on the floor. A young man, around 19, in uniform, stained in blood.
        Milford looked away, trying not to pay them mind as he passed them.
        """);
        wait(3);
        System.out.println("""
        
        He wasn't watching where he was going. He accidentally kicks a beheaded head on the ground.
        It rolled across, leaving a trail of blood, into the remaining darkness. A low growl could be heard not so far away.
        """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to examine." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
        
        He tries to take a step closer, but a roar echoed through, and suddenly, he felt a strong push into his chest.
        A large, monsterous paw had reached for him quickly, throwing him into the wall. Milford gets up quickly after impact.
        """);
        wait2seconds();
        System.out.println("""
        
        It was a giant werewolf beast. It's fangs glowed a bright white, it's vicious yellow eyes looking at Milford with hungry intent.
        It readied it's claws, hungry to kill and devour it's newfound prey.
        Milford showed no fear. He held his Lancer up, preparing for battle.
        """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to begin battle." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + "Beginning battle..." + ConsoleUtility.YELLOW);
        wait2seconds();
        ConsoleUtility.clearScreen();
        boolean cleared = bossFight(100, 15);
        while (!cleared) {
            player.addH(100);
            System.out.println(ConsoleUtility.PURPLE + "You died. Press q to restart." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            cleared = bossFight(100, 20);
        }
        player.setH(100);
        System.out.println(ConsoleUtility.YELLOW + "You have completed the battle!");
        wait2seconds();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*" + ConsoleUtility.YELLOW);
        System.out.println("""
                He wiped the blood trickling down his weapon.
                Vapor bubbled in his throat, the heat scalding his esophagus.
                He sighs, the steam evacuating from him in a faint hiss...
                """);

        wait2seconds();
        System.out.println("""
                
                He de-equips his sword back into his sheath.
                He receives a voice alert from his assistant. "Colonel, where are you??"
                "I can't seem to pick up your location. Please answer."
                """);
        wait(3);
        System.out.println("""
                
                Milford tried to respond through his communicator, but the screen was distorted.
                There was a suspicious signal block in the area.
                """);
        waitASecond();
        System.out.println("""
                
                This is odd, he wondered. The only people who should have access to the area's receptors was the agent organization itself.
                There should be no reason for them to shut off communication to the area, especially during an investigation.
                Is this what lead to the death of these agents here?
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                He felt a disturbance. His electromagnetic sensors sensed a movement in the area's magnetic field.
                He stayed quiet, trying to sense what was around.
                One person. No. Two.
                """);
        wait(4);
        System.out.println("""
                
                No. A bunch of people. He counted through his senses.
                15. 17.
                He ducked behind a wall. Two people jump down just as he ducked and hid.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to listen." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                "Looks like the werewolf took out a few. I'll have my men carry the bodies back home," said one of the voices.
                Milford peeked his head around the wall's corner carefully.
                A tall, sleek figure, with a height of 6 feet, stood by, examining a soldier's body.
                By his side was a shorter man, around the height of 5 foot 7.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to examine." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford noted the red in their eyes glowing ominously in the dark. There was no doubt that they were vampires.
                The shorter one spoke. "Alright. Careful lifting them, Riyun. We don't want the bodies to lose too much blood."
                The taller one, who seemed to be Riyun, nodded.
                """);
        wait(3);
        System.out.println("""
                
                The shorter one had glasses under his large, feathered hat, his cape flowing in the cold, unwelcoming breeze of the night.
                His eyes scanned the area, his blood-lusted red eyes threatening the moonlight's shade of blue over the area.
                The clouds revealed the crescent moon, and a whole group of vampires could be seen standing on the perch of a building.
                """);
        wait(4);
        System.out.println("""
                
                The shorter, feathered hat man smiled.
                """);
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

    private void printMaze31stDivision() {
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

    private boolean navigateWithWeapons () {
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
                        weaponFind();
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
                        weaponFind();
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
                        weaponFind();
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
                        weaponFind();
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
        if (chance <= 7) {
            Food cannedBeans = new Food("cannedBeans", 10);
            System.out.println(inventory.addToFoodInv(cannedBeans));
        } else if (chance > 7 && chance < 13) {
            Food cannedMeat = new Food("cannedFood", 15);
            System.out.println(inventory.addToFoodInv(cannedMeat));
        } else if (chance >= 13){
            Food herbs = new Food("herbs", 20);
            System.out.println(inventory.addToFoodInv(herbs));
        }
    }

    private void weaponFind () { // lolololololol i love being annoying
        int chance = (int) (Math.random() * 10) + 1;
        if (chance <= 4) {
            System.out.println("You thought your eyes were deceiving you, but you take a second look and see that...");
            wait(3);
            System.out.println("Nope sorry. You thought you saw something, but it was just a shiny piece of dust.");
        } else if (chance > 4 && chance <= 8) {
            System.out.println("You quicken your gaze towards the ground to see a round explosive on the floor by luck.");
            wait2seconds();
            Weapons bigBoomThingy = new Weapons("Bomb", 1, 25);
            System.out.println(inventory.addToWeaponsInv(bigBoomThingy));
        } else if (chance > 8) {
            System.out.println("You thought your eyes were deceiving you, but you take a second look and see that...");
            wait(3);
            System.out.println("Glimmering in it's purple hue, lay the grand Prowler Blade in it's presence.");
            waitASecond();
            System.out.println("You lift the giant contraption of a sword in your hands, feeling it's weight upon you.");
            wait2seconds();
            System.out.println("The Prowler accepts you, as it dwindles it's light down calmly to a neutral glow.");
            waitASecond();
            Sword Prowler = new Sword("Prowler", 10, 50, false);
            System.out.println(inventory.addToWeaponsInv(Prowler));
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

    private boolean bossFight (int bossHealth, int bossDmg) { //for Werewolves
        int roundCount = 1;
        while (!(player.getH() <= 0) || !(bossHealth <= 0)) {
            Scanner scan = new Scanner(System.in);
            String userInput = "";
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~ ROUND " + roundCount + " *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            System.out.println("PLAYER, IT'S YOUR TURN!");
            System.out.println(ConsoleUtility.PURPLE + "Current Health: " + player.getH());
            System.out.println("Werewolf's Current Health: " + bossHealth);
            inventory.printInv();
            System.out.println(ConsoleUtility.GREEN + "Options (USE LOWERCASE INPUT):");
            System.out.println("Press e to use Lancer (10 damage, infinite uses).");
            System.out.println("Press g to release Voltage Storm." + ConsoleUtility.YELLOW);
            if (inventory.hasWeapon("Prowler")) {
                Weapons wantedWeapon = inventory.requestedWeapon("Prowler");
                System.out.println("Press r to use Prowler (50 damage, " + wantedWeapon.getUses() + " uses left).");
            }
            if (inventory.hasWeapon("Bomb")) {
                System.out.println("Press f to use a Bomb (25 damage, one use for each Bomb you have).");
            }
            if (inventory.hasFood()) {
                System.out.println("Press c to heal using your food.");
            }
            userInput = scan.nextLine();
            if (userInput.equals("e")) { //if user chooses Lancer
                int hitOrMiss = (int) (Math.random() * 3) + 1;
                if (hitOrMiss >= 2) {
                    int powerfulBlow = (int) (Math.random() * 3) + 1;
                    if (powerfulBlow == 1) {
                        System.out.println("The Lancer charged a powerful wave, which cost the werewolf 20 damage!");
                        bossHealth -= 20;
                        System.out.println("Werewolf Health: " + bossHealth);
                    } else {
                        System.out.println("You sliced a vengeful attack with your Lancer, costing the werewolf 10 health.");
                        bossHealth -= 10;
                        System.out.println("Werewolf Health: " + bossHealth);
                    }
                } else {
                    System.out.println("You missed!");
                }
                if (checkIfDead(bossHealth)) {
                    System.out.println("The monster was slain!");
                    return true;
                }
                wait(3);
                System.out.println("Werewolves turn!");
                waitASecond();
                werewolfMoves(bossDmg);
                if (checkIfDead(player.getH())) {
                    System.out.println("Player Health: " + player.getH());
                    wait2seconds();
                    return false;
                }
            } else if (userInput.equals("r")) { //Prowler
                Weapons wantedWeapon = inventory.requestedWeapon("Prowler");
                int hitOrMiss = (int) (Math.random() * 2) + 1; //On the Prowler, there's more of a chance of missing.
                if (hitOrMiss == 1) {
                    int powerfulBlow = (int) (Math.random() * 6) + 1;
                    if (powerfulBlow == 1) {
                        System.out.println("A faint hum grew in vibration from the rim of the blade...");
                        wait2seconds();
                        System.out.println("A great beam of light fired from the Prowler, searing through the monster's flesh.");
                        System.out.println("The werewolf roars in great pain, losing 75 health.");
                        bossHealth -= wantedWeapon.getDamage() + 25;
                        System.out.println("Werewolf Health: " + bossHealth);
                    } else {
                        System.out.println("The Prowler charged it's purple radiance at the beast, as you struck a powerful blow!");
                        System.out.println("The werewolf lost 50 health!");
                        bossHealth -= wantedWeapon.getDamage();
                        System.out.println("Werewolf Health: " + bossHealth);
                    }
                    wantedWeapon.useOnce();
                    wantedWeapon.setBrokeIfSo(); //only happens if uses is 0.
                    if (wantedWeapon.getBroke()) {
                        inventory.removeBrokenWeapon("Prowler");
                    }
                } else {
                    System.out.println("Yikes! By bad luck, you missed!");
                    wantedWeapon.useOnce();
                }
                if (checkIfDead(bossHealth)) {
                    System.out.println("The monster was slain!");
                    return true;
                }
                wait(3);
                System.out.println("Werewolves turn!");
                waitASecond();
                werewolfMoves(bossDmg);
                if (checkIfDead(player.getH())) {
                    wait2seconds();
                    System.out.println("Player Health: " + player.getH());
                    return false;
                }
            } else if (userInput.equals("f")) { //BOMB KABOOM
                Weapons wantedBomb = inventory.requestedWeapon("Bomb");
                System.out.println("Your bomb cost the werewolf 25 damage!");
                bossHealth -= wantedBomb.getDamage();
                System.out.println("Werewolf Health: " + bossHealth);
                wantedBomb.useOnce();
                wantedBomb.setBrokeIfSo(); //only happens if uses is 0.
                if (wantedBomb.getBroke()) {
                    inventory.removeBomb();
                }
                wait(3);
                System.out.println("Werewolves turn!");
                waitASecond();
                werewolfMoves(bossDmg);
                if (checkIfDead(player.getH())) {
                    wait2seconds();
                    System.out.println("Player Health: " + player.getH());
                    return false;
                }
            } else if (userInput.equals("c")) { //healing with food
                Food wantedFood = inventory.requestedFood();
                System.out.println("You ate the " + wantedFood.getName() + ".");
                player.addH(wantedFood.getHealthBuff());
                inventory.removeFood(wantedFood.getName());
                wait2seconds();
                System.out.println("Werewolves turn!");
                waitASecond();
                werewolfMoves(bossDmg);
            } else if (userInput.equals("g")){ //voltage storm, remember to deduce health from the player as well
                waitASecond();
                ConsoleUtility.clearScreen();
                System.out.println(ConsoleUtility.CYAN + "You feel electricity sparkling around you, the current flowing rapidly through your body.");
                System.out.println("You heart feels as if it's searing alive, being cut in half, but you do what you must do.");
                wait2seconds();
                System.out.println("An electromagnetic surge of waves surges from your armor, sucking in the current and electricity around you.");
                int damageRange = (int) (Math.random() * 16) + 15;
                bossHealth -= damageRange;
                System.out.println("You release it in a large blow, shocking everything around you, including the werewolf. You reduce it's health by " + damageRange + ".");
                int stunChance = (int) (Math.random() * 3) + 1;
                if (stunChance == 1) { //new feature, note this for later!!
                    System.out.println(ConsoleUtility.RED + "NOW'S YOUR CHANCE! Attack the werewolf while it's stunned within 2 seconds!" + ConsoleUtility.CYAN);
                    waitASecond();
                    System.out.println(ConsoleUtility.RED + "WHEN THE PROMPT COMES UP, PRESS THE RIGHT BUTTON! LOWERCASE!" + ConsoleUtility.CYAN);
                    wait(4);
                    int randomKey = (int) (Math.random() * 4) + 1;
                    String key = "";
                    if (randomKey == 1) {
                        key = "q";
                    } else if (randomKey == 2) {
                        key = "z";
                    } else if (randomKey == 3) {
                        key = "m";
                    } else if (randomKey == 4) {
                        key = "p";
                    }
                    System.out.println("PRESS " + key);
                    long start = System.currentTimeMillis();
                    while (!(userInput.equals(key))) {
                        userInput = scan.nextLine();
                        if (!userInput.equals(key)) {
                            System.out.println(ConsoleUtility.RED + "WRONG INPUT!!" + ConsoleUtility.CYAN);
                        }
                    }
                    long end = System.currentTimeMillis(); //thanks emile and mr miller!
                    int diff = (int) (end - start) / 1000;
                    if (diff == 1 || diff == 0) {
                        System.out.println("You were able to strike the Werewolf with another strong blow, costing it another 20 health!");
                        bossHealth-= 20;
                    } else if (diff == 2) {
                        System.out.println("You were able to strike the Werewolf with another strong blow, costing it another 15 health!");
                        bossHealth -= 15;
                    } else {
                        System.out.println("You weren't able to get it in time!");
                        System.out.println("The werewolf woke up, growling in rage as it swiped it's claws at you, costing you 15 health.");
                        player.loseH(15);
                    }
                }
                System.out.println(ConsoleUtility.YELLOW + "Although you produced significant damage, the large surge recoiled on you as well.");
                int recoilDmg = (int) (Math.random() * 21) + 15;
                player.loseH(recoilDmg);
                if (checkIfDead(bossHealth)) {
                    System.out.println("The monster was slain!");
                    return true;
                }
                if (checkIfDead(player.getH())) {
                    System.out.println("Player Health: " + player.getH());
                    wait2seconds();
                    return false;
                }
                System.out.println("Werewolves turn!");
                waitASecond();
                werewolfMoves(bossDmg);
                if (checkIfDead(player.getH())) {
                    wait2seconds();
                    System.out.println("Player Health: " + player.getH());
                    return false;
                }
            } else { //user is clearly stupid and doesn't know how to follow directions nah jk
                System.out.println("Bruh, invalid input. MAKE SURE YOU TYPE THE RIGHT OPTION, LOWERCASE.");
            }
            roundCount++;
        } //while code ends
        return false; // this shouldn't happen btw
    }

    private void werewolfMoves (int dmg) {
        int hitOrMiss = (int) (Math.random() * 4) + 1;
        if (hitOrMiss > 1 && hitOrMiss < 4) {
            System.out.println("The werewolf made his move, swiping his large claws at you.");
            player.loseH(dmg);
            waitASecond();
        } else if (hitOrMiss == 1) {
            System.out.println("The werewolf missed.");
            waitASecond();
        } else {
            System.out.println("The werewolf struck a huge attack, causing you a lot of pain!");
            player.loseH(dmg + 10);
            waitASecond();
        }
    }

    private boolean checkIfDead (int healthNumber) {
        if (healthNumber <= 0) {
            return true;
        }
        return false;
    }

    private void ohThatsCompletelyNormal () {
        System.out.println(ConsoleUtility.RED + """
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        They watch from above as I slaughter my people.
                        """ + ConsoleUtility.YELLOW);
        wait(3);
        ConsoleUtility.clearScreen();
    }
}