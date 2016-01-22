import wheels.users.*;

public class Card extends Rectangle{

    private Rectangle _card;
    private int _atk, _row;

    public Card(int atk, int row){
	super(atk, row);
	this.setSize(50,50);
	this.setFillColor(java.awt.Color.BLACK);
	_atk = atk;
	_row = row;	
    }

    public int getAtk(){
	return _atk;
    }

    public int getRow(){
	return _row;
    }

}
