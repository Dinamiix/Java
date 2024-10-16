package GenericSwapMethodStrings;

class Box <T> {
    private T element;

    public Box ( T element) {
        this.element = element;
    }

    @Override
    public String toString () {

        return element.getClass ().getName () + ": "  + this.element;
    }
}
