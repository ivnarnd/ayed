package ayed.tp1.ejercicio9;
public class StackTest {
    public static void main(String []args){
        String exp = "[{}Ivan}]";
        System.out.println("La expresion "+exp+" esta balanceada? "+validar(exp));
    }
    //[{(T)}]
    private static boolean validar(String expresion){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<expresion.length();i++){
            char car = expresion.charAt(i);
            char wanted =' ';
            if((car == '(') || (car == '[') || (car == '{')){
                stack.push(car);
            }else if((car == ')') || (car == ']') || (car == '}')){
                switch (car) {
                    case '}':{
                        wanted = '{';
                        break;
                    }
                    case ']':{
                        wanted='[';
                        break;
                    }
                    case ')':{
                        wanted = '(';
                        break;
                    }
                    default:{
                        break;
                    }
                }
                if(stack.isEmpty() || (stack.pop()!= wanted)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
