public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Boxer(String name, int damage, int health, int weight, int dodge)
    {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Boxer opponent)
    {
        System.out.println(this.name + " " + opponent.name + " dövüşçüsüne " + this.damage + " hasar vurdu!");
        if (opponent.dodged())
        {
            System.out.println(opponent.name + " gelen hasarı blokladı!");
            System.out.println("======================================");
            return opponent.health;
        }
        if (opponent.health - this.damage < 0)
        {
            System.out.println(opponent.name + " öldü!");
            System.out.println("======================================");
            return 0;
        }
        System.out.println(opponent.name + " canı: " + (opponent.health - this.damage));
        System.out.println("======================================");
        return opponent.health - this.damage;
    }

    boolean dodged()
    {
        double chance = Math.random() * 100;
        return chance < this.dodge;
    }
}
