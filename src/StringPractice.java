public class StringPractice {

    public static void main(String[] args){
        String s1 = "java";
        String s2 = "java";
        String newS1 = s1.concat("world");
        String s3 = new String("java");

        System.out.println(s1==s2);
        System.out.println(s1 == s3);
        System.out.println(newS1);
    }
}
