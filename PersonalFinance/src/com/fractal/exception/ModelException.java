package com.fractal.exception;

import com.fractal.settings.Text;

public class ModelException extends Exception{

    public static final int TITLE_EMPTY = 1;
    public static final int DOES_EXIST = 2;
    public static final int DATE_FORMAT = 3;
    public static final int CODE_EMPTY = 4;
    public static final int CURRENCY_EMPTY = 5;
    public static final int ARTICLE_EMPTY = 6;
    public static final int ACCOUNT_EMPTY = 7;
    public static final int RATE_INCORRECT = 8;
    public static final int AMOUNT_FORMAT = 9;
    public static final int NO_BASE_CURRENCY = 10;

    private final int code;

    public ModelException(int code) {
        this.code = code;
    }

    public String getMessage() {
        switch (code) {
            case TITLE_EMPTY:
                return Text.get("TITLE_EMPTY_ERROR");
            case DOES_EXIST:
                return Text.get("ERROR_TITLE_EMPTY");
            case DATE_FORMAT:
                return Text.get("DATE_FORMAT_ERROR");
            case CODE_EMPTY:
                return Text.get("CODE_EMPTY_ERROR");
            case CURRENCY_EMPTY:
                return Text.get("CURRENCY_EMPTY_ERROR");
            case ARTICLE_EMPTY:
                return Text.get("ARTICLE_EMPTY_ERROR");
            case ACCOUNT_EMPTY:
                return Text.get("ACCOUNT_EMPTY_ERROR");
            case RATE_INCORRECT:
                return Text.get("RATE_INCORRECT_ERROR");
            case AMOUNT_FORMAT:
                return Text.get("AMOUNT_FORMAT_ERROR");
            case NO_BASE_CURRENCY:
                return Text.get("NO_BASE_CURRENCY_ERROR");
        }
        return "";
    }
}
