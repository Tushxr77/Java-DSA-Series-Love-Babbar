Stack<Integer> stackList = new Stack<>();

stackList.add(10);
stackList.add(20);
stackList.add(30);
stackList.add(40);
stackList.add(50);
stackList.add(90);

System.out.println("Stack List " + stackList);

// Push
stackList.push(60);
System.out.println("Stack List after push " + stackList);

// Pop
stackList.pop();
System.out.println("Stack List after pop " + stackList);

// Peek
System.out.println("Top element: " + stackList.peek());

// Search
System.out.println("Position of 40: " + stackList.search(40));

// Empty
System.out.println("Is stack empty: " + stackList.empty());
