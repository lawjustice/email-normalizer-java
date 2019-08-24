package com.yan.adhi.wiranata.provider;

import com.yan.adhi.wiranata.Modification;
import com.yan.adhi.wiranata.iProvider;

import java.util.Arrays;
import java.util.List;

public class Generic implements iProvider {

    private List<Modification> modifications = Arrays.asList();

    public static final List<String> domains = Arrays.asList();

    public List<Modification> getModifications() {
        return modifications;
    }
}
