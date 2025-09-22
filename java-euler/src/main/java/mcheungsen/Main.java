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
            int start = ((problemNumber - 1) / 10) * 10 + 1;
            int end = start + 9;
            String className = "mcheungsen.pb"+start+"to"+end+".Problem" + problemNumber;
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