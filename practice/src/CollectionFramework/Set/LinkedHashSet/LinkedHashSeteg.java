package CollectionFramework.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSeteg {

        public static void main(String[] args) {
            String s = new String("1");
            HashSet<Object> names = new HashSet<>();
            names.add("ronin");
            names.add("batman");
            names.add("robin");
            names.add("alex");
            names.add(1);
            names.add(null);
            names.add(null);
            String st=null;
            names.add(st);


            Iterator<Object> i = names.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }



        }}
