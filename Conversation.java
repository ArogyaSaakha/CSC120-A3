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
    a = i;
    while(i !=0) //loop function to excute number of rounds for the conversation
      {
        if (a == i)
          {
            System.out.println("Hi there!  What's on your mind?");
            reply = in.nextLine();
            String word = reply.replace("I", "You");
            String word_1 = word.replace("me", "you");
            String word_2 = word_1.replace("Me", "You");
            String word_3 = word_2.replace("am", "are");
            String word_4 = word_3.replace("'m", "'re");
            String word_5 = word_4.replace("your", "my");
            String word_6 = word_5.replace("Your", "My");
            String word_7 = word_6.replace("you", "I");
            String word_8 = word_7.replace("You", "I");
            String word_9 = word_8.replace("my", "your");
            String word_10 = word_9.replace("My", "Your");//replaces and mirrors some words. Has errors. Need to use loop function
            
            System.out.println(word_10 +"?");
          }
        i --;  
        if(i==1)
          {
            reply = in.nextLine();
            System.out.println("Mmm-hm.");
            System.out.println("Cya!");
          }
        else
          {
            reply = in.nextLine();
            String word = reply.replace("I", "You");
            String word_1 = word.replace("me", "you");
            String word_2 = word_1.replace("Me", "You");
            String word_3 = word_2.replace("am", "are");
            String word_4 = word_3.replace("'m", "'re");
            String word_5 = word_4.replace("your", "my");
            String word_6 = word_5.replace("Your", "My");
            String word_7 = word_6.replace("you", "I");
            String word_8 = word_7.replace("You", "I");
            String word_9 = word_8.replace("my", "your");
            String word_10 = word_9.replace("My", "Your");//replaces and mirrors some words. Has errors. Need to use loop function
            System.out.println(word_10 +"?");
          }

      } 
     


      


  }

}

