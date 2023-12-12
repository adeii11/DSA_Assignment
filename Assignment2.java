import java.util.*;
class Assignment2{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args){
    
  }
  public static void EvenorOdd(){
    int a=sc.nextInt();
    if(a%2==0){
      System.out.println("number is even");
    }
    else{
      System.out.println("number is odd");
    }
  }
  public static void greet(){
    System.out.println("enter the name ");
    String name=sc.next();
    System.out.println("hello "+name);
  }
  public void currency(){
    int a=sc.nextInt();
    System.out.println("your currency in Pkr ruppes is "+a);
    System.out.println("your currency in dollars is "+a/284+"$");
  }
  public static void largestNumber(){
    System.out.println("enter number 1:");
    int a1=sc.nextInt(); 
    System.out.println("enter number 1:");
    int b1=sc.nextInt();
    if(a1>b1){
      System.out.println("a is greater than b");
    }else if(a1==b1){
      System.out.println("a is equal to b");
    }else{
      System.out.println("b is greate than a");
    }
  }
  public static void calculate(){
    System.out.println("enter the number 1");
    int a=sc.nextInt();
    System.out.println("enter the number 2");
    int b=sc.nextInt();
    System.out.println("enter the operator");
    char c=sc.next().charAt(0);
    if(c=='+'){
      System.out.println("sum of "+a+" and "+b+" is "+(a+b));
    }else if(c=='-'){
      System.out.println("subtraction of "+a+" and "+b+" is "+(a-b));
    }else if(c=='*'){
      System.out.println("multiply of "+a+" and "+b+" is "+(a*b));
    }else if(c=='/'){
      System.out.println("division of "+a+" and "+b+" is "+(a/b));
    }else if(c=='%'){
      System.out.println("% of "+a+" and "+b+" is "+(a%b));
    }else{
      System.out.println("invalid operator");
    }
  }
  public static void interest(){
    System.out.println("enter the principle amount");
    int P=sc.nextInt();
    System.out.println("enter the time in year");
    int T=sc.nextInt();
    System.out.println("enter the rate of interest");
    int R=sc.nextInt();
    System.out.println("simple interest is "+(P*T*R)/100);
  }
  public static void fibo(){
    System.out.println("enter the fibo number");
    int n=sc.nextInt();
    if(n==0){
      System.out.println("0");
    }else if(n==1){
      System.out.println("1");
    }else{
      int a=0,b=1,c=0;
      for(int i=0;i<n;i++){
        c=a+b;
        a=b;
        b=c;
      }
      System.out.println(c);
      
    }
  }
  public static boolean palindrome(String s){
    int a=0,b=s.length()-1;
    while(a<b){
      if(s.charAt(a)!=s.charAt(b)){
        return false;
      }
      a++;
      b--;
    }
    return true;
  }
  public static void armStrong(int n){
    int a=n,sum=0,b=1;    
    while(a>0){
      b=a%10;
      sum=sum+(b*b*b);
      a=a/10;
    }
    if(sum==n){
      System.out.println("armstrong number");
    }else{
      System.out.println("not an armstrong number");
    }   
  }
  
}
