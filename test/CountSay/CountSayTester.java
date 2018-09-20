package CountSay;

public class CountSayTester {

    public static void main(String[] args)
    {
        CountSay r = new CountSay();
        if (args.length > 1)
        {
            System.out.println("missing arguments");
            //return;
        }
        int n = Integer.parseInt(args[0]);
        //String result = r.toString();
        //System.out.println(result);
    }
}