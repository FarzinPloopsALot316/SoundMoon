import java.util.Locale;
import java.util.Scanner;

public class Game {
    private Space[][] maze = new Space[7][7];
    Inventory inventory;
    Player player;
    Player lostPlayer;
    Inventory lostInv;
    boolean demo;

    public Game () {
        this.inventory = new Inventory();
        this.player = new Player();
        this.lostPlayer = new Player();
        this.lostInv = new Inventory();
        lostPlayer.setH(30);
        demo = false;
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

    public void askForDemo () {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        waitASecond();
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.CYAN + "First off, would you like to play the demo or the full game?");
        System.out.println(ConsoleUtility.CYAN + "1 for demo, 2 for full game.");
        userInput = scan.nextInt();
        if (userInput == 1) {
            demo = true;
        } else {
            demo = false;
        }
        waitASecond();
        ConsoleUtility.clearScreen();
        start();
    }

    public boolean start () {
        waitASecond();
        ConsoleUtility.clearScreen();
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        System.out.println(ConsoleUtility.PURPLE + "Welcome to Sound Moon!");
        if (demo) {
            System.out.println(ConsoleUtility.CYAN + "THIS IS THE DEMO VERSION, NOT THE FULL GAME.");
        }
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
        if (navigate(6, 0)) {
            System.out.println(ConsoleUtility.YELLOW + "After a while, he finds the door to the lobby.");
        }
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(ConsoleUtility.YELLOW + """
                
                After a while, he finds the door to the lobby.
                His eyes follow the dim lights upon the ceiling of the hallways, as he opens the door.
                "Mornin'." Somebody's voice could be heard in the large room.
                The man grips his forehead, the lights vibrating through his skull, the screams reminiscent. "Who.."
                """);
        wait2seconds();
        System.out.println("a. What happened?");
        System.out.println("b. Who are you?");
        userInput = scan.nextLine().toLowerCase(Locale.ROOT);
        if (userInput.equals("a")) {
            System.out.println("""
                    
                    "What... what happened?.." he mumbles, his chest wrapping him in pain and discomfort.
                    "Why, you'se was in a huge tangle, fightin' ties with the devil!" the boy responded in a loud, Southern accent.
                    "When you'se was out there fightin' hell and beyond tryna protect that woman, you done end up fried like chicken in oil!
                    """);
            wait(4);
            System.out.println("""
                    
                    He gestured with his hands, expanding them to visualize the scene. "You realeased this huge of a voltage shock, enough to deprive the whole area of it's current!"
                    "Yours' companions on the battlefield said you done went into cardiac arrest and died for 20 seconds... but by miracle, you'se is a back alive!-"
                    """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                    
                    Ash looked at the man, seeing how his blue eyes showed no passion nor emotion.
                    His glasses shined with an ominous glow under the dim lights, faintly hiding his piercing stare.
                    The man knew he was no longer who he was 10 years ago.
                    """);
            wait(4);
        } else { // if b
            System.out.println("""
                    
                    "Who are you?" he groaned.
                    "Name's Ash! I work in the 7th Division, Tech and Coordination headquarters!" said the young boy.
                    """);
            wait(2);
            System.out.println("""
                    
                    Ash looked at the man, seeing how his blue eyes showed no passion nor emotion.
                    His glasses shined with an ominous glow under the dim lights, faintly hiding his piercing stare.
                    The man knew he was no longer who he was 10 years ago.
                    """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to leave." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                    
                    "Yeesh! You ain't lookin' so jolly!" Ash exclaimed. 
                    "Musta been the huge electric attack you did last night on the battlefield. Shocked you into cardiac arrest!..."
                    """);
            wait2seconds();
        } //end of choice selection
        System.out.println("""
                    
                    He realized the man was serious, his blue eyes were cunningly threatening under the glow of the dim lights.
                    "I- well... you lived is all. Just a minor heart attack in battle." Ash cleared his throat.
                    """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to leave." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                    
                    The man with glasses shook his head, grabbing his Lancer and his armor from the armory stand.
                    "I'm leaving. I have duties to attend to... Ash."
                    "WAIT!- But you'se ain't even recovered yet!!-"
                    """);
        wait(3);
        System.out.println("""
                    
                    Ash watched the man storm out the door, leaving him in the quietness of the room.
                    """);

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
        System.out.println(ConsoleUtility.YELLOW + """
                
                He equipped his vibrantly bright armor, it's electric hue sparking with anticipation, with rage and grandeur.
                """);
        waitASecond();
        System.out.println("""
                The technology expanded itself into one over the mass of his torn body, the metal clinking together.
                """);
        System.out.println("""
                
                The Lancer charged with potential, it's sharp edges shimmering.
                """);
        wait(3);
        System.out.println("""
                
                The man sighed, tilting his glasses back onto the rim of his nose. 
                He felt current seep through his veins; the charge was a feeling he couldn't erase.
                """);
        wait(3);
        System.out.println("""
                
                His receiver notified him of an incoming call. He groans, tapping the receiver to pick up the call.
                """);
        if (!demo) {
            wait2seconds();
            System.out.println("""
                    
                    "What, Dee?" he responded in a deep, raspy breath.
                    "Where have you been?! I have been calling you for the past 4 days! You have work to do," she yelled with a great annoyance in her tone.
                    """);
            wait(3);
            System.out.println("""
                    
                    "I was knocked out from a heavy battle.
                    Shocked myself into cardiac arrest. I'm fine, thanks for asking." he mocked.
                    """);
            waitASecond();
            System.out.println("""
                    
                    "First of all, you are to treat your higher ups with a little more respect, Milford." she scoffed.
                    Dee tried to keep her composure, holding her breath. "And second, you are needed in the 31st division for an ongoing investigation."
                    "I've sent you the location's coordinates already."
                    """);
            waitASecond();
            System.out.println(ConsoleUtility.PURPLE + "Press q to respond." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            waitASecond();
            System.out.println("""
                    
                    "I'll be there. Call my assistant."
                    He coughed, steam coming out of him in a faint hisss...
                    The current in his body sparked a bit.
                    """);
            wait(4);
            System.out.println("""
                    
                    "Don't be late." She cuts the call off.
                    """);
            System.out.println("""
                    
                    He sighs, coughing again. The receiver taps out.""");
            wait(3);
            System.out.println(ConsoleUtility.PURPLE + "Press q to start your bike." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                    
                    He hops onto his bike, which connected to his armor by bluetooth. It hummed to life, the engines roaring.
                    He revved the bike and drove off into the foggy night, beginning his duties yet again.""");
            wait(3);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(ConsoleUtility.PURPLE + "Teleporting....");
            wait2seconds();
            ConsoleUtility.clearScreen();
        } else { //much shorter for the presentation
            wait2seconds();
            System.out.println("""
                    
                    His commander informed him that an invasion was ongoing, and that his presencece was expected.
                    He nodded. "I'l be right there." He coughed, his voice raspy and jagged.
                    """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to start your bike." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                    
                    He hops onto his bike, which connected to his armor by bluetooth.
                    It hummed to life, the engines roaring.
                    """);
            wait2seconds();
            System.out.println("""
                    
                    He revved the bike and drove off into the foggy night, beginning his duties yet again.
                    """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println(ConsoleUtility.PURPLE + "Teleporting....");
            wait2seconds();
            ConsoleUtility.clearScreen();
        }
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(ConsoleUtility.YELLOW + """
                
                He hit the brakes, slowing to a halt in front of a dark alleyway.
                """);
        System.out.println("""
                
                With great suspicion, he equipped his Lancer from his back, armed and ready.""");
        System.out.println(ConsoleUtility.PURPLE + "Press q to call an agent." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("He taps on his receiver, trying to reach the other agents by signal.");
        wait(4);
        System.out.println("""
                
                No response. He squinted his eyes behind his glasses, trying to find the end of the dark labyrinths.
                It was obvious that nothing was visible. He sighed, deciding he had no choice but to enter the mass darkness.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        ohThatsCompletelyNormal();
        printMaze31stDivision();
        if (navigateWithWeapons(6, 0)) {
            System.out.println(ConsoleUtility.YELLOW + """
                    
                    He came to the end of the alleyway's path, finding a space between a bunch of heavily graffitied buildings.
                    """);
        }
        wait2seconds();
        System.out.println("""
                He looked around, gagging from the stench. Flies buzzed around.
                He made the last turn, finding a dead body on the floor. A young man, around 19, in uniform, stained in blood.
                Milford looked away, trying not to pay them mind as he passed them.
                """);
        wait(3);
        System.out.println("""
                A low growl could be heard not so far away.
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
        boolean cleared = bossFight(100, 15); //100, 15
        while (!cleared) {
            player.addH(100);
            System.out.println(ConsoleUtility.PURPLE + "You died. Press q to restart." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            cleared = bossFight(100, 15);
        }
        player.setH(100);
        System.out.println(ConsoleUtility.YELLOW + "You have completed the battle!");
        wait2seconds();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*" + ConsoleUtility.YELLOW);
        if (!demo) {
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
                
                He felt a disturbance. His electromagnetic sensors picked up a movement in the area's magnetic field.
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
                By his side was a shorter man, around the height of 5 foot 9.
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
                He scanned the area, his blood-lusted red eyes threatening the moonlight's shade of blue in the sky.
                The clouds revealed the crescent moon, and a whole group of vampires could be seen standing on the perch of a building.
                """);
            wait(4);
            System.out.println("""
                
                The shorter, feathered hat man smiled. "I smell one that's fresh. I hear their heart beating."
                Riyun nodded. "Live blood."
                Milford gripped onto his weapon.
                """);
            wait(3);
            System.out.println("""
                
                He peeks over the edge. His heart drops. The shorter man was no longer there.
                A sharp nail scratches against his chin. He winces, jumping back and firing a charge at the threat.
                "Feisty," he snickered. He eyed the blood on his hand.
                "You must be that strong one."
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                
                Milford did not hesitate to attack, but suddenly, a knife pierced him from the back.
                He yelled in pain, dagging the Lancer against the vampire behind him.
                He releases a large voltage shock, the one behind him dropping dead.
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to attack!" + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                
                Suddenly, the shorter one launched foward, his long nails stabbing into his neck.
                Milford grabbed his left eyeball, frying it off. The boy screamed.
                Riyun grabbed his gun, firing at Milford.
                Milford was stunned, his body dropping to the floor.
                """);
            wait2seconds();
            System.out.println("""
                
                "Grab him! Hog tie him! We will feast tonight!" the shorter one yelled.
                They violently take his weapons and artillery, stabbing him with a painful, sedative syringe.
                Milford hollers in pain. His vision begins to swirl as they tied him up, dragging him away.
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            waitASecond();
        } else {
            System.out.println("""
                He wiped the blood trickling down his weapon.
                Vapor bubbled in his throat, the heat scalding his esophagus.
                He sighs, the steam evacuating from him in a faint hiss...
                """);
            wait2seconds();
            System.out.println("""
                
                He de-equips his sword back into his sheath.
                """);
            wait(3);
            System.out.println("""
                
                Reception is off.
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
                
                He felt a disturbance. Suddenly, he saw several vampires crowd on top of a building.
                Milford equips his Lancer. A vampire dashed at him from behind!
                """);
            wait(4);
            System.out.println(ConsoleUtility.RED + "YOU HAVE ONE SECOND TO FIRE BEFORE HE GETS YOU." + ConsoleUtility.YELLOW);
            wait2seconds();
            System.out.println(ConsoleUtility.RED + "WHEN THE PROMPT COMES UP, PRESS THE RIGHT BUTTON! LOWERCASE!" + ConsoleUtility.YELLOW);
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
            long end = System.currentTimeMillis();
            int diff = (int) (end - start) / 1000;
            if (diff == 1 || diff == 0) {
                System.out.println(ConsoleUtility.GREEN + "YOU REACTED IN TIME." + ConsoleUtility.YELLOW);
                wait2seconds();
                System.out.println("""
                
                Milford slices the vampire in half, frying his body.
                He manages to pry off and kill the few others that jumped him.
                """);
                wait(3);
                System.out.println("""
                
                Suddenly, one stabs him in the back, and another fires a gun at him.
                They pin him down, about 5 to 9 of them knocking him unconcious.
                """);
                wait(3);
                System.out.println("""
                
                "Grab him! Hog tie him! We will feast tonight!" one of them yelled.
                They violently take his weapons and artillery, stabbing him with a painful, sedative syringe.
                Milford hollers in pain. His vision begins to swirl as they tied him up, dragging him away.
                """);
                System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
                userInput = scan.nextLine();
                while (!userInput.equals("q")) {
                    userInput = scan.nextLine();
                }
            } else {
                System.out.println(ConsoleUtility.RED + "TOO LATE! THEY GOT TO YOU!");
                wait2seconds();
                System.out.println("""
                
                He stabs him in the back, and another fires a gun at him.
                They pin him down, about 5 to 9 of them knocking him unconcious.
                """);
                wait(3);
                System.out.println("""
                
                "Grab him! Hog tie him! We will feast tonight!" one of them yelled.
                They violently take his weapons and artillery, stabbing him with a painful, sedative syringe.
                Milford hollers in pain. His vision begins to swirl as they tied him up, dragging him away.
                """);
                System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
                userInput = scan.nextLine();
                while (!userInput.equals("q")) {
                    userInput = scan.nextLine();
                }
            }
        }
        if (demo) {
            System.out.println(ConsoleUtility.PURPLE + """
                
                And so, Milford is kidnapped and taken away, unconcious and unable to fight back.
                Who knows what happened to him? Does he escape? Does he get killed and eaten?
                """);
            wait(7);
            System.out.println("""
                
                Find out in the full game...
                
                THANKS FOR WATCHING. Any questions?
                """ + ConsoleUtility.YELLOW);
            return true;
        }
        //no more demo code after this
        System.out.println(ConsoleUtility.PURPLE + "Teleporting..." + ConsoleUtility.YELLOW);
        ConsoleUtility.clearScreen();
        System.out.println("""
                
                The world was a haze. His head hurt. His heart pounded loudly, painfully.
                """);
        wait(3);
        ConsoleUtility.clearScreen();
        System.out.println("""
                
                Why was he still breathing?
                Did he dare to breathe the same oxygen his companions could no longer have?
                """);
        wait(3);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.RED + """
                
                "You were just a pawn. A strong card to play in a trivial game where the player knew he has already lost."
                """);
        wait2seconds();
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.RED + """
                
                I couldn't save those poor kids.
                Shame on me.
                I should have tried harder.
                """);
        wait(3);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.YELLOW + """
                
                It's not my fault.
                I was too weak, I couldn't do anything!
                I was just a teacher. I really tried my best.
                """);
        wait(3);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.RED + """
                
                "He'll be good enough. He still has a pulse."
                "Take him, he'll be perfect to test our new weapon."
                """);
        wait(3);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.PURPLE + """
                PLAYER, WAKE UP!!
                """);
        waitASecond();
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.YELLOW + """
                He jolts awake, his hair dripping sweat as he looked around.
                His heart still pounded.
                He let out a large exhale as he stands up.
                """);
        wait2seconds();
        System.out.println("""
                
                He reached for his weapons, but he had nothing.
                He looked around. The room was surrounded in metal.
                They took away his armor, but he still had his senses.
                """);
        wait(3);
        System.out.println("""
                
                Milford places his hands against the wall of the room interior, trying to sense any openings.
                He sent waves throughout the walls. Eventually, he found a gap where the waves didn't bounce back.
                It must be an opening.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to take down the wall." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        waitASecond();
        System.out.println("""
                
                He slams against the wall, putting dents into it. He sighs.
                "Ow." he mutters. He punches against the metal wall repeatedly, eventually tearing a hole in it.
                He groans, widening the hole with his bare arms, catching his breath.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to examine." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                A long labyrinth follows. He ties to navigate through it.
                """);
        lostInv.removeBrokenWeapon("Lancer");
        lostInv.printInv();
        lostPlayer.setH(10);
        System.out.println(ConsoleUtility.PURPLE + "Current Health: " + lostPlayer.getH() + ConsoleUtility.YELLOW);
        printMazeVampLair();
        boolean clearedRisky = navigateWithRisk(6, 0);
        while (!clearedRisky) {
            printMazeVampLair();
            System.out.println("Whatever bombs you found were lost.");
            lostInv.clearWeaponsInv();
            lostPlayer.setH(10);
            clearedRisky = navigateWithRisk(6, 0);
        }
        System.out.println("D.J. Khalid. Another one.");
        lostInv.printInv();
        System.out.println(ConsoleUtility.PURPLE + "Current Health: " + lostPlayer.getH() + ConsoleUtility.YELLOW);
        printMazeVampLair2();
        boolean clearedRiskyAgain = navigateWithRisk(6, 0);
        while (!clearedRiskyAgain) {
            printMazeVampLair2();
            System.out.println("Whatever bombs you found were lost.");
            lostInv.clearWeaponsInv();
            lostPlayer.setH(10);
            clearedRiskyAgain = navigateWithRisk(6, 0);
        }
        wait2seconds();
        System.out.println(ConsoleUtility.YELLOW + """
                
                He finally finds a vent, hearing the overlapping echoes of 2 voices.
                He peeks through the folds, eavesdropping as he tries to quietly open the vent.
                """);
        wait(3);
        System.out.println("""
                
                Two of them were heavily caped and hooded, so he couldn't discern their faces.
                One was fooling around, waving Milford's Lancer playfully.
                "Yeesh! Look at this thing!" He chuckles. "These Voltage Agents don't screw around!"
                """);
        wait2seconds();
        System.out.println("""
                
                He puts the Lancer aside. "Markam's gonna be proud. Been a while since he was able to feed his own family."
                The other one leans against a table, nodding. "What's with the guy we captured anyway? He seems like a sour one."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                "Well, Markam said he used to be a kind fella. Said he used to be a teacher or something."
                Milford tampered with the screws on the vent.
                "Don't know what his backstory really is, but it's said that his school got attacked by a horde of vampires once."
                "He tried his best to save whoever he could during their school lockdown."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                "Markam said he was a brave one, killing one of the vampires with his remaining strength."
                "He ain't even got his powers yet. He was just a normal human being at the time."
                The one leaning on the table nodded. "Guess that's where the Vengeance Agents' leader came in."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford managed to unscrew the last bolt, carefully taking off the vent cover.
                The first one spoke. "Yeah. She said he was perfect, and took him away for eh.. the werewolf surgery or whatnot."
                "Must suck, to have your life be welded by a whole other lunatic who wanted to test her scientific experiment."
                Milford paused for a second. But he shook his head and quietly dropped down, out of their sight.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        waitASecond();
        System.out.println("""
                
                He eyed the Lancer on the table behind the first hooded man, inching closer and closer to it.
                With great stealth, in the immediate moment the second one looked away, Milford grabbed the Lancer.
                """);
        wait2seconds();
        System.out.println("""
                
                "Whatever, I'm hungry." said the second one, turning back to face the first man.
                The man's body was sliced vertically in half. Milford was gone. The armor and the weapons kit were missing.
                "WHAT?!" He reached for his walkie talkie, but his hand was sliced clean off.
                """);
        wait2seconds();
        System.out.println("""
                
                Milford was behind him. The man nearly hollered in pain, but Milford placed the Lancer to his neck, threatening him.
                "You're going to tell me which way takes me to your leader." Milford spoke dangerously quiet.
                The Lancer poked against the vampire's windpipe.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to threaten." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford had a strong grip on the man, one arm bounding his torso and arms in one, the other hold the Lancer to his throat.
                The man stuttered, whimpering. "T-Take a right.. and..uh..."
                "If you don't tell me within 3 seconds, I'll slice your windpipe and watch you choke on your own blood, slowly." Milford grumbled.
                The man nodded hesitantly, telling Milford all the directions. Milford nods.
                "Thanks for your cooperation." He slits his throat, the man falling to the ground, gagging and coughing, before going silent.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                He put on his armor again. He put his weapon back in his sheath, climbing back out the same vent.
                """);
        for (int i = 0; i < lostInv.getWeaponsSize(); i++) {
            Weapons bomb = new Weapons("Bomb", 1, 25);
            inventory.addToWeaponsInv(bomb);
        }
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        player.setH(100);
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait(4);
        System.out.println(ConsoleUtility.PURPLE + "PART 2 COMPLETED.");
        System.out.println("Current Health: " + player.getH());
        inventory.printInv();
        System.out.println("Press q to begin Part 3.");
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
        System.out.println(ConsoleUtility.YELLOW + """
                
                He saw a notification on his reciever. He listened to it. It was a message from Dee, his commander.
                "If you get this message, do know there is a killer vampire on the loose. He's a child, relatively around 17."
                "He's been baiting our agents and killing them one by one, then harvesting their bodies for the blood."
                "Kill him on sight. Report back when you've done so."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.YELLOW + """
                
                He turns off the receiver as he kept walking. Seems he's finally gotten out of the long vent system.
                He lands in a large study. The room was brisk and freezing. He must have been in a large refrigerator.
                """);
        wait2seconds();
        System.out.println(ConsoleUtility.YELLOW + """
                
                Bodies of soldiers and agents hung on hooks from the roof like Christmas decorations, not far above him.
                His heart felt a pang as he saw one of them was his young assistant.
                He took a sharp breath, his memories fading in. He lost another one. He blames himself.
                """);
        wait(3);
        System.out.println(ConsoleUtility.YELLOW + """
                
                He shook his head, trying to ignore it. He ducks behind a pillar, as 2 vampires walk past.
                As they passed, he slithered through the hanging meat and jars of blood.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        printSuspiciousMaze1();
        susNavigate(6, 0);
        waitASecond();
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.RED + """
                
                "I'm scared. I'm scared."
                "It's so dark."
                "I hear one on my left. No, my right??"
                """);
        wait(4);
        System.out.println(ConsoleUtility.RED + """
                
                "I've been stuck in here for 30 days."
                "Everytime they strike, they hurt."
                He huddles into a corner, alone, closing his eyes, trying not to freeze from the cold.
                Monsterous screeches echoed through the large cavern.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.RED + """
                
                "My body hurts. Everything hurts."
                "How do I use my powers! I don't know how!"
                "It's too dark. Too cold. My ears decieve me."
                He felt a vibration. His eyes shot open.
                """);
        wait(5);
        System.out.println(ConsoleUtility.RED + """
                
                "Why me? Why did they take me?"
                "Why was I chosen for this?"
                A creature growled, stepping closer.
                He couldn't see it. Dee put him through quite a training exercise.
                It came closer, it's fangs bearing sharp.
                He could only hear it. He couldn't do anything to defend himself.
                """ + ConsoleUtility.YELLOW);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("Milford snapped out of his trance, the maze returning to vision.");
        wait2seconds();
        ConsoleUtility.clearScreen();
        printSuspiciousMaze2();
        susNavigate(6, 1);
        waitASecond();
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.RED + """
                
                Blood and scars were on his body as he kneeled there, catching his breath.
                He was in a large observatory room.
                A giant, muscular man held a large axe in his hand.
                "GET UP! GET UP LIKE A MAN AND FIGHT TO THE DEATH!"
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.RED + """
                
                Milford yelled, getting up and dashing at the man, trying to land a hit.
                The muscular man scoffed, dodging.
                He punched Milford in the stomach, throwing him across the room.
                Dee watched from the opposite side of the viewing mirror. She chuckled.
                "PATHETIC!" yelled the man. "WEAK! GET UP! USE YOUR POWERS! ACCEPT YOUR CHANGE!
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.RED + """
                
                Milford coughed up a deal of blood, struggling to breathe.
                He stood up, not saying a word.
                He stood silently. The lights began to flicker.
                Dee looked around, raising an eyebrow.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.RED + """
                
                Suddenly, light bulbs and bars began to burst around them.
                Milford absorbed the current from them.
                The huge muscular man should dazed and confused. "W-what?!.."
                Suddenly, a huge surge of energy blasted in all directions as the area went dark.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.RED + """
                
                After a whole minute, the lights finally came back on.
                Dee had a suprised look on her face. She gasped, looking through the viewing mirror.
                Milford was standing over the dead body of the man, his heart in his hands.
                He kicked the dead body, crushing the heart organ in his hands.
                """ + ConsoleUtility.YELLOW);

        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("Milford snapped out of his trance, the maze returning to vision.");
        wait2seconds();
        ConsoleUtility.clearScreen();
        printSuspiciousMaze3();
        susNavigate(4, 3);
        System.out.println("He finally finds a switch, which opens a security door, clearing some obstacles out of the way.");
        printSuspiciousMaze4();
        if (susNavigate(2, 0)) {
            System.out.println(ConsoleUtility.YELLOW + """
                    He eventually reaches the end of the rooms.
                    """);
            wait2seconds();
        }
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.YELLOW + """
                
                He soon entered a large, labratory like area.
                He stayed quiet, seeing the two vampires from before.
                Markam and Riyun. He held his breath, kneeling down behind an object.
                He spotted a gun on the table he was behind.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to listen." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.YELLOW + """
                
                "Ever since the last Sound Moon..." Markam muttered. "Those bastard werewolves have gone insane."
                "This god forsaken astronomical occurance that occurs every 10 years, driving those beasts insane.."
                Markam looked at Riyun. "My people suffered as a result. Our kind- we're simple, calm, accepting."
                "Food's getting scarce. People are starving. And you ask that we BACK OFF?"
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to listen." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.YELLOW + """
                
                Riyun sighed. "Look... we captured a highly important asset to the Vengeance organization."
                "That man we have locked up in that room is no joke, Markam! The organization has us on their radar now."
                Markam banged the wall, gripping his forehead. "YOU DON'T UNDERSTAND THE SACRIFICES THAT HAVE TO BE MADE."
                "I DON'T CARE ABOUT ANYBODY'S GOD DAMN RADAR! I CARE ABOUT HELPING MY PEOPLE. HELPING MY COMMUNITY."
                """);
        wait(4);
        System.out.println(ConsoleUtility.YELLOW + """
                
                Another man, wearing a large hood, enetered the room. "Sir, the hostage escaped-"
                Markam's eyes widened. The room went silent.
                "Where is he." Markam asked.
                "We don't know.."
                "WELL THEN FIND HIM." He pointed his long, red, pointy nails at the door, gesturing him out.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to reach for the gun." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.YELLOW + """
                
                "DAMN IT!" He heard a shuffle behind the table, seeing Milford lunge for the gun.
                Milford has little time to react.
                """);
        wait2seconds();
        System.out.println(ConsoleUtility.RED + "YOU HAVE ONE SECOND TO FIRE BEFORE HE DODGES." + ConsoleUtility.YELLOW);
        waitASecond();
        System.out.println(ConsoleUtility.RED + "WHEN THE PROMPT COMES UP, PRESS THE RIGHT BUTTON! LOWERCASE!" + ConsoleUtility.YELLOW);
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
        long end = System.currentTimeMillis();
        int diff = (int) (end - start) / 1000;
        boolean lose20 = false; // will reduce Markam's initial health by 20 if player shot in time.
        if (diff == 1 || diff == 0) {
            System.out.println("""
                    
                    Markam winces from the bullet piercing just above his heart.
                    Milford fires another bullet at Riyun, square in the head, blasting his brains off.
                    "Riyun! No!" Markam looks at him, watching the young vampire drop dead.
                    """);
            lose20 = true;
        } else {
            System.out.println("""
                    
                    Markam deflects the bullet with his cape, pouncing back, ready to fight.
                    Milford fires another bullet at Riyun, square in the heart, blasting his brains off.
                    "Riyun! No!" Markam looks at him, watching the young vampire drop dead.
                    """);
        }
        wait2seconds();
        System.out.println("""
                    
                    He charges at Milford. Milford jumps back, dodging.
                    "You're a dead man." Markam yells. He flairs his larges claws, pointing at him.
                    """);
        System.out.println(ConsoleUtility.PURPLE + "Press t to begin battle." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("t")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + "Beginning battle..." + ConsoleUtility.YELLOW);
        wait2seconds();
        ConsoleUtility.clearScreen();
        if (lose20) {
            boolean clearedMarkam = vampBossFight(80, 12);
            while (!clearedMarkam) {
                player.setH(100);
                System.out.println(ConsoleUtility.PURPLE + "You died. Press q to restart." + ConsoleUtility.YELLOW);
                userInput = scan.nextLine();
                while (!userInput.equals("q")) {
                    userInput = scan.nextLine();
                }
                clearedMarkam = vampBossFight(80, 12);
            }
        } else {
            boolean clearedMarkam = vampBossFight(100, 12);
            while (!clearedMarkam) {
                player.setH(100);
                System.out.println(ConsoleUtility.PURPLE + "You died. Press q to restart." + ConsoleUtility.YELLOW);
                userInput = scan.nextLine();
                while (!userInput.equals("q")) {
                    userInput = scan.nextLine();
                }
                clearedMarkam = vampBossFight(100, 12);
            }
        }
        player.setH(100);
        System.out.println(ConsoleUtility.YELLOW + "You have completed the battle!");
        wait(2);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*" + ConsoleUtility.YELLOW);
        System.out.println("""
                
                Milford watches the young boy fall to the ground, blood trickling down his head.
                The boy looks up, anger and vengeance in his eyes, but a slight twinge of fear.
                The will to live still flared in his eyes.
                """);
        wait2seconds();
        System.out.println("""
                
                Milford walks up to the boy, holding the Lancer in his right hand.
                "It's over, huh?" Markam chuckled. He coughed up some blood.
                "My people want to live, Milford. We want to breathe, just as you do."
                "You humans act like you're the holy salvation this planet needs but..."
                """);
        wait(3);
        System.out.println("""
                
                "...you know that's not true. You, of all people... should know that, Milford."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                "Humans.." Markam spoke in hoarse breaths, "... are no more evil than us."
                Milford raised his Lancer, ready to stab him.
                "Humanity kills, humanity does what it needs to survive..."
                "We're only the monsters because we do it with freaky fangs, nails, and claws."
                """);
        wait2seconds();
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford looks the boy in his eyes. He sighs.
                The boy looked at the Lancer. "You wished you were a better teacher."
                "I know those kids' screams echo in your head everyday."
                "And how you wished.. oh so wished... you could save them."
                """);
        wait(4);
        System.out.println("""
                
                The Lancer fell to his side. He stood there, not knowing what to say.
                Markam chuckled. "Ironic. You want to take revenge on all the monsters, but you're turning into one yourself."
                "That's not really the nice guy I remember."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford releases the hot steam of vapor in his throat.
                He took his glasses off, the moonlight seeping in through the cracks of the roof.
                Though the yellow color of anger had been there, a slight shade of blue was present.
                "I know who I am." He coughs. "I know what I've become. And this is.. my choice."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                He stabs Markam in the heart, staking the vampire. The boy turns to ash, crumbling to dust.
                He sighs. He realized how much his body was starting to ache from the armor.
                But he needs it to live, to thrive. He walks away, wiping the blood off his Lancer.
                Wiping the blood off his hands.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        wait2seconds();
        System.out.println(ConsoleUtility.PURPLE + "PART 3 COMPLETED.");
        System.out.println("Current Health: " + player.getH());
        inventory.printInv();
        System.out.println("Press q to begin Part 4.");
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
        System.out.println(ConsoleUtility.PURPLE + "~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*" + ConsoleUtility.YELLOW);
        System.out.println("""
                
                He exits the building, walking past the small town.
                It was not a pleasant sight. Houses were in shambles, people living in rags.
                Some slept on the ground on nothing but mere cloth.
                Mothers held there children close, afraid of Milford's bright, electrical armor.
                """);
        wait(3);
        System.out.println(ConsoleUtility.PURPLE + "Press q to keep walking." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                The people watched. They knew.
                They feared.
                He saw a cat on the ground.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to pet cat." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford kneels down, examining the cat as he pet it.
                The cat has long, black fur, it's yellow eyes looking up, purring.
                Milford gave it a treat. It meowed in acceptance.
                """);
        wait(3);
        System.out.println("""
                
                He stood back up, hearing the clacking of high heeled boots behind him.
                "So there you are. I saw your battle. You've lost some reaction time, I see."
                Milford turned around, facing Dee.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.GREEN + """
                
                a. Hello, commander.
                b. Screw you. (most preferable)
                c. (Remain silent)
                """ + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        if (userInput.equals("a")) {
            System.out.println("""
                
                Dee nods. "I expect a solute.
                Milford sighed, and reluctantly saluted.
                "That's better." Dee responded.
                "I needed assistance, and you didn't send any the entire time." Milford puts his glasses back on.
                "Wanna explain where you were while I was being kidnapped by lunatic vampires?"
                """);
        } else if (userInput.equals("b")) {
            System.out.println("""
                
                Dee scoffs. "Watch it, lab experiment."
                "Watch the receeding hairline, you balding old woman." Milford coughs.
                "Excuse me? You are to show some more respect, lowly plaything."
                "Then show me a reason as to why you didn't bother sending help this whole time." Milford puts his glasses back on.
                "Wanna explain where you were while I was being kidnapped by lunatic vampires?"
                """);
        } else {
            System.out.println("""
                
                Milford remains silent.
                Dee rolls her eyes. "Am I not deserving of at least a simple hi?"
                He turns to face her reluctantly."Hi."
                "Wanna explain where you were while I was being kidnapped by lunatic vampires?"
                """);
        }
        wait(3);
        System.out.println("""
                
                Dee chuckles. "I was just in town. My men were searching for you, and so was I."
                "I found a suspicious building, entered it, and soon caught a glimpse of your battle with the boy."
                "Good job for completing your task." She smiled.
                "You always do what I ask of you."
                """);
        wait(3);
        System.out.println("""
                
                The black cat meowed curiously, placing a paw on Dee's leg.
                She scrunched her nose, disgusted. "Get off me, you filthy animal!"
                She kicked the cat, who landed on the floor with a thud. It hissed, running away.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford remains silent.
                She clears her throat, continuing. "Anyways, you're needed for an execution."
                "Our target subject has been spotted at Meadow's Castle.
                "You know of the great structure known to be home to the princess of werewolves, do you not?
                """);
        System.out.println(ConsoleUtility.GREEN + """
                
                a. I know of it.
                b. What is it? (most preferable)
                """ + ConsoleUtility.YELLOW);
        userInput = "";
        userInput = scan.nextLine();
        if (userInput.equals("a")) {
            System.out.println("""
                
                "I know of it."
                "Dee nods. "Well then you should know where it is too."
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue" + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
        } else {
            System.out.println("""
                
                "What and where is that?" he asked.
                Dee walked alongside Milford as she explained.
                "Years ago, a royal family had a daughter, but they wanted a son and wasn't proud of her.
                "The little princess was always hated by her father and mother.
                "It was certain that she would never be a successful heir to the werewolf kingdom."
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                
                "When she grew up, she swore she would build an army and a castle of her own, to prove she was worth something."
                "They doubted her, because she was alone, and was still exploring her powers as a feral werewolf."
                "But soon, she was able to convert humans that stood in her way into her little militants."
                "She built a castle upon a hilltop, which her slaves guarded."
                "Her army grew day by day."
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                
                "Then, came the first Sound Moon ever recorded in the history of the world.
                The moon turned a dark yellow. It emitted a sound that only werewolves could hear, that made only werewolves go berserk.
                Her army became strong beasts upon that night. She waged war upon her own family.
                It didn't take long to slaughter everybody in the royalty, detroying every structure under their name.
                She became the new ruler of the land upon that night, and nobody ever dared to doubt, nor challenge, her strength again."
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
            System.out.println("""
                
                Dee's eyes darkned. "I aspire to hve power like her. Her story... inspires me, Milford."
                She then chuckles, looking at Milford. "But enough of that."
                "She died long ago, along with her army, so they're not the target I speak of."
                """);
            System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
            userInput = scan.nextLine();
            while (!userInput.equals("q")) {
                userInput = scan.nextLine();
            }
        }
        System.out.println("""
                
                "Speaking of the Sound Moon..."
                She looks up at the sky. "It has been 10 years."
                "You know that it is expected to be this year again, do you not?"
                Milford nodded.
                """);
        wait(3);
        System.out.println("""
                
                The clouds swirled in the sky. The sun was beginning to set.
                The sky was already getting darker.
                She looked past the horizon. "Our target is of the werewolf species."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                "The man we are targeting isn't a joke. He's incredibly strong."
                Dee continued. "Hes middle aged, around 51 I believe.
                "He lost his son to the Sound Moon that happened 10 years ago."
                Milford nodded. "I remember that night. I was quite busy taking out your orders."
                "The Sound Moon drives werewolves insane by releasing a high pitched sound when it rises."
                "It turns them into creatures that are three times their normal werewolf strength."
                Dee nodded. "If that happens tonight, you're opponent will be very difficult to fight."
                "He's dangerously strong, and needs to be put down."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                "The man we speak of used to be an English teacher.
                On the night of the Sound Moon, everything was hectic, and the first thing he did was run home to protect his son.
                But when he came home, he found the 8 year old's dead body being chewed out by a werewolf. He was too late.
                He lost his mind after that night, and bloodshed was all he knew.
                Towns were being ripped apart. People being swallowed whole by rabid beasts of hunger and destruction. The man was one of the rabid ones.
                So many bodies torn and deceased, so much blood everywhere.
                He disappeared after that dark yellow night, and my agents never found him after.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                "However, we recently traced down a strong source, coming all the way from that lonely castle up on the hill." Dee pointed at the hill.
                "You need to go there and investigate. Kill whoever you see on sight."
                Milford sighed. "Are you certain he's up there?"
                Dee nodded.
                "Fine. I'll go."
                """);
        wait2seconds();
        System.out.println("""
                
                "Well you're most certainly not going up there without a vehicle."
                Dee pointed at Milford's bike, which her men had dragged up here.
                He nodded. "Thanks." He hopped on the bike. He didn't look at Dee.
                She walked up to him. "Wait one second. Can I ask you something?"
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford nodded, looking at the bike's handle bars.
                "Do you still have my back?" Dee questioned.
                He nodded, but didn't face her when he did.
                "I didn't have to kill that kid, Commander." He revved up his bike, driving off.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + "Teleporting..." + ConsoleUtility.YELLOW);
        wait2seconds();
        ConsoleUtility.clearScreen();
        System.out.println("""
                
                The purple hue of the bike brightened the snow around him as he drove up the large hill.
                Trees surrounded him, passing him by as he drove. The road was very bumpy and jagged.
                """);
        wait(3);
        System.out.println("""
                
                After about 20 minutes of driving, the bike hits a pothole in the ground.
                "CRAP-" The bike catapaults Milford forward like a cannonball.
                He lands into the snow with a hard thud, rolling over.
                He lies there, catching his breath.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to shrug it off like a cool guy." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                He gets on his knees, brushing the snow off of him.
                The bike starts falling down the hill. It crashes into a tree, breaking apart.
                He kneeled there, stunned.
                A round squirrel, holding an acorn, stood there just as astounded as he.
                """);
        wait(4);
        System.out.println("""
                
                He eyed the squirrel. "What do you want?"
                It sat there dumbfoundedly, chewing on its acorn.
                Milford groaned. "Guess I'm going on foot." The squirrel followed him.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to shrug it off like a cool guy." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Navigate through the woods to the castle.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Current Health: " + player.getH() + ConsoleUtility.YELLOW);
        inventory.printInv();
        printWoodsMaze1();
        if (!navigateWithRisk(6, 3)) {
            System.out.println("Whatever bombs you had were lost.");
            inventory.clearWeaponsInv();
            player.setH(100);
        }
        System.out.println(ConsoleUtility.PURPLE + "Current Health: " + player.getH() + ConsoleUtility.YELLOW);
        inventory.printInv();
        printWoodsMaze2();
        navigate(6, 3);
        System.out.println("""
                
                A large fog covered the top of the hill, but as Milford came closer, the fog slowly cleared.
                The large castle came into view. The moon rose behind it, casting an ominous shadow upon the large, ghastly structure.
                The castle had beautifully carved and decorated dome tops, oscilating in yellow and black.
                """);
        wait(4);
        System.out.println("""
                
                He entered the gigantic castle, the crystallized door sliding open by a crack.
                As he walked inside, he noted how dark it was, except for occasional streams of moonlight which casted in.
                Statues of angels and demons with wings and horns coveted the ceiling and walls.
                In the center stood a statue of Lucifer with wings on his back, holding up a sword.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to shrug it off like a cool guy." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Milford walked up to the statue, eying it's detail. The sword reflected moonlight, sparkling.
                He looked at his Lancer and sighed, shaking his head.
                He heads up the staircase cautiously.
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to shrug it off like a cool guy." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println("""
                
                Navigate through the castle and find the target.
                """);
        printCastleMaze1();
        susNavigate(6,3);
        printCastleMaze2();
        susNavigate(5,3);
        printCastleMaze3();
        susNavigate(4,0);
        printCastleMaze4();
        susNavigate(4,6);
        ConsoleUtility.clearScreen();
        System.out.println(ConsoleUtility.RED + """
                
                Looks like you got a warranty on your head, isn't that right, Milford?
                """ + ConsoleUtility.YELLOW);
        wait(3);
        ConsoleUtility.clearScreen();
        printCastleMaze5();
        navigateWithRisk(1, 3);
        return true; // stops start
    } //end of start code


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

    public void printMazeVampLair () {
        /* this is how the maze should be printed!
        There should b a risk of blowing up!
        _______
        ____|__
        ____$__
        ___|_|_
        __|__|_
        _|_____
        X|__O$_
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("_");
            }
        }
        maze[6][0] = new Space("X");
        maze[6][4] = new Space("O");
        maze[6][1] = new Space("|");
        maze[5][1] = new Space("|");
        maze[4][2] = new Space("|");
        maze[3][3] = new Space("|");
        maze[1][4] = new Space("|");
        maze[3][5] = new Space("|");
        maze[4][5] = new Space("|");
        maze[6][5] = new Space("$");
        maze[2][4] = new Space("$");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printMazeVampLair2 () {
        /* this is how the maze should be printed!
        There should be a risk of blowing up!
        _______
        __|_|__
        __|_|__
        __|$O|_
        __|__|_
        ||||||_
        X__$___
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("_");
            }
        }
        maze[6][0] = new Space("X");
        maze[3][4] = new Space("O");
        maze[6][3] = new Space("$");
        maze[3][3] = new Space("$");
        maze[5][5] = new Space("|");
        maze[5][4] = new Space("|");
        maze[5][3] = new Space("|");
        maze[5][2] = new Space("|");
        maze[5][1] = new Space("|");
        maze[5][0] = new Space("|");
        maze[4][5] = new Space("|");
        maze[4][2] = new Space("|");
        maze[3][5] = new Space("|");
        maze[3][2] = new Space("|");
        maze[2][2] = new Space("|");
        maze[2][4] = new Space("|");
        maze[1][2] = new Space("|");
        maze[1][4] = new Space("|");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printSuspiciousMaze1 () {
        /* this is how the maze should be printed!
        |||||||
        |||||O|
        |||||||
        |||||||
        |||||||
        |||||||
        X$|||||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[6][0] = new Space("X");
        maze[1][5] = new Space("O");
        maze[6][1] = new Space("$");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printSuspiciousMaze2 () {
        /* this is how the maze should be printed!
        |||||||
        |||||O|
        |||||||
        |||||||
        |||$|||
        |||_|||
        _X__|||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[6][1] = new Space("X");
        maze[1][5] = new Space("O");
        maze[6][0] = new Space("_");
        maze[6][2] = new Space("_");
        maze[6][3] = new Space("_");
        maze[5][3] = new Space("_");
        maze[4][3] = new Space("$");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

        public void printSuspiciousMaze3 () {
            /* this is how the maze should be printed!
            |||||||
            |||||O|
            $___|||
            |||_|||
            |||X|||
            |||_|||
            ____|||
            */
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze.length; j++) {
                    maze[i][j] = new Space("|");
                }
            }
            maze[4][3] = new Space("X");
            maze[1][5] = new Space("O");
            maze[6][0] = new Space("_");
            maze[6][2] = new Space("_");
            maze[6][3] = new Space("_");
            maze[5][3] = new Space("_");
            maze[3][3] = new Space("_");
            maze[2][3] = new Space("_");
            maze[2][2] = new Space("_");
            maze[2][1] = new Space("_");
            maze[2][0] = new Space("$");
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze.length; j++) {
                    System.out.print(maze[i][j].getSymbol());
                }
                System.out.println();
            }
        }

    public void printSuspiciousMaze4 () {
        /* this is how the maze should be printed!
        _______
        _____O_
        X______
        _______
        _______
        _______
        ___?___
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("_");
            }
        }
        maze[2][0] = new Space("X");
        maze[1][5] = new Space("O");
        maze[6][3] = new Space("?");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printWoodsMaze1 () {
        /* this is how the maze should be printed!
        ___O___
        _|_$_|$
        _|||||_
        _||||$_
        ____|||
        |||_|||
        ||_X_||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[6][3] = new Space("X");
        maze[0][3] = new Space("O");
        maze[6][2] = new Space("_");
        maze[6][4] = new Space("_");
        maze[5][3] = new Space("_");
        maze[4][3] = new Space("_");
        maze[4][2] = new Space("_");
        maze[4][1] = new Space("_");
        maze[4][0] = new Space("_");
        maze[3][0] = new Space("_");
        maze[2][0] = new Space("_");
        maze[1][0] = new Space("_");
        maze[0][0] = new Space("_");
        maze[0][1] = new Space("_");
        maze[0][2] = new Space("_");
        maze[1][2] = new Space("_");
        maze[1][3] = new Space("$");
        maze[1][4] = new Space("_");
        maze[0][4] = new Space("_");
        maze[0][5] = new Space("_");
        maze[0][6] = new Space("_");
        maze[1][6] = new Space("$");
        maze[2][6] = new Space("_");
        maze[3][6] = new Space("_");
        maze[3][5] = new Space("$");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printWoodsMaze2 () {
        /* this is how the maze should be printed!
        ||_O_||
        |||_|||
        ||___||
        $__|__$
        ||___||
        |||_|||
        ||_X_||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[6][3] = new Space("X");
        maze[0][3] = new Space("O");
        maze[6][2] = new Space("_");
        maze[6][4] = new Space("_");
        maze[6][2] = new Space("_");
        maze[5][3] = new Space("_");
        maze[4][2] = new Space("_");
        maze[4][4] = new Space("_");
        maze[4][3] = new Space("_");
        maze[3][0] = new Space("$");
        maze[3][6] = new Space("$");
        maze[3][1] = new Space("_");
        maze[3][2] = new Space("_");
        maze[3][4] = new Space("_");
        maze[3][5] = new Space("_");
        maze[2][2] = new Space("_");
        maze[2][4] = new Space("_");
        maze[2][3] = new Space("_");
        maze[1][3] = new Space("_");
        maze[0][2] = new Space("_");
        maze[0][4] = new Space("_");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printCastleMaze1() {
        /* this is how it should be printed!
        |||O|||
        |||||||
        |||||||
        |||||||
        |||||||
        |||$|||
        |||X|||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[6][3] = new Space("X");
        maze[5][3] = new Space("$");
        maze[0][3] = new Space("O");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printCastleMaze2() {
        /* this is how it should be printed!
        |||O|||
        |||||||
        |||||||
        |||||||
        $___|||
        |||X|||
        |||_|||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[5][3] = new Space("X");
        maze[4][0] = new Space("$");
        maze[0][3] = new Space("O");
        maze[6][3] = new Space("_");
        maze[4][3] = new Space("_");
        maze[4][2] = new Space("_");
        maze[4][1] = new Space("_");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printCastleMaze3() {
        /* this is how it should be printed!
        |||O|||
        |||||||
        |||||||
        |||||||
        X_____$
        |||_|||
        |||_|||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[4][0] = new Space("X");
        maze[0][3] = new Space("O");
        maze[4][6] = new Space("$");
        maze[6][3] = new Space("_");
        maze[5][3] = new Space("_");
        maze[4][3] = new Space("_");
        maze[4][2] = new Space("_");
        maze[4][1] = new Space("_");
        maze[4][4] = new Space("_");
        maze[4][5] = new Space("_");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printCastleMaze4() {
        /* this is how it should be printed!
        |||O|||
        |||$|||
        |||_|||
        |||_|||
        ______X
        |||_|||
        |||_|||
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("|");
            }
        }
        maze[4][6] = new Space("X");
        maze[0][3] = new Space("O");
        maze[1][3] = new Space("$");
        maze[6][3] = new Space("_");
        maze[5][3] = new Space("_");
        maze[4][3] = new Space("_");
        maze[4][2] = new Space("_");
        maze[4][1] = new Space("_");
        maze[4][0] = new Space("_");
        maze[4][4] = new Space("_");
        maze[4][5] = new Space("_");
        maze[3][3] = new Space("_");
        maze[2][3] = new Space("_");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void printCastleMaze5() {
        /* this is how it should be printed! RISK OF BLOWING UP!
        $__O__$
        ___X___
        _______
        _______
        _______
        _______
        $_____$
        */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = new Space("_");
            }
        }
        maze[1][3] = new Space("X");
        maze[0][3] = new Space("O");
        maze[0][0] = new Space("$");
        maze[0][6] = new Space("$");
        maze[6][0] = new Space("$");
        maze[6][6] = new Space("$");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    private boolean navigate (int row, int col) {
        Scanner choice = new Scanner(System.in);
        String currentSymbol = "";
        String userInput = "";
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


    private boolean susNavigate (int row, int col) {
        Scanner choice = new Scanner(System.in);
        String currentSymbol = "";
        String userInput = "";
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
                        int chance = (int) (Math.random() * 2) + 1;
                        if (chance == 1) {
                            foodFind();
                        } else {
                            weaponFind();
                        }
                        return true;
                    }
                    if (currentSymbol.equals("|")) {
                        System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border! (|)");
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row - 1][col] = new Space("X");
                        maze[row][col] = new Space("_");
                        row -= 1;
                    }
                    if (currentSymbol.equals("?")) {
                        ConsoleUtility.clearScreen();
                        wait2seconds();
                        unknownDiologue();
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
                        int chance = (int) (Math.random() * 2) + 1;
                        if (chance == 1) {
                            foodFind();
                        } else {
                            weaponFind();
                        }
                        return true;
                    }
                    if (currentSymbol.equals("|")) {
                        System.out.println(ConsoleUtility.YELLOW + "You cannot cross this border! (|)");
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row][col - 1] = new Space("X");
                        maze[row][col] = new Space("_");
                        col -= 1;
                    }
                    if (currentSymbol.equals("?")) {
                        ConsoleUtility.clearScreen();
                        wait2seconds();
                        unknownDiologue();
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
                        int chance = (int) (Math.random() * 2) + 1;
                        if (chance == 1) {
                            foodFind();
                        } else {
                            weaponFind();
                        }
                        return true;
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row][col + 1] = new Space("X");
                        maze[row][col] = new Space("_");
                        col += 1;
                    }
                    if (currentSymbol.equals("?")) {
                        ConsoleUtility.clearScreen();
                        wait2seconds();
                        unknownDiologue();
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
                        int chance = (int) (Math.random() * 2) + 1;
                        if (chance == 1) {
                            foodFind();
                        } else {
                            weaponFind();
                        }
                        return true;
                    }
                    if (currentSymbol.equals("_")) {
                        maze[row + 1][col] = new Space("X");
                        maze[row][col] = new Space("_");
                        row += 1;
                    }
                    if (currentSymbol.equals("?")) {
                        ConsoleUtility.clearScreen();
                        unknownDiologue();
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
    } //end of susNavigate

    private boolean navigateWithRisk (int row, int col) {
        Scanner choice = new Scanner(System.in);
        String currentSymbol = "";
        String userInput = "";
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
                        int blowYourselfUp = (int) (Math.random() * 4) + 1;
                        if (blowYourselfUp == 1) {
                            lostPlayer.loseH(10);
                            System.out.println(ConsoleUtility.YELLOW + "You stepped on a landmine and lost 10 health.");
                            maze[row - 1][col] = new Space("X");
                            maze[row][col] = new Space("_");
                            row -= 1;
                            if (checkIfDead(lostPlayer.getH())) {
                                System.out.println("YOU DIED.");
                                return false;
                            }
                        } else {
                            bombFind();
                            maze[row - 1][col] = new Space("X");
                            maze[row][col] = new Space("_");
                            row -= 1;
                        }
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
                        int blowYourselfUp = (int) (Math.random() * 4) + 1;
                        if (blowYourselfUp == 1) {
                            lostPlayer.loseH(5);
                            System.out.println(ConsoleUtility.YELLOW + "You stepped on a landmine and lost 5 health.");
                            maze[row][col - 1] = new Space("X");
                            maze[row][col] = new Space("_");
                            col -= 1;
                            if (checkIfDead(lostPlayer.getH())) {
                                System.out.println("YOU DIED.");
                                return false;
                            }
                        } else {
                            bombFind();
                            maze[row][col - 1] = new Space("X");
                            maze[row][col] = new Space("_");
                            col -= 1;
                        }
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
                        int blowYourselfUp = (int) (Math.random() * 4) + 1;
                        if (blowYourselfUp == 1) {
                            lostPlayer.loseH(5);
                            System.out.println(ConsoleUtility.YELLOW + "You stepped on a landmine and lost 5 health.");
                            maze[row][col + 1] = new Space("X");
                            maze[row][col] = new Space("_");
                            col += 1;
                            if (checkIfDead(lostPlayer.getH())) {
                                System.out.println("YOU DIED.");
                                return false;
                            }
                        } else {
                            bombFind();
                            maze[row][col + 1] = new Space("X");
                            maze[row][col] = new Space("_");
                            col += 1;
                        }
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
                        int blowYourselfUp = (int) (Math.random() * 4) + 1;
                        if (blowYourselfUp == 1) {
                            lostPlayer.loseH(5);
                            System.out.println(ConsoleUtility.YELLOW + "You stepped on a landmine and lost 5 health.");
                            maze[row + 1][col] = new Space("X");
                            maze[row][col] = new Space("_");
                            row += 1;
                            if (checkIfDead(lostPlayer.getH())) {
                                System.out.println("YOU DIED.");
                                return false;
                            }
                        } else {
                            bombFind();
                            maze[row + 1][col] = new Space("X");
                            maze[row][col] = new Space("_");
                            row += 1;
                        }
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

    private boolean navigateWithWeapons (int row, int col) {
        Scanner choice = new Scanner(System.in);
        String currentSymbol = "";
        String userInput = "";
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

    public void bombFind () {
        int chance = (int) (Math.random() * 4) + 1;
        if (chance <= 2) {
            System.out.println("You quicken your gaze towards the ground to see a round explosive on the floor by luck.");
            wait2seconds();
            Weapons bigBoomThingy = new Weapons("Bomb", 1, 25);
            System.out.println(inventory.addToWeaponsInv(bigBoomThingy));
        } else {
            System.out.println("You thought your eyes were deceiving you, but you take a second look and see that...");
            wait(2);
            System.out.println("Nope sorry. You thought you saw something, but it was just a shiny piece of dust.");
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
                int hitOrMiss = (int) (Math.random() * 4) + 1;
                if (hitOrMiss >= 2) {
                    int powerfulBlow = (int) (Math.random() * 3) + 1;
                    if (powerfulBlow == 1) {
                        System.out.println("The Lancer charged a powerful wave, which cost the werewolf 20 damage!");
                        bossHealth -= 20;
                        System.out.println("Werewolf Health: " + bossHealth);
                    } else {
                        System.out.println("You sliced a vengeful attack with your Lancer, costing the werewolf 15 health.");
                        bossHealth -= 15;
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
                waitASecond();
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
                        if (checkIfDead(player.getH())) {
                            System.out.println("Player Health: " + player.getH());
                            wait2seconds();
                            return false;
                        }
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
                int wolfConfused = (int) (Math.random() * 2) + 1;
                if (wolfConfused == 1) {
                    System.out.println("The werewolf was too stunned to attack back.");
                } else {
                    System.out.println("Werewolves turn!");
                    waitASecond();
                    werewolfMoves(bossDmg);
                }
                if (checkIfDead(player.getH())) {
                    System.out.println("Player Health: " + player.getH());
                    wait2seconds();
                    return false;
                }
            } else { //user is clearly stupid and doesn't know how to follow directions nah jk
                System.out.println("Bruh, invalid input. MAKE SURE YOU TYPE THE RIGHT OPTION, LOWERCASE.");
            }
            roundCount++;
        } //while code ends
        return false; // this shouldn't happen btw
    }

    private boolean vampBossFight (int bossHealth, int bossDmg) { //for Vampires, specifically Markam. He's the only vampire you fight.
        int roundCount = 1;
        while (!(player.getH() <= 0) || !(bossHealth <= 0)) {
            Scanner scan = new Scanner(System.in);
            String userInput = "";
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~ ROUND " + roundCount + " *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            System.out.println("PLAYER, IT'S YOUR TURN!");
            System.out.println(ConsoleUtility.PURPLE + "Current Health: " + player.getH());
            System.out.println("Vampire's Current Health: " + bossHealth);
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
                int hitOrMiss = (int) (Math.random() * 2) + 1;
                if (hitOrMiss >= 2) {
                    int powerfulBlow = (int) (Math.random() * 3) + 1;
                    if (powerfulBlow == 1) {
                        System.out.println("The Lancer charged a powerful wave, which cost the vampire 20 damage!");
                        bossHealth -= 20;
                        System.out.println("Vampire Health: " + bossHealth);
                    } else {
                        System.out.println("You sliced a vengeful attack with your Lancer, costing the vampire 15 health.");
                        bossHealth -= 15;
                        System.out.println("Vampire Health: " + bossHealth);
                    }
                } else {
                    System.out.println("You missed!");
                }
                if (checkIfDead(bossHealth)) {
                    System.out.println("Markam has fallen!");
                    return true;
                }
                wait(3);
                System.out.println("Markam's turn!");
                waitASecond();
                MarkamMoves(bossDmg);
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
                        System.out.println("A great beam of light fired from the Prowler, searing through Markam's flesh.");
                        System.out.println("He yells in great pain, losing 75 health.");
                        bossHealth -= wantedWeapon.getDamage() + 25;
                        System.out.println("Vampire Health: " + bossHealth);
                    } else {
                        System.out.println("The Prowler charged it's purple radiance at him as you struck a powerful blow!");
                        System.out.println("Markam lost 50 health!");
                        bossHealth -= wantedWeapon.getDamage();
                        System.out.println("Vampire Health: " + bossHealth);
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
                    System.out.println("Markam has fallen!");
                    return true;
                }
                wait(3);
                System.out.println("Markam's turn!");
                waitASecond();
                MarkamMoves(bossDmg);
                if (checkIfDead(player.getH())) {
                    wait2seconds();
                    System.out.println("Player Health: " + player.getH());
                    return false;
                }
            } else if (userInput.equals("f")) { //BOMB KABOOM
                Weapons wantedBomb = inventory.requestedWeapon("Bomb");
                System.out.println("Your bomb cost the vampire 25 damage!");
                bossHealth -= wantedBomb.getDamage();
                System.out.println("Vampire Health: " + bossHealth);
                wantedBomb.useOnce();
                wantedBomb.setBrokeIfSo(); //only happens if uses is 0.
                if (wantedBomb.getBroke()) {
                    inventory.removeBomb();
                }
                wait(3);
                System.out.println("Markam's turn!");
                waitASecond();
                MarkamMoves(bossDmg);
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
                waitASecond();
            } else if (userInput.equals("g")){ //voltage storm, remember to deduce health from the player as well
                waitASecond();
                ConsoleUtility.clearScreen();
                System.out.println(ConsoleUtility.CYAN + "You feel electricity sparkling around you, the current flowing rapidly through your body.");
                System.out.println("You heart feels as if it's searing alive, being cut in half, but you do what you must do.");
                wait2seconds();
                System.out.println("An electromagnetic surge of waves surges from your armor, sucking in the current and electricity around you.");
                int damageRange = (int) (Math.random() * 16) + 15;
                bossHealth -= damageRange;
                System.out.println("You release it in a large blow, shocking everything around you, including Markam. You reduce his health by " + damageRange + ".");
                int stunChance = (int) (Math.random() * 3) + 1;
                if (stunChance == 1) { //new feature, note this for later!!
                    System.out.println(ConsoleUtility.RED + "NOW'S YOUR CHANCE! Attack the vampire while he's stunned within 2 seconds!" + ConsoleUtility.CYAN);
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
                        System.out.println("You were able to strike Markam with another strong blow, costing it another 20 health!");
                        bossHealth-= 20;
                    } else if (diff == 2) {
                        System.out.println("You were able to strike the Markam with another strong blow, costing it another 15 health!");
                        bossHealth -= 15;
                    } else {
                        System.out.println("You weren't able to get him time!");
                        System.out.println("Markam quickly dodged your approach, stabbing you and costing you 15 health.");
                        player.loseH(15);
                        if (checkIfDead(player.getH())) {
                            System.out.println("Player Health: " + player.getH());
                            wait2seconds();
                            return false;
                        }
                    }
                }
                System.out.println(ConsoleUtility.YELLOW + "Although you produced significant damage, the large surge recoiled on you as well.");
                int recoilDmg = (int) (Math.random() * 21) + 15;
                player.loseH(recoilDmg);
                if (checkIfDead(bossHealth)) {
                    System.out.println("Markam has fallen!");
                    return true;
                }
                if (checkIfDead(player.getH())) {
                    System.out.println("Player Health: " + player.getH());
                    wait2seconds();
                    return false;
                }
                int wolfConfused = (int) (Math.random() * 2) + 1;
                if (wolfConfused == 1) {
                    System.out.println("Markam was paralyzed for a while from the shock, unable to return a move.");
                } else {
                    System.out.println("Markam's turn!");
                    waitASecond();
                    MarkamMoves(bossDmg);
                }
                if (checkIfDead(player.getH())) {
                    System.out.println("Player Health: " + player.getH());
                    wait2seconds();
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
        if (hitOrMiss == 3) {
            System.out.println("The werewolf made his move, swiping his large claws at you.");
            player.loseH(dmg);
            waitASecond();
        } else if (hitOrMiss == 1 || hitOrMiss == 2) {
            System.out.println("The werewolf missed.");
            waitASecond();
        } else {
            System.out.println("The werewolf struck a huge attack, causing you a lot of pain!");
            player.loseH(dmg + 10);
            waitASecond();
        }
    }

    private void MarkamMoves (int dmg) {
        int hitOrMiss = (int) (Math.random() * 4) + 1;
        if (hitOrMiss == 1 || hitOrMiss == 2) {
            System.out.println("Markam dashes, swping his claws at you.");
            player.loseH(dmg);
            waitASecond();
        } else if (hitOrMiss == 3) {
            System.out.println("The area fogs up, impairing your vision, as Markam moves at a great pace.");
            System.out.println("He stabs you from the back, causing a great deal of damage.");
            player.loseH(dmg + 15);
            waitASecond();
        } else {
            System.out.println("You dodged his attack.");
        }
    }

    private boolean checkIfDead (int healthNumber) {
        if (healthNumber <= 0) {
            return true;
        }
        return false;
    }

    private void unknownDiologue () {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        waitASecond();
        System.out.println(ConsoleUtility.BLUE + """
                Milford? Milford, is that you?
                """);
        wait(2);
        System.out.println(ConsoleUtility.PURPLE + """
                
                A soft, gentle voice spoke to him.
                Milford looked at the person. "Why are you here?"
                """);
        wait(3);
        System.out.println(ConsoleUtility.BLUE + """
                
                "It seems time hasn't done a good number on you."
                "That armor must be slowly killing you."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + """
                
                "I haven't... seen you in so long."
                Milford watches the strange, ghostly figure.
                "I don't know what I've become, friend. I'm not myself anymore."
                """);
        wait(3);
        System.out.println(ConsoleUtility.BLUE + """
                
                "Stop giving your life to this useless cause."
                "They aren't worth saving. They aren't worth your time."
                "You're a nice guy, Milford, but you need to stop helping everybody."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.BLUE + """
                
                "Dee doesn't consider you as a loyal assistant. She sees you as a pet."
                "She sees you as her little card up her sleeve, but she won't ever see you for what you are.
                """);
        wait(3);
        System.out.println(ConsoleUtility.PURPLE + """
                
                Milford shakes his head. "You don't understand. I've put myself in an endless burden."
                "It's my fault I couldn't save those kids."
                "It's rightful that I was pulled away for a science experiment."
                He sighs. "They made me stronger, more capable than I ever could have been."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.BLUE + """
                
                The ghostly figure held in tears, a twinge in rage and confusion in their emotions.
                "Look at what they did to you!"
                "You still have the chance to turn the tides, to show them you are more than capable!"
                "You don't have to be their little chess move, Milford!"
                "I saw what they did to you! They tore you apart, toying with your body!"
                "They put POISON in you, disguised as strength!"
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + """
                
                Milford's voice quivered as he spoke in raspy breaths. "Priscilla, leave me alone-"
                """);
        waitASecond();
        System.out.println(ConsoleUtility.BLUE + """
                
                "I know what that power does to you, Milford!"
                "It fries you, inside out!"
                "Your organs start to malfunction and eventually, some will fail from the repeated shocks!"
                "The human body isn't meant to handle such levels of voltage!"
                "That's why your heart STOPPED for so long the last time you got wiped out!"
                They took a deep breath.
                "You're going to die like this, dear."
                """);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        System.out.println(ConsoleUtility.PURPLE + """
                
                He stood silent for a bit. Then, he spoke up.
                "Let me die the way I want to, then."
                He walked away.
                """);
        wait2seconds();
        System.out.println(ConsoleUtility.BLUE + """
                
                "Come back..." their voice echoed.
                "Come back please.. don't go that way.."
                The ghost watched his walk away, fading away into the air.
                """ + ConsoleUtility.YELLOW);
        System.out.println(ConsoleUtility.PURPLE + "Press q to continue." + ConsoleUtility.YELLOW);
        userInput = scan.nextLine();
        while (!userInput.equals("q")) {
            userInput = scan.nextLine();
        }
        ConsoleUtility.clearScreen();
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