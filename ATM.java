import java.util.Scanner;
public class ATM {
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        String pass,kadı;
        int hak=3,secim,bal = 0,value;
        while(hak>0){
            System.out.println("kullanıcı adınızı giriniz;");
            kadı= inp.nextLine();
            System.out.println("Şifrenizi giriniz;");
            pass= inp.nextLine();
            if(pass.equals("12345")&&kadı.equals("slckbthn")){
               do {
                   System.out.println("Bankacılık sistemine hoşgeldiniz");
                   System.out.println("Lütfen işlem seçiniz;");
                   System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye sorgulama\n" + "4-Çıkış\n");
                   secim = inp.nextInt();
                   if (secim < 1 && secim > 5) {
                       System.out.println("Lütfen belirtilen işlemlerden birini seçin");
                   }
                   switch (secim){
                   case 1:
                       System.out.println("Para Yatırma İşlemini seçtiniz.\n"+"Lütfen miktar giriniz");
                       value= inp.nextInt();
                       bal+=value;
                       break;
                       case 2:
                           System.out.println("Para çekme işlemini seçtiniz.\n"+"Lütfen miktar giriniz:");
                           value= inp.nextInt();
                           bal-=value;
                           break;
                       case 3:
                           System.out.println("Bakiye:"+bal);
                           break;
                   }
               }while(secim!=4);
               if(secim==4){
                   break;
               }
            }
            else{
                hak--;
                System.out.println("hatalı giriş yaptınız lütfen tekrar deneyin");
                System.out.println(hak+" hakkınız kaldı");
            }
            if(hak==0){
                System.out.println("hesabınız bloke edilmistir");
            }

        }
    }
}
