
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.*;



public class Task2 {
    public static void main(String[] args)  {

        List<Integer> list = new ArrayList<Integer>();
     
        for (int i = 0; i < new Random().nextInt(1,100); i++) {
            list.add(new Random().nextInt(-100,100));
            
        }
        System.out.printf("Исходный список имеет следующий вид:\n%s\n", list);

        Iterator<Integer> itr = list.iterator();
        
        while (itr.hasNext()) {
        if (itr.next()%2 == 0){
            itr.remove();
        }
    }

        System.out.printf("Список , из которого были удалены четные числа,имеет следующий вид:\n%s\n", list);
    }
}
