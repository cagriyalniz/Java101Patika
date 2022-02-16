
/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String [] args)
    {
        String uName, passW, checkUname, checkPassw;

        Scanner inp = new Scanner(System.in);

        System.out.println("kullanici adini giriniz");
        uName = inp.nextLine();
        System.out.println("sifrenizi giriniz");
        passW = inp.nextLine();

        System.out.println("kullanıcı adi kontrolü için kullanici adini giriniz");
        checkUname = inp.nextLine();
        System.out.println("sifre kontrolü için sifrenizi giriniz");
        checkPassw = inp.nextLine();
        int uFlag = 0, pFlag = 0;
        if(uName.equals(checkUname))
        {
            System.out.println("kullanici adi dogru");
            uFlag = 1;
        }
        if(passW.equals(checkPassw))
        {
            System.out.println("sifre dogru");
            pFlag = 1;
        }
        if(uFlag == 0)
            System.out.println("kullanici adi yanlis");
        if (pFlag == 0)
            System.out.println("sifre yanlis");
    }
}
