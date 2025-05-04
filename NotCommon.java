public class NotCommon {
    public static void main(String[] args) {
        String a="aacbd";
        String b="gafd";

        StringBuilder sb=new StringBuilder();

        for(char c:a.toCharArray()) {
            if(!b.contains(c+"")) {
            sb.append(c);
            }
        }


        for(char c:b.toCharArray()) {
            if(!a.contains(c+"")) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
