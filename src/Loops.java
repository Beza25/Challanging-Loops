import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
      Scanner input = new Scanner (System.in);

      //numbers();
      //backWards();
      //odd();
      //even();
      //down();
        // sum();
        //userSum();
        //stars();
        //stars2();
        stars3();
    }

    public static void numbers(){
        for(int i = 1; i <10; i++){
            System.out.println(i + "\n");
        }
    }
    public static void backWards(){
        for(int i = 10; i > 1; i--){
            System.out.println(i +'\n');
        }
    }
    public static void odd(){
        for( int i=1; i <= 20; i=i+2){
            System.out.println(i +"\n");
        }
    }
    public static void even(){
        for(int i=2; i<=20; i=i+2){
            System.out.println(i + "\n");
        }
    }

    public static void down(){
        Scanner key = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = key.nextInt();
        for (int i = number; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void sum(){
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void userSum(){
        Scanner key = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = key.nextInt();
        int sum = 0;
        for(int i = num; i >= 1; i--){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void stars(){
        for(int i = 0; i < 4; i++){
            String stars = "************";
            System.out.println(stars);
        }
    }
    public static void stars2(){

        for(int row = 0; row < 5; row++){
            //System.out.println("row =" + row);
            for(int col = 0; col <= row; col++){
                //System.out.println("star = " +  star);
                System.out.print(  "*");
            }
            System.out.println();
        }
    }

    public static void stars3(){


        for (int row = 5; row > 0; row --) {
            System.out.print(" ");
            for (int col = 0; col >= row; col++) {

                System.out.println("*");
            }
            System.out.println();
        }



    }
}
