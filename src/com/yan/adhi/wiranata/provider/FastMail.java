package com.yan.adhi.wiranata.provider;

import com.yan.adhi.wiranata.Modification;
import com.yan.adhi.wiranata.iProvider;

import java.util.Arrays;
import java.util.List;

public class FastMail implements iProvider {
//    https://www.fastmail.com/help/receive/addressing.html
    private List<Modification> modifications = Arrays.asList(
            Modification.LOWERCASE,
            Modification.REMOVE_PLUS_PART
    );

    public static final List<String> domains = Arrays.asList(
            "fastmail.com",
            "fastmail.fm"
    );

    public List<Modification> getModifications() {
        return modifications;
    }
}

