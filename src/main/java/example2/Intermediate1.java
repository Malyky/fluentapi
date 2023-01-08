package example2;

// Intermediate DSL "step" extending the interface that is returned
// by optionalWord(), to make that method "optional"
public interface Intermediate1 extends End {
    End optionalWord();
}
