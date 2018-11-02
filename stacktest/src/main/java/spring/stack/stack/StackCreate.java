/**
 * 
 */
package spring.stack.stack;

/**
 * @author Dell
 *
 */
public class StackCreate {
	 private int arrstack[];
	 private int top, size, len;
	
	 public void createStack(int num) {
	        size = num;
	        len = 0;
	        arrstack = new int[size];
	        top = -1;
	}
	 
	public void push(int element){
        if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arrstack[++top] = element;
        len++ ;
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arrstack[i]+" ");
        System.out.println();
    }
	
	public void pop(){
        len-- ;
        top--; 
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arrstack[i]+" ");
        System.out.println();
    }
	
	/*public void pop(int Toindex){
		int tmpstack[] = new int[arrstack.length] ;
		
			for(int index = arrstack.length; index> Toindex; index--) {
				push(pop());
			}	
			stack.pop();
			while (!tmpstack.isEmpty()) {
			    stack.push(tmpstack.pop());
			}
			System.out.println(arrstack);
	}*/

	   
}
