package Test01;

public class Calculator2{
    public double plus(int data1, int data2){
        double result = 0.0;
        result = data1 + data2;
        return result;
    }
    public double minus(int data1, int data2){
        double result = 0.0;
        result = data1 - data2;
        return result;
    }
    public double multiplication(int data1, int data2){
        double result = 0.0;
        result = data1 * data2;
        return result;
    }
//    public double devide(int data1, int data2){
//        double result = 0.0;
//        try{
//            result = data1 / data2;
//        }catch(ArithmeticException e){
//            System.out.println("Exception 이 발생 하였습니다. 다시 입력해 주세요");
//        }
//        return result;
//    }
    public double devide(int data1, int data2)throws ArithmeticException{
        double result = 0.0;
        result = data1 / data2;
        
        return result;
    }
}

