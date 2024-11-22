package programs;

public class FactorsOfNumber {
public static void main(String[] args) {
    int number = 12;
    for(int i=1;i<number;i++){
        if(number%i==0){
            System.out.println(i);
        }
    }
}
}
