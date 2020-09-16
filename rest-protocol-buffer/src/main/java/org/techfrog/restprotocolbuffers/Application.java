package org.techfrog.restprotocolbuffers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.techfrog.restprotocolbuffers.model.Course;
import org.techfrog.restprotocolbuffers.model.Student;
import org.techfrog.restprotocolbuffers.repository.CourseRepository;

import java.util.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    @Bean
    public CourseRepository createTestCourses() {
        Map<Integer, Course> courses = new HashMap<>();
        Course c1 = Course.newBuilder()
                .setId(1)
                .setCourseName("Protocol Buffer")
                .addAllStudent(createTestStudents())
                .build();
        Course c2 = Course.newBuilder()
                .setId(2)
                .setCourseName("Life on Mars")
                .addAllStudent(new ArrayList<>())
                .build();
        courses.put(c1.getId(), c1);
        courses.put(c2.getId(), c2);
        return new CourseRepository(courses);
    }

    private List<Student> createTestStudents() {
        return Arrays.asList(Student.newBuilder()
                .setId(1)
                .setFirstName("John")
                .setLastName("Doe")
                .setEmail("john.doe@mail.com")
                .addPhone(Student.PhoneNumber.newBuilder()
                        .setNumber("938204300")
                        .setType(Student.PhoneType.MOBILE)
                        .build())
                .build());
    }
}
