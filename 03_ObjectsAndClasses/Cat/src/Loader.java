
public class Loader {

      public static void main(String[] args)
    {
        Cat serega = getKitten();
        System.out.println("Cat weight: " + serega.getWeight());
        Cat max = getKitten();
        System.out.println("Cat weight: " + max.getWeight());
        Cat vlad = getKitten();
        System.out.println("Cat weight: " + vlad.getWeight());

        vlad.setColorOfCats(ColorOfCats.BROWN);
        System. out.println("Color of cat: " + vlad.getColorOfCats());

        Cat stas = new Cat(3000);
        stas.setColorOfCats(ColorOfCats.GREY);
        System.out.println("Cat weight: " + stas.getWeight());
        while (!stas.getStatus().equals("Exploded"))
        {
            stas.feed(5000);
        }

        Cat anton = new Cat(stas);
 //     Cat anton = stas.deepCopy();
        System.out.println("The cat would weigh: " + anton.getWeight());
        System.out.println("The cat would have a color: " + anton.getColorOfCats());

        System.out.println("Count of cats: " + Cat.getCount());
    }
    private static Cat getKitten()
    {
        return new Cat(1100);
    }

}