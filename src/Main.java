public class Main {
    public static String function (int a ) {
        // string do ktorego dodajemy jesli liczba dzieli sie przez dana liczbe
        String ile = "";
        // w ten sposob ograniczamy liczbe ifow i nie musimy badac kazdego przypadku z osobna

        // zadanie 1
        if ( a % 3 == 0 ) ile += "trzy";
        if ( a % 5 == 0 ) ile += "piec";

        // zadanie 2
        if ( a % 7 == 0 ) ile += "siedem";

        // zadanie 3
        if ( a % 11 == 0 ) ile += "jedenascie";
        if ( a % 13 == 0 ) ile += "trzynascie";

        // zadanie 4
        if ( a % 15 == 0 ) ile += "pietnascie";
        if ( a % 21 == 0 ) ile += "dwadziesciajeden";

        // zwracanie otrzymanego napisu
        return ile;
        // jesli podana liczba nie dzieli sie przez zadna z powyzszych liczb zwracamy pusty string
    }

    public static void main(String[] args) {
        // podane przyklady
        System.out.print( function(15015) + "\n");
        System.out.print( function(1155) + "\n");
        System.out.print( function( 585 ) + "\n");
        System.out.print( function( 3465 ) + "\n");

    }
}