import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> arr;
  public RandomStringChooser(String [] words){
    arr = new ArrayList<String>();
    for(String w : words){
      arr.add(w);
    }
  }
  public String getNext(){
    if(arr.size() == 0)
      return "NONE";
    int index = (int)(Math.random()*arr.size());
    return arr.remove(index);
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
