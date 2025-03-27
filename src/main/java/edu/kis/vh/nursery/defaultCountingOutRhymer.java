package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int EMPTY_TOTAL = -1;

    private final int[] NUMBERS = new int[NUMBERS_SIZE];

    public int total = EMPTY_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_TOTAL;
        }
        
            public boolean isFull() {
                return total == NUMBERS_SIZE-1;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return EMPTY_TOTAL;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return EMPTY_TOTAL;
                        return NUMBERS[total--];
                    }

}
