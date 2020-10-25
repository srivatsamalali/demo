https://www.w3schools.com/sql/sql_autoincrement.asp
https://stackoverflow.com/questions/2601576/delete-truncate-or-drop-to-clean-out-a-table-in-mysql

### drop vs truncate vs delete

- drop table will remove the entire table with data 
- removes the structure

```sql
create table test(testid integer);
insert into test values(1);
drop table test;
```
### delete
- delete * from table will remove the data
- allows deleting specific rows.

### truncate
- truncate table will remove the data
- removes all rows
- faster than delete.

create table orders (oid char(5), ordername char(5), quantity integer);
insert into orders values('O01', 'ON1', 100);
insert into orders values('O02', 'ON1', 200);
insert into orders values('O03', 'ON2', 300);
insert into orders values('O03', 'ON2', 400);
insert into orders values('O04', 'ON2', 400);

select * from orders
where oid < 'O04';


select oid, ordername, sum(quantity) from orders
where oid < 'O04';

select oid,  sum(quantity) from orders
where oid < 'O04'
group by oid;

select oid, ordername, sum(quantity) from orders
where oid < 'O04'
group by oid, ordername;

select oid, ordername, sum(quantity) from orders
where oid < 'O04'
group by oid;

select oid, ordername, sum(quantity) from orders
where oid < 'O04'
group by oid, ordername
having sum(quantity) < 700;