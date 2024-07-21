public class DiceOpposite {
    public static void main(String[] args) {
        
        int [] faces= {1,2,3,4,5,6};

        System.out.println(findOpposite(faces,4));

    }

    public static int findOpposite(int []faces,int n ){


        return faces[(faces.length-1)-(n-1)];


    }
}
