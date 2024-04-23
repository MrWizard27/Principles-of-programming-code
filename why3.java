import java.util.Scanner;
            //Name of file
public class why3{


public static void Introconversation(String s) {
  String str = input.nextLine();
                //nextline makes the scanner scan the string, nextint would be scanning int data values
    switch (str) {
      case "Hello There":
      case "hello there":
      case "HELLO THERE":
      case "Hello there":
      System.out.println("Kenobi?");
      break;
      case "Nothin Much":
      case "nothin much":
      case "Nothin much":
      System.out.println("Thats Boring");
      break;
      case "Execute Order 66":
      case "execute order 66":
      case "Execute order 66":
      System.out.println("Death to the Jedi!");
      break;
      case "What is the meaning of life":
      case "what is the meaning of life":
      case "What is the Meaning of Life":
      case "What is the meaning of Life":
      case "What's the meaning of life":
      case "what's the meaning of life":
      case "What's the meaning of Life":
      System.out.println("I dont know bro, I just work  here");
      break;
      case "Up Up Down Down Left Right Left Right B A Start":
      case "up up down down left right left right b a start":
      System.out.println("Hwhat");
      break;
      case "The Sky":
      case "the sky":
      case "The sky":
      System.out.println("No dib Sherlock");
      break;
      case "Threat Level Midnight":
      case "threat level midnight":
      case "Threat level midnight":
      System.out.println("I don't watch The Office");
      break;
      case "Dukes up":
      case "dukes up":
      case "Dukes Up":
      case "Dukes up!":
      case "Dukes Up!":
      System.out.println("Bonks with crown");
      System.exit(0);
      break;
      case "Dad?!":
      case "Dad!?":
      case "dad!?":
      case "dad?!":
      case "Dad?":
      case "dad?":
      case "Dad!":
      case "dad!":
      case "DAD":
      case "dad":
      case "Dad":
      System.out.println("Yes son");
      break;
      case "Blows up pancakes with mind":
      case "blows up pancakes with mind":
      case "Blows up Pancakes with Mind":
      case "Blows up pancakes with Mind":
      case "BLOWS UP PANCAKES WITH MIND":
      System.out.println("My fudgin panca-");
      System.exit(0);
      break;
      case "Howdy":
      case "howdy":
      System.out.println("*Tips Hat*");
      break;
      case "Your mom":
      case "your mom":
      case "ur mom":
      case "Your mother":
      System.out.println("Why");
      break;
      default:
      System.out.println("I don't do english too well partner so im just gonna nod my head");
      break;

  }
}

public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Introconversation;
      System.out.println("");
      System.out.println("Adventurer, I have a quest for you");
      System.out.println("Would you be willing to fetch me a Regen artifact.\nI'm willing to pay you 100 gold coins for it.\nDo you accept (yes/no)");
      String nl = input.nextLine();
      //nl= new lines
      switch (nl) {
      case "no":
      case "No":
      System.out.println("ok :(");
      System.exit(0);
      break;
      case "yes":
      case "Yes":
      case "s":
      System.out.println("");
      System.out.println("Great, here is what you need to do.");
      break;
      default:
      System.out.println("Thats not an answer");
      System.exit(0);
      break;
}         //secret word
      String sw = "The One Piece, The One Piece is Real";
      //Adventure plan
      System.out.println("Go through the haunted forest, watch out for monsters,\nOnce you get out of there climb up the mountain and look for a chest.");
      System.out.println("Once you find the chest, whisper the Sentence \"" + sw + "\" and it will open,\ninside will be the regen artifact");
      System.out.println("\nBefore you go, take this Magical sword, now go adventurer.");
      //Entering the forest
      System.out.println("\nYou enter the haunted forest\nA Skeleton appears, what will you do?");
      //Fight Options
      System.out.println("\nAttack\nBlock\nRun\nCry");
      String ml = input.nextLine();
      //ml = mission lines
      switch (ml) {
      default:
      System.out.println("Thats not an option");
      System.exit(0);
      break;
      case "Cry":
      case "cry":
      case "4":
      case "Option 4":
      System.out.println("");
      System.out.println("Wha- why did you pick this option, is the Skeleton really that scary? fine, uh you win, congrats!");
      System.out.println("\nYOU WIN\nCONGRATULATIONS\n\nHidden Ending\n(are you ok?)");
      System.exit(0);
      break;
      case "Run":
      case "run":
      case "3":
      case "Option 3":
      System.out.println("You attempt to run away and trip hitting your head and dying instantly");
      System.out.println("Mission Failed, We'll get em next time");
      System.exit(0);
      break;
      case "Block":
      case "block":
      case "2":
      case "Option 2":
      System.out.println("The Skeleton get ready to swing, you go into a blocking stance ready to block their next move");
      System.out.println("The Skeleton swings it's sword, You block the hit, sliding back.\nYou run at the Skeleton who is struggling to recover from its swing as it literally has no muscles.\nYou reach the Skeleton\nSwing //");
      System.out.println("With one swing the skeleton falls apart, you have won this battle");
      break;
      case "attack":
      case "Attack":
      case "attack it":
      case "Attack it":
      case "1":
      case "Option 1":
      case "s":
      System.out.println("You ready your sword and widen your stance. The Skeleton seems to mimic your moves as if it has no moves of it's own.\nYou breath in.... Then out...\nYou both swing at the same time");
      System.out.println("Your slice was perfect, the Skeleton's swing cutting only a single strand of hair off your head");
      System.out.println("The Skeleton Crumbles, you have won this fight");
      break;
  }

}
