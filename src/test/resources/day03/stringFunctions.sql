select * from employees;

-- Add email to @gmail domain for all employees and show column name as full_email
select * from EMPLOYEES; --> SKING@gmail.com

select EMAIL||'@gmail.com' as full_amail from EMPLOYEES;

-- CONCAT (value1, value2)
select concat(EMAIL, '@gmail.com') as full_email from EMPLOYEES;

select concat('Cydeo', concat(EMAIL, '@gmail.com')) as full_email from EMPLOYEES;

-- UPPER (varchar)
select UPPER(EMAIL||'@gmail.com') as full_email from EMPLOYEES;

-- LOwer(varchar)
select LOWER(EMAIL||'@gmail.com') as full_email from EMPLOYEES;

-- INITCAP (varchar)
-- It makes first letter uppercase
select email from EMPLOYEES;
select initcap(EMAIL) from EMPLOYEES;

-- LENGTH()
select email, length(email||'@gmail.com') as email_length from employees
order by email_length;

select FIRST_NAME from EMPLOYEES
where length(FIRST_NAME)=6;

select FIRST_NAME from EMPLOYEES
where FIRST_NAME like '______';

select count(*) from EMPLOYEES
where FIRST_NAME like '______';

select * from EMPLOYEES;
select substr(FIRST_NAME,0,1)||'.'||substr(LAST_NAME,0,1)||'.' as initials from EMPLOYEES;
select substr(FIRST_NAME,1,1)||'.'||substr(LAST_NAME,1,1)||'.' as initials from EMPLOYEES;
