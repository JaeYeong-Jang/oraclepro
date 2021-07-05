drop table phonebook;

drop SEQUENCE seq_person_id;

create table phonebook(
    person_id number(5),
    name varchar2(100),
    hp varchar2(500),
    company varchar2(500),
    primary key(person_id)
);

create sequence seq_person_id
increment by 1
start with 1;

insert into phonebook values(seq_person_id.nextval,'이효리','010-1111-1111','02-1111-1111');
insert into phonebook values(seq_person_id.nextval,'정우성','010-2222-2222','02-2222-2222');
insert into phonebook values(seq_person_id.nextval,'유재석','010-3333-3333','02-3333-3333');
insert into phonebook values(seq_person_id.nextval,'이정재','010-4444-4444','02-4444-4444');
insert into phonebook values(seq_person_id.nextval,'서장훈','010-5555-5555','02-5555-5555');

select person_id,
       name,
       hp,
       company
from phonebook;

update phonebook
set hp = '010-9999-9999',
    company = '02-9999-9999'
where person_id = 4;

delete phonebook
where person_id = 5;