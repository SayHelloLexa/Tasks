package Task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.addGrade(1, "Math", 5);
        student.addGrade(1, "Math", 4);
        student.addGrade(1, "Math", 4);
        student.addGrade(1, "Math", 5);

        student.addGrade(2, "Math", 5);
        student.addGrade(2, "Math", 5);
        student.addGrade(2, "Math", 4);
        student.addGrade(2, "Math", 3);
        System.out.println("Математика 1 семестр: " + student.getAverageSemesterGrade(1, "Math"));
        System.out.println("Математика 2 семестр: " + student.getAverageSemesterGrade(2, "Math"));
        System.out.println("Математика за 2 семестра: " + student.getAverageAllGrade());

        student.addGrade(1, "Programming", 5);
        student.addGrade(1, "Programming", 3);
        student.addGrade(1, "Programming", 3);
        student.addGrade(1, "Programming", 5);

        student.addGrade(2, "Programming", 5);
        student.addGrade(2, "Programming", 5);
        student.addGrade(2, "Programming", 4);
        student.addGrade(2, "Programming", 3);
        System.out.println("Введение в программирование 1 семестр: " + student.getAverageSemesterGrade(1, "Programming"));
        System.out.println("Введение в программирование 2 семестр: " + student.getAverageSemesterGrade(2, "Programming"));
        System.out.println("Введение в программирование за 2 семестра: " + student.getAverageAllGrade());
    }
}
