# Grocery List Manager

grocery_list = []

while True:
    print("\nGrocery List Manager")
    print("1. Add item")
    print("2. Remove item")
    print("3. View list")
    print("4. Exit")
    
    choice = input("Enter your choice (1-4): ")
    
    if choice == "1":
        item = input("Enter the item to add: ")
        grocery_list.append(item)
        print(f"'{item}' added to the list!")
    
    elif choice == "2":
        if not grocery_list:
            print("The list is empty!")
        else:
            item = input("Enter the item to remove: ")
            if item in grocery_list:
                grocery_list.remove(item)
                print(f"'{item}' removed from the list!")
            else:
                print(f"'{item}' not found in the list.")
    
    elif choice == "3":
        if not grocery_list:
            print("The list is empty!")
        else:
            print("\nYour Grocery List:")
            for i, item in enumerate(grocery_list, 1):
                print(f"{i}. {item}")
    
    elif choice == "4":
        print("Exiting the program. Happy shopping!")
        break
    
    else:
        print("Invalid choice. Please try again.")