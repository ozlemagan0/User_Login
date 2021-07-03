import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, passWord, answer, newPass;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username:");
        userName = sc.nextLine();

        System.out.print("Enter password:");
        passWord = sc.nextLine();

        if((userName.equals("patika")) && (passWord.equals("java"))) {
            System.out.print("Login successfull!");
        }
            else {
                System.out.print("Login fail!");
            }
        if(passWord!="java") {
            System.out.print("\nWould you like to reset your password?\n Please enter YES or NO\n");
            answer = sc.nextLine();
            boolean aw = (answer.equals("YES"));
            String str = aw ? "Please enter new password:" : "Your password has not been changed.";
            System.out.print(str);
            newPass=sc.nextLine();
            System.out.print("Your password has been created.");

           }
        }
        }


