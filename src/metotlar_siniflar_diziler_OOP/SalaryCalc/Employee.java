package metotlar_siniflar_diziler_OOP.SalaryCalc;

public class Employee {
    String name;
    int salary;//maas
    int workHours;//haftalik calisma saati
    int hireYear;//ise giris yili

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    /*
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
     */
    int tax(Employee worker){
        int taxx;

        if (worker.salary < 1000)
            taxx = 0;
        else
            taxx = worker.salary*3/100;

        return taxx;
    }

    /*
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
    fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
     */
    int bonus(Employee worker){
        int bonus = 0;

        if (worker.workHours > 40)
            bonus = 30 * (workHours - 40);
        return bonus;
    }

    /*
    Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
    Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
     */
    int raiseSalary(Employee worker){
        int zam;
        int calismaYili = 2021 - worker.hireYear;

        if ( calismaYili < 10)
            zam = worker.salary*5/100;
        else if(calismaYili > 9 && calismaYili < 20)
            zam = worker.salary*10/100;
        else
            zam = worker.salary*15/100;

        return zam;
    }

    //Calisana ait tum bilgileri yazdirma
    void toString(Employee worker){
        System.out.println("Adı: " + worker.name);
        System.out.println("Maaşı: " + worker.salary);
        System.out.println("Çalışma saati: " + worker.workHours);
        System.out.println("Başlangıç yılı: " + worker.hireYear);
        System.out.println("Vergi: " + worker.tax(worker));
        System.out.println("Bonus: " + worker.bonus(worker));
        System.out.println("Maaş artışı: " + worker.raiseSalary(worker));

        int vMaas =  worker.salary - worker.tax(worker);
        int vBMaas = vMaas + worker.bonus(worker);
        System.out.println("Vergi ve bonuslarla birlikte maas: " + vBMaas);
        int tMaas = vBMaas + worker.raiseSalary(worker);
        System.out.println("Toplam maas: " + tMaas);
    }

}
