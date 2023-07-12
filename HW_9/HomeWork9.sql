CREATE TABLE questions
(
    question_number          SERIAL          PRIMARY KEY,
    question_text            VARCHAR(100)    NOT NULL
);

INSERT INTO questions(question_text)
VALUES
      ('Question1?'),
	  ('Question2?'),
	  ('Question3?');
	  
SELECT *
FROM questions;

CREATE TABLE answer_options
(
    answer_number          INTEGER          NOT NULL,
	question_number        INTEGER         REFERENCES questions (question_number),
    answer_text            VARCHAR(100)    NOT NULL,
	correct                BOOLEAN
);

INSERT INTO answer_options(answer_number, question_number, answer_text, correct)
VALUES
      (1, 1, 'A1', false),
	  (2, 1, 'B1', true),
	  (3, 1, 'C1', false),
	  (4, 1, 'D1', false),
	  (1, 2, 'A2', false),
	  (2, 2, 'B2', false),
	  (3, 2, 'C2', true),
	  (4, 2, 'D2', false),
	  (1, 3, 'A3', true),
	  (2 ,3, 'B3', false),
	  (3 ,3, 'C3', false),
	  (4, 3, 'D3', false);

SELECT *
FROM answer_options;


SELECT questions.*, answer_options.*
FROM answer_options
JOIN questions ON questions.question_number = answer_options.question_number;
