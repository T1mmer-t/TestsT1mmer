package TestsT1mmer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class temuri {
    public static void main(String[] args) {
        ArrayList List1 =  new ArrayList();
        ArrayList New = new ArrayList();
        Random rand = new Random();

        for (int j = 0; j<12; j++)
        {
            New.add(rand.nextInt(10 - 4) + 5);
            List1.add(rand.nextInt(100));
        }
        Even(List1);

        _3multiple(New,rand);

    }
    public static void  Even(ArrayList newlist){
        ArrayList List2 = newlist;
        System.out.println(newlist);
        for (int i=0; i < List2.size();){
            List2.remove(i);
            i++;
        }
        Collections.sort(List2);
        System.out.println(List2);



    }
    public static void _3multiple(ArrayList New, Random rand){
        ArrayList Axali = new ArrayList();
        Axali = New;
        System.out.println(New);
        for (int i=0; i < 12;i++){
            i++;
            i++;
            i++;
            Axali.add(i,rand.nextInt(25 - 19) + 20);
        }

        System.out.println(Axali);

    }
}