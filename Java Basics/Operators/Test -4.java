class Test{
    public static void main(String[] args){
        int a=10;
        int b=a++;//post incr : first assign, then incr 
        System.out.println(a); //11
        System.out.println(b); //10

    }
}