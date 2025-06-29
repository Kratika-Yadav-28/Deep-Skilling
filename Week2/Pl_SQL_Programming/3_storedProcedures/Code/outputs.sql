SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings';

EXEC ProcessMonthlyInterest;

SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings';

SELECT EmployeeID, Name, Salary, Department FROM Employees WHERE Department = 'HR';

EXEC UpdateEmployeeBonus('HR', 10);

SELECT EmployeeID, Name, Salary, Department FROM Employees WHERE Department = 'HR';

SELECT AccountID, Balance FROM Accounts WHERE AccountID IN (1, 2);

EXEC TransferFunds(1, 2, 500);

SELECT AccountID, Balance FROM Accounts WHERE AccountID IN (1, 2);