public class MyJavaClass {

    public static void main(String[] args) {
        int area = FromkotlinKt.area(4,5);
        System.out.print("printing area inside Java class returning from Kotlin file: "+area);
    }


    public static void add(int a,int b){
        int result = a + b;
        System.out.println("printing inside Java class :"+result);
    }
    public static final void printMessage( String message) {

        String var1 = message;
        System.out.println(var1);
    }
    public static int area(int l, int b){
        int result = l * b;
        return result;
    }


}
