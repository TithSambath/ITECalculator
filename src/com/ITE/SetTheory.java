package com.ITE;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class SetTheory {
    // Complement:
    Scanner scan = new Scanner(System.in);
    ArrayList<String> setA = new ArrayList<String>();
    ArrayList<String> setB = new ArrayList<String>();

    // create interface:
    public interface UnionHelper {
        ArrayList<String> Union = new ArrayList<>();
        void unionOperation();
        void Display();
    }

    public interface IntersectionHelper {
        ArrayList<String> Intersection = new ArrayList<>();
        void intersectionOperation();
        void Display();
    }

    public interface SetDifferenceHelper {
        ArrayList<String> SetDifference = new ArrayList<>();
        void differenceOperation();
        void Display();
    }

    // Method: Create Set
        void createSet() {
        String Element = null;
        int startIndex = 0;
        int endIndex = 0;

        // create set A
            // Set value for Set A:
                System.out.print("A: ");
                StringBuilder element = new StringBuilder(scan.next());
            for (int i = 0; i < element.length(); i++) {
                endIndex = i;
                if (element.charAt(i) == ',') {
                    Element = element.substring(startIndex, endIndex); // Cut string ex: 10,11 to 10 and 11
                    startIndex = endIndex + 1;
                    setA.add(Element);

                } else if (i == element.length() - 1) {
                    Element = element.substring(startIndex);
                    setA.add(Element);
                    // reset value:
                    startIndex = 0;
                    endIndex = 0;
                    element.setLength(0);
                }
            }
            System.out.print("Set A: ");
            System.out.println(setA);
        // create set B
            // Set value for Set B:
                System.out.print("B: ");
                element.append(scan.next());
            for (int i = 0; i < element.length(); i++) {
                endIndex = i;
                if (element.charAt(i) == ',') {
                    Element = element.substring(startIndex, endIndex); // Cut string ex: 10,11 to 10 and 11
                    startIndex = endIndex + 1;
                    setB.add(Element);

                } else if (i == element.length() - 1) {
                    Element = element.substring(startIndex);
                    setB.add(Element);
                    // reset value:
                    startIndex = 0;
                    endIndex = 0;
                    element.setLength(0);
                }
            }
            System.out.print("Set B: ");
            System.out.println(setB);
    }

    // Union:
        class SetUnion implements UnionHelper {
        @Override
        public void unionOperation() {
            // Implement the methodology:
                Union.addAll(setA);
            for (String s : setB) {
                if (!Union.contains(s)) {
                    Union.add(s);
                }
            }
        }
        @Override
        public void Display() {
            System.out.println("Union: " + Union);
        }
    }
        void Union(){
            SetUnion setUnion = new SetUnion();

            // Create set:
                createSet();
                setUnion.unionOperation();
                setUnion.Display();
        }

    // Intersection:
        void intersection(){
            class setIntersection implements IntersectionHelper{
                @Override
                public void intersectionOperation() {
                    for (String Element_of_thisSetA: setA){
                        if (setB.contains(Element_of_thisSetA)){
                            Intersection.add(Element_of_thisSetA);
                        }
                    }
                }

                @Override
                public void Display() {
                    System.out.println("Intersection: " + Intersection);
                }

            }
            setIntersection SetIntersection = new setIntersection();
            // Create set:
                createSet();
            // Implement intersection:
                SetIntersection.intersectionOperation();
                SetIntersection.Display();
        }
    // Set Difference:
        void setDiff(){
            SetDifferenceHelper setDifference = new SetDifferenceHelper() {
                int option;
                @Override
                public void differenceOperation() {
                    System.out.println("Menu: ");
                    System.out.println("    1. Set Difference of A: Set(A - B)");
                    System.out.println("    2. Set Difference of A: Set(B - A)");
                    option = scan.nextInt();
                    switch (option){
                        case 1: for (String Element_of_thisSetA: setA){
                                    if (!setB.contains(Element_of_thisSetA)){
                                        SetDifference.add(Element_of_thisSetA); // Set A - Set B
                                    }
                                }break;
                        case 2: for (String Element_of_thisSetB: setB){
                                    if (!setA.contains(Element_of_thisSetB)){
                                        SetDifference.add(Element_of_thisSetB); // Set B - Set A
                                    }
                                }break;
                    }
                }

                @Override
                public void Display() {
                    if (option == 1){
                        System.out.println("Set Difference of A: " + SetDifference);
                    }else if(option == 2){
                        System.out.println("Set Difference of B: " + SetDifference);
                    }
                }
            };
            // Create Set:
                createSet();
                setDifference.differenceOperation();
                setDifference.Display();
        }

    // Called Set Operation Method:
        void calledSetOperation(int Option){
            switch (Option){
                case 1: Union();break;
                case 2: intersection();break;
                case 3: setDiff();break;
            }
        }
}
