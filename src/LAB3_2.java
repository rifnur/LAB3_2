import java.util.Random;
import java.util.Scanner;

public class LAB3_2 {
    public static void main(String[] args) {
        String text= massiv();
        game(text);
       }
    static String massiv (){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int chislo = random.nextInt(words.length);
        String fruit =words[chislo];
        return fruit;
        }
    static void game ( String massiv){
        Scanner nom = new Scanner(System.in);
        String copyFruit = massiv.charAt(0) + "" + massiv.charAt(1);
        System.out.println("Угадайти загаданное слово. Слово начинается " + copyFruit + "############");
        String a = nom.next();
        gameStr(massiv,a) ;
    }
    static void gameStr ( String fruit, String ugadai) {
        while (fruit.equals(ugadai) == false) {
            String copyFruit = fruit.charAt(0) + "" + fruit.charAt(1);
                Scanner nom = new Scanner(System.in);
                System.out.println("Угадайти загаданное слово. Слово начинается " + copyFruit + "############");
                String a = nom.next();
                if (fruit.equals(a) == true) {
                    System.out.println("Вы угадали");
                    break;
                }
        } System.out.println("Вы угадали");
    }
}
