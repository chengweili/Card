import wheels.users.*;

public class Card{

    private int _atk, _row;

    public Card(int atk, int row){
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
