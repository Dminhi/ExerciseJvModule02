package baitap02.run;


import baitap02.model.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "minh", 9.3);
        students[1] = new Student(2, "thinh", 6.7);
        students[2] = new Student(3, "duc", 8.2);
        // Bubble Sort
//        for (int i = 0; i < students.length - 1; i++) {
//            for (int j = students.length - 1; j > i; j--) {
//                if (students[j].getScore() < students[j - 1].getScore()) {
//                    Student temp = students[j];
//                    students[j] = students[j - 1];
//                    students[j - 1] = temp;
//                }
//            }
//        }
//        for (Student student : students) {
//            student.displayData();
//        }
        // Selection Sort
//        int min;
//
//        for (int i = 0; i < students.length - 1; i++) {
//            min = i;
//            for (int j = i + 1; j < students.length; j++) {
//                if (students[min].getScore() < students[j].getScore())
//                    min = j;
//                if (min != j) {
//                    Student temp = students[j];
//                    students[j] = students[j - 1];
//                    students[j - 1] = temp;
//                }
//            }
//        }
//        for (Student student : students) {
//            student.displayData();
//        }
        // Insertion Sort
        int y;
        for (int i = 0; i < students.length; i++) {
           Student x = students[i];
            y = i;
            while (y > 0 && x.getScore() < students[y - 1].getScore()) {
                students[y] = students[y - 1];
                y--;
            }
            students[y] = x;
        }
        for (Student student : students) {
            student.displayData();
        }
    }
}



