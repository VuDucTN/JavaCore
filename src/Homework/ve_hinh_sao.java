package Homework;

public class ve_hinh_sao {
    public static void main(String[] args) {
        //Vẽ hình chữ nhật đầy
        for (int i = 1; i<=4; i++){
            for (int j=1; j<=4;j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ hình chữ nhật rỗng
        for (int i = 1; i<=4; i++){
            for (int j=1; j<=4;j++){
                if(i== 1 || j == 1 || i == 4 || j == 4)
                    System.out.print("*"+"\t");
                else System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác đầy
        for (int i = 1; i<=4; i++){
            for (int j=1; j<=i;j++){
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác rỗng
        for (int i = 1; i<=4; i++){
            for (int j=1; j<=i;j++){
                if(i == 3 && j==2)
                    System.out.print(""+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác trên đầy
        for (int i = 1; i<=4; i++){
            for (int j=i; j<=4;j++){
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác trên rỗng
        for (int i = 1; i<=4; i++){
            for (int j=i; j<=4;j++){
                if (i==2 && j==3)
                    System.out.print(" "+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 4; i >=1; i--){
            for (int j = 1; j <=4;j++){
                if (i==1 || j==4 ||i<=j)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải rỗng
        for (int i = 4; i >=1; i--){
            for (int j = 1; j <=4;j++){
                if (i==1 || j==4 ||i==j)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 7;j++){
                if (i == 4 || j == 4 || i==2 && j == 3 || i ==2 && j==5 || i==3 && j == 2 || i == 3 && j==3 || i == 3 && j==5 || i == 3 && j==6)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 7;j++){
                if (i == 4 || i==1 && j==4 || i==2 && j==3 || i == 2 && j==5 || i ==3 && j==2 || i == 3 && j == 6)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 4;j++){
                if (i==4||i<=4 && j==1 || i >=4 && j==4 || i==j || i==3 && j==2 || i==5 && j==2 || i==5 && j==3 || i==6 && j==3)
                    System.out.print("*"+"\t");
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 4;j++){
                if (i<=4 && j==1 || i >=4 && j==4 || i==j || i==5 && j==2 || i==6 && j==3)
                    System.out.print("*"+"\t");
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 7;j++){
                if (i==4||i<=4 && j==1 || i>=4 && j==7|| i==j || i==3 &&j==2 || i==5 && j==6)
                    System.out.print("*"+"\t");
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }

        System.out.println("=============================================");
        System.out.println("");
        //Vẽ tam giác phải đầy
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 7;j++){
                if (i==4||i<=4 && j==1 || i>=4 && j==7|| i==j)
                    System.out.print("*"+"\t");
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
    }
}
