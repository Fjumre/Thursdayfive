package TaskTwo;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cafe<function> {
        public void cafe {
        function loadMenuData() {
        File file = new File("coffees.txt");
    }
            try {
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    coffeeMenu.add(sc.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Check path and filename");
            }

        for (Scanner sc = file.scanner(); sc.hasNext();) {
            System.out.println("The coffees available are: " + sc.get(0));
            System.out.println(sc.next());
        }
        }
    }