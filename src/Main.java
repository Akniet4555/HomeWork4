import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 имен для списка А");
        a.add(scanner.nextLine());a.add(scanner.nextLine());
        a.add(scanner.nextLine());a.add(scanner.nextLine());
        a.add(scanner.nextLine());System.out.println(a.toString());


        ArrayList<String> b = new ArrayList<>();
        scanner = new Scanner(System.in);
        System.out.println("Введите 5 имен для списка B");
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        System.out.println(b.toString());




        ArrayList<String> c = new ArrayList<>();
        Collections.reverse(b);for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));    c.add(b.get(i));}
        System.out.println(c);System.out.println("---------------------");
        StringComparator stringComparator = new StringComparator();
        Collections.sort(c, stringComparator);System.out.println(c);


    }
}