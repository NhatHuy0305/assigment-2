package com.example.calculator;

public class ImplementDivide {
    public Double calculate(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case DIVIDE:
                if (arg2 != 0) {
                    return arg1 / arg2;
                } else {
                    System.out.println("Lỗi: chia cho 0");
                    return null; // hoặc return 0d;
                }
            default:
                break;
        }
        return 0d;
    }
}
