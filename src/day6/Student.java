package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private int sid;
    private String sname;
    private int srollNo;
    
    public Student(int sid, String sname, int srollNo) {
        this.sid = sid;
        this.sname = sname;
        this.srollNo = srollNo;
    }
    
    public int getSid() {
        return sid;
    }
    
    public void setSid(int sid) {
        this.sid = sid;
    }
    
    public String getSname() {
        return sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }
    
    public int getSrollNo() {
        return srollNo;
    }
    
    public void setSrollNo(int srollNo) {
        this.srollNo = srollNo;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.sname.compareTo(other.sname);
    }
    
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "John", 101));
        studentList.add(new Student(2, "Mary", 102));
        studentList.add(new Student(3, "Alice", 103));
        studentList.add(new Student(4, "Bob", 104));
        studentList.add(new Student(5, "David", 105));
        
        System.out.println("Before sorting:");
        for (Student student : studentList) {
            System.out.println(student.getSname());
        }
        
        Collections.sort(studentList);
        
        System.out.println("After sorting:");
        for (Student student : studentList) {
            System.out.println(student.getSname());
        }
    }
}