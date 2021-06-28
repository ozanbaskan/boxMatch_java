public class Match {
    Boxer b1;
    Boxer b2;
    int maxW;
    int minW;


    Match(Boxer b1, Boxer b2, int minW, int maxW)
    {
        this.b1 = b1;
        this.b2 = b2;
        this.minW = minW;
        this.maxW = maxW;
    }

    public void run()
    {

        int start = (int) Math.round(Math.random());
        if (wCheck())
        {
            while(b1.health > 0 && b2.health > 0)
            {
                if (start == 0)
                {
                    this.b1.health = b2.hit(b1);
                    this.b2.health = b1.hit(b2);
                    if (getWinner()) break;
                }
                else
                {
                    this.b2.health = b1.hit(b2);
                    this.b1.health = b2.hit(b1);
                    if (getWinner()) break;
                }

            }
        }
        else
        {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean wCheck()
    {
        return (this.b1.weight >= this.minW && this.b1.weight <= this.maxW) && (this.b2.weight >= this.minW && this.b2.weight <= this.maxW);
    }

    boolean getWinner()
    {
        if (this.b1.health == 0)
        {
            System.out.println(this.b2.name + " kazandı!");
            return true;
        }
        if (this.b2.health == 0)
        {
            System.out.println(this.b1.name + " kazandı!");
            return true;
        }
        return false;
    }



}
