public class Main {
    public static void main(String[] args) {
        //Задание 1

        int clientOS=0;
        int ios=0;
        int android=1;
        if(clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
         if(clientOS==1){System.out.println("Установите версию приложения для Android по ссылке");}


         //Задание 2
        int clientDeviceYear=2013;
        int clientOSS=1;
        int iosF=0;
        int androidF=1;
        if(clientDeviceYear<2015&&clientOSS==0){System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
         if(clientDeviceYear<2015&&clientOSS==1){System.out.println("Установите облегченную версию приложения для Android по ссылке");}
         if(clientDeviceYear>=2015&&clientOSS==0){System.out.println("Установите версию приложения для iOS по ссылке");}
        if(clientDeviceYear>=2015&&clientOSS==1){System.out.println("Установите версию приложения для Android по ссылке");}













    }
}