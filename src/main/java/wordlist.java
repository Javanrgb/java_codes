
public class wordlist {//class definition
    public static void main(String[] args) {
        String wordlist1[] = {"Hello","Boy","24/7","Encyclopaedia","man"};//Creating a list of words
        String wordlist2 [] = {"came","talked","sang"};
        String wordlist3[] = {"here","now","quickly","loudly"};
        
        //determining length of each wordlist
        int onelength= wordlist1.length; 
        int twolength= wordlist2.length;//
        int threelength= wordlist3.length;
        
        

        //creating a set of random words from our created lists
        int rand1 =  (int) (Math.random()*onelength);
        int rand2 =  (int) (Math.random()*onelength);
        int rand3 =  (int) (Math.random()*onelength);

        String phrase = wordlist1[rand1] +" " +wordlist2[rand2] +" "+wordlist3[rand3];//creating a phrase out of the random words in each list
        System.out.println("Sample statement " +phrase);// printing to the standard output a sample output of a phrase

    }
}
