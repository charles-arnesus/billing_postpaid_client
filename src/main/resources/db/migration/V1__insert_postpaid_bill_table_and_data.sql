-- Table: public.pdam_bill

-- DROP TABLE public.pdam_bill;

CREATE TABLE pdam_bill
(
    biller_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    customer_account_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    due_date date NOT NULL,
    payment_date date,
    payment_id uuid,
    status character varying(255) COLLATE pg_catalog."default",
    total_amount double precision,
    CONSTRAINT pdam_bill_pkey PRIMARY KEY (biller_id, customer_account_id, due_date)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.pdam_bill
    OWNER to postgres;

INSERT INTO pdam_bill(
	biller_id, customer_account_id, due_date,  status, total_amount)
	VALUES ('pdam_bandung', '112233', '2020-09-20', 'available', 110000),
	('pdam_bandung', '112233', '2020-08-20', 'available', 120000),
	('pdam_bandung', '112233', '2020-07-20', 'available', 130000);