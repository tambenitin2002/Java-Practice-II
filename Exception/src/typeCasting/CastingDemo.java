package typeCasting;

public class CastingDemo {
public static void main(String[] args) {
    // matching Info
    int k=20;
    double p=32.25;
    System.out.println(k+"\t\t"+p);
    
    //narrowing 
    int j=(int) p;
    System.out.println(j); //32
    //widening
    double d=k;
    System.out.println(d);//20.0
}
    


}
