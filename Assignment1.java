import java.util.Scanner;
class Main {

  public int hcf(int a,int b){
     int temp,temp1,temp2;
    temp1=a;
    temp2=b;
    while(temp2!=0){
      temp=temp2;
      temp2=temp1%temp2;
      temp2=temp;
    }
    return temp1;
  }
  public void table(int a){
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(a+"*"+i+"="+a*i);
    }
  }
  public int lcm(int a,int b){
    int hcf=hcf(a,b);
    int lcm=(a*b)/hcf;
    return lcm;
  }
  public static void func(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    String y;
    int sum=0;
    do{
      y=sc.next();
      if(isInteger(y)){
        sum+=Integer.parseInt(y);
      }else if(y.charAt(0)!='x'){
        System.out.println("invalid character");
      }
    }while(y.charAt(0)!='x');
    System.out.println(sum);
  }
  public static boolean isInteger(String s) {
      try {
          Integer.parseInt(s);
          return true;
      } catch (NumberFormatException e) {
          return false;
      }
  }
  public static void main(String[] args) {
    func();
  }
}
