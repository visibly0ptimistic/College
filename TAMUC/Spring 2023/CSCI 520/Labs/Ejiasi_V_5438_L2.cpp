// Victor Ejiasi
// 50315438
// 2/13/2023

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

// Node structure
struct Node
{
    char name;
    Node *next;
    Node *prev;
};

// Generate a random letter
char randomLetter()
{
    return 'A' + rand() % 26;
}

// Create a circular linked list
void createCircularList(Node *&head, int size)
{
    Node *current, *prev;
    head = new Node;
    head->name = randomLetter();
    prev = head;
    for (int i = 1; i < size; i++)
    {
        current = new Node;
        current->name = randomLetter();
        prev->next = current;
        prev = current;
    }
    prev->next = head;
}

// Print the list
void printList(Node *head)
{
    Node *current = head;
    cout << current->name;
    current = current->next;
    while (current != head)
    {
        cout << "->" << current->name;
        current = current->next;
    }
}

// Search for a node
Node *searchNode(Node *head, char name)
{
    Node *current = head;
    int count = 0;
    while (current->name != name)
    {
        current = current->next;
        count++;
        if (count >= 26 || current == head)
        {
            return NULL;
        }
    }
    Node *prev = head;
    while (prev->next != current)
    {
        prev = prev->next;
    }
    return prev;
}

// Main function
int main()
{
    srand(time(NULL));
    Node *head, *manager, *temp;
    int size = 10;
    char name;
    createCircularList(head, size);
    manager = head;
    cout << "A backup plan for " << size << " employees is ready." << endl;
    cout << endl;
    cout << manager->name << " is the manager of the store." << endl;
    cout << endl;
    cout << "Backup list: ";
    printList(head);
    cout << endl;
    cout << endl;
    while (true)
    {
        cout << "Backup search for:";
        cin >> name;
        if (name == '-')
        {
            break;
        }
        temp = searchNode(head, name);
        if (temp == NULL)
        {
            cout << "There is no employee named " << name << "." << endl;
        }
        else
        {
            cout << name << " is backed up by " << temp->name << "." << endl;
        }
        cout << endl;
    }
    cout << "Bye" << endl;
    return 0;
}