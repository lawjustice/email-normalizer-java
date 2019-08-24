package com.yan.adhi.wiranata.provider;

import com.yan.adhi.wiranata.Modification;
import com.yan.adhi.wiranata.iProvider;

import java.util.Arrays;
import java.util.List;

public class Microsoft implements iProvider {

    private List<Modification> modifications = Arrays.asList(
            Modification.LOWERCASE,
            Modification.REMOVE_PLUS_PART
    );

    public static final List<String> domains = Arrays.asList(
            "hotmail.com",
            "hotmail.com.tw",
            "hotmail.ca",
            "hotmail.ch",
            "hotmail.co",
            "hotmail.co.id",
            "hotmail.co.jp",
            "hotmail.co.kr",
            "hotmail.co.th",
            "hotmail.co.uk",
            "hotmail.co.za",
            "hotmail.com",
            "hotmail.com.au",
            "hotmail.com.hk",
            "hotmail.com.my",
            "hotmail.de",
            "hotmail.dk",
            "hotmail.es",
            "hotmail.fi",
            "hotmail.fr",
            "hotmail.gr",
            "hotmail.it",
            "hotmail.my",
            "hotmail.nl",
            "hotmail.ph",
            "hotmail.se",
            "hotmail.sg",
            "live.ca",
            "live.cn",
            "live.co",
            "live.co.kr",
            "live.co.uk",
            "live.co.za",
            "live.com",
            "live.com.au",
            "live.com.my",
            "live.com.ph",
            "live.com.sg",
            "live.de",
            "live.dk",
            "live.fr",
            "live.hk",
            "live.ie",
            "live.in",
            "live.it",
            "live.jp",
            "live.nl",
            "live.no",
            "live.ru",
            "live.se",
            "livemail.tw",
            "msn.com",
            "msn.cn",
            "outlook.be",
            "outlook.co",
            "outlook.co.id",
            "outlook.co.th",
            "outlook.com",
            "outlook.com.au",
            "outlook.com.vn",
            "outlook.de",
            "outlook.dk",
            "outlook.fr",
            "outlook.jp",
            "outlook.kr",
            "outlook.my",
            "outlook.ph",
            "outlook.sg",
            "plasa.com"
    );

    public List<Modification> getModifications() {
        return modifications;
    }
}

