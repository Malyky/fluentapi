package org.example;

import static org.example.WordBuilder.create;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        create().singleWord().end();

        create().parameterisedWord("My Word should appear here").end();
        create().word1().end();
        create().word1().optionalWord().end();
        create().word2().wordChoiceA().end();
        create().word2().wordChoiceB().end();
        create().word3().word3().word3().end();


    }
}
