public  class Sample20 {
    public static void main(String[] args) throws Exception {
        
        int [] test = {19,89,64,12,13};

        for (int i=0;i<test.length;i++)
        {
            System.out.println("第"+ (i+1) + "個人分數是" + test[i] + "分");
        } 
        System.out.println("考試人數為" + test.length + "人");
        
    }
} 

