package atrofimovich.Lesson6.TaskC1;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Введите параметры каждой собаки (кличку, возраст, вес и силу укуса):");
        Scanner sc = new Scanner(System.in);

        String dg1 = sc.nextLine();
        int dgsz1 = sc.nextInt();
        int wghtdg1 = sc.nextInt();
        double pwrdg1 = sc.nextDouble();

        String dg2 = sc.nextLine();
        int dgsz2 = sc.nextInt();
        int wghtdg2 = sc.nextInt();
        double pwrdg2 = sc.nextDouble();

        Dog sharky = new Dog();
        sharky.setSize(dgsz1);
        sharky.setName(dg1);
        sharky.setWeight(wghtdg1);
        sharky.setPower(pwrdg1);

        Dog wuffy = new Dog();
        wuffy.setSize(dgsz2);
        wuffy.setName(dg2);
        wuffy.setWeight(wghtdg2);
        wuffy.setPower(pwrdg2);
    }
}

//недоделал до конца :"(