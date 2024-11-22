package stringPrograms;

public class PrintOnlyVowels {
public static void printVowels(){
    String str = "Hello World";
    for(int i=0;i<str.length();i++){

        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'|| ch=='I' || ch=='O'|| ch=='U'){
           System.out.print(ch+" ");
        }
    }
}

  public static void main(String[] args) {
    
   printVowels();

  }
}
