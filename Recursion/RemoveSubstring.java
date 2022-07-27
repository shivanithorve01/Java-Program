public class RemoveSubstring {
    public static void main (String[] args)
    {
        skip("","bdapplegf");
    }
    static void skip(String op , String ip)
    {
        if(ip.isEmpty())
        {
            System.out.println(op);
            return ;
        }

        if(ip.startsWith("apple"))
        {
            skip(op,ip.substring(5));
        }
        else
            skip(op+ip.charAt(0),ip.substring(1));
    }
}
