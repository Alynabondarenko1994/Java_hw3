// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.*;
public class Task3 {
    public static void main(String[] args)  {
        ArrayList<Integer> list = new ArrayList<Integer>();
     
        for (int i = 0; i < new Random().nextInt(1,100); i++) {
            list.add(new Random().nextInt(-100,100));
            
        }
        System.out.printf("Исходный список имеет следующий вид:\n%s\n", list);
        
        list.sort(Comparator.naturalOrder());
        int min = list.get(0);
        int max = list.get(list.size()-1);
        int sum = 0;
        for (int i: list) {
            sum += i;
            }
        double ave=(double)sum/list.size();
       
        System.out.printf("Отсортированный список имеет следующий вид:\n%s\n", list);
        System.out.printf("Минимальное число из списка следующее:\n%s\n", min);
        System.out.printf("Максимальное число из списка следующее:\n%s\n", max);
        System.out.printf("Среднее арифмитическое:\n%s\n", ave);

    }
    
}
