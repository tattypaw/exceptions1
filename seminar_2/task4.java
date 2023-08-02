/*Разработайте программу, которая выбросит Exception, когда пользователь вводит 
пустую строку. Пользователю должно показаться сообщение, что пустые строки 
вводить нельзя.
 */

import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reader;
        System.out.print("Введите текст: ");
        reader = sc.nextLine();
        if(reader.equals("")) {
            sc.close();
            throw new RuntimeException("Пустую строку вводить нельзя");
        } 
        System.out.println("Вы ввели: " + reader);
        sc.close();

    }    
}
