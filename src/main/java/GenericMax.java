public class GenericMax {

    //uc1
    public Integer MaximumIntiger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maxInt = firstValue;
        if (secondValue.compareTo(maxInt) > 0)
            maxInt = secondValue;
        if (thirdValue.compareTo(maxInt) > 0)
            maxInt = thirdValue;
        return maxInt;
    }

    public Float MaximumFloat(Float firstValue, Float secondValue, Float thirdValue) {
        Float maxFloat = firstValue;
        if (secondValue.compareTo(maxFloat) > 0)
            maxFloat = secondValue;
        if (thirdValue.compareTo(maxFloat) > 0)
            maxFloat = thirdValue;
        return maxFloat;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to program");
    }
}
