# Write your MySQL query statement below
delete A from Person A inner join Person B on (A.email = B.email) where A.id > B.id
