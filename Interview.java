public class Interview{
  public static void main(String[] args){
    
    String variable1 = new String("variable");
    String variable2 = new String("variable");
    
    String stringVariable1 = "stringvariable";
    String stringVariable2 = "stringvariable";
    
    System.out.println(stringVariable1 == stringVariable2);
    System.out.println(stringVariable1.equals(stringVariable2));
    
    
    System.out.println(variable1 == variable2);
    System.out.println(variable1.equals(variable2));
    
    
    System.out.println(recursiveFacto(10));
    System.out.println(recursiveSum(10));
  }
  
  
  public static int recursiveFacto(int number){
    if(number == 1 || number == 0){
      return 1;
    } else {
      return  number * recursiveFacto(number-1);
    }
  }
  
  public static int recursiveSum(int number){
    if(number == 0 || number == 1){
      return number;
    } else {
      return number + recursiveSum(number-1);
      
    }
    
  }
  
  public static boolean checkCondition(int number){
    String stringNumber = number + "";
    boolean condition = true;
    for(int n = 0; n <= stringNumber.length(); n++){
      
    }
  }
}



