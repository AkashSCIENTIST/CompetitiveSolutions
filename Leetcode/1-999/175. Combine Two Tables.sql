# Write your MySQL query statement below
select a.firstname, a.lastname, b.city, b.state from person as a left join address as b on (a.personId = b.personId)
