 DELIMITER //
 CREATE PROCEDURE update_student_info(IN local_Id int, IN local_name VARCHAR(20))
    BEGIN
       UPDATE student_info SET stud_name = local_name
       where stud_id=local_Id;
    END //
 DELIMITER ;