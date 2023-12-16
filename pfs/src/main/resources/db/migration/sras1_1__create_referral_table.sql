--create referral table
CREATE TABLE IF NOT EXISTS t_referral (
    referral_id bigint NOT NULL,
	referral_name VARCHAR(255),
	referral_phone VARCHAR(255),
	referral_email VARCHAR(255),
	referral_address VARCHAR(255),
	referral_city VARCHAR(255),
	referral_state VARCHAR(255),
	referral_zip VARCHAR(255),
	referral_country VARCHAR(255),
	referral_date DATE,
	amount_paid decimal(10,2),
	remarks VARCHAR(255),
	project_code VARCHAR(255),
	PRIMARY KEY (referral_id)
);