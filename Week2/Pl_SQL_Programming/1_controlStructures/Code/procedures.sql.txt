BEGIN
    FOR cust IN (
        SELECT CustomerID
        FROM Customers
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, DOB) / 12) > 60
    ) LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

BEGIN
    FOR cust IN (
        SELECT CustomerID FROM Customers WHERE Balance > 10000
    ) LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE SendLoanReminders AS
BEGIN
    FOR loan IN (
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan.LoanID ||
                             ' for Customer ' || loan.CustomerID ||
                             ' is due on ' || TO_CHAR(loan.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/

SET SERVEROUTPUT ON;
EXEC SendLoanReminders;


