drop table orders if exists;
drop table line_item if exists;


create table orders (order_id integer identity primary key, user varchar(255));
create table line_item (line_item_id integer identity primary key,  product varchar(255), quantity integer, order_id integer);
