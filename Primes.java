public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args [0]);
        System.out.println("Prime numbers up to "+n+ ":");
        int count=0;
        boolean [] arr = new boolean [n+1];
        for(int i=2;i<arr.length;i++)
        {
            arr[i]=true;
        }
        boolean flag=true;
        int p=2;
        while(p<=Math.sqrt(n))
        {
           for(int i=p+1;i<n+1;i++)
           {
                if(i%p==0 && arr[i])
                {
                    arr[i]=false;
                }
           }
           p++;
           while(!arr[p] && p<=Math.sqrt(n))
           {
                p++;
           }
        }
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i])
            {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("There are "+count+ " primes between 2 and "+n+" ("+(int)(((double)count/n)*100)+"% are primes)");
    }
}