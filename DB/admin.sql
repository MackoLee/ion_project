-- 사용자 생성
create user sangok identified by oracle account UNLOCK;
-- 기본 권한 부여
grant connect, resource to sangok;
-- 특정 권한 부여
grant create session, create table, create view, create sequence, create procedure to sangok;