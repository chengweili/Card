public class Shuffle{

  public static void shuffle(int[] a){
	for(int i = 0; i < a.length - 1; i++){
	    int index = (int)(Math.random() * (a.length - i)) + i;
	    int temp = a[i];
	    a[i] = a[index];
	    a[index] = temp;
	}
	
}
