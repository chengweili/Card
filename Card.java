import wheels.users.*;

public class Card extends Rectangle{

    private int _atk, _row;

    public Card(int atk, int row){
	this.setSize(50,50);
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

