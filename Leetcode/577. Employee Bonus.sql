# Write your MySQL query statement below
select Employee.name, Bonus.bonus from Employee left join Bonus on (Employee.empId = Bonus.empId) where ifnull(Bonus.bonus,0) < 1000;
