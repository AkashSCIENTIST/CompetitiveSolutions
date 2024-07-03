# Write your MySQL query statement below
(
    select name as results
    from Users U
    inner join MovieRating MR
    on (U.user_id = MR.user_id)
    group by U.user_id
    order by count(rating) desc, name
    limit 1
)
union all
(
    select title as results
    from Movies M
    inner join MovieRating MR
    on (M.movie_id = MR.movie_id)
    where date_format(created_at, '%Y-%m') = '2020-02'
    group by M.movie_id
    order by avg(MR.rating) desc, title
    limit 1
)
;
