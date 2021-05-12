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

    public Double maxPositionDouble(Double firstDoublePosition, Double secondDoublePosition, Double thirdDoublePosition) {
        Double maxDouble = firstDoublePosition;
        if (secondDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = secondDoublePosition;
        if (thirdDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = thirdDoublePosition;
        return maxDouble;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to program");
    }
}
