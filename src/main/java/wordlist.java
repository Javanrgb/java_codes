//import math.*;
public class wordlist {
    public static void main(String[] args) {
        String wordlist1[] = {"Hello","Boy","24/7","Encyclopaedia","man"};
        String wordlist2 [] = {"came","talked","sang"};
        String wordlist3[] = {"here","now","quickly","loudly"};
        int onelength= wordlist1.length; //determining length of each wordlist
        int twolength= wordlist2.length;
        int threelength= wordlist3.length;

        int rand1 =  (int) (Math.random()*onelength);
        int rand2 =  (int) (Math.random()*onelength);
        int rand3 =  (int) (Math.random()*onelength);

        String phrase = wordlist1[rand1] +" " +wordlist2[rand2] +" "+wordlist3[rand3];
        System.out.println("Sample statement " +phrase);

    }
}
