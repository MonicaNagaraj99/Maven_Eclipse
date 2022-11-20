package com.selenium.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Conversion {
   //List to set 
	public static void listToSet() {
		List<Object> list = new ArrayList<Object>();
		list.add('!');
		list.add("list");
		list.add(9);
		list.add('!');
		System.out.println("list: " + list);
		Set<Object> set = new HashSet<Object>(list);
		System.out.println("List to Set: " + set);
	}
	//set to list
	public static void setToList() {
		List<Object> list1 = new ArrayList<Object>();
		list1.add(10);
		
		Set<Object> set = new HashSet<Object>();
		set.add(6);
		set.add('s');
		set.add(6);
		System.out.println("set: " + set);
		
		List<Object> list2 = new ArrayList<Object>(set);
		System.out.println("Set to List: "+ list2);
	}
	
	//String to Int 
	  public static void stringToInt() {
		  System.out.println("----String to Int-----");
		    System.out.println("2 as string");
		    String a = "2";
			System.out.println(a+5);
			
			int b = Integer.parseInt(a);
			System.out.println("2 as int");
			System.out.println(b+5);
	}
	  
	//Int to String
	  public static void intToString() {
		  System.out.println("----Int to String-----");
		    System.out.println("5 as int");
		  int a = 5;
		  System.out.println(5+5);
		  
		  String b = String.valueOf(a);
		  System.out.println("5 as string");
		  System.out.println(b+5);
	  }  
	  
	  //Array to String 
	  public static void arrayToString() {
		  System.out.println("----Array to String-----");
		  int a[] = new int[3];
           
		  a[0] = 10;
		  a[1] = 9;
		  a[2] = 8;
		  System.out.println("Array: ");
			  for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
		  System.out.println("Array as String: ");
		  {		System.out.println(Arrays.toString(a));
				}
		} 
	  
	  //String to Array
	  public static void stringToArray() {
		  System.out.println("----String to Array-----");
		  String a = "Welcome to java";
		  System.out.println("String: " +a);
		  
   		   char b[] = a.toCharArray();
   		System.out.println("String as Array: ");
		   for (char c : b) {
			System.out.println(c);
		}
		  }
		  
	  
	  //Double to float & 	String
	  public static void doubleto() {
		  System.out.println("==================================");
		  double a = 45.6;
		  System.out.println(a);
		  
		  System.out.println("double to float: ");
		  float b = (float) a;
		  System.out.println(b+7);
		  
		  System.out.println("double to string: ");
		  String c = String.valueOf(a);
		  System.out.println(c+7);
	}
	  
	  //int to long and double
	  public static void intto() {
		  System.out.println("==================================");
		  int a = 50;
		  System.out.println(a);
		  
		  System.out.println("int to long");
		  long b = a;
		  System.out.println(b);
		  
		  System.out.println("int to double");
		  double c = a;
		  System.out.println(c);
	}		  
	  
	  public static void arrayToList() {
		  char a[] = {'!','@' ,'#','!' };
		  System.out.println("Array: ");
          for (int i = 0; i < a.length; i++) {
	      System.out.println( a[i]);
		}
          System.out.println("Array to List: ");	
          String s = Arrays.toString(a);
 	      List<String> myList = new ArrayList<String>(Arrays.asList(s));
   	      System.out.println(myList);
 	
	  }

	  public static void arrayToSet() {
		  System.out.println("-----Array to Set------");
        String a[] = new  String[3];
        a[0]="one";
        a[1]="two";
        a[2]="one";
        
        System.out.println("Array: ");
       for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
       }
        System.out.println("Array to Set: ");
		  Set<Object> set = new HashSet<Object>(Arrays.asList(a));
		  System.out.println(set);
	}
	
	  
	  public static void stringToList() {
		  System.out.println("------String to list-------");
		  String s = "a,r,r,a,y";
		  List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
		  System.out.println(myList);
	}
	  
	  public static void stringToSet() {
		  System.out.println("-------String to set--------");
		  String s = "a,r,r,a,y";
		  List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
		  HashSet<String> set = new HashSet<String>(myList);
		  System.out.println(set);
 	}
	 
	 	public static void main(String[] args) {
	    listToSet();
     	setToList();
		stringToInt();
		intToString();
		arrayToString();
		stringToArray();
		doubleto();
		intto();
		arrayToList();
		arrayToSet();
		stringToList();
		stringToSet();
		
		
	}
	
}
