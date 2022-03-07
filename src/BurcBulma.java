/*
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık


Ödev
Aynı örneği switch-case kullanmadan yapınız.
 */

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args)
    {
        int gun, ay;
        Scanner inp = new Scanner(System.in);

        System.out.println("kacinci ayda dogdunuz ?");
        ay = inp.nextInt();
        System.out.println("hangi gun dogdunuz");
        gun = inp.nextInt();
/*

        if (ay == 1) {
            if (gun <= 21) {
                System.out.print("burcunuz oglak");
            } else {
                System.out.print("burcunuz kova");
            }
        } else if (ay == 2) {
            if (gun <= 19) {
                System.out.print("burcunuz kova");
            } else {
                System.out.print("burcunuz balik");
            }
        } else if (ay == 3) {
            if (gun <= 20) {
                System.out.print("burcunuz balik");
            } else {
                System.out.print("burcunuz koc");
            }
        } else if (ay == 4) {
            if (gun <= 20) {
                System.out.print("burcunuz koc");
            } else {
                System.out.print("burcunuz boga");
            }
        } else if (ay == 5) {
            if (gun <= 21) {
                System.out.print("burcunuz boga");
            } else {
                System.out.print("burcunuz ikizler");
            }
        } else if (ay == 6) {
            if (gun <= 22) {
                System.out.print("burcunuz ikizler");
            } else {
                System.out.print("burcunuz yengec");
            }
        } else if (ay == 7) {
            if (gun <= 22) {
                System.out.print("burcunuz yengec");
            } else {
                System.out.print("burcunuz aslan");
            }
        } else if (ay == 8) {
            if (gun <= 22) {
                System.out.print("burcunuz aslan");
            } else {
               System.out.print("burcunuz basak");
            }
        } else if (ay == 9) {
            if (gun <= 22) {
                System.out.print("burcunuz basak");
            } else {
                System.out.print("burcunuz terazi");
            }
        } else if (ay == 10) {
            if (gun <= 22) {
                System.out.print("burcunuz terazi");
            } else {
                System.out.print("burcunuz akrep");
            }
        } else if (ay == 11) {
            if (gun <= 21) {
                System.out.print("burcunuz akrep");
            } else {
                System.out.print("burcunuz yay");
            }
        } else if (ay == 12) {
            if (gun <= 21) {
                System.out.print("burcunuz yay");
            } else {
                System.out.print("burcunuz oglak");
            }
        }
*/

        System.out.println("----------- ODEV ----------");

        switch (ay)
        {
            case 1:
                if (gun <= 21) {
                    System.out.print("burcunuz oglak");
                } else {
                    System.out.print("burcunuz kova");
                }
                break;
            case 2:
                if (gun <= 19) {
                    System.out.print("burcunuz kova");
                } else {
                    System.out.print("burcunuz balik");
                }
                break;
            case 3:
                if (gun <= 20) {
                    System.out.print("burcunuz balik");
                } else {
                    System.out.print("burcunuz koc");
                }
                break;
            case 4:
                if (gun <= 20) {
                    System.out.print("burcunuz koc");
                } else {
                    System.out.print("burcunuz boga");
                }
                break;
            case 5:
                if (gun <= 21) {
                    System.out.print("burcunuz boga");
                } else {
                    System.out.print("burcunuz ikizler");
                }
                break;
            case 6:
                if (gun <= 22) {
                    System.out.print("burcunuz ikizler");
                } else {
                    System.out.print("burcunuz yengec");
                }
                break;
            case 7:
                if (gun <= 22) {
                    System.out.print("burcunuz yengec");
                } else {
                    System.out.print("burcunuz aslan");
                }
                break;
            case 8:
                if (gun <= 22) {
                    System.out.print("burcunuz aslan");
                } else {
                    System.out.print("burcunuz basak");
                }
                break;
            case 9:
                if (gun <= 22) {
                    System.out.print("burcunuz basak");
                } else {
                    System.out.print("burcunuz terazi");
                }
                break;
            case 10:
                if (gun <= 22) {
                    System.out.print("burcunuz terazi");
                } else {
                    System.out.print("burcunuz akrep");
                }
                break;
            case 11:
                if (gun <= 21) {
                    System.out.print("burcunuz akrep");
                } else {
                    System.out.print("burcunuz yay");
                }
                break;
            case 12:
                if (gun <= 21) {
                    System.out.print("burcunuz yay");
                } else {
                    System.out.print("burcunuz oglak");
                }
                break;

        }

    }
}
