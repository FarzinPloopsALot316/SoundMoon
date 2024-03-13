public class Game {
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
        /*
        ______O
        __|____
        ____|__
        ___|_$_
        ____|__
        _$_____
        X______
        */
        String[][] maze = new String[7][7];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = "_";
            }
        }
        maze[6][0] = "X";
        maze[0][6] = "O";
        maze[5][1] = "$";
        maze[4][4] = "|";
        maze[3][3] = "|";
        maze[3][5] = "$";
        maze[2][4] = "|";
        maze[1][2] = "|";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.println(maze[i]);
            }
            System.out.println();
        }
    }
}
