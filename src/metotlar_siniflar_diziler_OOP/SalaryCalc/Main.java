package metotlar_siniflar_diziler_OOP.SalaryCalc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("çalışanın adını giriniz");
        String name = inp.nextLine();
        System.out.println("çalışanın maaşını giriniz");
        int salary = inp.nextInt();
        System.out.println("çalışanın haftalik calisma saatini giriniz");
        int workHours = inp.nextInt();
        System.out.println("çalışanın ise baslayis yilini giriniz");
        int hireYear = inp.nextInt();
        Employee emp = new Employee(name, salary, workHours, hireYear);

        System.out.println("çalışanın yeni maaşı hesaplaniyor ...:.:.:.:.:.:.:.:.::.:.:.:.:.:.:.:.:...");
        emp.toString(emp);

    }
}
