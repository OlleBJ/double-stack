public class DoubleStack {
    private double[] stack;

    private int position;

    public DoubleStack() {
        position = -1;
        stack = new double[10000];

    }

    public void push(double n) {
        position++;
        stack[position]=n;

    }
    public double pop(){
        if (!is_empty()) {
            double n = stack[position];
            stack[position] = 0;
            position--;
            //System.out.println(n);
            return n;
        }
        else {
            System.out.println("Stack empty");
            return -1;
        }
        }
        public boolean is_empty() {
        if (position==-1) return true;
        else return false;
        }

    public static void main(String[] args) {
        DoubleStack olbert = new DoubleStack();
        }
    }