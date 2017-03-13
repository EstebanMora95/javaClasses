public class Test {
 public static void main (String[] args)
 {
   
  String test = "this"; 
  System.out.println("this" == "this"); 
  System.out.println(test.equals("this"));
  
  
  int number = 45323;
  String stringNumber = number + "";
  String newString = "";
  for(int n = stringNumber.length()-1; n >= 0; n--){
    newString = newString + stringNumber.charAt(n);
  }
  System.out.println(newString);
  
 }
}