public class Question02 {
    public static void main(String[] args) {
//1’den 20’ye kadar olan sayıların toplamını bulma programı

        int toplam = 0;
        int i = 0;
        while (i < 21) {
            toplam = toplam + i;
            i++;
    }
        System.out.println("toplam : " + toplam);  // yazdırmayı while dögüsünün dışına yazmalıyız
}
}
// toplam değeri ilk önce  0 dır. sonra i =1
// eklenerek en son soldaki toplam değeri her i değerinde
// artarak yani toplayarak gider
