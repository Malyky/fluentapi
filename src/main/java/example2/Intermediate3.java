package example2;

// Intermediate interface returning itself on word3(), in order to allow
// for repetitions. Repetitions can be ended any time because this
// interface extends End
public interface Intermediate3 extends End {
    Intermediate3 word3();
}
