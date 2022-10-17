create table "Order"
(
    id        uuid not null
            primary key,
    time      integer,
    beverages varchar,
    size      varchar,
    sugar     integer
);

alter table "Order"
    owner to postgres;
