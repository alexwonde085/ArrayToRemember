import java.util.Scanner;

public class ArrayRemember {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        String [] names={"Johnson", "Nixon","Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama", "Trump"};
        System.out.println("Enter Your word:'history'");
        String str=input.nextLine();
        if(str.equals("history")){
            for (int i=names.length-1;i>=0;i--){
                System.out.print(names[i]+ "  ");
            }
        }
    }
}
