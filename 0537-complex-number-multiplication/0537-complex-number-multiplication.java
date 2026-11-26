class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] nums1 = num1.split("\\+");
        String[] nums2 = num2.split("\\+");

        StringBuilder output = new StringBuilder();

        int a = Integer.parseInt(nums1[0]);
        int b = Integer.parseInt(nums1[1].replace("i", ""));
        int c = Integer.parseInt(nums2[0]);
        int d = Integer.parseInt(nums2[1].replace("i", ""));

        int e = a * c;
        int f = b * d;
        int g = (a * d) + (b * c);
        int h = e - f;

        output.append(h);
        output.append("+");
        output.append(g);
        output.append("i");

        return output.toString();
    }
}