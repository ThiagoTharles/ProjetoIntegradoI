CREATE TABLE student(
	tokken VARCHAR PRIMARY KEY,
	name_student VARCHAR NOT NULL
);

CREATE TABLE activity(
	activity_ID SERIAL PRIMARY KEY,
	name_activity VARCHAR NOT NULL,
	hourAlocatted DOUBLE NOT NULL,
	timer_summary_FK INT,
	FOREIGN KEY(timer_summary_FK) REFERENCES timer(timer_ID)
);

CREATE TABLE timer (
	timer_ID SERIAL PRIMARY KEY,
	allocated_time_FK INT,
	date_timer DATE,
	pomodoro INT,
	isPaused BOOLEAN,
	shortBreak INT,
	longBreak INT,
	FOREIGN KEY (allocated_time_FK) REFERENCES clock(clock_ID)
);

CREATE TABLE clock(
	clock_ID SERIAL PRIMARY KEY,
	clock_hour INT,
	clock_minute INT,
	clock_second INT
);

CREATE TABLE dashboard(
	tokken_student_FK INT,
	activity_ID_FK INT,
	ADD CONSTRAINT dashboar_PK 	PRIMARY KEY (tokken_student_FK, activity_ID_FK),
	FOREIGN KEY (tokken_student_FK) REFERENCES student(tokken),
	FOREIGN KEY (activity_ID_FK) REFERENCES activity(activity_ID)
);










