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
      System.out.println();

        //Задание 4
        int deliveryDistance = 1;
        if(deliveryDistance>=0&&deliveryDistance<=20){System.out.println("Потребуется один день");}
        else if (deliveryDistance>20&&deliveryDistance<=60){System.out.println("Потребуется два дня");}
        else if (deliveryDistance>60&&deliveryDistance<=100){System.out.println("Потребуется три дня");}
        else {System.out.println("Сюда не доставляем");}

        //Задание 5
        int monthNumber = 0;
        switch (monthNumber){
            case 12:
            case 2:
            case 1:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
                case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        System.out.println("Такого месяца нет");}





    }
}