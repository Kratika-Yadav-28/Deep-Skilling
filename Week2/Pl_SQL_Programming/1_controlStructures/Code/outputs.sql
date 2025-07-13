SELECT CustomerID, LoanID, InterestRate FROM Loans;


SELECT CustomerID, Name, Balance, IsVIP FROM Customers;


SELECT LoanID, CustomerID, EndDate
FROM Loans
WHERE EndDate <= SYSDATE + 30;