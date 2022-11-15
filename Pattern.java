class Pattern{
    public static void main(String[] args){
        int i = 5;
        while(i>=1)  //row
        {
            int j = 1;
            while(j<=i)  //column
            {
                System.out.print(i);
                j = j + 1;
            }
            System.out.println();
            i = i - 1;
        }
    }
}