 INSERT INTO tb_users (name, email, phone, birth_date, password, roles) VALUES ('Joao', 'joao@gmail.com', '123456789', '1990-01-01', '123456', 'ROLE_USER');
 INSERT INTO tb_users (name, email, phone, birth_date, password, roles) VALUES ('Tomasi', 'tomasi@gmail.com', '123456789', '1990-01-01', '123456', 'ROLE_USER');
 INSERT INTO tb_users (name, email, phone, birth_date, password, roles) VALUES ('Maria', 'maria@gmail.com', '123456789', '1990-01-01', '123456', 'ROLE_USER');
 INSERT INTO tb_users (name, email, phone, birth_date, password, roles) VALUES ('Pedro', 'pedro@gmail.com', '123456789', '1990-01-01', '123456', 'ROLE_USER');
 INSERT INTO tb_users (name, email, phone, birth_date, password, roles) VALUES ('Carlos', 'carlos@gmail.com', '123456789', '1990-01-01', '123456', 'ROLE_USER');

 INSERT INTO tb_products (name, description, price, image) VALUES ('Notebook', 'Notebook', 100.00, 'notebook.jpg');
 INSERT INTO tb_products (name, description, price, image) VALUES ('Mouse', 'Mouse', 20.00, 'mouse.jpg');
 INSERT INTO tb_products (name, description, price, image) VALUES ('Keyboard', 'Keyboard', 30.00, 'keyboard.jpg');

 INSERT INTO tb_categories (name) VALUES ('Notebook');
 INSERT INTO tb_categories (name) VALUES ('Mouse');
 INSERT INTO tb_categories (name) VALUES ('Keyboard');  

 INSERT INTO tb_products_categories (product_id, category_id) VALUES (1, 1);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (1, 2);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (2, 1);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (3, 2);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (4, 2);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (5, 3);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (6, 3);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (7, 3);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (8, 3);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (9, 3);
 INSERT INTO tb_products_categories (product_id, category_id) VALUES (10, 3);

 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 1);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 2);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 3);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 4);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 5);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 6);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 7);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 8);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 9);
 INSERT INTO tb_orders (moment, status, user_id) VALUES (now(), 'WAITING_PAYMENT', 10);

 INSERT INTO tb_order_items (product_id, quantity, price) VALUES (1, 1, 100.00);
 INSERT INTO tb_order_items (product_id, quantity, price) VALUES (2, 1, 20.00);
 INSERT INTO tb_order_items (product_id, quantity, price) VALUES (3, 1, 30.00);

 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 1);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 2);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 3);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 4);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 5);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 6);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 7);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 8);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 9);
 INSERT INTO tb_payments (moment, order_id) VALUES (now(), 10);