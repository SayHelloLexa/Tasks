package Task1;

import java.util.*;

public class Student {
   private Map<Integer, Map<String, Integer>> grades;

   public Student() {
      this.grades = new HashMap<>();
   }

   public void addGrade(int semester, String subject, int grade) {
      Map<String, Integer> semesterGrades;
      if (grades.containsKey(semester)) {
         semesterGrades = grades.get(semester);
      } else {
         semesterGrades = new HashMap<>();
         grades.put(semester, semesterGrades);
      }
      semesterGrades.put(subject, grade);
      grades.put(semester, semesterGrades);
   }

   public double getAverageSemesterGrade(int semester, String subject) {
      Map<String, Integer> semesterGrades = grades.get(semester);
      if (semesterGrades != null && semesterGrades.containsKey(subject)) {
         return semesterGrades.get(subject) / semesterGrades.size();
      }
      return 0;
   }

   public double getAverageAllGrade(){
      double sum = 0;
      int count = 0;
      for (Map<String, Integer> semesterGrades : grades.values()){
         for(Integer grade : semesterGrades.values()){
            sum += grade;
            count ++;
         }
      }
      if (count == 0){
         return 0;
      } else {
         return sum / count;
      }
   }
}









