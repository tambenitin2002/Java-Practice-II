package pattern;

public class StarPattern {
    public static void twoParallelLine(){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    }

    public static void squarStarPatter(){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inSquerCross(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i+j==n-1 || i==j || j==n-1 || i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void cross(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void leftSideTriangle(){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
               System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightSideTriangle(){
       int n=4;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i+j>=n-1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
       }
    }

    public static void inversLeftSideTriangle(){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<=n-1){
                 System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inversRightSideTriangle(){
        int n=4;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(i-j<=0){
                  System.out.print("* ");
                }else{
                   System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle(){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(i+j>=n-1&&i-j>= -(n-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inversTriangle(){
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(i-j<0&&i+j<2*n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void doubleTriangle(){
        int n=4;
        for(int i=0;i<2*n;i++){
            for(int j=0;j<2*n;j++){
                if(false){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("twoParallelLine();");
        twoParallelLine();
        System.out.println("squarStarPatter()");
        squarStarPatter();
        System.out.println("inSquerCross()");
        inSquerCross();
        System.out.println("cross()");
        cross();
        System.out.println("leftSideTriangle()");
        leftSideTriangle();
        System.out.println("rightSideTriangle()");
        rightSideTriangle();
        System.out.println("inversLeftSideTriangle()");
        inversLeftSideTriangle();
        System.out.println("inversRightSideTriangle()");
        inversRightSideTriangle();
        System.out.println("triangle()");
        triangle();
        System.out.println("inversTriangle()");
        inversTriangle();
        System.out.println("doubleTriangle()");
        doubleTriangle();
    }
}
