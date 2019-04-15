import java.util.Scanner;
import java.lang.*;



public class RPN {
    public static void main(String[] args) {
        DoubleStack stacken = new DoubleStack();
        int i;
        Scanner input = new Scanner(System.in);
        String dbl = input.nextLine();
        String[] splitStr = dbl.split("\\s+");
        int arrayLength = splitStr.length;
        for (i = 0; i < arrayLength ; i++ ) {
            if (splitStr[i].matches("\\+")) {
                double a = stacken.pop();
                double b = stacken.pop();
                double c = b + a;
                stacken.push(c);
            }
            else if (splitStr[i].matches("\\-")){
                double a = stacken.pop();
                double b = stacken.pop();
                double c = b - a;
                stacken.push(c);
            }
            else if (splitStr[i].matches("\\*")) {
                double a = stacken.pop();
                double b = stacken.pop();
                double c = b * a;
                stacken.push(c);
            }
            else if (splitStr[i].matches("\\/")){
                double a = stacken.pop();
                double b = stacken.pop();
                double c = b / a;
                stacken.push(c);

                }
            else if (splitStr[i].matches("\\=")){
                System.out.println(stacken.pop());
                }
            else {
                double n = Double.parseDouble(splitStr[i]);
                stacken.push(n);
            }

        }






    }
}