import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws Exception {
                                                                   // пишем сканер для ввода данных
        System.out.println("Введите выражение и нажмите Enter");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
//
        boolean isRim = false;
        if (str.contains("I")) {
            isRim = true;
        } else if (str.contains("II")) {
            isRim = true;
        } else if (str.contains("III")) {
            isRim = true;
        } else if (str.contains("IV")) {
            isRim = true;
        } else if (str.contains("V")) {
            isRim = true;
        } else if (str.contains("VI")) {
            isRim = true;
        } else if (str.contains("VII")) {

                isRim = true;
        } else if (str.contains("VIII")) {
            isRim = true;
        } else if (str.contains("IX")) {
            isRim = true;
        } else if (str.contains("X")) {
            isRim = true;
        } else {
            String data[] = new String[4];
            for (int i = 0; i < data.length; i++) {
                data[i] = "data" + i;
            }
                                                            //проверяем количество операндов
            boolean length = false;
            if (data.length >4) {
                length = true;

                throw new Exception("Больше двух операндов");}


                                                                         //проверяем знак
            String action = null;
            if (str.contains("+")) {
                data = str.split("\\+");
                action = "+";
            } else if (str.contains("-")) {
                data = str.split("-");
                action = "-";
            } else if (str.contains("*")) {
                data = str.split("\\*");
                action = "*";
            } else if (str.contains("/")) {
                data = str.split("/");
                action = "/";

            } else if (str.contains("")) {

                throw new Exception("Недопустимый символ");
            }


                                                             // проверяем что числа не больше 10
            boolean numb = false;
            if (Integer.parseInt(data[0]) > 10) {
                numb = true;
                throw new Exception("Операнд больше 10");}


            if (Integer.parseInt(data[1]) > 10) {
                numb = true;
                throw new Exception("Операнд больше 10");}
            if (Integer.parseInt(data[0]) == 0) {
                numb = true;
                throw new Exception("Операнд  должен быть больше 0");}
            if (Integer.parseInt(data[1]) == 0) {
                numb = true;
                throw new Exception("Операнд должен быть больше 0");}





            //производим операции
            if (action.equals("+")) {
                System.out.println("Ответ");
                System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));

            } else if (action.equals("-")) {
                System.out.println("Ответ");
                System.out.println(Integer.parseInt(data[0]) - Integer.parseInt(data[1]));
            } else if (action.equals("*")) {
                System.out.println("Ответ");
                System.out.println(Integer.parseInt(data[0]) * Integer.parseInt(data[1]));
            } else if (action.equals("/")) {
                System.out.println("Ответ");
                System.out.println(Integer.parseInt(data[0]) / Integer.parseInt(data[1]));
            }
            return;
        }
                                                      //проверка на арабские и римские цифры

        if (isRim = true) {
            boolean isRim2 = true;

            if (str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5")
                    || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9")
                    || str.contains("10")) {

                throw new Exception("Операнды должны быть либо римскими либо арабскими");
            } else {
                String[] rim = {	"0","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                        "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                        "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV",
                        "LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII",
                        "LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C",};

                                                           //проверяем знак
                String action = null;
                if (str.contains("+")) {
                    rim = str.split("\\+");
                    action = "+";

                } else if (str.contains("-")) {
                    rim = str.split("-");
                    action = "-";
                } else if (str.contains("*")) {
                    rim = str.split("\\*");
                    action = "*";
                } else if (str.contains("/")) {
                    rim = str.split("/");
                    action = "/";

                } else if (str.contains("")) {
                    throw new Exception("Недопустимый символ");

                }


                int num1;
                int num2;

                String result2;
                num1 = Romon.converter(rim[0]);
                num2 = Romon.converter(rim[1]);
                                                        //проверяем что числа не больше 10
                if (num1>10 || num2>10){
                    throw new Exception("Число больше X");
                }
                if (num1<1 ){
                    throw new Exception("Римские числа могут быть только положительными");

                }

                if (action.equals("+")) {
                    System.out.println("Ответ");
                    int result = num1+num2;
                    result2 = Romon.converter2(result);
                    System.out.println(result2);
                } else if (action.equals("-")) {
                    System.out.println("Ответ");
                    int result = num1-num2;

                                     //проверка на положительный ответ
                    if (result<1){
                        throw new Exception("Римские числа могут быть только положительными");

                    }
                    result2 = Romon.converter2(result);
                    System.out.println(result2);


                } else if (action.equals("*")) {
                    System.out.println("Ответ");
                    int result = num1*num2;
                    result2 = Romon.converter2(result);
                    System.out.println(result2);
                } else if (action.equals("/")) {
                    System.out.println("Ответ");
                    int result = num1/num2;
                    result2 = Romon.converter2(result);
                    System.out.println(result2);
                    if (result<1){
                        throw new Exception("Римские числа могут быть только положительными");

                    }

                }




            }
        }

    }
}
class Romon {

    static String[] rim = new String[]{	"0","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV",
            "LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII",
            "LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C",};


    public static int converter(String romon) {
        for (int i = 0; i < rim.length; i++) {
            if (romon.equals(rim[i])) {
                return i;
            }
        }
        return -1;

    }
    public static String converter2(int result){

        return rim[result];

    }
}
