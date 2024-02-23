package JSON;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class jsonSort {
    public static void main(String[] args) {
/*        try {

            File file= new File(jsonSort);
            // Read JSON data into a list of Student objects
            ObjectMapper objectMapper = new ObjectMapper();
            List<Student> students = objectMapper.readValue(new File("students.json"), new TypeReference<List<Student>>() {});

            // Sort the list of students based on grades (assuming grades are stored in a field called "grade")
            Collections.sort(students, Comparator.comparing(Student::getGrade).reversed());

            // Retrieve the top 5 students
            List<Student> topStudents = students.subList(0, Math.min(5, students.size()));

            // Print the top 5 students
            for (int i = 0; i < topStudents.size(); i++) {
                System.out.println("Top " + (i + 1) + ": " + topStudents.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        LinkedList<Student> students= new LinkedList<>();
        students.add(new Student("aryan",80.8));
        students.add(new Student("rohit",76.8));
        students.add(new Student("karan",78.9));
        students.add(new Student("raghav",57.9));
        students.add(new Student("prerna",45.0));
        students.add(new Student("sushma",87.7));
        students.add(new Student("chandu",90.8));
//        Collections.sort(students,Comparator.comparing(Student::getPercentage));
        students.sort(Comparator.comparingDouble(Student::getPercentage));
        students.sort((s1, s2) -> Double.compare(s1.getPercentage(), s2.getPercentage()));

        System.out.println("Sorted by grade:");
        for (Student student : students) {
            System.out.println(student.name +" " + student.percentage);
        }
    }
}

class Student{
    String name;
    double percentage;

    Student(String name,double percentage){
        this.name= name;
        this.percentage= percentage;
    }

    public double getPercentage(){
        return this.percentage;
    }
}
