package com.javafordev.lesson4.task1;

import static com.javafordev.lesson4.task1.AirlineService.removeNullElementsFromAirlines;

public class Validator {

    public static String validateInputParameterForString(String parameterName, String parameterValue) {

        if (parameterName.equals("destination") && parameterValue.equals("")) {
            System.out.println("Для параметра destination задано пустое значение.");
            return " ";
        } else {
            return parameterValue;
        }
    }

    public static int validateStringParameterForNumber(String parameterName, int parameterValue) {

        switch (parameterName) {
            case "numberOfFlight":
                if (parameterValue <= 0) {
                    System.out.println("Для параметра numberOfFlight задано отрицательное или нулевое значение. "
                            + "Допустимые значения - целые положительные числа");
                }
                break;
            case "departureTimeInHours":
                if (parameterValue < 0 || parameterValue > 23) {
                    System.out.println("Для параметра departureTimeInHours задано недопустимое значение. "
                            + "Допустимые значения - целые положительные числа от 0 до 23");
                }
                break;
            case "departureTimeInMinutes":
                if (parameterValue < 0 || parameterValue > 59) {
                    System.out.println("Для параметра departureTimeInMinutes задано недопустимое значение. "
                            + "Допустимые значения - целые положительные числа от 0 до 59");
                }
                break;
            default:
                System.out.println("Задано некорректное имя входного параметра!");
        }
        return parameterValue;
    }


    public static Airline[] validateInputParameterForArray(Airline[] arrayName) {
        for (Airline element : arrayName) {
            if (element == null) {
                System.out.println("Входнои массив содержит null элементы!");
                return null; // проверить что является дефолтным значение для массива
            }
        }
        return arrayName;
    }
}

