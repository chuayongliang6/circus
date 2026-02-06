package Circus.Batch;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override // overriding method
    public String toString() {
        return "I'm a parrot";
    }
}
