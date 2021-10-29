import java.util.Stack;

public class Game {
    public static void main(String[] args) {
        Stack<Integer> first=new Stack();
        Stack<Integer> second=new Stack();
        Boolean[] rnd=new Boolean[10];
        for (int i=0;i<10;i++) {
            rnd[i]=true;
        }
        for (int i=0;i<5;i++) {
            int temp;
            while (true) {
                temp = (int) (Math.random() * 10);
                if (rnd[temp] == true) {
                    rnd[temp] = false;
                    break;
                }
            }
            first.push(temp);
            while (true) {
                temp = (int) (Math.random() * 10);
                if (rnd[temp] == true) {
                    rnd[temp] = false;
                    break;
                }
            }
            second.push(temp);
        }
        System.out.print("First stack: ");
        for (int i=0;i<first.size();i++)
        {
            System.out.print(first.elementAt(i)+" ");
        }
        System.out.println();
        System.out.print("Second stack: ");
        for (int i=0;i<second.size();i++)
        {
            System.out.print(second.elementAt(i)+" ");
        }
        System.out.println();
        int count=0;
        while ((!first.isEmpty() && !second.isEmpty())&&(count!=106))
        {
            int temp1,temp2;
            temp1=first.remove(0);
            temp2=second.remove(0);
            if(((temp1!=9)&&(temp2!=0))&&(temp1>temp2)||((temp1==0)&&(temp2==9))||(temp1>temp2))
            {
                first.push(temp1);
                first.push(temp2);
            }
            else
            {
                second.push(temp1);
                second.push(temp2);
            }
            count++;
        }
        if (count==106)
            System.out.print("botva");
        else {
            if (first.isEmpty())
                System.out.print("Second " + count);
            else System.out.print("First  " + count);
        }
    }

}
