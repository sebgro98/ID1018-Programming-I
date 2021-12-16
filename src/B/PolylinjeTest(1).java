package B;
import java.io.PrintWriter;
import java.lang.System.*;
import java.util.*;

import B.Polylinje.PolylinjeIterator;

public class PolylinjeTest {

    public static void main (String[] args) {
            Scanner in = new Scanner(System.in);

            Punkt p1 = new Punkt("A", 3, 4);
            Punkt p2 = new Punkt("B", 5, 6);
            Punkt p3 = new Punkt("C", 8, 2);
            Punkt p4 = new Punkt("D", 4, 1);
            Punkt p5 = new Punkt("E", 7, 9);
            System.out.println(p1 + " " + p2 + " " + p3);
            System.out.println();

            // skapa polylinje objects
            Punkt[] pointVec = {p1, p2, p3};
            Polylinje pol1 = new Polylinje(pointVec);

            // Test get och set färg metoder
            System.out.println("Current colour is: " + pol1.getFarg());
            System.out.print("Enter new colour: ");
            pol1.setFarg(in.next());
            System.out.println("Current colour is: " + pol1.getFarg());
            System.out.println();

            // Test get och set bredd metoder
            System.out.println("Current width is: " + pol1.getFarg());
            System.out.print("Enter new width: ");
            pol1.setBredd(in.nextInt());
            System.out.println("Current width is: " + pol1.getFarg());
            System.out.println();

            // Return polylinje längd
            System.out.println("Polyline length: " + pol1.langd());
            System.out.println();


            System.out.println("Adding point D at the end");
            pol1.laggTill(p4);
            System.out.println(pol1);
            System.out.println();

            System.out.println("Adding point E before C");
            pol1.laggTillFramfor(p5, "C");
            System.out.println(pol1);
            System.out.println();

            System.out.println("Removing point D");
            pol1.taBort("B");
            System.out.println(pol1);
            System.out.println();
         
         Polylinje.PolylinjeIterator polyIter = p1.new PolylinjeIterator();
         while (polyIter.finnsHorn()) {
             System.out.println(polyIter.horn());
             polyIter.gaFram();
         }
     }   
 }
