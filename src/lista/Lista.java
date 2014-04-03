/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author ENTRAR
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ExtendedQueueOfInt extendedQueueOfInt=new ExtendedQueueOfInt();
      ExtendedQueueOfInt extendedQueueOfInt1=new ExtendedQueueOfInt();
        for (int i = 0; i < 4; i++) {
       extendedQueueOfInt.insert(i);

        }
        
        ExtendedQueueOfInt copy=extendedQueueOfInt.clone();
        System.out.println(copy.equals(extendedQueueOfInt1));
        System.out.println(copy.toString()); 
                    while(copy.front!=null )  {
            System.out.println(copy.getFirst() );
            copy.front=copy.front.next;
        }
    }
}
