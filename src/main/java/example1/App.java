package example1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WordBuilder.create().singleWord().end();

        WordBuilder.create().parameterisedWord("My Word should appear here").end();
        WordBuilder.create().word1().end();
        WordBuilder.create().word1().optionalWord().end();
        WordBuilder.create().word2().wordChoiceA().end();
        WordBuilder.create().word2().wordChoiceB().end();
        WordBuilder.create().word3().word3().word3().end();


    }
}
