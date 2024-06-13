# Write your MySQL query statement below
with temp as (
    Select 
        D.name as Department, 
        E.name as Employee, 
        E.salary as Salary, 
        dense_rank() over(
            partition by E.departmentId
            order by E.salary desc
        ) as employee_rank
        from Department D
        inner join Employee E
        on (E.departmentId = D.id)
)
select Department, Employee, Salary from temp where employee_rank <= 3;
