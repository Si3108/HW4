public  class Sample16 {
    public static void main(String[] args) throws Exception {
        
        int [] test;
        test = new int[5];

        test[0]=19;
        test[1]=89;
        test[2]=64;
        test[3]=12;
        test[4]=13;

        for (int i=0;i<5;i++)
        {
            System.out.println("第"+ (i+1) + "個人分數是" + test[i] + "分");
        } 
        
    }
} 

