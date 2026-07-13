-- Customer Table
CREATE TABLE Customers (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    age NUMBER,
    balance NUMBER,
    loan_interest NUMBER,
    isVIP VARCHAR2(5)
);

-- Loan Table
CREATE TABLE Loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    due_date DATE
);

-- Sample Customers
INSERT INTO Customers VALUES (1,'Rahul',65,15000,8.5,'FALSE');
INSERT INTO Customers VALUES (2,'Priya',45,9000,9.0,'FALSE');
INSERT INTO Customers VALUES (3,'Amit',70,20000,7.5,'FALSE');
INSERT INTO Customers VALUES (4,'Neha',30,12000,10.0,'FALSE');

-- Sample Loans
INSERT INTO Loans VALUES (101,1,SYSDATE+10);
INSERT INTO Loans VALUES (102,2,SYSDATE+20);
INSERT INTO Loans VALUES (103,3,SYSDATE+40);
INSERT INTO Loans VALUES (104,4,SYSDATE+5);

COMMIT;

-- Scenario 1
SET SERVEROUTPUT ON;

BEGIN
    FOR customer_record IN (SELECT * FROM Customers) LOOP

        IF customer_record.age > 60 THEN

            UPDATE Customers
            SET loan_interest = loan_interest - 1
            WHERE customer_id = customer_record.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                customer_record.customer_name ||
                ' received 1% interest discount.'
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

-- Scenario 2
SET SERVEROUTPUT ON;

BEGIN
    FOR customer_record IN (SELECT * FROM Customers) LOOP

        IF customer_record.balance > 10000 THEN

            UPDATE Customers
            SET isVIP = 'TRUE'
            WHERE customer_id = customer_record.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                customer_record.customer_name ||
                ' is now a VIP customer.'
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

-- Scenario 3
SET SERVEROUTPUT ON;

BEGIN
    FOR loan_record IN
    (
        SELECT c.customer_name,
               l.due_date
        FROM Customers c
        JOIN Loans l
        ON c.customer_id = l.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' ||
            loan_record.customer_name ||
            ', your loan is due on ' ||
            TO_CHAR(loan_record.due_date,'DD-MON-YYYY')
        );

    END LOOP;
END;
/