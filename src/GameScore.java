import java.util.*;

public class GameScore {

    public static  void main(String[]  args){

        List<Integer>  score = new  ArrayList<>();
        List<String>  cards = new ArrayList<>();
        List<String>  Uniquecards = new ArrayList<>();
        LinkedList<String> messageQueue = new LinkedList<>();

        messageQueue.addLast("User Logged In");
        messageQueue.addLast("Data Saved");
        System.out.println("Queue after initial adds: " + messageQueue);

        messageQueue.addFirst("server Started");
        System.out.println("Queue after addFirst: " + messageQueue);

        messageQueue.add("Transaction Complete");
        System.out.println("Queue after last add: " + messageQueue);

        String processedMsg1 = messageQueue.removeFirst();
        String processedMsg2 = messageQueue.removeFirst();

        System.out.println("\nProcessed Messages:");
        System.out.println("  - " + processedMsg1);
        System.out.println("  - " + processedMsg2);

        // Print the remaining queue
        System.out.println("\nRemaining Queue: " + messageQueue);


        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.add("Ten");
        cards.add("Nine");


        while(Uniquecards.size() < 3){
            int randomNum = (int)(Math.random() * 5);
            String retrieveCard = cards.get(randomNum);
            if(!Uniquecards.contains(retrieveCard)){
                Uniquecards.add(retrieveCard);
            }
        }

        System.out.println(Uniquecards);
        score.add(100);
        score.add(75);
        score.add(120);
        score.add(90);

        System.out.println(score);
        score.set(1,85);
        System.out.println(score);
        score.add(0,150);
        System.out.println(score);
        score.remove(2);
        System.out.println(score);
    }
}
