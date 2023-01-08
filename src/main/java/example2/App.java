package example2;


import static example2.Start.staticStart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        staticStart().singleWord().end();

        staticStart().parameterisedWord("My Word should appear here").end();
        staticStart().word1().end();
        staticStart().word1().optionalWord().end();
        staticStart().word2().wordChoiceA().end();
        staticStart().word2().wordChoiceB().end();
        staticStart().word3().word3().word3().end();
    }
}
