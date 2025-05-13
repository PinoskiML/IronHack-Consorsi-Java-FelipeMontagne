package com.ironhack.spring_lessons.repository;

import com.ironhack.spring_lessons.model.Course;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //added per Bot
class CourseRepositoryTest {
    @Autowired
    CourseRepository courseRepository;



    @BeforeEach
    public void setUP(){
        Course algebra = new Course("Algebra", 150, "B1","3 weeks", 2);
        courseRepository.save(algebra);
    }


    @AfterEach
    public void tearDown (){
        courseRepository.deleteById("Algebra");

    }

    @Test //para buscar que busca todos los cursos
    public void  findAll_course_courseList(){
        List<Course>  courseList = courseRepository.findAll();
        System.out.println(courseList);
        assertEquals(7, courseList.size());


    }

    @Test //consultar por ID
    public void findById_validId_correctCourse (){
        Optional<Course> courseOptional = courseRepository.findById("Math");
        assertTrue(courseOptional.isPresent());
        System.out.println(courseOptional.get());
        assertEquals(100, courseOptional.get().getHours());

    }

    @Test
    public void findById_invalidID_courseNotPresent (){
        Optional<Course> courseOptional= courseRepository.findById("Politics");
        assertTrue(courseOptional.isEmpty());

    }

/*    @BeforeEach  // se realiza antes de cada test
    void setUP(){

        //courseRepository.deleteAll();

        course = new Course("J");
       courseRepository.save(course);
        System.out.println("in setUP, saved course: " + course);
    }

    @AfterEach
    void tearDown(){
        courseRepository.deleteById(course.getCourse());
    }

    @Test  // findAll
    public void findAll_courses_courseList(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println(courseList);

        assertTrue(!courseList.isEmpty(), "Course list should not be empty");

    }*/
    @Test
    public void findByHours_validHours_correctCourse(){
        Optional<Course> courseOptional = courseRepository.findByHours(50);   // solo se puede recibir 1 campo
        assertTrue(courseOptional.isPresent());

    }

    //JPA Keywords  Java Persistency Api
    @Test
    public void findAllByClassroom_validClassroom_courseList(){
        List<Course> courseList = courseRepository.findAllByClassroom("B1");
        System.out.println(courseList);

        System.out.println("there are: " + courseList.size() + " classrooms");
        assertEquals(3, courseList.size());
    }

    @Test
    public void findAllByCourseContaining_str_courseList(){
        List<Course> courseList = courseRepository.findAllByCourseContaining("p");
        System.out.println("There are: " +courseList.size() +" courses containing this string. ");
        System.out.println("The Courses are: " +courseList);
        assertEquals(3, courseList.size());
    }

    @Test
    public void findAllByHoursLessThan_validHours_courseList(){
        List<Course> courseList = courseRepository.findAllByHoursLessThan(150);
        System.out.println(courseList);
        assertEquals(3, courseList.size());
    }

    //JPQL
    @Test
    public void findAllWhereHours150_courses_courseList(){
        List<Course> courseList = courseRepository.findAllWhereHours150();
        System.out.println(courseList);
        assertEquals(3, courseList.size());   // 2 en base de datos y uno que se hace beforeEach Algebra 150

    }

    @Test
    public void findAllWhereClassroomAndHoursParams_courses_courseList(){
        List<Course> courseList = courseRepository.findAllWhereClassRoomAndHoursParams( "B1", 150);
        System.out.println(courseList);
        assertEquals(3, courseList.size());
        }



    // trae todos los cursos que tengan 150 horas
    @Test
    void testFindAllWhereHours150() {
        List<Course> courses = courseRepository.findAllWhereHours150();
        assertNull(courses, "Cannot be null");
    }



    }
