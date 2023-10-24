/*   CSCI 515
 
 Victor Ejiasi
 
 Practice Program 7 Q2
 
*/

#include <iostream>
#include <string>
using namespace std;

// The bank account class is defined here
// The class contains the following data members:
class Bank_Account {
    private:
        int accountNumber;
    string accountName, accountType;
    long double accountBalance;
    public:
        static int objectCount; 

// The data members of the bank account class are initialized here
    void init(int number, string name, string type, long double balance)
    {
        objectCount++;
        accountNumber = number;
        accountName = name;
        accountType = type;
        accountBalance = balance;
    }

// The deposit function is defined here
    void deposit(long double amount)
    {
        // The account balance is updated here
        accountBalance = accountBalance + amount;
    }

// The withdraw function is defined here
    void withdraw(long double amount)
    {
        // The account balance is checked to see if it is less than the amount to be withdrawn
        if (amount <= accountBalance)
        {
        accountBalance = accountBalance - amount;
        cout << "\nThe amount withdrawn is " << amount << endl;
        cout << "The new balance is " << accountBalance << endl;
        } else
        {
        cout << "\nAmount requested for withdrawal more than balance";
        }
    }

// The balance function is defined here
    void bal()
    {
        // The account balance is displayed here
        cout << "\nBalance is: " << accountBalance;
    }
    };

int Bank_Account::objectCount = 0;

// The main function is defined here
int main() {

// The bank account class is instantiated here
    int no, c, bal;
    string name, type;

// Enter the number of accounts to create 
    cout << "Enter number of bank account to create: ";
    cin >> c;


    Bank_Account ba[c];
    for (int i = 0; i < c; i++)
    {
        // Enter the account number, name of the depositor, type of account and the initial balance here
        cout << "\nBank Account " << i + 1 << " details" << endl;
        cout << "Enter the Bank Account Number: ";
        cin >> no;
        cout << "Enter the Name of the Depositor: ";
        cin >> name;
        cout << "Enter the Bank Account Type: ";
        cin >> type;
        cout << "Enter the Bank Account Balance: ";
        cin >> bal;
        ba[i].init(no, name, type, bal);
    }

    // The number of bank accounts created is displayed here
    cout << "\nNumber of Account Objects created: " << Bank_Account::objectCount << endl;; 

    // withdraw function is invoked here
    ba[0].withdraw(1000);

    return 0;
}

