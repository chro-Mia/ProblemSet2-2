import java.util.Scanner;
public class LetterCount
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string:");
        String string = input.nextLine();
        string = string.toLowerCase();
        System.out.println("Letter:\tNumber Found:");

        /*
        main logic loop
        this loop runs for however long the string is
        the loop takes the character at the index it's currently at and checks it against all characters in the string
        repeat until all characters have been counted
        */

        for(int i = 0; i < string.length(); i++){

            int instances = 0;
            String checkerChar = string.substring(i, i + 1);

            for(int j = 0; j < string.length(); j++){
                String checkedChar = string.substring(j, j + 1);
                if(checkerChar.equals(checkedChar)){
                    instances++;
                }
            }

            System.out.println(checkerChar + "\t" + instances);
        }
    }
}
