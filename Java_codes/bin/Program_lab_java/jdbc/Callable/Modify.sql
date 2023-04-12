 DELIMITER //
 CREATE PROCEDURE modify_student_info(IN local_Id int, IN local_Name varchar(20))
    BEGIN
       ALTER TABLE student_info MODIFY COLUMN marks VARCHAR(20);
    END //
 DELIMITER ;