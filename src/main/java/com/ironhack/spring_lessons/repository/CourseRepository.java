package com.ironhack.spring_lessons.repository;

import com.ironhack.spring_lessons.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.SimpleTimeZone;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
//JPA Keywords

    //crear un metodo para encontrar por horas en concreto
    Optional<Course> findByHours(Integer hours);
    List<Course> findAllByClassroom (String classroom);    // crear metodo que recibe varios
    //consultas por fragmentos de la informacion   por ejemplo el señor de los anillos   poder buscarlo por "el señor"
    List<Course> findAllByCourseContaining (String srt);
    // buscar por algo numerico
    List<Course> findAllByHoursLessThan(Integer hours);


   //JPQL Java persistency query language

    @Query("SELECT c FROM Course c WHERE c.hours = 150")
    List<Course> findAllWhereHours150();
    @Query("SELECT c FROM Course c WHERE c.classroom = ?1 AND c.hours <=?2")
    List<Course> findAllWhereClassRoomAndHoursParams (String classroom, Integer hours);



    //NATIVE SQL   la sintaxis es especifica del gestor de base de datos

    @Query(value = "SELECT * FROM course c WHERE c.hours =150", nativeQuery = true)
    List<Course> nativeFindAllWhereHours150();


}
