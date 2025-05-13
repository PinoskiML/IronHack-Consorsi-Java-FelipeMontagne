package com.ironhack.spring_lessons.repository;

import com.ironhack.spring_lessons.model.Teacher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class TeacherRepositoryTest {
    @Autowired
    TeacherRepository teacherRepository;
    Teacher teacher;

    @BeforeEach  // se realiza antes de cada test
    public void setUP(){
        teacher = new Teacher("John Doe");
        teacherRepository.save(teacher);
        System.out.println(teacher);
    }

    @AfterEach    //  se realiza despues de cada test
    public void tearDown(){
        teacherRepository.deleteById(teacher.getId());
    }
    @Test
    public void findAll_teachers_teacherList(){

        //variable Lista profesores
        List<Teacher> teacherList = teacherRepository.findAll();
        System.out.println(teacherList);

        assertEquals(4,teacherList.size());
    }

    @Test
    public void findById_validID_correctTeacher(){     // Buscar por clave primaria
        Optional <Teacher> teacherOptional = teacherRepository.findById(1);
        assertTrue(teacherOptional.isPresent());   //revisa si existe espera que exista
        System.out.println(teacherOptional.get());  //.get consigue variable que este en
        assertEquals("John Doe", teacherOptional.get().getTeacher());

    }

    @Test
    public void findById_invalidId_teacherNotPresent(){    // Revisa si no existe
        Optional<Teacher> teacherOptional = teacherRepository.findById(666);
        assertTrue(teacherOptional.isEmpty());
    }



}