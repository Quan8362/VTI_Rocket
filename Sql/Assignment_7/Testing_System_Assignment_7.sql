-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước:
DROP TRIGGER IF EXISTS tr_inGroup_before1year;
DELIMITER $$
CREATE TRIGGER tr_inGroup_before1year
BEFORE INSERT ON `Group` 
FOR EACH ROW
BEGIN
DECLARE v_Createdate datetime;
SET v_Createdate = DATE_SUB(now(), INTERVAL 1 YEAR);
IF (NEW.CreateDate <= v_Createdate) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'KHONG DUOC THEM VAO GROUP';
END IF;
END $$
DELIMITER ;
INSERT INTO `Group` ( GroupName , CreatorID , CreateDate) 
			VALUES (N'Test' , 2,'2021-10-06');
            
-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, 
-- khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user"
DROP TRIGGER IF EXISTS tr_insDepartment;
DELIMITER $$
CREATE TRIGGER tr_insDepartment
BEFORE INSERT ON `Account` 
FOR EACH ROW
BEGIN
DECLARE v_Departmentid int;
SELECT DepartmentID INTO v_Departmentid FROM `Department`
		WHERE DepartmentName = 'Sale';
IF (NEW.DepartmentID = v_Departmentid) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
END IF;
END $$
DELIMITER ;
INSERT INTO `Account`(Email , Username, FullName , DepartmentID , PositionID, CreateDate)
				VALUES ('Email15@gmail.com' , 'Username15' ,'Fullname15' , '4' , '1', '2022-03-05');
                
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user:
DROP TRIGGER IF EXISTS tr_conf_Group;
DELIMITER $$
CREATE TRIGGER tr_conf_Group
BEFORE INSERT ON `Groupaccount` 
FOR EACH ROW
BEGIN
DECLARE v_Count_Groupid int;
SELECT count(GroupID) INTO v_Count_Groupid FROM `Groupaccount`
		WHERE GroupID = NEW.GroupID;
IF (v_Count_Groupid >= 5) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'Mot group chi duoc ton tai 5 user';
END IF;
END $$
DELIMITER ;
INSERT INTO GroupAccount ( GroupID , AccountID , JoinDate )
				VALUES ( 1 , 10,'2022-10-05');
                
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question:
DROP TRIGGER IF EXISTS tr_exam_question;
DELIMITER $$
CREATE TRIGGER tr_exam_question
BEFORE INSERT ON `Examquestion` 
FOR EACH ROW
BEGIN
DECLARE v_Count_Examid int;
SELECT count(ExamID) INTO v_Count_Examid FROM `Examquestion`
		WHERE ExamID = NEW.ExamID;
IF (v_Count_Examid >= 10) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'Mot Exam chi duoc ton tai 10 question';
END IF;
END $$
DELIMITER ;
INSERT INTO ExamQuestion(ExamID , QuestionID ) 
	 VALUES ( 7 , 5 ),
			( 7 , 10 ),
			( 7 , 4 ),
			( 7 , 3 ),
			( 7 , 7 ),
			( 7 , 1 ),
			( 7 , 6 ),
			( 7 , 11 ),
			( 7 , 9 ),
			(7 , 8 );

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com (đây là tài khoản admin, 
-- không cho phép user xóa), còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó
DROP TRIGGER IF EXISTS tr_delete_account;
DELIMITER $$
CREATE TRIGGER tr_delete_account
BEFORE DELETE ON `Account` 
FOR EACH ROW
BEGIN
DECLARE v_email varchar(255);
SET v_email = 'Email1@gmail.com';
IF (OLD.Email = v_email) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'Khong cho phep xoa user nay';
END IF;
END $$
DELIMITER ;
DELETE FROM `Account` WHERE Email = 'Email2@gmail.com';

-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table Account, hãy tạo trigger cho phép 
-- người dùng khi tạo account không điền vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
DROP TRIGGER IF EXISTS tr_insAccount_noDeapartmentid;
DELIMITER $$
CREATE TRIGGER tr_insAccount_noDeapartmentid
BEFORE INSERT ON `Account` 
FOR EACH ROW
BEGIN
DECLARE v_waiting_department varchar(255);
SELECT DepartmentID INTO v_waiting_department FROM `Department`
		WHERE DepartmentName = 'Waiting room';
IF (NEW.DepartmentID is NULL) THEN
SET NEW.DepartmentID = v_waiting_department;
END IF;
END $$
DELIMITER ;
INSERT INTO `Account`(Email , Username, FullName, PositionID, CreateDate)
				VALUES ('Email16@gmail.com' , 'Username16' ,'Fullname16', '3', '2022-09-05');
                
-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng.
DROP TRIGGER IF EXISTS tr_answer_question;
DELIMITER $$
CREATE TRIGGER tr_answer_question
BEFORE INSERT ON `Answer` 
FOR EACH ROW
BEGIN
DECLARE v_Count_Questionid int;
DECLARE v_Count_isCorrect int;
SELECT count(QuestionID) INTO v_Count_Questionid FROM `Answer`
		WHERE QuestionID = NEW.QuestionID;
SELECT count(1) INTO v_Count_isCorrect FROM `Answer`
		WHERE QuestionID = NEW.QuestionID AND isCorrect = NEW.isCorrect ;        
IF (v_Count_Questionid >= 4) OR (v_Count_isCorrect >=2) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'Mot bai thi chi toi da 4 cau hoi';
END IF;
END $$
DELIMITER ;
INSERT INTO Answer ( Content , QuestionID , isCorrect )
			VALUES (N'Trả lời 12' , 2 , 1);
            
-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày:
DROP TRIGGER IF EXISTS tr_del_exam_before2day;
DELIMITER $$
CREATE TRIGGER tr_del_exam_before2day
BEFORE DELETE ON `Exam` 
FOR EACH ROW
BEGIN
DECLARE v_Createdate DATE;
SET v_Createdate = DATE_SUB(now(), INTERVAL 2 DAY);
IF (OLD.CreateDate >= v_Createdate) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'can not delete this exam';
END IF;
END $$
DELIMITER ;
DELETE FROM `Exam` WHERE ExamID = 10;

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update,
-- delete các question khi question đó chưa nằm trong exam nào:
-- UPDATE:
DROP TRIGGER IF EXISTS tr_update_question;
DELIMITER $$
CREATE TRIGGER tr_update_question
BEFORE UPDATE ON `Question` 
FOR EACH ROW
BEGIN
DECLARE v_Count_Questionid int;
SET v_Count_Questionid = 0;
SELECT count(1) INTO v_Count_Questionid FROM `Examquestion`
		WHERE QuestionID = NEW.QuestionID; 
IF (v_Count_Questionid != 0) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'can not update this question';
END IF;
END $$
DELIMITER ;
UPDATE `Question` SET Content = 'Hỏi về JS' WHERE QuestionID = 11;
-- DELETE:
DROP TRIGGER IF EXISTS tr_del_question;
DELIMITER $$
CREATE TRIGGER tr_del_question
BEFORE DELETE ON `Question` 
FOR EACH ROW
BEGIN
DECLARE v_Count_Questionid int;
SET v_Count_Questionid = 0;
SELECT count(1) INTO v_Count_Questionid FROM `Examquestion`
		WHERE QuestionID = OLD.QuestionID; 
IF (v_Count_Questionid != 0) THEN 
SIGNAL SQLSTATE '12345'
SET MESSAGE_TEXT = 'can not delete this question';
END IF;
END $$
DELIMITER ;
DELETE FROM `Question` WHERE QuestionID = 11;

-- Question 12: Lấy ra thông tin exam trong đó: Duration <= 30 thì sẽ đổi thành giá trị 
-- "Short time" 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time" Duration > 60 thì sẽ đổi thành giá trị "Long time"
SELECT ExamID, `Code` , Title , CategoryID, CASE 
											WHEN Duration <= 30 THEN "Short time"
                                            WHEN Duration <= 60 THEN "Medium time"
                                            ELSE "Long time"
                                            END AS Duration, CreatorID , CreateDate  
FROM `Exam`;

-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
-- là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher
SELECT GroupID, count(GroupID) as total_account, CASE
										WHEN count(GroupID) <= 5 THEN 'few'
                                        WHEN count(GroupID) <= 20 THEN 'normal'
                                        ELSE 'higher'
                                        END AS the_number_user_amount
FROM `Groupaccount`
GROUP BY GroupID;

-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nàokhông có user 
-- thì sẽ thay đổi giá trị 0 thành "Không có User":
SELECT DepartmentName, CASE
					   WHEN count(ac.DepartmentID) = 0 THEN "Không có User"
					   ELSE count(ac.DepartmentID)
					   END AS total_account
FROM `Department` dp
LEFT JOIN `Account` ac ON dp.DepartmentID = ac.DepartmentID
GROUP BY dp.DepartmentID;