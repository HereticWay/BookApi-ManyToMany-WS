INSERT INTO author (id, name) VALUES
    (1, 'Giovanni Bocacchio'),
    (2, 'F. Scott Fitzgerald');

INSERT INTO book (id, title) VALUES
    (1, 'Bible'),
    (2, 'The Decameron'),
    (3, 'The Life of Dante'),
    (4, 'The Great Gatsby'),
    (5, 'The Curious Case of Benjamin Buttons');

INSERT INTO book_author (book_id, author_id) VALUES
    (2, 1),
    (3, 1),
    (3, 2),
    (4, 2),
    (5, 2);