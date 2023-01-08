package example2;

// Initial interface, entry point of the DSL
// Depending on your DSL's nature, this can also be a class with static
// methods which can be static imported making your DSL even more fluent
public interface Start {
    End singleWord();

    End parameterisedWord(String parameter);

    Intermediate1 word1();

    Intermediate2 word2();

    Intermediate3 word3();

    static Start staticStart() {
        return new WordBuilder();
    }
}
