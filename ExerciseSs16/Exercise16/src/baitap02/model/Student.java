package baitap02.model;

import java.util.*;

public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        return this.Name.compareTo(o.getName());
    }

    int ID;
    String Name;
    double Score;

    public Student() {
    }

    public Student(int ID, String name, double score) {
        this.ID = ID;
        Name = name;
        Score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public void inputdata(Scanner scanner){
        Random random = new Random();
        System.out.println("Tên học sinh");
        this.Name=scanner.nextLine();
        this.Score= random.nextDouble(100);
        this.ID=0;
    }
    public void displayData(){
        System.out.printf("Id : %s | Tên : %s | Điểm : %s \n",ID,Name,Score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
