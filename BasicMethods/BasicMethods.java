public class BasicMethods {
    public static void main(){
        int x;
        x = 2;
        int y = 3;
        int z = 10000000;
        int nicole = 12;
        int kiet = 2;

        System.out.println (x+y); 
        System.out.println (add(x,y,z));
        System.out.println (substract(z,x));
        System.out.println (multiply(nicole,x));
        System.out.println (divide(nicole,kiet));
    }

    private static int add(int i, int j, int k){ // inside the () is the type of data this method expects as inputs  
        return i+j+k;
    }

    private static int substract(int a, int b){ 
        return a-b;
    }

    private static int multiply(int q, int p){
        return q*p;
    }

    private static int divide(int u, int y){
        return u/y;
    }
}

/* declaring varibles */