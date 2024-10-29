import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.util.Random;
import java.io.PrintWriter;
public class Merge {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        OrderedList<String> randomNames = new OrderedList<>();//this will be the list of all names
        OrderedList<String> list1 = new OrderedList<>();//this will be the list of all names
        OrderedList<String> list2 = new OrderedList<>();//this will be the list of all names to compare with

        File file = new File("src/RandomNames.txt");//creates the file object (so we can read it)
        Scanner fileScanner = new Scanner(file);
        //above is instantiation + setup

        while (fileScanner.hasNextLine()) {
            randomNames.insert(fileScanner.nextLine());
        }//this creates the list of all names

        System.out.println("Input an integer between 1000 and 1500.");
        int n1 = keyboard.nextInt();
        while (list1.size() < n1) {
            //i had to trial and error this loop for like 3 hours sorry if its ugly TA
            //it must be a while loop because a for loop could run over the same index multiple times and skip it
            int randomIndex = (int) (Math.random() * 2000);
            if (list1.binarySearch(randomNames.get(randomIndex)) < 0) {
                list1.insert(randomNames.get(randomIndex));
            }
        }//creates list1

        System.out.println("Input an integer between 1000 and 1500.");
        int n2 = keyboard.nextInt();
        while (list2.size() < n2) {
            int randomIndex = (int) (Math.random() * 2000);
                if (list2.binarySearch(randomNames.get(randomIndex)) < 0) {
                    list2.insert(randomNames.get(randomIndex));
                }//creates list2
            }//creates list2

        PrintWriter method1 = new PrintWriter("merge.txt");
        method1.println("Merged lists: ");
        OrderedList<String> result1=merge(list1,list2);
        for(int i=0;i<result1.size();i++){
            method1.print(result1.get(i)+" ");
        }//prints merged list
        method1.close();

        PrintWriter method2 = new PrintWriter("common.txt");
        method2.println("Names in common: ");
        OrderedList<String> result2=common(list1,list2);
        for(int i=0;i<result2.size();i++){
            method2.print(result2.get(i)+" ");
        }//prints common list
        method2.close();

        PrintWriter method3 = new PrintWriter("difference.txt");
        method3.println("Names that aren't shared between lists: ");
        OrderedList<String> result3=difference(list1,list2);
        for(int i=0;i<result3.size();i++){
            method3.print(result3.get(i)+" ");
        }//prints difference list
        method3.close();

    }

    public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> list3 = new OrderedList<T>();
        int f1 = 0;
        int f2 = 0;
        while (f1 < list1.size() && f2 < list2.size()) {
            if (list1.get(f1).compareTo(list2.get(f2)) < 0) {
                list3.insert(list1.get(f1));
                f1++;
            } else if (list1.get(f1).compareTo(list2.get(f2)) < 0) {
                list3.insert(list2.get(f2));
                f2++;
            } else {
                list3.insert(list1.get(f1));
                f1++;
                f2++;
            }
        }

        if (f1 == list1.size()) {
            while (f2 != list2.size()) {
                list3.insert(list2.get(f2));
                f2++;
            }
        }//add rest of l2 to l3
        if (f2 == list2.size()) {
            while (f1 != list1.size()) {
                list3.insert(list1.get(f1));
                f1++;
            }
        }//add rest of l1 to l3
        return list3;
    }

    public static <T extends Comparable<T>> OrderedList<T> common(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> list3 = new OrderedList<T>();
        int f1 = 0;
        int f2 = 0;
        while (f1 < list1.size() && f2 < list2.size()) {

            if (list1.get(f1).compareTo(list2.get(f2)) == 0) {
                list3.insert(list1.get(f1));
                f1++;
                f2++;
            }//items are ==
            else if (list1.get(f1).compareTo(list2.get(f2)) < 0) {
                f1++;
            }//item f1 is before f2
            else if (list1.get(f1).compareTo(list2.get(f2)) > 0) {
                f2++;
            }//item f2 is before f1
            else {
                f1++;
                f2++;
            }
        }
        return list3;
    }

    public static <T extends Comparable<T>> OrderedList<T> difference(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> list3 = new OrderedList<T>();
        int f1 = 0;
        int f2 = 0;
        while (f1 < list1.size() && f2 < list2.size()) {
            if (list1.get(f1).compareTo(list2.get(f2)) < 0) {
                list3.insert(list1.get(f1));
                f1++;
            }//pointer for f2 has advanced beyond where it could be in list1
            else if (list2.get(f2).compareTo(list1.get(f1)) < 0) {
                list3.insert(list2.get(f2));
                f2++;
            }//pointer for f1 has advanced beyond where it could be in list2
            else {
                f1++;
                f2++;
            }
        }
        if (f1 == list1.size()) {
            while (f2 != list2.size()) {
                list3.insert(list2.get(f2));
                f2++;
            }
        }//add rest of l2 to l3
        if (f2 == list2.size()) {
            while (f1 != list1.size()) {
                list3.insert(list1.get(f1));
                f1++;
            }
        }//add rest of l1 to l3
        return list3;
    }
}