/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mean;

import java.util.*;
public class Meanmode {
        
        static int set[];
    public static void main(String[] args) {
        UserInput();
        GetMean();
        GetMode();
    }
    public static void UserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter:\t");
        set = new int[sc.nextInt()];
        
        for (int i = 0; i < set.length; i++) {
            System.out.print("Element No. " + i + ":\t");
            set[i] = sc.nextInt();
        }
    }
    public static void GetMean() {
        double sum = 0d;
        for (int i = 0; i < set.length; i++) {
            sum += set[i];
        }
        double mean = sum/set.length;
        System.out.println("Mean:\t\t" + mean);
    }
    public static void GetMode() {
        List<Integer> modes = new ArrayList<Integer>();
        int count[] = new int[set.length];
        int maxCount = 0;
        for (int i = 0; i < set.length; i++) {
            count[i] = 0;
            for (int j = 0; j < set.length; j++) {
                if (set[i] == set[j]) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                if (!modes.contains(set[i])) {
                    modes.add(set[i]);
                }
            }
            if (count[i] > maxCount) {
                modes.clear();
                modes.add(set[i]);
                maxCount = count[i];
            }
        }
        System.out.print("Mode(s):\t");
        if (modes.size() == set.length) {
            System.out.println("None");
        } else {
            for (int i = 0; i < modes.size(); i++) {
                    System.out.print(modes.get(i) + "\t");
            }
        }
        System.out.println("");
    }
    
}
    

