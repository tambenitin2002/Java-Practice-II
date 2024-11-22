package programs;

public class ArmstrongNumber {
public static void main(String[] args) {
    
    int n = 153;
    int copy=n;
    int temp=n;
    int rem=0;
    int rem1=0;
    int count=0;
    int sum=0;
    while(copy!=0){
        rem=copy%10;
        count++;
        copy=copy/10;
    }
    while(temp!=0){
        rem1=temp%10;
        int power=rem1;
        for(int i=1;i<count;i++){

            power=power*rem1;
            
        }
        sum=sum+power;
        temp=temp/10;
    }
    if(sum==n){
        System.out.println("It is a amstrong");
    }else{
        System.out.println("Not Amstrong Number");
    }

}
}
