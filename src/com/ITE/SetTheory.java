package com.ITE;

import java.util.*;

public class SetTheory {
    // Complement:
    Scanner scan = new Scanner(System.in);
    ArrayList<String> setA = new ArrayList<String>();
    ArrayList<String> setB = new ArrayList<String>();

    // create interface:
    public interface UnionHelper {
        ArrayList<String> Union = new ArrayList<>();
        ArrayList<String> unionOperation();
        void Display(ArrayList<String> union);
    }

    public interface IntersectionHelper {
        ArrayList<String> Intersection = new ArrayList<>();
        ArrayList<String> intersectionOperation();
        void Display(ArrayList<String> intersection);
    }

    public interface SetDifferenceHelper {
        ArrayList<String> differenceOperation();
        void Display(ArrayList<String> difference);
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
                    if (!setA.contains(Element)){
                        setA.add(Element);
                    }
                } else if (i == element.length() - 1) {
                    Element = element.substring(startIndex);
                    if (!setA.contains(Element)){
                        setA.add(Element);
                    }
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
                    if (!setB.contains(Element)){
                        setB.add(Element);
                    }

                } else if (i == element.length() - 1) {
                    Element = element.substring(startIndex);
                    if (!setB.contains(Element)) {
                        setB.add(Element);
                    }
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
        public ArrayList<String> unionOperation() {
            // Implement the methodology:
            for (String s : setB) {
                if (!setA.contains(s)) {
                    setA.add(s);
                }
            }
            setA.sort(Comparator.comparingInt(Integer::parseInt));
            return setA;
        }
        @Override
        public void Display(ArrayList<String> union) {
            System.out.println("Union: " + union);
            setA.clear();
        }
    }
        void Union(){
            SetUnion setUnion = new SetUnion();

            // Create set:
                createSet();
                setUnion.Display(setUnion.unionOperation());
        }

    // Intersection:
        void intersection(){
            class setIntersection implements IntersectionHelper{
                @Override
                public ArrayList<String> intersectionOperation() {
                    for (String Element_of_thisSetA: setA){
                        if (setB.contains(Element_of_thisSetA)){
                            Intersection.add(Element_of_thisSetA);
                        }
                    }
                    Intersection.sort(Comparator.comparingInt(Integer::parseInt));
                    return Intersection;
                }

                @Override
                public void Display(ArrayList<String> intersection) {
                    System.out.println("Intersection: " + intersection);
                    Intersection.clear();
                }
            }
            setIntersection SetIntersection = new setIntersection();
            // Create set:
                createSet();
            // Implement intersection:
                SetIntersection.Display(SetIntersection.intersectionOperation());
        }
    // Set Difference:
        void setDiff(){
            SetDifferenceHelper setDifference = new SetDifferenceHelper() {
                int option;
                @Override
                public ArrayList<String> differenceOperation() {
                    System.out.println("Menu: ");
                    System.out.println("    1. Set Difference of A: Set(A - B)");
                    System.out.println("    2. Set Difference of A: Set(B - A)");
                    option = scan.nextInt();
                    switch (option){
                        case 1: for (String Element_of_thisSetB: setB){
                                    if (setA.contains(Element_of_thisSetB)){
                                        setA.remove(Element_of_thisSetB); // Set A - Set B
                                    }
                                } break;
                        case 2: for (String Element_of_thisSetA: setA){
                                    if (setB.contains(Element_of_thisSetA)){
                                        setB.remove(Element_of_thisSetA); // Set B - Set A
                                    }
                                } break;
                    }
                    if (option == 1){
                        setA.sort(Comparator.comparingInt(Integer::parseInt));
                        return setA;
                    }else {
                        setB.sort(Comparator.comparingInt(Integer::parseInt));
                        return setB;
                    }
                }

                @Override
                public void Display(ArrayList<String> difference) {
                    if (option == 1){
                        System.out.println("Set Difference of A: " + difference);
                    }else if(option == 2){
                        System.out.println("Set Difference of B: " + difference);
                    }
                    setA.clear();
                    setB.clear();
                }
            };
            // Create Set:
                createSet();
                setDifference.Display(setDifference.differenceOperation());
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
