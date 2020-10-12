import java. io. *;
public class Mark
{

    public static void main (String args[])

    {
        Mark m = new Mark();
        m. showMark();
    }

    public void showMark()

    {

        int m1 = 75, m2 = 62, m3 = 89, m4 = 68, m5 = 77;
        int perc,total;
        total = m1+m2+m3+m4+m5;
        perc = total/5;
        if (perc>=91 && perc<=100)

        {
            System . out. println ("Grade - O    percentage - "+perc);
        }

        else if(perc>=81 && perc<=90)

        {
            System . out. println ("Grade - A    percentage - "+perc);
        }

        else if(perc>=71 && perc<=80)

        {
            System . out. println ("Grade - B    percentage - "+perc);
        }

        else if(perc>=61 && perc<=70)

        {
            System . out. println ("Grade - C    percentage - "+perc);
        }

        else if(perc>=51 && perc<=60)

        {
            System . out. println ("Grade - D    percentage - "+perc);
        }

        else if(perc>=35 && perc<=50)

        {
            System . out. println ("Grade - E    percentage - "+perc);
        }

        else

        {
            System . out . println ("Fail    percentage - "+perc);
        }

    }
}
