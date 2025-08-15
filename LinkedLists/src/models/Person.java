
package models;

import java.util.LinkedList;

/**
 *
 * @author jahood
 */
public class Person {
    
    private String name;
    private LinkedList<String> credit_cards;
    
    public String getName(){return name;}
    public LinkedList<String> get_Cards(){return credit_cards;}
    
    public void setName(String nameIn){name=nameIn;}
    public void set_credit_cards(LinkedList<String> cardsIn){credit_cards = cardsIn;}
    
    public Person()
    {
        name = "Bob";
        credit_cards = new LinkedList<>();
    }
    
    public void addCard(String cardNo)
    {
        credit_cards.add(cardNo);
    }
    
    public void addFirstCard(String cardNo)
    {
        credit_cards.addFirst(cardNo);
    }
    
    public void removeCard(int elementNo)
    {
        credit_cards.remove(elementNo);
    }
    
}
