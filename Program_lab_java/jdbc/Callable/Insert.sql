 DELIMITER // 
Create PROCEDURE insert_studentinfo(IN p_id int, IN p_code varchar(20),IN p_name Varchar(20), IN p_subject Varchar(20), IN p_marks int, IN p_phone varchar(20))
     BEGIN
     insert into student_info(stud_id, stud_code, stud_name, subject,marks,phone) values (p_id, p_code,p_name, p_subject,p_marks,p_phone);
     END //