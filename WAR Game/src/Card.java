
public class Card {

	public static void main(String[] args) {
	}	
     public int value;
     public String name;
          
     public Card(int value, String name)  
    {
      setName(name);
      setValue(value);
}
     public int getValue(){return this.value;}
     public String getName() {return this.name;}
     public void setValue(int x) {this.value = x;}
     public void setName(String name) {this.name = name;}
     
     public void describe() 
     {	
        System.out.println("Your card is the" + this.value + "of" + this.name);
     }

}