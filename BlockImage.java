import wheels.users.*;

public class BlockImage extends Image{
  
  private Image _card;
  
  public BlockImage(String file){
    super(file);
    _card = new Image(file);
  }
  
}
