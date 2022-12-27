import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите имя не менее 4 символов");
        String name = sc.nextLine();
        if (name.length() < 4)
            do {
            System.out.println("имя короткое");
                name = sc.nextLine();
                }
                while (name.length() > 4);
        System.out.println("Хорошее имя");

        System.out.println("Создайте пароль:");
        String pw = sc.nextLine();
        if (pw.length() < 8 || pw.length() > 15)
        do {
            System.out.println("Не верная длина пароля");
            pw = sc.nextLine(); }
            while (pw.length() < 8 || pw.length() > 15) ;
        System.out.println("Отличный пароль");
        System.out.printf("Ваше новое имя: %s и ваш новый пароль %s", name, pw);

    }
    }


