-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó:
drop procedure if exists pro_department;
delimiter $$
create procedure pro_department(in in_department_name varchar(20))
	begin 
		select  * 
        from `account` ac
        inner join department dp on ac.DepartmentID = dp.DepartmentID
        where dp.DepartmentName = in_department_name;
	end$$
delimiter ;
call pro_department('No person');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group:
drop procedure if exists pro_acc;
delimiter $$
create procedure pro_acc(in in_group_name varchar(50))
	begin 
		select  gr.GroupName, count(ga.AccountID) as total
        from `group` gr
        inner join `groupaccount` ga on gr.GroupID = ga.GroupID
        where gr.GroupName = in_group_name;
	end$$
delimiter ;
call pro_acc('Testing System');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
-- trong tháng hiện tại:
drop procedure if exists pro_type_question;
delimiter $$
create procedure pro_type_question()
	begin 
		select  tq.TypeName, count(qs.TypeID) as total
        from `typequestion` tq
        inner join `question` qs on tq.TypeID = qs.TypeID
        where month(qs.CreateDate) = month(now()) and year(qs.CreateDate) = year(now())
        group by tq.TypeID;
	end$$
delimiter ;
call pro_type_question();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất:
drop procedure if exists pro_id_typequestion;
delimiter $$
create procedure pro_id_typequestion()
	begin 
		with cte_max_question as 
		(select count(qs.TypeID) as total_question 
		from `question` qs 
		group by qs.TypeID)
			select tq.TypeID, count(q.TypeID) as total
			from `typequestion` tq
			inner join `question` q on tq.TypeID = q.TypeID
			group by tq.TypeID  
			having total = (select max(total_question) from cte_max_question );
	end$$
delimiter ;
call pro_id_typequestion();

-- cach 2:
drop procedure if exists pro_id_typequestion;
delimiter $$
create procedure pro_id_typequestion(out out_id_typequestion int)
	begin 
		with cte_max_question as 
		(select count(qs.TypeID) as total_question 
		from `question` qs 
		group by qs.TypeID)
			select q.TypeID into out_id_typequestion
			from `question` q
			group by q.TypeID  
			having count(q.TypeID) = (select max(total_question) from cte_max_question );
	end$$
delimiter ;
set @out_id = 0;
call pro_id_typequestion(@out_id);
select @out_id as ID;

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question:
drop procedure if exists pro_name_typequestion;
delimiter $$
create procedure pro_name_typequestion()
	begin 
		with cte_max_question as 
		(select count(qs.TypeID) as total_question 
		from `question` qs 
		group by qs.TypeID)
			select tq.TypeName, count(q.TypeID) as total
			from `typequestion` tq
			inner join `question` q on tq.TypeID = q.TypeID
			group by tq.TypeID  
			having total = (select max(total_question) from cte_max_question );
	end$$
delimiter ;
call pro_name_typequestion();
set @out_id = 0;
call pro_name_typequestion(out_id);
select * from `typequestion` where TypeID = @out_id;

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào：
drop procedure if exists pro_in_sequence;
delimiter $$
create procedure pro_in_sequence(in in_sequence varchar(255))
	begin 
		select Username from `account` as result where Username LIKE CONCAT('%',in_sequence,'%')
		union
		select GroupName from `group` as result where GroupName LIKE CONCAT('%',in_sequence,'%');
	end$$
delimiter ;
call pro_in_sequence('User');

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công
drop procedure if exists pro_in_fullname_email;
delimiter $$
create procedure pro_in_fullname_email(in in_fullname varchar(255), in in_email varchar(255))
	begin 
		declare v_username varchar(255) default SUBSTRING_INDEX(in_email, '@', 1);
		declare v_positionID int unsigned default 1;
		declare v_departmentID int unsigned default 11;
		declare v_CreateDate datetime default now();
		insert into `account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate)
						value (in_email, v_username, in_fullname, v_departmentID, v_positionID, v_CreateDate);
	end$$
delimiter ;
call pro_in_fullname_email('nguyen ngat', 'nguyenngat@gmail.com');
select *  from `account`;

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất:
DROP PROCEDURE IF EXISTS pro_in_typequestion;
delimiter $$
CREATE PROCEDURE pro_in_typequestion(IN in_typename VARCHAR(255))
	BEGIN 
		DECLARE v_typeid INT UNSIGNED;
		SELECT tq.TypeID INTO v_typeid FROM `typequestion` tq
		WHERE tq.TypeName = in_typename;
			IF in_typename = 'Essay' THEN 
				WITH cte_max_content AS (
				SELECT length(q.content) AS leng
				FROM `question` AS q
				WHERE TypeID = v_typeid)
					SELECT * FROM `question` qs WHERE TypeID = v_typeid 
												AND length(qs.content) = (SELECT max(leng) FROM cte_max_content);
			ELSEIF in_typename = 'Multiple-Choice' THEN 
				WITH cte_max_content AS (
				SELECT length(q.content) AS leng
				FROM `question` AS q
				WHERE TypeID = v_typeid)
					SELECT * FROM `question` qs WHERE TypeID = v_typeid 
												AND length(qs.content) = (SELECT max(leng) FROM cte_max_content);
			END IF;
	END$$
delimiter ;
CALL pro_in_typequestion('Multiple-Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID:
drop procedure if exists pro_delete_exam;
delimiter $$
create procedure pro_delete_exam(in in_examid int)
	begin 
		delete from `examquestion` eq where eq.ExamID = in_examid;
        delete from `exam` e where e.ExamID = in_examid;
	end$$
delimiter ;
call pro_delete_exam(1);

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
drop procedure if exists pro_delete_exam_get_count_record;
delimiter $$
create procedure pro_delete_exam_get_count_record()
	begin 
		declare v_examid int unsigned;
		declare v_count_exam int unsigned default 0;
		declare v_count_examquestion int unsigned default 0;
		declare i tinyint unsigned default 1;
        declare v_thongbao varchar(50);
		-- tạo bảng tạm chữa các examid của 3 năm về trước:
        drop table if exists examid_before_3year;
        create table examid_before_3year(
        id int primary key auto_increment,
		examid int unsigned
        );
        -- insert data in table:
        insert into examid_before_3year (examid)
        select examid from exam ex where (year(now()) - year(ex.CreateDate)) > 2;
        -- lấy ra số lượng exam với examquestion cần xóa:
        select count(1) into v_count_exam from examid_before_3year;
        select count(1) into v_count_examquestion from examquestion e
        inner join examid_before_3year ex3 on e.examid = ex3.examid;
			while (i <= v_count_exam) do
				select examid into v_examid from examid_before_3year where id = i;
			call pro_delete_exam(v_examid);
            set i = i+1;
            end while;
		-- in thông báo số lượng record đã remove:
        select concat('delete ', v_count_exam, ' in exam and ', v_count_examquestion, ' in examequstion') into v_thongbao;
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = v_thongbao;
        -- xóa bảng tạm sau khi thông báo được đưa ra:
        drop table if exists examid_before_3year;  
	end$$
delimiter ;
call pro_delete_exam_get_count_record();

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
-- chuyển về phòng ban default là phòng ban chờ việc
drop procedure if exists pro_in_departmentname;
delimiter $$
create procedure pro_in_departmentname(in in_departmentname varchar(255))
	begin 
		declare v_departmentID int;
		select DepartmentID into v_departmentID from `department` d where d.DepartmentName = in_departmentname;
		update `account` ac set ac.DepartmentID = 12 where ac.DepartmentID = v_departmentID;
		delete from `department` dp where dp.DepartmentName = in_departmentname;
	end$$
delimiter ;
call pro_in_departmentname('Sale');

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay:
drop procedure if exists pro_everymonth_howmanyquestion;
delimiter $$
create procedure pro_everymonth_howmanyquestion()
	begin 
		with cte_info_of_12month as(
			select 1 as month
            union
            select 2 as month
            union
            select 3 as month
            union
            select 4 as month
            union
            select 5 as month
            union
            select 6 as month
            union
            select 7 as month
            union
            select 8 as month
            union
			select 9 as month
            union
            select 10 as month
            union
            select 11 as month
            union
            select 12 as month
        )
        select mt.month, count(month(yn.CreateDate)) from cte_info_of_12month as mt
        left join
        (select * from `question` qs where year(qs.CreateDate) = year(now())) as yn
        on mt.month = month(yn.CreateDate)
        group by mt.month;
	end$$
delimiter ;
call pro_everymonth_howmanyquestion();

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng"):
drop procedure if exists pro_everymonth_howmanyquestion_befor6month;
delimiter $$
create procedure pro_everymonth_howmanyquestion_befor6month()
	begin 
		with cte_info_of_6month as(
            select month(DATE_SUB(now(), INTERVAL 5 month)) as month, 
            year(DATE_SUB(now(), INTERVAL 5 month))  as `year`
            union
            select month(DATE_SUB(now(), INTERVAL 4 month)) as month, 
            year(DATE_SUB(now(), INTERVAL 4 month))  as `year`
            union
			select month(DATE_SUB(now(), INTERVAL 3 month)) as month, 
            year(DATE_SUB(now(), INTERVAL 3 month))  as `year`
            union
			select month(DATE_SUB(now(), INTERVAL 2 month)) as month, 
            year(DATE_SUB(now(), INTERVAL 2 month))  as `year`
            union
			select month(DATE_SUB(now(), INTERVAL 1 month)) as month, 
            year(DATE_SUB(now(), INTERVAL 1 month))  as `year`
            union
			select month(now()) as month, 
            year(now())  as `year`
        )
        select mt.month, mt.year,
			case when count(questionid) = 0 then 'không có câu hỏi nào trong tháng'
			else count(questionid)
            end as so_luong
        from cte_info_of_6month as mt
        left join
        (select * from `question` where CreateDate >= DATE_SUB(now(), INTERVAL 6 month)
										and CreateDate <= now()) as mth
        on mt.month = month(CreateDate)
        group by mt.month
        order by mt.month asc;
	end$$
delimiter ;
call pro_everymonth_howmanyquestion_befor6month();