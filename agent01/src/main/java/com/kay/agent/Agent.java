package com.kay.agent;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String agentArgs, Instrumentation instrumentation){
        instrumentation.addTransformer(new MonitorTransformer());
    }
}
