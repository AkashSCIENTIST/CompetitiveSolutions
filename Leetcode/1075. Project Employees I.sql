# Write your MySQL query statement below
select Project.project_id, round(avg(Employee.experience_years), 2) as average_years from Project inner join Employee on (Project.employee_id = Employee.employee_id) group by Project.project_id;
