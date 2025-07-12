class ReCur{

    public static void main(String[] args){

       aditya();

    }
    public static int count = 0;
    public static void aditya(){

        if(count == 300) 
        return;
            System.out.println(count);
            count++;
            aditya();
        
    }
}