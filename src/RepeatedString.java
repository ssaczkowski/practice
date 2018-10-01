




public class RepeatedString {

    static long repeatedString(String s, long n) {

        long count_of_a = 0;
        int index_s = 0;

        for (long i = 0 ; i < n ; i++){
            System.out.println( "A : "+ count_of_a + " indexS:" + index_s +" I:"+i );

            if(index_s == 3){//verifico si index_s llego al largo de s --> reinicio el index_s
                index_s = 0;
            }
            if(s.charAt(index_s) == 'a'){
                count_of_a++;  //chequeo si es una a --> sumo 1 al contador
            }

            index_s++;
        }

        return count_of_a;

    }

    public static void main(String[] args)  {

        String s = "aba";

        long n = Long.parseLong("1000000000000");

        long result = repeatedString(s, n);

       System.out.println(result);
    }

}
