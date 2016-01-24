import wheels.users.*;

public class TetrisImage extends Image{
  
  private Image _card;
  
  public TetrisImage(String file){
    super(file);
    _card = new Image(file);
  }
  
}
