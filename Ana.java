public class Ana {
    public static void main(String[] args) {
        String s1="bcadeh";
        String s2="hea";
        char [] sh1=s1.toCharArray();
        char [] sh2=s2.toCharArray();
        StringBuilder sb=new StringBuilder(10);
        for(int i=0;i<s1.length();i++) {
            boolean found=false;
            for (int j=0;j<s2.length();j++) {
                if(s1.charAt(i)==s2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
