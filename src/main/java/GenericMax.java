public class GenericMax {

    //uc1
    public Integer MaximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maxInt = firstValue;
        if (secondValue.compareTo(maxInt) > 0)
            maxInt = secondValue;
        if (thirdValue.compareTo(maxInt) > 0)
            maxInt = thirdValue;
        return maxInt;
    }
    //uc2
    public Double maxPositionDouble(Double firstDoublePosition, Double secondDoublePosition, Double thirdDoublePosition) {
        Double maxDouble = firstDoublePosition;
        if (secondDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = secondDoublePosition;
        if (thirdDoublePosition.compareTo(maxDouble) > 0)
            maxDouble = thirdDoublePosition;
        return maxDouble;
    }

    //uc3
    //String
    public String maxPositionString(String firstStringPosition, String secondStringPosition, String thirdStringPosition) {
        String maxString = firstStringPosition;
        if (secondStringPosition.compareTo(maxString) > 0)
            maxString = secondStringPosition;
        if (thirdStringPosition.compareTo(maxString) > 0)
            maxString = thirdStringPosition;
        return maxString;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to program");
    }
}
