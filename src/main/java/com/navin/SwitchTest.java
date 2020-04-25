package com.navin;

import java.io.FileNotFoundException;
import java.io.UncheckedIOException;

public class SwitchTest {

    public static void main(String... args) {

        System.out.println(ternaryBoolean(TerniaryBool.TRUE));

        TerniaryBool status = TerniaryBool.TRUE;

        System.out.println(
        switch(status) {
            case TRUE -> true;
            case FALSE -> false;
            case FILE_NOT_FOUND ->
                throw new UncheckedIOException(new FileNotFoundException("File does not exist"));
            default ->
                throw new IllegalStateException(status + " Unknown argument supplied");


        }
        );


        System.out.println(
                switch(status) {
                    case TRUE : yield  true;
                    case FALSE : yield false;
                    case FILE_NOT_FOUND :
                            throw new UncheckedIOException(new FileNotFoundException("File does not exist"));
                    default :
                            throw new IllegalStateException(status + " Unknown argument supplied");


                }
        );
    }

    public static boolean ternaryBoolean(TerniaryBool status) {

        boolean result;;
        switch(status) {
            case TRUE :
                result = true;
                break;
            case FALSE :
                result = false;
                break;
            case FILE_NOT_FOUND :
                throw new UncheckedIOException(new FileNotFoundException("File does not exist"));
            default :
                throw new IllegalStateException(status + " Unknown argument supplied");

        }
        return result;
    }

    private enum TerniaryBool {
        TRUE,
        FALSE,
        FILE_NOT_FOUND
    }
}
