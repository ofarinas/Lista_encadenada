/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import lista.QueueOfInt;

/**
 *
 * @author ENTRAR
 */
public class ExtendedQueueOfInt extends QueueOfInt
        implements Comparable<QueueOfInt>, Cloneable {

    @Override
    public int compareTo(QueueOfInt arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean equals(Object arg0) {
        ExtendedQueueOfInt extendedQueueOfInt = (ExtendedQueueOfInt) arg0;
        Node aux = front;
        Node aux2 = extendedQueueOfInt.front;

        while (aux != null && aux2 != null) {
            if (aux.info != aux2.info) {
                return false;
            }
            aux=aux.next;
            aux2=aux2.next;
        }
        if (aux2 ==null &&aux==null) {
            return true;
        }
        return false;
}
@Override
        public String toString() {
        if (front == null) {
            return "<<";
        }
        String aux = "<";
        Node nodo = front;
        while (nodo != null) {
            aux += nodo.info;
            if (nodo.next != null) {
                aux += "-";
            }
            nodo = nodo.next;
        }
        aux += ">";
        return aux;
    }

    @Override
        public ExtendedQueueOfInt clone() {
        ExtendedQueueOfInt extendedQueueOfInt = new ExtendedQueueOfInt();
        Node node = front;
        while (node != null) {
            extendedQueueOfInt.insert(node.info);
            node = node.next;
        }
        return extendedQueueOfInt;
    }
}