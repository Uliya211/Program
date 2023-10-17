import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите наименование товара: ");
        String name=scanner.nextLine();
        System.out.print("Введите количество: ");
        int kol=scanner.nextInt();
        System.out.print("Введите Ваш телефон: ");
        scanner.nextLine();
        String tel=scanner.nextLine();
        System.out.print("Введите адрес: ");
        String adr=scanner.nextLine();
        System.out.println("Ваш заказ принят.\n Товар " + name + " в количестве " + kol +
                " прибудет к вам в ближайшее время. \n Товар доставим по адресу: " + adr +". \n " +
                        "Ваш контактный номер: " + tel);

        scanner.close();


    }
}