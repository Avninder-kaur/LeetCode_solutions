# Write your MySQL query statement below
select author_id as id from Views where viewer_id=author_id and viewer_id >=1 group by author_id order by author_id ASC;