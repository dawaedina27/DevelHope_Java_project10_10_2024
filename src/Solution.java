public class Solution {
    public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }

        public static void main(String[] args){
            Solution solution = new Solution();


            String address1 = "1.1.1.1";

            System.out.println(solution.defangIPaddr(address1));

            String address2 = "255.100.50.0";
            System.out.println(solution.defangIPaddr(address2));

        }
};
