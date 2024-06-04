# Write your MySQL query statement below
select E.employee_id from Employees E 
left join Employees M on (E.manager_id = M.employee_id) 
where E.salary < 30000
and E.manager_id is not null
and M.employee_id is null
order by E.employee_id
;
