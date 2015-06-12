package com.github.yongjhih;

import rx.schedulers.*;
import rx.Observable;
import rx.functions.*;
import rx.observables.*;
import rx.internal.operators.*;
import rx.subjects.*;
import java.util.concurrent.*;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Observable.range(1, 10).forEach(System.out::println);
    }
}
