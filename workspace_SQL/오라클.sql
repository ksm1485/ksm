select * from emp;
select * from dept;
select * from salgrade;

select empno, ename, deptno
from emp;

select ename, sal, 123, 'a' from emp;
select deptno from emp;
select distinct deptno from emp;
select distinct job, deptno from emp;
select ename, sal, sal*12+comm,comm from emp;
select ename, sal, 
sal*12+comm as s1,
sal*12+comm s2,
sal*12+comm "s s"
from emp;



