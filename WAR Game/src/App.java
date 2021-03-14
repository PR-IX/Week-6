
public class App {
	 public static void main(String[] args) {
	Player one = new Player("Phill");
	Player two = new Player("Sam");
	Deck deck = new Deck();
	deck.shuffle();
	
	for(int i = 0; i < 52;i++) {
	   if(i % 2 == 0) {
			one.draw(deck);
		}else {
			two.draw(deck);
		}
	}
    for(int i = 0; i < 26;i++) {
     Card oneCard = one.flip();
     Card twoCard = two.flip();
     if (oneCard.getValue() > twoCard.getValue()) {
    	 one.incrementScore();
     } else if (oneCard.getValue() < twoCard.getValue()) {
    	 two.incrementScore();
     }
    }
     System.out.printf("player1 score is" + " " + one.getScore() + " ");
     System.out.printf("player2 score is" + " " + two.getScore() + " ");
     if(one.getScore() > two.getScore()) {
    	 System.out.println("one is the winner!");
     }else if (one.getScore() < two.getScore()) {
    	 System.out.println("two is the winner!");
     } else {
    	 System.out.println("It is a DRAW");
    	 
     }
     
    }
	 }

    
    	
	



