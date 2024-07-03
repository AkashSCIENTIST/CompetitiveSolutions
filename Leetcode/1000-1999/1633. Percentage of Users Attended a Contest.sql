# Write your MySQL query statement below
select Register.contest_id, round(count(Register.contest_id) * 100 / (select count(*) from Users), 2) as percentage from Register group by Register.contest_id order by percentage desc, contest_id
