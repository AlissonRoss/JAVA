/*
Alisson Leiva Salazar
 */
import java.util.Stack;

/*
Implement a Queue using two stacks
 */
public class Queue<T> {

    //Declarations
    //this stack is for pushing elements that are enqueued stack 1
    Stack<T> nq;

    //Pops elements that are dequed stack 2
    Stack<T> dq;

    public Queue(){
        nq = new Stack<>();
        dq=new Stack<>();
    }

    //deques an element and returns it
    public T deleteHead(){
        if(dq.isEmpty()){
            if(nq.isEmpty()){
                return null;
            }

            while (!nq.isEmpty()) {
                //move all elements from nq to dq
                dq.push(nq.pop());
            }
        }
        return dq.pop();
    }

    //enqueues an element
    public void appendTail(T element){
        nq.push(element);

    }

}
