import java.util.Scanner;
public class home{
    public static void main(String[] args) {
        System.out.println("Hi there I am Gonna Remind Of Your Tasks");
        System.out.println("Do you want to continue 1.Yes 2.No");
        Scanner input  = new Scanner(System.in);
        int utily = input.nextInt();
        if ( utily == 2 ){
            System.exit(0);
        }
        else{
            System.out.println("Do you Want To \n1>add a Task\n2>Remove a task\n3>Display all Tasks");
            int choice2 = input.nextInt();
            if ( choice2 == 1 ){
                task b = new task();
                b.create();
            }
            if ( choice2 == 2){
                RemoveTask c = new RemoveTask();
                c.Remove();
            }
            if (choice2 == 3){
                Display d = new Display();
                d.Open();
            }
        }

    }
}