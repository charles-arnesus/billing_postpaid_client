-- Table: public.postpaid_bill

-- DROP TABLE public.postpaid_bill;

CREATE TABLE postpaid_bill
(
    biller_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    customer_account_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    due_date date NOT NULL,
    payment_date date,
    payment_id uuid,
    status character varying(255) COLLATE pg_catalog."default",
    total_amount double precision,
    CONSTRAINT postpaid_bill_pkey PRIMARY KEY (biller_id, customer_account_id, due_date)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.postpaid_bill
    OWNER to postgres;

INSERT INTO postpaid_bill(
	biller_id, customer_account_id, due_date,  status, total_amount)
	VALUES ('halo', '08123456789', '2020-09-20', 'available', 110000),
	('halo', '08123456789', '2020-08-20', 'available', 120000),
	('halo', '08123456789', '2020-07-20', 'available', 130000);