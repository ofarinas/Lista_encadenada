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

        if (equals(arg0)) {
            return 0;
        }
        Node tem1 = front;
        Node tem2 = arg0.front;
        while (tem1 != null && tem2 != null) {
            if (tem1.info > tem2.info) {
                return -1;
            }
            if (tem1.info < tem2.info) {
                return 1;
            }

            tem1 = tem1.next;
            tem2 = tem2.next;
        }
        if (tem1 == null && tem2 != null) {
            return 1; 
        }
        return -1;
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
            aux = aux.next;
            aux2 = aux2.next;
        }
        if (aux2 == null && aux == null) {
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