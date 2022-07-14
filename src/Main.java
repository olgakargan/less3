

     public class Main {
         public static void main(String[] args) {

             //Задание1

             int clientIOS = 0;
             int clientAndroid = 1;

             if (clientIOS == 0 && clientAndroid == 1) {
             }
             {
                 System.out.println("Install the iOS version of the app by following the link");
                 System.out.println("Install the android version of the app by following the link");
             }

             //Задание2
             int clientDeviceYearIOS = 2015;
             int clientDeviceYearAndroid = 2015;

             if (clientDeviceYearIOS <= 2015 || clientDeviceYearAndroid <= 2015) {

             }
             System.out.println("Install thlite version of the Android app by following the link");
             System.out.println("Install the lite version of the IOS app by following the link");


             if (clientDeviceYearIOS > 2015 || clientDeviceYearAndroid > 2015) {

             }
             System.out.println("Install the Android app by following the link");
             System.out.println("Install the IOS app by following the link");


             // задание 5

             int montNovember = 5;
             switch (montNovember) {
                 case 12:
                 case 1:
                 case 2:
                     System.out.println(" Winter! 1");
                     break;
                 case 3:
                 case 4:
                 case 5:
                     System.out.println(" Spring! 2");
                     break;
                 case 6:
                 case 7:
                 case 8:
                     System.out.println(" Summer! 3");
                     break;
                 case 9:
                 case 10:
                 case 11:
                     System.out.println(" Autumn! 4");
                     break;
                 default:
                     System.out.println(" there is no such month!");

             }

             //Задание 3
             int year = 2021;
             switch (year) {
                 case 2021:
                 case 2022:
                 case 2023:
                     System.out.println("the year is not a leap year");
                 case 2024:
                     System.out.println("the year is  a leap year");
                 default:
                     System.out.println("the year is not");
             }

             // Задание 4
             int deliveryDistance = 95;
             if (deliveryDistance <= 20) {
                 System.out.println(" deliveryDistance 1 day!");
             } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                 System.out.println(" deliveryDistance 2 day!");
             } else {
                 System.out.println(" deliveryDistance 3 day!");
             }


             //
         }
     }







