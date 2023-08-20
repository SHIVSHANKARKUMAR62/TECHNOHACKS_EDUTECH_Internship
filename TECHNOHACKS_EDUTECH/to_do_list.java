package TECHNOHACKS_EDUTECH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LL{
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String name;
    public void addList(){
        System.out.print("Enter name: ");
        name = sc.nextLine();
        list.add(name);
    }
    public void removeList(){
        System.out.print("Enter name: ");
        name = sc.nextLine();
        list.remove(name);
    }
    public void display(){
        System.out.print("Items are: ");
        for (String s : list) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}

class Dishp{

    public void dis(){
        int s;
        LL l = new LL();
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("1.Add\n2.Remove\n3.Display\nEnter Your Choice: ");
            int n = sc.nextInt();

            switch (n){

                case 1->
                    l.addList();
                case 2->
                    l.removeList();
                case 3->l.display();

            }

            System.out.print("Enter one to take more value for calculation otherwise press other number: ");
            s = sc.nextInt();

        }while (s==1);

    }

}

public class to_do_list {
    public static void main(String[] args) {
        Dishp display = new Dishp();
        display.dis();
    }
}
