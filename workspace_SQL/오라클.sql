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

select * from emp where deptno = 30;
select * from emp where deptno = 30 order by sal;

-- sal이 1600인 사람만 출력
select * from emp where sal = 1600;
-- 초과
select * from emp where sal > 1600;
-- 이상
select * from emp where sal >= 1600;
-- 이하
select * from emp where sal <= 1600; -- =이 오른쪽
-- 부정
select * from emp where deptno != 30;
select * from emp where deptno <> 30;

-- and
select * from emp where deptno = 30 and job = 'SALESMAN';
-- or
/* emp 테이블에서 deptno(부서번호)값이 30 이거나 job(직업)이 CLERK(점원)인 것 */
select * from emp where deptno = 30 or job = 'CLERK';

/* job이 clerK 이거나 sal이 2000 초과면서 deptno가 10인 사원 조회*/
select * from emp where job = 'CLERK' or sal > 2000 and deptno = 10;
/* and, or 같이 있는경우 괄호로 먼저 실행해야 하는것을 묶어주는게 편함*/ 
select * from emp where job = 'CLERK' or (sal > 2000 and deptno = 10);

select * from emp where not (job = 'CLERK' or (sal > 2000 and deptno = 10));
/*   deptno != 30, deptno <> 30, deptno ^= 30, not deptno = 30    */

-- 월급 2000이상 4000미만인 사원을 출력하시오
select * from emp where sal >= 2000 and sal < 4000;
-- 부서번호 10또는 20인 사원만 출력
select * from emp where deptno = 10 or deptno = 20;
-- 또는을 간추릴때 in을 쓴다
select * from emp where deptno in (10, 20);
-- 아닌 애들만 나오는것 not
select * from emp where deptno not in (10, 20);

-- *퀴즈*
-- 1.부서번호가 10인 사람들을 출력
select * from emp where deptno = 10;
-- 2.부서번호가 10번이 아닌 사람들을 출력
select * from emp where deptno != 10;
-- 3.급여가 3000 이상인 사람들을 출력
select * from emp where sal >= 3000;
-- 4.급여가 1500~3000 사이(포함)의 사람을 출력
select * from emp where sal >= 1500 and sal <= 3000;
-- 5.부서번호가 10번인 사람 중 급여 2000 이상인 사람들 출력
select * from emp where deptno = 10 and sal >= 2000;
-- 6. 부서번호가 30번 중 1500~3000 사이(미포함)인 사람을 출력
select * from emp where deptno = 30 and sal > 1500 and sal < 3000;
-- 7. 부서번호 30번중 1500~3000 사이(미포함)인 사람을 연본이 작은 순으로 출력, 연봉이 같은 경우 이름 빠른순으로 출력
select * from emp where deptno = 30 and sal > 1500 and sal < 3000 order by sal asc, ename asc;
-- 8. 부서번호 20,30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력,연봉이 같은 경우 이름이 빠른 순으로 출력
select * from emp where (deptno = 20 or deptno = 30) and (sal > 1500 and sal < 3000) order by sal asc, ename asc;
-- 9. 부서번호가 20또는 30이고 급여거 1500이산인 직원의 이름과 급여를 급여 오름차순으로 출력하시오
select ename, sal from emp where (deptno = 20 or deptno = 30) and sal >= 1500 order by sal asc;

select * from emp where sal between 2000 and 3000 and deptno not in (20,30);
select * from emp where sal not between 2000 and 3000;
-- 2000 초과, 3000미만
select * from emp where sal between 2000 and 3000 
and sal != 2000 
and sal != 3000;

--like(S로 시작한 사원 출력)
select * from emp where ename like 'S%';
-- 첫번째 상관없음
-- 두번째 무조건 L
-- 그 이후 상관없음
select * from emp where ename like '_L%';
select * from emp where ename like '%AM%';
-- A로 포함한 사원 출력
select * from emp where ename like '%A%';
-- A라는 포함한 사원 뺴고 나머지
select * from emp where ename not like '%A%';
select * from emp where ename like '%A%S%' or ename like '%S%A%';
select * from emp where ename like '%A%' or ename like '%a%';

select comm from emp;
-- null
select * from emp where comm < 400;
select * from emp where comm is null;
select * from emp where mgr is null;
select * from emp where comm is not null;

select * from emp where deptno = 10;
select * from emp where deptno = 20;
-- union 앞에 있는 조회결과와 뒤에 있는 조회결과 합쳐서 조회(중복x)
select * from emp where deptno = 10 
union
select * from emp where deptno = 10;

select * from emp where deptno = 10 
union all
select * from emp where deptno = 10;

select empno from emp
union all
select sal from emp;

-- 부서 10번을 사원번호 내림차순으로 정렬하여 출력
select * from emp where deptno = 10 order by ename desc;
-- 부서 20번을 사원번호 오름차순으로 정렬하여 출력
select * from emp where deptno = 20 order by ename asc;

-- Q5번 사원 이름에 E가 포함된 30번 부서의 사원 중 급여가 1000~2000 사이가 아닌 사원 이름, 사원번호, 부서번호를 출력하는 SQL 구문
select ename, empno, sal, deptno from emp where ename like '%E%' and deptno = 30 and sal not between 1000 and 2000;
-- Q6 추가수당 없고 상급자가 있고 직책이 매니저, 사원인 사원중에거 사원이름의 두번째 글자가 L이 아닌 사원의 정보를 출력하는 SQL 구문
select * from emp where comm is null 
and mgr is not null 
and job in ('MANAGER', 'CLERK') 
and ename not like '_L%';

-- upper(), lower()
select ename, upper(ename), lower(ename), initcap(ename) from emp;
select ename  from emp where lower(ename) like lower('%aM%');

select 1 from dual;
select 'abc' from dual;
select upper('abc'), lower('abc') from dual;

select ename, length(ename) from emp;

select * from emp where length(ename) = 5;

select lengthb('a'), lengthb('한') from dual;
desc emp;

-- substr
select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;
-- 사원 이름을 두번째부터 3글자만 출력
select substr(ename, 2, 30) from emp;
select job, substr(job, -3, 2) from emp;
select job, substr(job, -30, 2) from emp;

-- 이름의 마지막 3글자만 출력하기
select ename, substr(ename, -3) from emp;
select ename, substr(ename, -3, 10) from emp;

SELECT '010-1234-5678' as replace_before,
replace('010-1234-5678', '-', ' ') as asd,
replace('010-1234-5678', '-') as replace_2 from dual;

--lpad(모자르면 채우고, 넘어가면 자르고)
select lpad(ename, 10, '+') from emp;
select lpad(ename, 5, '+') from emp;

-- 문제1 ename 앞에 두글자만 출력
select ename, substr(ename, 1, 2) from emp;
-- 문제2 앞에 두글자만 원본을 출력하고 나머지는 4개의 *로 표시
select rpad(substr(ename, 1, 2), 6, '*') from emp;
-- 문제3 사원 이름 두글자만 보이고 나머지는 *로. 단, 원래 이름 길이 만큼 표시
select rpad(substr(ename, 1, 2), length(ename), '*') from emp;
-- 심화(job 총 20자 중 가운데 정렬)

select 'ab' || 'cd' from dual;
select empno || ' : ' || ename from emp;
select ' ab c   ', trim('     ab c   ') from dual;

--round
select 
    round(14.46), -- 하나만 입력하는 소수점 첫째자리 반올림
    round(14.46, 1), -- 소수점 두번째 자리
    round(14.46, -1)
 from dual;
 
 select trunc(14.46),
        trunc(14.46, 1),
        trunc(14.46, -1),
        trunc(-14.46) from dual;
select 
     ceil(3.14),
     floor(3.14),
     ceil(-3.14),
     floor(-3.14), 
     trunc(-3.14) from dual;
     
select 7 / 3 from dual;
select 7 / 0 from dual;
-- 나누기 나머지 값
select mod(7, 3) from dual;
select mod(8, 3) from dual;

select sysdate from dual;

select empmo, empno + '1000' from emp;
select empmo, empno + 'abcd' from emp;
select 'a' + 'b' from dual;
select 'a' || 'b' from dual;

select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from dual;
select to_char(hiredate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from emp;

select to_date('2025-05-15', 'yyyy-mm-dd') from dual;
select to_date('2025-05-15', 'yyyy-mm-dd') - to_date('2025-05-12', 'yyyy-mm-dd') from emp;
select * from emp where hiredate > to_date('1987-06-01','yyyy-mm-dd');

select sal*12 + comm, sal*12 + nvl(comm, 0) from emp;

-- 각 사원의 연봉을 출력
select sal, ename from emp;
-- 월급*12+comm
select sal * 12 + comm from emp;
-- ename, total_pay 출력
select ename, sal*12 + comm total_pay from emp;
-- 최종
select ename, sal, comm, sal*12 + nvl(comm, 0) as total_pay from emp;

select empno, ename, job, sal, 
             decode(job, 
                        'MANAGER', sal*1.1, 
                        'SALEMAN', sal*1.05, 
                        'ANALYST', sal, 
                        sal*1.03) as upsal from emp;
SELECT
    empno, ename, job, sal,
    CASE job
        WHEN 'MANAGER'  THEN sal * 1.1
        WHEN 'SALESMAN' THEN sal * 1.05
        WHEN 'ANALYST'  THEN sal
        ELSE sal * 1.03
    END upsal FROM emp;

-- nvl 사용하지 않고, decode, case로 nal이랑 동일한 결과 출력하기
select nvl(comm, -1) from emp;

SELECT
    empno, ename, comm,
    CASE
        WHEN comm is null  THEN '해당 사항 없음'
        WHEN comm = 0 THEN '수당없음'
        WHEN comm > 0 THEN '수당 : ' || comm
    END as comm_TEXT FROM emp;

--179 문제1
select 
    ename, empno, 
       rpad(substr(empno, 1, 2), 4, '*'), 
       rpad(substr(ename, 1, 1), 5, '*')    
 from emp 
 where
    length(ename) >= 5 
    and length(ename) < 6;

-- 문제2
select 
    empno, ename, sal,
    trunc(sal / 21.5, 2) as day_pay,
    round((sal / 21.5) / 8, 1) as time_pay
from emp;

-- 문제3
select empno, ename, hiredate,
       add_months(hiredate, 3) as R_JOB from emp;

-- 문제4
select empno, ename, mgr,
       case 
           when mgr is null then '0000'
           when substr(mgr, 1, 2) = 75 then '5555'
           when substr(mgr, 1, 2) = 76 then '6666'
           when substr(mgr, 1, 2) = 77 then '7777'
           when substr(mgr, 1, 2) = 78 then '8888'
           else to_char(mgr)
    end from emp;

-- sum
select sum(sal) from emp;
--deptno 10 것만 더하기
select sum(sal) from emp where deptno = 10;

select sum(comm) from emp;
select count(*) from emp;
select count(*), sum(sal) from emp;
select count(sal), count(comm) from emp;

select max(sal), min(sal) from emp;
select max(sal), min(sal), min(hiredate), min(comm) from emp;
-- 이름에 a가 들어가는 사람은 몇명?
select count('*') from emp where ename like '%A%';

select avg(sal) from emp;
-- 다중행 함수(집계 함수)는 where에서 사용할 수 없다.
-- select * from emp where sal > avg(sal);

select deptno, sum(sal), count(*) from emp group by deptno;
select job from emp group by job;
select deptno, job, count(*), ename from emp group by deptno, job, ename;
select job from emp where deptno = 10 group by job order by job desc;

select job, deptno, avg(sal) 
from emp
group by deptno, job 
having avg(sal) > 2000;

/* 5 */ select job, count(*) as cnt
/* 1 */ from emp
/* 2 */ where sal > 1000-- and cnt >= 3 -- and count(*) >= 3
/* 3 */ group by job
/* 4 */ having count(*) >= 3
/* 6 */ order by cnt desc;
---------------------------------------------------------------
select * from dept;

select * 
from emp, dept 
order by empno;

select * 
from emp, dept 
where emp.deptno = dept.deptno 
order by empno;

select * 
from emp e, dept d 
where e.deptno = d.deptno 
order by empno;
-- where e, deptno = d.deptno;

select e.ename, e.deptno
from emp e, dept d
where e.deptno = d.deptno;

select * from salgrade;

select * 
from emp e, salgrade s 
where e.sal between s.losal and s.hisal;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;
-- 총 13개 나옴
select count(*) 
from emp e1, emp e2
where e1.mgr = e2.empno;

select e1.empno, e1.ename, e1.mgr,
       e2.empno as mgr_empno,
       e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno(+)
order by e1.empno;

select empno, ename, deptno
from emp e join dept d using(deptno)
where sal >= 3000;

select empno, ename, e.deptno
from emp e left outer join dept d on(e.deptno = d.deptno);

select * from emp e1 right outer join emp e2 on(e1.mgr = e2.empno);
----------------------

--퀴즈
--각 부서별로 급여가 가장 높은 사원, 가장 낮은 사원의 급여 차이와 부서번호를 출력
select deptno, max(sal), min(sal), max(sal) - min(sal) 급여차이
from emp
group by deptno;
--심화문제
--(job을 총 20자 중 가운데 정렬)
select 
job,
lpad( job, length(job)/2 + 20/2, '-'),
rpad(lpad(job, length(job)/2 + 20/2, '-'),
20,'-' ) from emp;
--226p 풀이
--Q1
select e.deptno as deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno 
and sal > 2000 
order by d.deptno, dname;
--Q2
select deptno, floor( avg(sal) ), max(sal), min(sal), count(*) 
from emp e left outer join dept d using (deptno)
group by deptno
order by deptno;
--Q3
select d.deptno, dname, empno, ename, job, sal
from dept d left outer join emp e on d. deptno = e.deptno
order by d.deptno, e.ename;
--Q4
select d.deptno, d.dname, e.empno, e.ename, e.mgr,
e2.empno mgr_empno, e2.ename mgr_ename
from dept d
left outer join emp e on (d.deptno = e.deptno)
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
left outer join emp e2 on (e.mgr = e2.empno)
order by d.deptno, e.empno;

select * 
from emp
where sal > (select sal from emp where ename = 'JONES');

select * from emp
where hiredate < (select hiredate from emp where ename = 'SCOTT');

select * from emp where sal > (select avg(sal) from emp);

select max(sal) from emp
group by deptno;

select *
from emp
where sal in (select max(sal) from emp group by deptno);

--from절에서의 서브쿼리
select * 
from(select * from emp where deptno = 10) e10, dept d
where e10.deptno = d.deptno;

select * from(
select job, count(*) cnt
from emp
group by job)
where cnt >= 3;

select rownum rn, emp.*
from emp
order by sal desc;
==
select rownum rn, e.*
from(select emp.*
from emp
order by sal desc) e;
---------------------------------
select * 
from (select rownum rn, e.*
from(select emp.*
from emp
order by sal desc) e)
where rn >= 2 and rn <= 4;

--with
with e10 as ( select * from emp where deptno = 10)
select ename from e10;

select empno, ename, job, sal,
(select grade
from salgrade
where e.sal between losal and hisal) as salgrade,
deptno,
(select dname 
 from dept
 where e.deptno = dept.deptno) as dname
 from emp e;

--join의 기본 형태
select *
from emp e, dept d
where e.deptno = d.deptno;

 --249p 문제
--Q1
select job, empno, ename, sal, d.deptno, dname
from emp e, dept d
where e.deptno = d.deptno and e.job = (select job from emp where ename = 'ALLEN');
--Q2
-- 1. 전체 사원 평균 급여 확보
-- 2. 평균보다 초과하는 사람들 출력
-- 3. 정렬은 급여 내림차순, 사원번호 오름차순
select empno, ename,
      (select dname from dept d where deptno =  d.deptno) dname, hiredate,
      (select grade from salgrade s where sal >= s.losal and sal <= s.hisal)
from emp  
where sal > (select avg(sal) from emp)
order by sal desc, empno desc;
--Q3
select job, 10 from emp where deptno = 10
union all
select distinct job, 30 from emp where deptno = 30;

select empno, ename, job, deptno, dname
from emp
where deptno = 10
and job not in (select job from emp where deptno = 30);
--Q4
select empno, ename, sal, grade 
from emp e
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
where sal > (select max(sal) from emp where job = 'SALESMAN');
--    sal > all (select sal  from emp where job = 'SALESMAN');  
--문제
--1.커미션이 null인 사원을 급여 오름차순으로 정렬
select * 
from emp
where comm is null
order by sal asc;
--2.(급여 등급 별) (사원 수)를 등급 (오름차순)으로 정렬 (단, 모든 등급을 표시한다)
select s.grade, count(*)
from emp e, salgrade s
where e.sal between s.losal and s.hisal
group by s.grade 
order by s.grade asc;
--3.이름, 급여, 급여 등급, 부서이름 조회 단, (급여 등급 3 이상만 조회). 급여 등급 내림차순, 급여 등급이 같은 경우 급여 내림 차순
select e.ename, e.sal, s.grade, d.dname
from emp e, salgrade s, dept d
where e.sal between s.losal and s.hisal
and e.deptno = d.deptno
and s.grade >= 3
order by s.grade desc, e.sal desc;
--4.부서명이 SALES인 사원 중 급여 등급이 2 또는 3인 사원을 급여 내림차순으로 정렬
select *
from emp e
left outer join dept d using (deptno) -- 괄호 필수
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
-- where s.grade = 2 or s.grade = 3
where s.grade in (2, 3)
order by e.sal desc;
-------------------------------------------------
desc emp;

-- 테이블 만들기
create table emp_ddl(
empno number(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2)
);
desc emp_ddl;
select * from emp_ddl;

create table dept_ddL
as select * from dept;

desc desc_ddl;
select * from dept_ddl;

create table emp_ddl_30
as select * from emp where deptno = 30;

select * from emp_ddl_30;

create table empdept_ddl
as select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc
from emp e, dept d
where 1 <> 1;
select * from empdept_ddl;

create table emp_alter
as select * from emp;
select * from emp_alter;

alter table emp_alter
add hp varchar2(20);
desc emp_alter;
select * from emp_alter;

alter table emp_alter
add age number(3) default 1;

alter table emp_alter
rename column hp to tel;
select *from emp_alter;

alter table emp_alter
modify empno number(5);
desc emp_alter;
-- 수정할 때 타입의 크기가 커지는건 가능하지만 줄어드는건 안됨
alter table emp_alter
modify empno number(4);
select * from emp_alter;

alter table emp_alter
drop column tel;

rename emp_alter to emp_rename;
select * from emp_rename;

truncate table emp_rename;

drop table emp_rename;
----------------------------------------
--10장 
create table dept_temp
as select * from dept;
select * from dept_temp;

insert into dept_temp(deptno, dname, loc)
values(50, 'datavase', 'seoul');
select * from dept_temp;

insert into dept_temp
values(60, 'NETWOKE', 'BUSAN');
select * from dept_temp;

--------------create table dept_temp
--------------as select * f

insert into emp_temp(empno, ename, hiredate)
values ( 2111, '이순신', to_date('2025-05-21', 'yyyy-mm-dd') );

insert into emp_temp (empno, ename, hiredate)
values ( 3111, '심청이', sysdate );

insert into emp_temp
select * from emp where deptno = 10;

create table dept_temp2
as select * from dept;
select * from dept_temp2;

--update
update dept_temp2
set loc = 'SEOUL';

select * from dept_temp2;
--update, delete의
--where를 무조건 select에서 검증하고 사용하기
update dept_temp2
set dname = 'DATEBASE',
loc = 'SEOUL2'
where deptno = 40;

select * from dept_temp2
where deptno = 40;

create table emp_tmp
as select * from emp;
select * from emp_tmp;

-- 연봉이 3% 조회 
select sal, sal * 1.03
from emp_tmp
where sal < 1000;
--수정
update emp_tmp
set sal = sal *1.03
where sal < 1000;
--결과
select *
from emp_tmp
where sal < 1000;

--delete
create table emp_temp2
as select * from emp;
select * from emp_temp2;

commit;  --save개념

delete emp_temp2; --삭제

rollback; --커밋까지 복구

select * from emp_temp2; -- 결과

-- 10번 부서를 지워보자
delete emp_temp2
where deptno = 10;

select * from emp_temp2;

select * from dict;

select * from user_tables;
--indexes
select * from user_indexes;

create index idx_emp_sal 
on emp(sal);

select /*+ index(e idx_emp_sal) */ --강제 힌트 
* from emp e 
where sal = 2000;

--view

create view vw_emp20
as(select empno, ename, job, deptno
from emp
where deptno = 20);

select * from dept_temp;

--sequence(조회할때마다 숫자 증가)
create sequence seq_dept
start with 10;

select seq_dept.nextval
from dual;

insert into dept_temp (deptno, dname, loc)
values (seq_dept.nextval, '테스트', '천안');
select * from dept_temp;

---primary key
create table table_pk(
login_id varchar2(20) primary key,
login_pwd varchar2(20) not null,
tel varchar2(20));

select * from table_pk;
--아마 존재하는 것 추가
insert into table_pk
values('id', 'pw', null);
--null로 추가
insert into table_pk
values(null, 'pw', null);
--null로 변경
update table_pk
set login_id = null
where login_id = 'id';
-- 이미 존재하는 것으로 변경
update table_pk
set login_id = 'id2'
where login_id = 'id';

--forign key
create table dept_fk(
deptno number(2) constraint pk_dept primary
dname varchar2(14),
loc varchar2(13));
---------------------------------------------------------------???????
create table dept_fk
empno number(4) constraint pk_emp_fk primary key
dname varchar2(14)
loc varchar2(13));

select * from dept_fk;

insert into dept_fk
values ( 1000, '이름', 10);

insert into dept_fk
values ( 1000, '부서' '위치');

insert into emp_fk
values ( 1000, '이름', 10);
select * from emp_fk;

update emp_fk
set deptno = 20
where deptno = 10;

delete dept_fk
where deptno = 10;

delete emp_fk
where deptno = 10;

update emp_fk
set deptno = 20
where deptno = 10;

desc emp;
---------------------------------------------------------------
select empno, ename from emp;


select empno, ename from emp order by empno asc;


select ename, rpad(substr(empno, 1, 2), 4, '*') from emp; 
-------------------------------------------------------------




select e.empno, e.ename, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno
order by d.dname desc;
