package cs141.patrickobrien;

public class Test {
    public static void main(String[] args)
    {
        char letters[] = {'a','n','a','l','o','g'};
        letters[4] = letters[0];
        letters[5] = letters[1];

        for (int num = 5; num >= 2; num--)
        {
            System.out.print(letters[num - 1]);
        }
    }
}
