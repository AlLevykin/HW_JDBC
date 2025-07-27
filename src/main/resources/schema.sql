create table if not exists customers(
    id bigserial primary key,
    name varchar(32) not null,
    surname varchar(32) not null,
    age int,
    phone_number varchar(15)
);

create table if not exists orders(
    id bigserial primary key,
    date date,
    customer_id bigint,
    product_name varchar(32) not null,
    amount decimal
);