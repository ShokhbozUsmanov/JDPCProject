select * from employees;
select MANAGER_ID, count(*) from EMPLOYEES
group by MANAGER_ID
having MANAGER_ID is not null
group by MANAGER_ID;

select MANAGER_ID, count (*) as employees_count from EMPLOYEES
where MANAGER_ID is not null
group by MANAGER_ID
order by employees_count desc;

select COUNTRY_ID, count(*) from LOCATIONS
where COUNTRY_ID IN('US','CA')
group by COUNTRY_ID;

select * from EMPLOYEES;
select FIRST_NAME||'names'||salary as Employees_Salary from EMPLOYEES;

select concat(FIRST_NAME,'names'),salary) as Employees_Salary from EMPLOYEES;