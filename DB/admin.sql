-- ����� ����
create user sangok identified by oracle account UNLOCK;
-- �⺻ ���� �ο�
grant connect, resource to sangok;
-- Ư�� ���� �ο�
grant create session, create table, create view, create sequence, create procedure to sangok;