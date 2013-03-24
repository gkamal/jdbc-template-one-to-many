insert into orders (order_id, user) values(1, 'Kamal');

insert into orders (order_id, user) values(2, 'Selva');
insert into orders (order_id, user) values(3, 'Anil');

insert into line_item (line_item_id, product, quantity, order_id) values(1,'Pen', 5, 1);
insert into line_item (line_item_id, product, quantity, order_id) values(2,'Notebook', 3, 1);
insert into line_item (line_item_id, product, quantity, order_id) values(3,'Marker', 2, 1);

insert into line_item (line_item_id, product, quantity, order_id) values(4,'Pen', 10, 2);
insert into line_item (line_item_id, product, quantity, order_id) values(5,'Notebook', 4, 2);
insert into line_item (line_item_id, product, quantity, order_id) values(6,'Marker', 2, 2);

insert into line_item (line_item_id, product, quantity, order_id) values(7,'Notebook', 4, 3);
