## Part 1: Test it with SQL

    # List the columns and their data types in the table:

    SELECT *
    FROM INFORMATION_SCHEMA.COLUMNS
    WHERE TABLE_NAME = "job";


## Part 2: Test it with SQL

    # Write a query to list the names of the employers in St. Louis City:

    SELECT * FROM techjobs.employer
    WHERE name = "St. Louis City";


## Part 3: Test it with SQL

    # Write the SQL statement to remove the job table:

    DROP TABLE job;


## Part 4: Test it with SQL

    # Write a query to return a list of the names and descriptions of all skills that are attached to jobs in
    # alphabetical order. If a skill does not have a job listed, it should not be included in the results of this query.

    SELECT name, description
    FROM skill
    WHERE description IS NOT NULL
    ORDER BY name;

