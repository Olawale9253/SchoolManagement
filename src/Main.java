import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // if Statement

        /**   int age = 5;
         if (age == 18 || age >= 18) {
         System.out.println("I am an adult");
         } else if (age >= 17) {
         System.out.println("I am almost an adult");
         }
         else {
         System.out.println("I am not an adult");
         }

         // Switch case

         String gender = "Female";
         switch (gender){
         case "Male":
         System.out.println("Male");
         break;
         case "Female":
         System.out.println("Female");
         break;
         case "Other":
         System.out.println("Other");
         break;
         default:
         System.out.println("prefer not say");
         }



         // Arrays

         String [] names =  {"Olawale", "John", "Doe"};
         System.out.println(Arrays.toString(names));
         System.out.println(names.length);

         //        names[0] = "John";
         //        names[1] = "Jane";
         //        names[2] = "Doe";
         //        names[3] = "Jack";
         //        names[4] = "Jane";
         //        System.out.println(names[0]);

         /** int [] numbers = {21, 16, 20, 43, 5};
         System.out.println(Arrays.toString(numbers));

         Arrays.stream(numbers).forEach(System.out::println);
         Arrays.stream(names).forEach(System.out::println);

         for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i]);

         for (int number : numbers) {
         System.out.println(number);
         }
         }

         // break//

         String [] name = {"John", "Doe", "Olawale", "Ali"};
         for (String names : name){
         if (names.equals("Olawale")){
         break;
         }
         System.out.println(names);
         }


         // while Loop
         int count = 0;
         while (count <= 20){
         System.out.println("count: " + count);
         count++;
         }

         */
        // Scanner//
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age < 18) {
            System.out.println("and you are not an adult");
        } else {
            System.out.println("and you are an adult :)");
        }
    }
}


    // Methods//
/**

        char[] letters = {'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'F', 'F'};
        int count = countOccurences(letters, 'B');
        System.out.println(count);
    }
    public static int countOccurences(char[] letters, char searchLetters) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetters) {
                count++;
            }
        }
        return count;
    }


 */
