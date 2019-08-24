package com.yan.adhi.wiranata;

import com.yan.adhi.wiranata.provider.*;

public class ProviderFactory {
    public static iProvider getProvider(String domain) {
        if (!domain.isEmpty()) {
            if (Gmail.domains.contains(domain)) {
                return new Gmail();
            } else if (Yahoo.domains.contains(domain)) {
                return new Yahoo();
            } else if (FastMail.domains.contains(domain)) {
                return new FastMail();
            } else if (GoogleApps.domains.contains(domain)) {
                return new GoogleApps();
            } else if (Microsoft.domains.contains(domain)) {
                return new Microsoft();
            }
        }
        return new Generic();
    }
}
