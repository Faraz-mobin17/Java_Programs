DELIMITER $$
CREATE PROCEDURE `SP_Sum`(
	IN `n1` INT,
	IN `n2` INT,
	OUT `result` INT
)
BEGIN
	Set result = n1 + n2;
END$$
DELIMITER ;