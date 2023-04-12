 DELIMITER //
 CREATE PROCEDURE delete_student_info(IN local_Id int, IN local_Name varchar(20))
    BEGIN
       delete from student_info
       where stud_id=local_Id and
         stud_name=local_Name;
    END //
 DELIMITER ;