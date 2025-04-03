package StringD;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");

        sb.append('Y');
        sb.append('A');
        sb.append('S');
        sb.append('H');

        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
