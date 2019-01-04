
/* 
Конвертируем время


*/

public class Solution {
    
    public static int convertToSeconds(int hour){
        return  hour * 3600;
    }
    
    //напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
       System.out.println(convertToSeconds(25));
        System.out.println(convertToSeconds(12));
    }
}
