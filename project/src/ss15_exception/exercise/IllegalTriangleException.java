package ss15_exception.exercise;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }
    public IllegalTriangleException() {
    }

    public void check(int a, int b, int c) throws IllegalTriangleException {
        if (a == 0 || b == 0 || c == 0){
            throw new IllegalTriangleException("do dai cua canh khong duoc be hon hoac bang 0");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("tong 2 canh phai lon hon canh con lai");
        }
        System.out.println("a,b,c la do dai cua 3 canh tam giac");
    }
}