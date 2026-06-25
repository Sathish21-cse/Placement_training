package Data_Structures.Queues;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue q=new queue();

while(true) {
    System.out.println("Enter the option");
    System.out.println("1.enqueue");
    System.out.println("2.dequque");
    System.out.println("3. dispaly");
    System.out.println("4.exit");

    int s = sc.nextInt();
    switch (s) {
        case 1: {
            int data = sc.nextInt();
            q.enqueue(data);
            break;

        }
        case 2: {
            q.dequeue();
            break;
        }
        case 3: {
            q.dispaly();
            break;
        }
        case 4: {
            System.exit(0);
            break;
        }
    }
}


    }
}
