public class DeckOfCards {
  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Jack", "Queen", "King"};
        
    // Initialize cards
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    
    System.out.println("Before shuffling!");
    // Display the first four cards
    for (int i = 0; i < 4; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println("Card number " + deck[i] + ": " 
        + rank + " of " + suit);
    }
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * deck.length);
      // index 12, i == 1
      int temp = deck[i];
      // temp == deck[1] == 1, deck[index]==12  
      deck[i] = deck[index]; 
      // deck[1]==12, deck[12]==12
      deck[index] = temp;
      // deck[12]== 1

      // Ubah tiga perintah diatas menjadi dua baris perintah saja!
    }

    System.out.println("After shuffling!");
    // Display the first four cards
    for (int i = 0; i < 4; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println("Card number " + deck[i] + ": " 
        + rank + " of " + suit);
    }
  }
}