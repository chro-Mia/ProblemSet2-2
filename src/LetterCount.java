import java.util.Scanner;
public class LetterCount
{
    public static void main(String[] args){

        String string1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string:");
        String string = input.nextLine();
        string = string.toLowerCase();
        System.out.println("Letter:\tNumber Found:");

        /*
        main logic loop
        the loop will run until every character in the string is counted
        the inner loop will create a new string that excludes the first instance of the character to be removed
        this increments the counter
        the loop repeats until all the characters of one type have been removed
        once the loop is done, we print the character and the number of times it appeared
        repeat until all characters have been counted
        */
        while(string.length() != 0){

            String removedChar = string.substring(0, 1);
            int timesRemoved = 0;

            while(string.indexOf(removedChar) != -1)
            {

                //removedChar at index 0 would cause unintended behavior, so there is a special case for that
                if(string.indexOf(removedChar) == 0){
                    string1 = string.substring(1, string.indexOf(removedChar) + 1);
                }
                else{
                    string1 = string.substring(0, string.indexOf(removedChar));
                }
                String string2 = string.substring(string.indexOf(removedChar) + 1);
                string = string1 + string2;
                timesRemoved++;
            }
            if (string.indexOf(removedChar) == -1){
                System.out.println(removedChar + "\t\t" + timesRemoved);
            }
        }
    }
}
