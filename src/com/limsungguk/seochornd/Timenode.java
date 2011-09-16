package com.limsungguk.seochornd;

import java.io.Serializable;

class Timenode implements Serializable {
    private static final long serialVersionUID = 8511656164616538989L;

    public String id;

    public String label;

    public String domain;

    public String incomingUsernameTemplate;

    public String outgoingUsernameTemplate;

    public String note;
}