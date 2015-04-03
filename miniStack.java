//Dign a stack that supports push, pop, top, and retrieving the minimum element in constant time.

//push(x) -- Push element x onto stack.
//pop() -- Removes the element on top of the stack.
//top() -- Get the top element.
//getMin() -- Retrieve the minimum element in the stack.


void push(int x) {
        s.push(x);
        if (sMin.empty() || x < sMin.top())
            sMin.push(x);
        else
            sMin.push(sMin.top());

