import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        boolean run=true;

        while (run){
            System.out.println("Do you want to Continue or Exit?");
            String navigate=scan.next();

            if(navigate.equals("Continue")){
                System.out.println("Input triangle sides to know type of triangle");
                System.out.println("Side 1");
                int sideOne=scan.nextInt();
                System.out.println("Side 2");
                int sideTwo=scan.nextInt();
                System.out.println("Side 3");
                int sideThree=scan.nextInt();

                Triangles userInput=new Triangles(sideOne,sideTwo,sideThree);

                Triangles[] triangles={userInput};

                for(Triangles triangle:triangles){

                    if(triangle.typeOfTriangle(sideOne,sideTwo,sideThree).equals("Equilateral")){
                        System.out.println("Your triangle is " + triangle.mShape);
                    }
                    else if(triangle.typeOfTriangle(sideOne,sideTwo,sideThree).equals("Isosceles")){
                        System.out.println("Your triangle is " + triangle.mShape);
                    }
                    else if(triangle.typeOfTriangle(sideOne,sideTwo,sideThree).equals("Scalene")){
                        System.out.println("Your triangle is " + triangle.mShape);
                    }
                    System.out.println("---------------------------------------");
                }

            }
            else if (navigate.equals("Exit")){
                run=false;
            }
        }


    }
}