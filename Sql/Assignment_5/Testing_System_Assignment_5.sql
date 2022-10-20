-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale:
drop view if exists list_staff;
create view list_staff as 
select ac.* from `account` as ac
inner join department as dp on ac.DepartmentID = dp.DepartmentID
where dp.DepartmentName = 'sale';

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất:
drop view if exists list_account;
create view list_account as
with cte_list_acc as
(select gr.AccountID, count(gr.AccountID) as total
from groupaccount gr
group by gr.AccountID)
select ga.AccountID, ac.FullName, count(ga.AccountID) as total_acc 
from `account` ac
inner join groupaccount ga on ac.AccountID = ga.AccountID
group by ga.AccountID
having total_acc = (select max(total) from cte_list_acc);

-- cach 2:
select ga.AccountID, ac.FullName, count(ga.AccountID) as total_acc 
from `account` ac
inner join groupaccount ga on ac.AccountID = ga.AccountID
group by ga.AccountID
having total_acc = (select count(gr.AccountID) as total
					from groupaccount gr
					group by gr.AccountID
					order by total desc limit 1);
                        
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
-- được coi là quá dài) và xóa nó đi:
drop view if exists content_length;
create view content_length as
SELECT Content
FROM question
WHERE LENGTH(Content) > 18;
delete from content_length;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất:
drop view if exists list_department;
create view list_department as
select dp.DepartmentID, dp.DepartmentName, count(ac.DepartmentID) as total_staff 
from Department dp
inner join `account` ac 
on dp.DepartmentID = ac. DepartmentID
group by ac.DepartmentID
having total_staff = 
					(select  max(total)
                     from (select count(a.DepartmentID) as total 
						   from `account` a
						   group by a.DepartmentID) as table_count_staff);
                                        
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo:
drop view if exists list_question;
create view list_question as
select qs.QuestionID, qs.Content, ac.AccountID, ac.FullName
from question qs
inner join `account` ac 
on qs.CreatorID = ac.AccountID
where SUBSTRING_INDEX(ac.FullName,' ', 1) = 'Nguyen';

-- Hàm SUBSTRING_INDEX trả về chuỗi con của chuỗi trước số lần xuất hiện của dấu phân
-- cách.
-- + Cú pháp
-- SUBSTRING_INDEX( string, delimiter, number )
-- Trong đó:
-- string: Chuỗi nguồn.
-- delimiter: Dấu phân cách để tìm kiếm trong chuỗi.
-- number: Số lần tìm kiếm dấu phân cách.
-- Lưu ý:
-- Nếu number là giá trị âm, mọi thứ từ bên trái của dấu phân cách sẽ được trả về
-- Nếu number là một giá trị dương, mọi thứ từ bên phải của dấu phân cách sẽ được trả về
-- vidu:
-- SELECT SUBSTRING_INDEX('daonq@viettel.com.vn', '.', 1);
-- -- Ket qua: 'daonq@viettel'
-- SELECT SUBSTRING_INDEX('daonq@viettel.com.vn', '.', 2);
-- -- Ket qua: 'daonq@viettel.com'
                                        
                                        