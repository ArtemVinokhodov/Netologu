package com.company.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
