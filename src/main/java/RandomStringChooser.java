import java.util.*;
public class RandomStringChooser
{
  private String [] arr;
  public RandomStringChooser(String [] words){
    arr = words;
  }
  public String getNext(){
    int randNum = (int)(Math.random()*arr.length);
    String randWord = arr[randNum];
    arr[randNum] = null;
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == null)
        count ++;
    }
    if(count == arr.length)
      return "NONE";
    return randWord;
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
