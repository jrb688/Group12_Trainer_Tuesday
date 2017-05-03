CREATE TABLE USER
(
  user_fname VARCHAR(30) NOT NULL,
  user_lname VARCHAR(30) NOT NULL,
  user_weight FLOAT NOT NULL,
  user_id VARCHAR(50) NOT NULL,
  user_password VARCHAR(30) NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE HOST
(
  shop_name VARCHAR(50) NOT NULL,
  host_id VARCHAR(50) NOT NULL,
  password INT NOT NULL,
  host_city INT NOT NULL,
  host_state INT NOT NULL,
  address INT NOT NULL,
  PRIMARY KEY (host_id)
);

CREATE TABLE devices
(
  device_id VARCHAR NOT NULL,
  device_type INT NOT NULL,
  user_id VARCHAR(50) NOT NULL,
  PRIMARY KEY (device_id, device_type),
  FOREIGN KEY (user_id) REFERENCES USER(user_id)
);

CREATE TABLE SUBSCRIBED_USERS
(
  shop_id INT NOT NULL,
  user_id INT NOT NULL,
  user_user_id VARCHAR(50) NOT NULL,
  host_id VARCHAR(50) NOT NULL,
  FOREIGN KEY (user_user_id) REFERENCES USER(user_id),
  FOREIGN KEY (host_id) REFERENCES HOST(host_id)
);

CREATE TABLE WORKOUTS
(
  workout_id VARCHAR(50) NOT NULL,
  workout_name INT NOT NULL,
  PRIMARY KEY (workout_id)
);

CREATE TABLE WORKOUT_DATA
(
  wd_id VARCHAR(50) NOT NULL,
  workout_data .fit NOT NULL,
  date INT NOT NULL,
  host_id VARCHAR(50) NOT NULL,
  workout_id VARCHAR(50) NOT NULL,
  PRIMARY KEY (wd_id),
  FOREIGN KEY (host_id) REFERENCES HOST(host_id),
  FOREIGN KEY (workout_id) REFERENCES WORKOUTS(workout_id)
);

CREATE TABLE ATTENDEES
(
  wd_id INT NOT NULL,
  user_id VARCHAR(50) NOT NULL,
  wd_id VARCHAR(50) NOT NULL,
  FOREIGN KEY (user_id) REFERENCES USER(user_id),
  FOREIGN KEY (wd_id) REFERENCES WORKOUT_DATA(wd_id)
);
