public class Main {
    public static void main(String[] args) {
        //Задание 1

        int clientOS=1;
        int ios=0;
        int android=1;
        if(clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
         else if (clientOS==1){System.out.println("Установите версию приложения для Android по ссылке");}else {System.out.println("Ос не найдено");

        }


         //Задание 2
        int clientDeviceYear=2020;
        int clientOSS=2;
        if(clientDeviceYear<2015&&clientOSS==0){System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
         else if(clientDeviceYear<2015&&clientOSS==1){System.out.println("Установите облегченную версию приложения для Android по ссылке");}
         else if(clientDeviceYear>=2015&&clientOSS==0){System.out.println("Установите версию приложения для iOS по ссылке");}
        else if(clientDeviceYear>=2015&&clientOSS==1){System.out.println("Установите версию приложения для Android по ссылке");}else
        {System.out.println("Ваше устройство не поддерживается");}

        //Задание 3
        int year=2000;
        if (year%4==0&&year%100!=0||year%400==0){System.out.printf("Год %s является високосным ",year );}else
        {System.out.printf("Год %s не является високосным " , year);}












    }
}