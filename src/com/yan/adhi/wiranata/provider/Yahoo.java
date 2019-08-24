package com.yan.adhi.wiranata.provider;

import com.yan.adhi.wiranata.Modification;
import com.yan.adhi.wiranata.iProvider;

import java.util.Arrays;
import java.util.List;

public class Yahoo implements iProvider {
//    Use hyphens - http://www.cnet.com/forums/discussions/did-yahoo-break-disposable-email-addresses-mail-plus-395088/
    private final List<Modification> modifications = Arrays.asList(
            Modification.LOWERCASE,
            Modification.REMOVE_HYPEN_PART
    );

    public static final List<String> domains = Arrays.asList(
            "yahoo.com.ar",
            "yahoo.com.au",
            "yahoo.at",
            "yahoo.be/fr",
            "yahoo.be/nl",
            "yahoo.com.br",
            "ca.yahoo.com",
            "qc.yahoo.com",
            "yahoo.com.co",
            "yahoo.com.hr",
            "yahoo.cz",
            "yahoo.dk",
            "yahoo.fi",
            "yahoo.fr",
            "yahoo.de",
            "yahoo.gr",
            "yahoo.com.hk",
            "yahoo.hu",
            "yahoo.co.in/yahoo.in",
            "yahoo.co.id",
            "yahoo.ie",
            "yahoo.co.il",
            "yahoo.it",
            "yahoo.co.jp",
            "yahoo.com.my",
            "yahoo.com.mx",
            "yahoo.ae",
            "yahoo.nl",
            "yahoo.co.nz",
            "yahoo.no",
            "yahoo.com.ph",
            "yahoo.pl",
            "yahoo.pt",
            "yahoo.ro",
            "yahoo.ru",
            "yahoo.com.sg",
            "yahoo.co.za",
            "yahoo.es",
            "yahoo.se",
            "yahoo.ch/fr",
            "yahoo.ch/de",
            "yahoo.com.tw",
            "yahoo.co.th",
            "yahoo.com.tr",
            "yahoo.co.uk",
            "yahoo.com",
            "yahoo.com.vn",
            "yahoo.ca",
            "yahoo.cn",
            "yahoo.co",
            "yahoo.co.in",
            "yahoo.co.kr",
            "yahoo.com",
            "yahoo.com.cn",
            "yahoo.in",
            "yahoogroups.com",
            "ymail.com",
            "y7mail.com",
            "rocketmail.com"
    );

    public List<Modification> getModifications() {
        return modifications;
    }
}
