public class DisplayLongestName {
    public static void main(String[] args) {
        int n = 4;
        String names[] = { "Apple", "Mango", "Orange", "Banana" };

        String longestName="";

        for(int i =0;i<n;i++){

            if(longestName.length()<names[i].length() && longestName.length()!=names[i].length()){
                longestName=names[i];
            }

        }

        System.out.println(longestName);
        
    }
}
