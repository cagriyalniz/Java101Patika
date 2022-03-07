
import java.util.Scanner;

public class AtmProjesi {
        public static void main(String[] args) {
            String userName, password;
            Scanner input = new Scanner(System.in);
            int right = 3;
            int balance = 1500;
            int select;
            while (right > 0) {
                System.out.print("Kullanıcı Adı :");
                userName = input.nextLine();
                System.out.print("Şifre : ");
                password = input.nextLine();

                if (userName.equals("cagri") && password.equals("123")) {
                    System.out.println("Hoşgeldiniz!");
                    do {
                        System.out.println("1-Para yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = input.nextInt();
                        if (select == 1) {
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                        } else if (select == 2) {
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                        } else if (select == 3) {
                            System.out.println("Bakiyeniz : " + balance);
                        }
                    } while (select != 4);
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                } else {
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Hakkınız : " + right);
                    }
                }
            }


            System.out.println("-----ODEV-----");

            String uName, passw;
            Scanner inp = new Scanner(System.in);
            int rig = 3;
            int money = 1500;
            int sel;
            while (rig > 0) {
                System.out.print("Kullanıcı Adı :");
                uName = inp.nextLine();
                System.out.print("Şifre : ");
                passw = inp.nextLine();

                if (uName.equals("cagri") && passw.equals("123")) {
                    System.out.println("Switch- Case Bankasına Hoşgeldini!");
                    do {
                        System.out.println("1-Para yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        sel = input.nextInt();

                        switch (sel)
                        {
                            case 1:
                                System.out.print("Para miktarı : ");
                                int price = input.nextInt();
                                money += price;
                                break;
                            case 2:
                                System.out.print("Para miktarı : ");
                                price = input.nextInt();
                                if (price > money) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    money -= price;
                                }
                                break;
                            case 3:
                                System.out.println("Bakiyeniz : " + money);
                                break;
                            case 4:
                                System.out.println("Tekrar görüşmek üzere.");
                                break;
                        }
                    } while (sel != 4);
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                } else {
                    rig--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Hakkınız : " + rig);
                    }
                }
            }
        }
}
