 class operators {
    public static void main(String[] args) 
    {
        int i = 80;
        int j = 20;
        System.out.println(i+j); //arithmetic operators
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);

        int k = -i;
        System.out.println(k);     //unary operators
        i--;        
        System.out.println(i);
        i++;
        System.out.println(i);
        --i;
        System.out.println(i);
        ++i;
        System.out.println(i);

        int a = 2;
        int b = 3;
        if(a>b)
        {
            System.out.println("a is greater then b");  //relational operators
        }
        if(a>b)
        {
            System.out.println("a is greater then b");
        } 
        if(a<b)
        {
            System.out.println("a is leeser then b");
        }
        if(a==b)
        {
            System.out.println("a is equal to b");
        }
        if(a!=b)
        {
            System.out.println("a is not equal to  b");
        }
        if(a>=b)
        {
            System.out.println("a is greater or equal b");
        }
        if(a<=b)
        {
            System.out.println("a is lesser or equal b");
        }
        if((a>0)&&(a<2))      //conditional operators
        {
            ;
        }
        if((a!=0)||(a==2))
        {
            ;
        }
        if((a>0)&(a<2))      //bitwise operators
        {
            ;
        }
        if((a!=0)|(a==2))
        {
            ;
        }

    }

    
}
