package Homework;

public class Tach_so_trong_chuoi {
    public static void main(String[] args) {
        String str = "English = 78 Science = 83 Math = 68 History = 65";
        String [] strings = str.split(" ");
        int sum = 0;
        int count =0;
        for (String pt: strings){
            try{
                int num = Integer.parseInt(pt);
                sum += num;
                count ++;
            }catch (NumberFormatException e){

            }
        }
        double tbc = (double) sum/count;
        System.out.println(tbc);
    }
}
