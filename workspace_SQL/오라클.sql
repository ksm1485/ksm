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

-- sal 컬럼을 기준으로 오름차순 - 작은 것 부터 크 것 순서로
select * from emp order by sal asc;
-- sal 컬럼 기준으로 내림차순 - 큰 것부터
select * from emp order by sal desc;
-- 가장 먼저 입사한 순서로 출력
select * from emp order by hiredate;
select * from emp order by ename desc;
-- 부서번호로 오름차순, 겹치면 sal 내림차순
select * from emp order by deptno asc, sal desc;
-- deptno asc, sal desc;이 상황에서 연봉으면 사원번호 내림차순 정렬
select * from emp order by deptno asc, sal desc, empno desc;
