# Write your MySQL query statement below
SELECT project_id, round(avg(experience_years), 2) AS average_years
FROM project as p
LEFT JOIN employee as e
ON p.employee_id = e.employee_id 
GROUP BY project_id;