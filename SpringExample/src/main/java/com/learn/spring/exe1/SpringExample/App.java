package com.learn.spring.exe1.SpringExample;

public class App 
{
    public static void main( String[] args )
    {
        JavaTrainer jt = new JavaTrainer();
        PythonTrainer pt = new PythonTrainer();
        DBTrainer dt = new DBTrainer();
        
        System.out.println("----------Java Trainer-------------");
        callingMethods(jt);
        System.out.println("----------Python Trainer-----------");
        callingMethods(pt);
        System.out.println("----------DataBase Trainer-------------");
        callingMethods(dt);       
    }
    public static void callingMethods(Trainer tr)
    {
    	tr.teach();
    	tr.takeAttendence();
    }
}
