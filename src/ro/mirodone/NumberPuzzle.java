package ro.mirodone;

 class NumberPuzzle {

    void numbers (){

        for ( int a=1; a< 46; a++ ) {

            for ( int b=1; b < 46; b++ ) {

                for ( int c=1; c< 46; c++ ) {

                    for ( int d=1; d< 46; d++ ) {

                        int sum = a + b + c + d;
                        int aMod = a + 2;
                        int bMod = b -2;
                        int cMod = c * 2;
                        int dMod = d / 2;

                        if ( sum == 45 && aMod == bMod && bMod == cMod && cMod == dMod ) {
                            System.out.println( a + ", " + b + ", " + c + ", " + d );
                        }
                    }
                }
            }
        }
    }

}
