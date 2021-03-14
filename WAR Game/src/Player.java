import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name)
	{
		this.score = 0;
		this.name = name;
	}
	public void describe()
	{
		System.out.println("Player" + this.name + "Score of" + this.score);
		for(Card card : hand) {
			card.describe();
		}
	}
		public Card flip(){
			return hand.remove(0);
		}
		public void draw(Deck d) {
			hand.add(d.draw());
		}
		public void incrementScore() {
			this.score++;
		}
		public int getScore() {
			return score;
		}
	}

	
	
	
 


