package tagver3;

import java.util.Scanner;

/**
 *
 * @author BendikteEva
 */
public class Boundery {

    Player n1 = new Player();
    String named;

    public void intro() {

        System.out.println(">> Hello " + named + " " + "Welcome to Text Based Adventure Game! <<\n\n");
        System.out.println("The objective of this game is to find your way through\n"
                + "the dungeon and collect as much gold as possible. \n\n"
                + "You don't have a map and only a flaslight at your \n"
                + "disposal to light up your quest.\n\n"
                + "You forgot to eat so you have to finish your quest\n"
                + "before you faint and is eaten by moths and bats \n"
                + "and big ugly spiders and then eventually die,  \n"
                + "which in that case you have lost. \n\n"
                + "Your health is at 100% when you start and you will\n"
                + "gradually lose your health while your walking around.\n"
                + "because you are hungry and no food is available.\n\n"
                + "At any time during your quest, type help and get some options\n\n"
                + "You have won the game when you have found the Exit."
                + "\n\n\n");
    }

    public void askNamed() {

        Scanner nameInput = new Scanner(System.in);
        System.out.println("What is your name? ");
        named = nameInput.nextLine();
        named = named.toUpperCase();

    }

    public void chooseRoomStart() {

        System.out.println("Will you like to enter the cave or are you a coward");
        System.out.println("type '0' for being a coward!");
        System.out.println("type '1' for entering.");

    }

    public void chooseDirection() {

        System.out.println("Where do you wanna go?");
        System.out.println("Press\n"
                + "n for north\n"
                + "s for south\n"
                + "e for east\n"
                + "w for west\n");
    }

}
