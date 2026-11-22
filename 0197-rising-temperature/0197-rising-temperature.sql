# Write your MySQL query statement below
SELECT a.id FROM weather a INNER JOIN weather b ON a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 DAY) WHERE a.temperature > b.temperature;