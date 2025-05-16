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

