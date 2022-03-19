package concurrent_modification;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {
    public static void main ( String[] args) {
        ArrayList<Integer> Numberlist = new ArrayList<Integer> () ;
        Numberlist.add ( 1) ;
        Numberlist.add ( 2) ;
        Numberlist.add ( 3) ;
        Numberlist.add ( 4) ;
        Numberlist.add ( 5) ;
        Iterator<Integer> it = Numberlist.iterator () ;
        while ( it.hasNext () ) {
            Integer numbervalue = it.next () ;
            System.out.println ( "List Value:" + numbervalue) ;
            if ( numbervalue .equals ( 3) )
                Numberlist.remove ( numbervalue) ;
        }
    }
}
