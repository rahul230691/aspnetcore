// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.aspnet.signalr;

import java.util.Arrays;
import java.util.List;

class InvocationHandler {
    private List<Class<?>> classes;
    private ActionBase action;

    InvocationHandler(ActionBase action, Class<?>... classes) {
        this.action = action;
        this.classes = Arrays.asList(classes);
    }

    public List<Class<?>> getClasses() {
        return classes;
    }

    public ActionBase getAction() {
        return action;
    }
}