# Write your MySQL query statement below
select 
    B.employee_id, 
    B.name, 
    count(A.employee_id) as reports_count, 
    round(avg(A.age)) as average_age 
from Employees B 
inner join Employees A 
on (B.employee_id = A.reports_to) 
group by B.employee_id order by B.employee_id
