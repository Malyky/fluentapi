package org.example;

public class WordBuilder implements Start, End, Intermediate1, Intermediate2, Intermediate3 {

    private String word;

    final StringBuilder sb = new StringBuilder();

    public static WordBuilder create() {
        return new WordBuilder();
    }

    @Override
    public void end() {
        System.out.println(sb.toString());
    }

    @Override
    public End optionalWord() {
        sb.append("Optional World ");
        return this;
    }

    @Override
    public End wordChoiceA() {
        sb.append("word A ");
        return this;
    }

    @Override
    public End wordChoiceB() {
        sb.append("word B ");
        return this;
    }

    @Override
    public End singleWord() {
        sb.append("SingleWorld ");
        return this;
    }

    @Override
    public End parameterisedWord(String parameter) {
        sb.append(parameter );
        return this;
    }

    @Override
    public Intermediate1 word1() {
        sb.append("word 1 ");
        return this;
    }

    @Override
    public Intermediate2 word2() {
        sb.append("word 2");
        return this;
    }

    @Override
    public Intermediate3 word3() {
        sb.append("word 3 ");
        return this;
    }
}
