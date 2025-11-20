public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args [0]);
        int count=0;
        boolean flag=true;
        for(int i=2;i<=n;i++)
        {
            flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag = false;
                }
            }
            if(flag)
            {
                count++;
                System.err.println(i);
            }
        }
        System.err.println("There are "+count+ " primes between 2 and "+n+" ("+(int)(((double)count/n)*100)+"% are primes)");
    }
}