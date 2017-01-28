package com.anurag.samplecodes;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class App 
{
	
    public static void main( String[] args ) throws CloneNotSupportedException, IOException
    {
    	
    	String path = new File("").getAbsolutePath();
    	System.out.println("path "+path);
    	//MDC.put("first", "MDC");
        System.out.println( "Hello World!" );
        Department d1=new Department();
        d1.setDepName("sci");
        Department d2=new Department();
        d2.setDepName("math");
        
        Employee e1=new  Employee();
        e1.setDept(d1);
        e1.setId(1);
        e1.setEmpName("a");
        Employee e2=(Employee) e1.clone();
        
        System.out.println("e1 name "+e1.empName);
        System.out.println("e1 dept "+e1.dept.depName);
        System.out.println("e2 name "+e2.empName);
        System.out.println("e2 dept "+e2.dept.depName);
        
        e1.setEmpName("c");
        e1.dept.setDepName("geo");
        
        System.out.println("e1 name "+e1.empName);
        System.out.println("e1 dept "+e1.dept.depName);
        System.out.println("e2 name "+e2.empName);
        System.out.println("e2 dept "+e2.dept.depName);
        
        PrintWriter pr=new PrintWriter(new FileWriter(new File("/home/anurag/t1.txt")));
        pr.println("avs");
        pr.println("b");
        pr.println("c");
        pr.flush();
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("/home/anurag/t2.txt")));
        bw.write("avs");
        bw.flush();
        BufferedReader br=new BufferedReader(new FileReader(new File("/home/anurag/t1.txt")));
        String inLine;
        while((inLine=br.readLine())!=null)
        {
        	System.out.println(inLine);
        }
        System.out.println("===== File stream =========");
        FileInputStream fileInputStream=new FileInputStream(new File("/home/anurag/t1.txt"));
        Scanner sc=new Scanner(fileInputStream);
        while(sc.hasNext())
        {
        	String st=sc.nextLine();
        	System.out.println(st);
        }
        Scanner sc1=new Scanner(System.in);
        String name=sc1.nextLine();
        System.out.println("input from u "+name);
        while(true){}
    }
}
