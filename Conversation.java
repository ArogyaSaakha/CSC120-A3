import java.util.Scanner;
class Conversation {

  /**
   * @param arguments
   */
  public static void main(String[] arguments) {
    Scanner keyboard = new Scanner(System.in); //created a scanner to get input from the user
    Scanner in = new Scanner(System.in); 

    String reply;
    int a;
    System.out.print("How many round?");
    int i = keyboard.nextInt();
    String[] transcript = new String[2 * i];
    a = i;
    while(i !=0) //loop function to excute number of rounds for the conversation
      {
        if (a == i)
          {
            System.out.println("Hi there!  What's on your mind?");
            reply = in.nextLine();
            StringBuilder result = new StringBuilder(); //Used for modifying the string value
            String[] words = reply.split(" ");
            boolean first = true;
            for (String word : words) {
                if (first) {
                    first = false;
                }
                else {
                    result.append(' ');
                }
                switch (word) {
                    case "I":
                        word = "you";
                        break;
                    case "I'm":
                        word = "You're";
                        break;    
                    case "me":
                        word = "you";
                        break;
                    case "am":
                        word = "are";
                        break;
                    case "you || You":
                        word = "I";
                        break;
                    case "my":
                        word = "your";
                        break;
                    case "My":
                        word = "Your";
                        break;    
                    case "your":
                        word = "my";
                        break;
                    case "Your":
                        word = "My";
                        break;
                    // used to change words while replying back    
                    // reference from https://stackoverflow.com/questions/71505537/java-chatbot-mirroring-and-canned-responses

                }
                result.append(word);
          }
         System.out.println(result +"?"); 
        } 
         i --;  
         
        if(i==1)
          {
            reply = in.nextLine();
            System.out.println("Mmm-hm.");
            System.out.println("Cya!");
            System.exit(0);
          }
        else
          {
            reply = in.nextLine();
            StringBuilder result2 = new StringBuilder();
            String[] words2 = reply.split(" ");
            boolean first2 = true;
            for (String word2 : words2) {
                if (first2) {
                    first2 = false;
                }
                else {
                    result2.append(' ');
                }
                switch (word2) {
                    case "I":
                        word2 = "you";
                        break;
                    case "I'm":
                        word2 = "You're";
                        break;    
                    case "me":
                        word2 = "you";
                        break;
                    case "am":
                        word2 = "are";
                        break;
                    case "you || You":
                        word2 = "I";
                        break;
                    case "my":
                        word2 = "your";
                        break;
                    case "My":
                        word2 = "Your";
                        break;    
                    case "your":
                        word2 = "my";
                        break;
                    case "Your":
                        word2 = "My";
                        break;

                }
                result2.append(word2);
            }
          System.out.println(result2 +"?");
         } 
  }
 }
}


