package com.iyzipay.google.cloud.vision;

public enum HttpMethod {
    GET,
    POST,
    DELETE,
    PUT;

    public static boolean isValidRequestFor(HttpMethod httpMethod) {
        return POST.equals(httpMethod) || PUT.equals(httpMethod) || DELETE.equals(httpMethod);
    }
}