package JavaQuestionsInterview;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IfArrayHasSameElement {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> a2= new ArrayList<>(Arrays.asList(1,5,7,6,8));
        System.out.println(checkSameElement(a, a2));
    }
    public static Boolean checkSameElement(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
//        Set<Object> set1=new HashSet<>(Arrays.asList(arr1));
//        Set<Object> set2=new HashSet<>(Arrays.asList(arr2));
        for (Integer o:arr1){
            if(arr2.contains(o)){
               return true;
            }
        }
        return false;
    }
}
