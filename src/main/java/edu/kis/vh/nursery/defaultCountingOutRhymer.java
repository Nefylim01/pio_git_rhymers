package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
            return total == -1;
        }

    public boolean isFull() {
                return total == 11;
            }
        
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }
            
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }
}
