/* ad211.cheban */
import java.util.Scanner; /* використовуємо для зчитування інфорції, введеної користувачем*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву: "); /* заповнюємо масив */
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введіть число: ");
            array[i] = sc.nextInt();
        }
        System.out.println(isSorted(array)); /* виводимо результат */
    }
        private static boolean isSorted(int[] array) { /* порівнюємо числа та знаходио результат для виведення */
            if(array.length>=2) {
                boolean flag = false;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i+1]>=array[i]) {
                        flag = true;
                    }
                    else {
                        flag=false;
                        break;
                    }
                }
                return flag;
            }
            return false;
        }
}