package File.io;

import java.io.*;
import java.util.Scanner;

public class operate_File {
    public static void operateFile(){
        Scanner sc = new Scanner(System.in);
        File file;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        FileInputStream fis= null;

        System.out.println("Nhap du lieu cho file Text.txt:");
        String text = sc.nextLine();
        try {
            file = new File("D:\\text.txt");
            if(!file.exists()) file.createNewFile();

            fos = new FileOutputStream(file);
            byte[] bytesArray = text.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");

//            Scanner readFile = new Scanner(file);
//            while (readFile.hasNext()){
//                String read = readFile.next();
//                System.out.println(read);

            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
            while( fis.available() > 0 ){
                System.out.print((char)fis.read());
            }
        }
        catch (IOException ioe){
            System.out.println("Exception Occurred:");
            ioe.printStackTrace();
        }
        finally {
            try {
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        operateFile();
    }
}
