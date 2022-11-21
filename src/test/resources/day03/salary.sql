select * from EMPLOYEES
where rownum<11;

select * from EMPLOYEES
where rownum<6
order by SALARY desc;

select * from (select * from EMPLOYEES order by salary desc)
where rownum <6;