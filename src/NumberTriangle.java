import java.util.Scanner;
public class NumberTriangle
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Should the numbers be determined by row or column (r/c)?: ");
        String choice = input.nextLine();
        System.out.print("\nHow many rows do you want to print?: ");
        int rows = input.nextInt();
        System.out.println("\n");

        for(int i = 1; i <= rows; i++){
            for(int j = 1;j <= i; j++){
                if(choice.equals("r")){
                    System.out.print(i);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
