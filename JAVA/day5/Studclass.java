package com.ust.day5;

import java.util.ArrayList;
import java.util.List;

public class Studclass {
    public static  void main(String[]args)
    {
        String name="absee";
        int age=20;

        List<Student> studentList=new ArrayList<>();
        for(int i=0;i<=4000;i++)
        {
            name=name+i;
            age++;
            studentList.add(new Student(name.concat(String.valueOf(i)),age,i));
        }
        studentList.add(new Student("absee89038",9083,87363));
    }
}
