insert into BLOGGER (AGE, NAME ) values (21, 'Gyula');
insert into BLOGGER (AGE, NAME ) values (26, 'Krisz');
insert into STORY (title, content, posted, blogger_id) values ('Teszt cím', 'Teszt tartalom', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Gyula'));
insert into STORY (title, content, posted, blogger_id) values ('Teszt cím 2', 'Ez egy másik tartalom', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Gyula'));

insert into STORY (title, content, posted, blogger_id) values ('Teszt cím 3', 'Teszt tartalom By Krisz', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Krisz'));
insert into STORY (title, content, posted, blogger_id) values ('Teszt cím 4', 'Ez egy másik tartalom By Krisz ', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Krisz'))