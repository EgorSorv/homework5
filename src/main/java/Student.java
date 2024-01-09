import java.util.List;

public class Student {
    private final String name;
    private final List<Double> grades;
    private final String speciality;

    public Student(String name, List<Double> grades, String speciality) {
        this.name = name;
        this.grades = grades;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Double getAverageGrade() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0);
    }
}
