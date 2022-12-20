import java.util.Arrays;
public class SortingPersons
{
    public static void main(String[] args){
        Person [] people = {
                new Person("Sam",1972),
                new Person("Linda", 1974),
                new Person ("Mary", 1957)};
        System.out.println("Unsorted:");
        for (Person p: people) {
            //System.out.print(p + " ");
            System.out.println(p.compareTo(new Person("Sawan", 2000)));
        }
        Arrays.sort(people);
        System.out.println("\nSorted by name:");
        for (Person p: people)
            System.out.print(p+" ");



    }
}
