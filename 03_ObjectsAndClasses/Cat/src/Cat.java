public class Cat
{
    private double originWeight;
    private double weight;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;
    public static final int EYES_COUNT = 2;
    private double totalEatenFood;
    public static int count;
    private ColorOfCats type;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(double weight){
        this();
        this.weight = weight;
        originWeight = weight;
    }
    public Cat(Cat other) {
        this();
        if (weight > MIN_WEIGHT && weight< MAX_WEIGHT) {
            this.weight = other.weight;
            this.type = other.type;
            if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
                System.out.println("The cat cannot be created");
                count--;
            }
        }
    }

/*    public Cat deepCopy(){
        return new Cat(this);
    }
*/
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColorOfCats(ColorOfCats type){
        this.type = type;
    }

    public ColorOfCats getColorOfCats() {
        return type;
    }

    public void meow()
    {
        if (weight > MIN_WEIGHT && weight< MAX_WEIGHT) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
                count--;
                System.out.println("The cat is gone");
            }
        }
        else {
            System.out.println("The cat is gone");
        }
    }

    public void feed(double amount) // передаем кол-во еды, которым кормим кошку
    {
        if (weight > MIN_WEIGHT && weight< MAX_WEIGHT) {
            weight = weight + amount;
            System.out.println("Feed");
            totalEatenFood += amount;
            if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
                count--;
            }
        }
        else{
            System.out.println("The cat is gone");
        }
    }

    public void drink(double amount)
    {
        if (weight > MIN_WEIGHT && weight< MAX_WEIGHT) {
            weight = weight + amount;
            if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
                count--;
            }
        }
        else{
            System.out.println("The cat is gone");
        }
    }

    public double totalEatenFood() // кол-во еды, съеденное кошкой
    {
        return totalEatenFood;
    }

    public void pee()
    {
        if (weight > MIN_WEIGHT && weight< MAX_WEIGHT) {
            weight = weight - 10;
            System.out.println("I went to the toilet...Mrrrr");
            if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
                count--;
            }
        }
        else{
            System.out.println("The cat is gone");
        }
    }

    public double getWeight()
    {
            return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return ("Dead");
        }
        else if(weight > MAX_WEIGHT) {
            return ("Exploded");
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public static int getCount() {
        return count;
    }
}