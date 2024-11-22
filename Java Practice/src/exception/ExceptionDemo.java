package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program started!");
        String str="15abc";
        try{
        int a=Integer.parseInt(str);
        System.out.println(a);
    }catch(NumberFormatException p){
        System.out.println(p);
    }
      System.out.println("program ended!!");  
    }
}
