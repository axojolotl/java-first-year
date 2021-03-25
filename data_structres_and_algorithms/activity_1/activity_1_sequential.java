package activity_1;
//0,1,1,2,3,5,8,13

class activity_1{
    public static void main(String[] args) {
        int ctr1 = 0, ctr2 = 1, ctr3 = 0;

        System.out.println(ctr1);
        System.out.println(ctr2);
        System.out.println(ctr1+ctr2);
        ctr1 = ctr2; //1
        System.out.println(ctr1+ctr2);
        ctr2++; //2
        System.out.println(ctr1+ctr2);
        ctr1 = ctr2; //2
        ctr2++; //3
        System.out.println(ctr1 + ctr2); 
        //==========================
        ctr3 = ctr2 + ctr1; //5
        ctr1 = ctr2; //3
        System.out.println(ctr3+ctr1);
        ctr2 = ctr3; //5
        ctr3 = ctr3 + ctr1; //8
        System.out.println(ctr3 + ctr2);
        ctr1 = ctr3; // 8
        ctr3 = ctr3 + ctr2; // 13
        System.out.println(ctr3 + ctr1);
        ctr2 = ctr3; //13
        ctr3 = ctr3 + ctr1; //21
        System.out.println(ctr3 + ctr2);
        ctr1 = ctr3; // 21
        ctr3 = ctr3 + ctr2; // 34
        System.out.println(ctr3 + ctr1);
        //===========================
        ctr2 = ctr3; //34
        ctr3 = ctr3 + ctr1; //55
        System.out.println(ctr3 + ctr2);
        ctr1 = ctr3; // 55  
        ctr3 = ctr3 + ctr2; // 144
        System.out.println(ctr3 + ctr1);
        ctr2 = ctr3; //144
        ctr3 = ctr3 + ctr1; //233
        System.out.println(ctr3 + ctr2);
        ctr1 = ctr3; // 233
        ctr3 = ctr3 + ctr2; // 377
        System.out.println(ctr3 + ctr1);
        //===========================
    }
}