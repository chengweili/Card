import wheels.users.*;

public class CardImage extends Image{
  
  private Image _card;
  
  public CardImage(String file){
    super(file);
    _card = new Image(file);
  }
  
}
