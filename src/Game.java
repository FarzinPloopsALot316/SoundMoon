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
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("In a distant future, where the world develops in turmoil and overpopulation...");
        System.out.println("...Lies a land full of viscous beasts and flying creatures.");
        System.out.println("He opens his dull eyes to the morning day,");
        System.out.println("");
    }
}
