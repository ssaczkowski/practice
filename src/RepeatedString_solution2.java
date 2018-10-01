import java.util.HashMap;

public class RepeatedString_solution2 {

        /*
        *

            Solucion 3 !!

            recorro una sola vez el string y guardo en un mapa cantidad de repeticiones totales por letra. ---> en la ultima posicion (ahora llamada totalAparicionesDelString) tengo la cantidad total de repeticiones (map con orden)
            1 -> 1
            2 -> 1
            3 -> 2

            realizo cuenta:

            N / s.length = X // # veces que entra el string en  N se separa en parte entera y resto.


            Xentero * totalAparicionesDelString = totalDeAparicionesARetornarSinResto

            Xresto  / s.lenght = P posicion para ver en mapa

             total = totalDeAparicionesARetornarSinResto + mapa(posicion P)

            return total

            Implementacion:

            Uso HashMap


        *
        *
        *
        *
        * */

        static long repeatedString(String s, long n) {

            long total_repeated = 0;

            int repeated_in_s = 0;

            final HashMap<Integer,Integer> repeatedMap =  new HashMap<Integer, Integer>(s.length());



            //loop in s
            for (int i = 0 ; i < s.length() ; i++){

                System.out.println(i + "-"+ s.charAt(i) );
                if (s.charAt(i) == 'a') {
                    repeated_in_s++;
                }
                repeatedMap.put(i, repeated_in_s);
            }


            long  X = n / s.length() ; // # veces que entra el string en  N se separa en parte entera y resto.

            total_repeated = X * repeated_in_s ; // Parte entera
            int position_map = (int) (n % s.length()); //Parte resto

            long rest_repeated = repeatedMap.get(position_map);


            return total_repeated + rest_repeated;
        }

        public static void main(String[] args)  {

            String s = "a";

            long n = Long.parseLong("1000000000000");//1000000000000

            long result = repeatedString(s, n);

            System.out.println(result);

        }



}
