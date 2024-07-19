import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b");
        String input = scn.nextLine();
        if (input.charAt(0)!='"'){
            throw new Exception("Первый символ должна быть  в кавычках");
        }


        String result = calculator(input);
        if (result.length()>40){
            result=result.substring(0,40)+ "...";
        }
        System.out.println("\""+result+"\"");



    }
public static String calculator(String raschet) throws Exception{
        String data[] = new String[3];

        if (raschet.contains("+")){
            data=raschet.split("\\+");
            if (data[1].charAt(0)!='"'){
                throw new Exception("Второй символ должен быть  в кавычках");}
            data[0]=data[0].replace("\"","");
            data[1]= data[1].replace("\"","");
            String result = (data[0])+(data[1]);
            if(data[0].length()>10 || data[1].length()>10){
             throw new Exception("Строка больше 10");
            }
            return result;
        } else if (raschet.contains("-")) {
            data=raschet.split("-");
            if (data[1].charAt(0)!='"'){
                throw new Exception("Второй символ должен быть  в кавычках");}
            data[0]=data[0].replace("\"","");
            data[1]= data[1].replace("\"","");
            String result = data[0].replace(data[1],"");
            if(data[0].length()>10 || data[1].length()>10){
                throw new Exception("Строка больше 10");
            }
            return result;}
        else if (raschet.contains("*")) {
            data=raschet.split("\\*");
            data[0]=data[0].replace("\"","");
            data[1]= data[1].replace("\"","");
            String result = data[0].repeat(Integer.parseInt(data[1]));
            if(data[0].length()>10 || data[1].length()>10){
                throw new Exception("Строка больше 10");
            }
            if(Integer.parseInt(data[1])<1 || Integer.parseInt(data[1]) >10){
                throw new Exception("Число должно быть от 1 до 10");
            }
            return result;
        } else if (raschet.contains("/")) {
            data = raschet.split("/");
            data[0]=data[0].replace("\"","");
            data[1]= data[1].replace("\"","");
            int num = Integer.parseInt(data[1]);
            int length = data[0].length()/num;
            String result = data[0].substring(0,length);
            if(data[0].length()>10 || data[1].length()>10){
                throw new Exception("Строка больше 10");
            }
            if(Integer.parseInt(data[1])<1 || Integer.parseInt(data[1]) >10){
                throw new Exception("Число должно быть от 1 до 10");
            }
            return result;

        } else throw new Exception("Не верный формат");




}
}
