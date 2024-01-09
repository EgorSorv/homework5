import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Игорь", Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0), "Информатика"));
        students.add(new Student("Алиса", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0), "Информатика"));
        students.add(new Student("Даниил", Arrays.asList(4.0, 5.0, 5.0, 5.0, 5.0), "Химия"));
        students.add(new Student("Олег", Arrays.asList(4.0, 4.0, 4.0, 4.0, 4.0), "История"));
        students.add(new Student("Татьяна", Arrays.asList(4.0, 3.0, 5.0, 5.0, 4.0), "Математика"));
        students.add(new Student("Виктория", Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0), "Информатика"));
        students.add(new Student("Анастасия", Arrays.asList(4.0, 3.0, 4.0, 5.0, 4.0), "Математика"));
        students.add(new Student("Владимир", Arrays.asList(5.0, 5.0, 5.0, 5.0, 4.0), "Информатика"));
        students.add(new Student("Дмитрий", Arrays.asList(5.0, 5.0, 5.0, 4.0, 4.0), "Информатика"));
        students.add(new Student("Константин", Arrays.asList(3.0, 5.0, 5.0, 3.0, 4.0), "Информатика"));
        students.add(new Student("Мария", Arrays.asList(2.0, 5.0, 5.0, 2.0, 4.0), "Физика"));
        students.add(new Student("Вероника", Arrays.asList(5.0, 5.0, 2.0, 5.0, 4.0), "Информатика"));
        students.add(new Student("Антон", Arrays.asList(2.0, 3.0, 3.0, 2.0, 4.0), "Информатика"));
        students.add(new Student("Борислав", Arrays.asList(4.0, 5.0, 5.0, 4.0, 5.0), "Математика"));
        students.add(new Student("Святослав", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0), "Информатика"));

        List<Student> result = students.stream()
                .filter(student -> "Информатика".equals(student.getSpeciality()))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((student1, student2) -> Double.compare(student2.getAverageGrade(), student1.getAverageGrade()))
                .limit(5)
                .toList();

        result.forEach(student -> System.out.println(student.getName() + ", " + student.getAverageGrade()));
    }
}
