public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// задача1
int os = 0;
    if (os ==0) {
    } System.out.println(" Установите приложение для ios");
} else if (os ==1) {
    (System.out.println(" Установите приложение для android");
}
// задача 2
os = 1
int clientDeviseYear = 2015;
if (os == 1 && clientDeviseYear < 2015){
    System.out.println(" Установите облегченную версию приложения для android ");
} else if (os ==1 && clientDeviseYear >= 2015){
    System.out.println(" Установите обычную версию приложения для android ");
} else if (os == 0 && clientDeviseYear <= 2015){
    System.out.println(" Установите облегченную версию приложения для ios ");
} else if (os == 0 && clientDeviseYear >= 2015){
    System.out.println(" Установите обычную версию приложения для ios ");
}
// задача 3
int year = 2021;
if (year > 1584 && ((year %  4 == 0 && year  % 100 > 0) || year % 400 == 0)){
    System.out.println( year + "год является високосным ");
} else {
    System.out.println( year + "год не является високосным ");
}
// задача 4
int deliveryDistance = 95;
if (deliveryDistance <= 20){
    System.out.println(" Потребуется дней " + 1);
} else if (deliveryDistance > 20 && <= 60) {
    System.out.println(" Потребуется дней " + 2);
} else if (deliveryDistance > 60 && <= 100){
    System.out.println(" Потребуется дней " + 3);
} else {
    System.out.println(" Доставки нет ");
}
// задача 5
int mn = 12;
switch (mn){
        case 12:
        case 1:
        case 2:
        System.out.println(" Зима ");
        break;
        case 3:
        case 4:
        case 5:
         System.out.println(" Весна ");
        break;
        case 6:
        case 7:
        case 8:
                System.out.println(" Лето ");
        break;
        case 9:
        case 10:
        case 11:
                System.out.println(" Осень ");
        break;
default:
        System.out.println(" Неверный номер месяца ");
}
        }