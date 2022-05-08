//Simple stack DS using ArrayList


import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> elements = new ArrayList<>();

    public void push(String element){
        elements.add(element);
    }

    public void pop(){
        if (elements != null) {
            elements.remove(elements.size()-1);
        }
        else
            System.out.println("Stack is empty.");
    }

    public String peak(){
        //System.out.println(elements.get(elements.size()-1));
        return elements.get(elements.size()-1);
    }

    public String toString(){
        return("elements: [" +  elements +  "]");
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("This");
        stack.push("started");
        stack.push("Here");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peak());
    }

}
