package com.aca.homework.week2.intbuffer;

public class LinkedIntBuffer extends  intBuffer{
    LinkedIntBuffer next;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedIntBuffer current = this;

            while (current != null){
                sb.append(current.getValue()).append("->");
                current = current.getNext();
            }

            sb.append(current);
        return sb.toString();
    }

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }
}
