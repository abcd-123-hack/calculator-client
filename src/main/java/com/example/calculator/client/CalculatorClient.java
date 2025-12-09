package com.example.calculator.client;

public class CalculatorClient {
    public static void main(String[] args) {
        // These classes are generated from your WSDL
        OperatorServiceService service = new OperatorServiceService();
        OperatorService port = service.getOperatorServicePort();

        int a = 10, b = 5;
        System.out.println("add: " + port.add(a, b));
        System.out.println("sub: " + port.sub(a, b));
        System.out.println("mul: " + port.mul(a, b));
        System.out.println("div: " + port.div(a, b));
    }
}
