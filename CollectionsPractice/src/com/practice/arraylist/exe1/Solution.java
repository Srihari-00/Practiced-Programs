package com.practice.arraylist.exe1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.println("Enter the size of the list");
        int length = scan.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<length;i++)
        {
            list.add(scan.nextInt());
        }
        System.out.println("Enter operations to be performed");
        int op = scan.nextInt();
        for(int i=0;i<op;i++){
        	System.out.println("Enter the name");
            String m = scan.next();
            if(m.equals("Insert")){
            	System.out.println("Enter the index and element");
                int index = scan.nextInt();
                int element = scan.nextInt();
                list.add(index, element);;
            }
            else if(m.equals("Delete")){
            	System.out.println("Enter the index ");
                int pos = scan.nextInt();
                list.remove(pos);
            }
        }
        //System.out.println(list);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        scan.close();
	}

}
