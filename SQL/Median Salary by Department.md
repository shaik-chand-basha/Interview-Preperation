with RankedEmployees as (

select department,
		salary,
		ROW_NUMBER() OVER(partition by department order by salary) as row_no,
		COUNT(*) OVER(partition by department) as total
from employees

)

select department, ROUND(avg(salary),2) as avg_salary from RankedEmployees
where row_no in ((total+1)/2,(total+2)/2)
group by department order by avg_salary desc;
