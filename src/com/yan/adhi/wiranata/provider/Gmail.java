package com.yan.adhi.wiranata.provider;

import com.yan.adhi.wiranata.Modification;
import com.yan.adhi.wiranata.iProvider;

import java.util.Arrays;
import java.util.List;

public class Gmail implements iProvider {

    private List<Modification> modifications = Arrays.asList(
            Modification.LOWERCASE,
            Modification.REMOVE_DOTS,
            Modification.REMOVE_PLUS_PART
    );

    public static final List<String> domains = Arrays.asList(
            "gmail.com",
            "google.com",
            "googlemail.com"
    );

    public List<Modification> getModifications() {
        return modifications;
    }
}
