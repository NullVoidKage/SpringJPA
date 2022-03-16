package com.example.springjpa.repository;

import com.example.springjpa.entity.Guardian;
import com.example.springjpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("nikko@gmail.com")
                .firstName("Nikko")
                .lastName("Nikko")
//                .guardianName("Ratbu")
//                .guardianEmail("ratbu@gmail.com")
//                .guardianMobile("09457633708")
                .build();
        studentRepository.save(student);

    }

    @Test
    public void printAllStudent() {
        List<Student> students = studentRepository.findAll();
        System.out.printf("Student List = " + students);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .name("ratbu")
                .email("ratbu@gmail.com")
                .mobile("0957575253")
                .build();
        Student student = Student.builder()
                .firstName("Nicko")
                .emailId("nicko@gmail.com")
                .lastName("Ferwelo")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void findStudentFirstName() throws Exception{
        List<Student> students = studentRepository.findByFirstNameContaining("S");
        System.out.println("students with firstname = " + students  );
    }

    @Test
    public void getStudentByEmailAddressNative() {
        Student studentEmail =studentRepository.getStudentByEmailAddressNative(
                "nikko@gmail.com"
        );
        System.out.println("Email = " + studentEmail);

    }

    @Test
    void printingStudentByEmailAddressNativeNamedParam() {
        Student studentEmail =studentRepository.getStudentByEmailAddressNativeNamedParam(
                "nikko@gmail.com", "Nikko"
        );
        System.out.println("Email = " + studentEmail);


    }

    @Test
    void printUpdateStudentNameByEmailId() {
        studentRepository.updateStudentNameByEmailId(
                "Nikkos",
                "nikko@gmail.com"
        );

    }
}