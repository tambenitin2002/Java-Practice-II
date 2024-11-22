package programs;

public class PalindromNumber {
public static void main(String[] args) {
    int num=1216;
    int copy=num;
    int rem=0;
    int rev=0;
    while(num!=0){
        rem=copy%10;
        rev=rev*10+rem;
        copy=copy/10;
    }
    if(num==rev){
        System.out.println("its is palindrom number! ");
    }else{
        System.out.println("Not a palindrom number!!!");
    }
}
}
