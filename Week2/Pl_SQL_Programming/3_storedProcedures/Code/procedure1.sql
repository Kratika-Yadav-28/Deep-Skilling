CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    CURSOR c_savings IS
        SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings';
BEGIN
    FOR acc IN c_savings LOOP
        UPDATE Accounts
        SET Balance = acc.Balance + (acc.Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;
    END LOOP;

    COMMIT;
END;
/



