package kz.bitlab.academy.springfirstsprint.service;

import kz.bitlab.academy.springfirstsprint.dto.StudentDto;
import kz.bitlab.academy.springfirstsprint.entity.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static List<StudentEntity> students = new ArrayList<>();
    private static Long id = 1L;

    static {
        students.add(new StudentEntity(id++, "Ilyas", "Zhuanyshev", 88, "B"));
        students.add(new StudentEntity(id++, "Serik", "Erikov", 91, "A"));
        students.add(new StudentEntity(id++, "Erik", "Serikov", 65, "C"));
        students.add(new StudentEntity(id++, "Nurzhan", "Bolatov", 48, "F"));
        students.add(new StudentEntity(id++, "Patrick", "Zuckerberg", 100, "A"));
    }

    public static List<StudentEntity> findAll() {
        return students;
    }

    public static void addStudent(StudentDto studentDto) {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(id++);
        studentEntity.setName(studentDto.getName());
        studentEntity.setSurname(studentDto.getSurname());
        studentEntity.setExam(studentDto.getExam());
        studentEntity.setMark(getMarkByExam(studentDto.getExam()));
        students.add(studentEntity);
    }

    private static String getMarkByExam(int exam) {
        // if else logic
        if (exam >= 90 && exam <= 100) {
            return "A";
        } else if (exam >= 75 && exam <= 89) {
            return "B";
        } else if (exam >= 60 && exam <= 74) {
            return "C";
        } else if (exam >= 50 && exam <= 59) {
            return "D";
        } else {
            return "F";
        }
    }
}
