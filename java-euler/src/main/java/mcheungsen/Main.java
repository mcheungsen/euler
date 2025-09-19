package mcheungsen;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        launch();
    }

    public static void launch(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Numéro du problème à résoudre : ");

            int problemNumber = sc.nextInt();
            if(problemNumber == -1){
                System.out.println("Exit");
                break;
            }
            String className = "mcheungsen.pb1to50.Problem" + problemNumber;
            try {
                Class<?> problemClass = Class.forName(className);
                Problem problem = (Problem) problemClass.getDeclaredConstructor().newInstance();
                System.out.println(problem.solve());
            } catch (ClassNotFoundException e) {
                System.out.println("Le problème ne semble pas exister ou n'a pas encore été résolu.");
            } catch (Exception e) {
                System.err.print(e.getMessage());
            }
        }
    }
}