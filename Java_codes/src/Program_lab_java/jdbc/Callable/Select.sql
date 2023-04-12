DELIMITER &&  
CREATE PROCEDURE get_merit_student ()  
BEGIN  
    SELECT * FROM student_info WHERE marks > 70;  
    SELECT COUNT(stud_code) AS Total_Student FROM student_info;    
END &&  
DELIMITER ;  