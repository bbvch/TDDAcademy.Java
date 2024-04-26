package tddacademy;

public class FooImpl implements Foo {

    private final Bar bar;

    public FooImpl(Bar bar) {

        this.bar = bar;
    }

    @Override
    public String say() {
        return "foo" + this.bar.say();
    }
}
