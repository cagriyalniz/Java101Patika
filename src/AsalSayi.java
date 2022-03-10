//1 ile 100 arasindaki asal sayilari ekrana yazdiran program
public class AsalSayi {

    public static void Asal(int nmb){
        int j = 2, flag = 1;
        while(j < nmb){
            if (nmb % j == 0){
                flag = 0;
                break;
            }
            j++;
        }
        if (flag == 1) {
            System.out.println(nmb + "sayisi asaldir");
        }
    }

    public static void main(String[] args) {

        int i = 2, j = 0;

        while(i <= 100){
            Asal(i);
            i++;
        }


    }
}
