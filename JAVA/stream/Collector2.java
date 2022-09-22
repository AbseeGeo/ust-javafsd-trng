package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Student
{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Collector2 {

	public static void main(String[] args) {
		//Student Auto-generated method stub
List<Student>studentlist=new ArrayList<Student>();
		studentlist.add(new Student(11,"absee",22));
		studentlist.add(new Student(22,"ansee",18));
		studentlist.add(new Student(33,"geo",22));
		studentlist.add(new Student(44,"mini",23));
		studentlist.add(new Student(55,"antony",18));
		List<String>names=new studentlist.stream().map(n->n.name).collect(Collectors.toList());
		System.out.println(names);
	}

}
