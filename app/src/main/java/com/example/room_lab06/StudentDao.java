package com.example.room_lab06;




import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao   {
    @Query("SELECT * FROM student")
    List<Student> getAll();

    @Query("SELECT * FROM student WHERE id IN (:studentIds)")
    List<Student> loadAllByIds(int[] studentIds);

    @Query("SELECT * FROM student WHERE name LIKE :nameStudent LIMIT 1")
    Student findByName(String nameStudent);

    @Insert
    void addStudent(Student student);

    @Delete
    void delete(Student student);
}
