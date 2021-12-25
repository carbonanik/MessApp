package com.massage.massenger.util

data class Country constructor(
    val nameCode: String,
    val phoneCode: String,
    val name: String
) {
    companion object {
        private val countryMasterLibraryMap: Map<String, Country> = mapOf(
            "ad" to Country("ad", "376", "Andorra"),
            "ae" to Country("ae", "971", "United Arab Emirates (UAE)"),
            "af" to Country("af", "93", "Afghanistan"),
            "ag" to Country("ag", "1", "Antigua and Barbuda"),
            "ai" to Country("ai", "1", "Anguilla"),
            "al" to Country("al", "355", "Albania"),
            "am" to Country("am", "374", "Armenia"),
            "ao" to Country("ao", "244", "Angola"),
            "aq" to Country("aq", "672", "Antarctica"),
            "ar" to Country("ar", "54", "Argentina"),
            "as" to Country("as", "1", "American Samoa"),
            "at" to Country("at", "43", "Austria"),
            "au" to Country("au", "61", "Australia"),
            "aw" to Country("aw", "297", "Aruba"),
            "ax" to Country("ax", "358", "Åland Islands"),
            "az" to Country("az", "994", "Azerbaijan"),
            "ba" to Country("ba", "387", "Bosnia And Herzegovina"),
            "bb" to Country("bb", "1", "Barbados"),
            "bd" to Country("bd", "880", "Bangladesh"),
            "be" to Country("be", "32", "Belgium"),
            "bf" to Country("bf", "226", "Burkina Faso"),
            "bg" to Country("bg", "359", "Bulgaria"),
            "bh" to Country("bh", "973", "Bahrain"),
            "bi" to Country("bi", "257", "Burundi"),
            "bj" to Country("bj", "229", "Benin"),
            "bl" to Country("bl", "590", "Saint Barthélemy"),
            "bm" to Country("bm", "1", "Bermuda"),
            "bn" to Country("bn", "673", "Brunei Darussalam"),
            "bo" to Country("bo", "591", "Bolivia, Plurinational State Of"),
            "br" to Country("br", "55", "Brazil"),
            "bs" to Country("bs", "1", "Bahamas"),
            "bt" to Country("bt", "975", "Bhutan"),
            "bw" to Country("bw", "267", "Botswana"),
            "by" to Country("by", "375", "Belarus"),
            "bz" to Country("bz", "501", "Belize"),
            "ca" to Country("ca", "1", "Canada"),
            "cc" to Country("cc", "61", "Cocos (keeling) Islands"),
            "cd" to Country("cd", "243", "Congo, The Democratic Republic Of The"),
            "cf" to Country("cf", "236", "Central African Republic"),
            "cg" to Country("cg", "242", "Congo"),
            "ch" to Country("ch", "41", "Switzerland"),
            "ci" to Country("ci", "225", "Côte D'ivoire"),
            "ck" to Country("ck", "682", "Cook Islands"),
            "cl" to Country("cl", "56", "Chile"),
            "cm" to Country("cm", "237", "Cameroon"),
            "cn" to Country("cn", "86", "China"),
            "co" to Country("co", "57", "Colombia"),
            "cr" to Country("cr", "506", "Costa Rica"),
            "cu" to Country("cu", "53", "Cuba"),
            "cv" to Country("cv", "238", "Cape Verde"),
            "cw" to Country("cw", "599", "Curaçao"),
            "cx" to Country("cx", "61", "Christmas Island"),
            "cy" to Country("cy", "357", "Cyprus"),
            "cz" to Country("cz", "420", "Czech Republic"),
            "de" to Country("de", "49", "Germany"),
            "dj" to Country("dj", "253", "Djibouti"),
            "dk" to Country("dk", "45", "Denmark"),
            "dm" to Country("dm", "1", "Dominica"),
            "do" to Country("do", "1", "Dominican Republic"),
            "dz" to Country("dz", "213", "Algeria"),
            "ec" to Country("ec", "593", "Ecuador"),
            "ee" to Country("ee", "372", "Estonia"),
            "eg" to Country("eg", "20", "Egypt"),
            "er" to Country("er", "291", "Eritrea"),
            "es" to Country("es", "34", "Spain"),
            "et" to Country("et", "251", "Ethiopia"),
            "fi" to Country("fi", "358", "Finland"),
            "fj" to Country("fj", "679", "Fiji"),
            "fk" to Country("fk", "500", "Falkland Islands (malvinas)"),
            "fm" to Country("fm", "691", "Micronesia, Federated States Of"),
            "fo" to Country("fo", "298", "Faroe Islands"),
            "fr" to Country("fr", "33", "France"),
            "ga" to Country("ga", "241", "Gabon"),
            "gb" to Country("gb", "44", "United Kingdom"),
            "gd" to Country("gd", "1", "Grenada"),
            "ge" to Country("ge", "995", "Georgia"),
            "gf" to Country("gf", "594", "French Guyana"),
            "gh" to Country("gh", "233", "Ghana"),
            "gi" to Country("gi", "350", "Gibraltar"),
            "gl" to Country("gl", "299", "Greenland"),
            "gm" to Country("gm", "220", "Gambia"),
            "gn" to Country("gn", "224", "Guinea"),
            "gp" to Country("gp", "450", "Guadeloupe"),
            "gq" to Country("gq", "240", "Equatorial Guinea"),
            "gr" to Country("gr", "30", "Greece"),
            "gt" to Country("gt", "502", "Guatemala"),
            "gu" to Country("gu", "1", "Guam"),
            "gw" to Country("gw", "245", "Guinea-bissau"),
            "gy" to Country("gy", "592", "Guyana"),
            "hk" to Country("hk", "852", "Hong Kong"),
            "hn" to Country("hn", "504", "Honduras"),
            "hr" to Country("hr", "385", "Croatia"),
            "ht" to Country("ht", "509", "Haiti"),
            "hu" to Country("hu", "36", "Hungary"),
            "id" to Country("id", "62", "Indonesia"),
            "ie" to Country("ie", "353", "Ireland"),
            "il" to Country("il", "972", "Israel"),
            "im" to Country("im", "44", "Isle Of Man"),
            "is" to Country("is", "354", "Iceland"),
            "in" to Country("in", "91", "India"),
            "io" to Country("io", "246", "British Indian Ocean Territory"),
            "iq" to Country("iq", "964", "Iraq"),
            "ir" to Country("ir", "98", "Iran, Islamic Republic Of"),
            "it" to Country("it", "39", "Italy"),
            "je" to Country("je", "44", "Jersey "),
            "jm" to Country("jm", "1", "Jamaica"),
            "jo" to Country("jo", "962", "Jordan"),
            "jp" to Country("jp", "81", "Japan"),
            "ke" to Country("ke", "254", "Kenya"),
            "kg" to Country("kg", "996", "Kyrgyzstan"),
            "kh" to Country("kh", "855", "Cambodia"),
            "ki" to Country("ki", "686", "Kiribati"),
            "km" to Country("km", "269", "Comoros"),
            "kn" to Country("kn", "1", "Saint Kitts and Nevis"),
            "kp" to Country("kp", "850", "North Korea"),
            "kr" to Country("kr", "82", "South Korea"),
            "kw" to Country("kw", "965", "Kuwait"),
            "ky" to Country("ky", "1", "Cayman Islands"),
            "kz" to Country("kz", "7", "Kazakhstan"),
            "la" to Country("la", "856", "Lao People's Democratic Republic"),
            "lb" to Country("lb", "961", "Lebanon"),
            "lc" to Country("lc", "1", "Saint Lucia"),
            "li" to Country("li", "423", "Liechtenstein"),
            "lk" to Country("lk", "94", "Sri Lanka"),
            "lr" to Country("lr", "231", "Liberia"),
            "ls" to Country("ls", "266", "Lesotho"),
            "lt" to Country("lt", "370", "Lithuania"),
            "lu" to Country("lu", "352", "Luxembourg"),
            "lv" to Country("lv", "371", "Latvia"),
            "ly" to Country("ly", "218", "Libya"),
            "ma" to Country("ma", "212", "Morocco"),
            "mc" to Country("mc", "377", "Monaco"),
            "md" to Country("md", "373", "Moldova, Republic Of"),
            "me" to Country("me", "382", "Montenegro"),
            "mf" to Country("mf", "590", "Saint Martin"),
            "mg" to Country("mg", "261", "Madagascar"),
            "mh" to Country("mh", "692", "Marshall Islands"),
            "mk" to Country("mk", "389", "Macedonia (FYROM)"),
            "ml" to Country("ml", "223", "Mali"),
            "mm" to Country("mm", "95", "Myanmar"),
            "mn" to Country("mn", "976", "Mongolia"),
            "mo" to Country("mo", "853", "Macau"),
            "mp" to Country("mp", "1", "Northern Mariana Islands"),
            "mq" to Country("mq", "596", "Martinique"),
            "mr" to Country("mr", "222", "Mauritania"),
            "ms" to Country("ms", "1", "Montserrat"),
            "mt" to Country("mt", "356", "Malta"),
            "mu" to Country("mu", "230", "Mauritius"),
            "mv" to Country("mv", "960", "Maldives"),
            "mw" to Country("mw", "265", "Malawi"),
            "mx" to Country("mx", "52", "Mexico"),
            "my" to Country("my", "60", "Malaysia"),
            "mz" to Country("mz", "258", "Mozambique"),
            "na" to Country("na", "264", "Namibia"),
            "nc" to Country("nc", "687", "New Caledonia"),
            "ne" to Country("ne", "227", "Niger"),
            "nf" to Country("nf", "672", "Norfolk Islands"),
            "ng" to Country("ng", "234", "Nigeria"),
            "ni" to Country("ni", "505", "Nicaragua"),
            "nl" to Country("nl", "31", "Netherlands"),
            "no" to Country("no", "47", "Norway"),
            "np" to Country("np", "977", "Nepal"),
            "nr" to Country("nr", "674", "Nauru"),
            "nu" to Country("nu", "683", "Niue"),
            "nz" to Country("nz", "64", "New Zealand"),
            "om" to Country("om", "968", "Oman"),
            "pa" to Country("pa", "507", "Panama"),
            "pe" to Country("pe", "51", "Peru"),
            "pf" to Country("pf", "689", "French Polynesia"),
            "pg" to Country("pg", "675", "Papua New Guinea"),
            "ph" to Country("ph", "63", "Philippines"),
            "pk" to Country("pk", "92", "Pakistan"),
            "pl" to Country("pl", "48", "Poland"),
            "pm" to Country("pm", "508", "Saint Pierre And Miquelon"),
            "pn" to Country("pn", "870", "Pitcairn Islands"),
            "pr" to Country("pr", "1", "Puerto Rico"),
            "ps" to Country("ps", "970", "Palestine"),
            "pt" to Country("pt", "351", "Portugal"),
            "pw" to Country("pw", "680", "Palau"),
            "py" to Country("py", "595", "Paraguay"),
            "qa" to Country("qa", "974", "Qatar"),
            "re" to Country("re", "262", "Réunion"),
            "ro" to Country("ro", "40", "Romania"),
            "rs" to Country("rs", "381", "Serbia"),
            "ru" to Country("ru", "7", "Russian Federation"),
            "rw" to Country("rw", "250", "Rwanda"),
            "sa" to Country("sa", "966", "Saudi Arabia"),
            "sb" to Country("sb", "677", "Solomon Islands"),
            "sc" to Country("sc", "248", "Seychelles"),
            "sd" to Country("sd", "249", "Sudan"),
            "se" to Country("se", "46", "Sweden"),
            "sg" to Country("sg", "65", "Singapore"),
            "sh" to Country("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"),
            "si" to Country("si", "386", "Slovenia"),
            "sk" to Country("sk", "421", "Slovakia"),
            "sl" to Country("sl", "232", "Sierra Leone"),
            "sm" to Country("sm", "378", "San Marino"),
            "sn" to Country("sn", "221", "Senegal"),
            "so" to Country("so", "252", "Somalia"),
            "sr" to Country("sr", "597", "Suriname"),
            "ss" to Country("ss", "211", "South Sudan"),
            "st" to Country("st", "239", "Sao Tome And Principe"),
            "sv" to Country("sv", "503", "El Salvador"),
            "sx" to Country("sx", "1", "Sint Maarten"),
            "sy" to Country("sy", "963", "Syrian Arab Republic"),
            "sz" to Country("sz", "268", "Swaziland"),
            "tc" to Country("tc", "1", "Turks and Caicos Islands"),
            "td" to Country("td", "235", "Chad"),
            "tg" to Country("tg", "228", "Togo"),
            "th" to Country("th", "66", "Thailand"),
            "tj" to Country("tj", "992", "Tajikistan"),
            "tk" to Country("tk", "690", "Tokelau"),
            "tl" to Country("tl", "670", "Timor-leste"),
            "tm" to Country("tm", "993", "Turkmenistan"),
            "tn" to Country("tn", "216", "Tunisia"),
            "to" to Country("to", "676", "Tonga"),
            "tr" to Country("tr", "90", "Turkey"),
            "tt" to Country("tt", "1", "Trinidad &amp; Tobago"),
            "tv" to Country("tv", "688", "Tuvalu"),
            "tw" to Country("tw", "886", "Taiwan"),
            "tz" to Country("tz", "255", "Tanzania, United Republic Of"),
            "ua" to Country("ua", "380", "Ukraine"),
            "ug" to Country("ug", "256", "Uganda"),
            "us" to Country("us", "1", "United States"),
            "uy" to Country("uy", "598", "Uruguay"),
            "uz" to Country("uz", "998", "Uzbekistan"),
            "va" to Country("va", "379", "Holy See (vatican City State)"),
            "vc" to Country("vc", "1", "Saint Vincent &amp; The Grenadines"),
            "ve" to Country("ve", "58", "Venezuela, Bolivarian Republic Of"),
            "vg" to Country("vg", "1", "British Virgin Islands"),
            "vi" to Country("vi", "1", "US Virgin Islands"),
            "vn" to Country("vn", "84", "Vietnam"),
            "vu" to Country("vu", "678", "Vanuatu"),
            "wf" to Country("wf", "681", "Wallis And Futuna"),
            "ws" to Country("ws", "685", "Samoa"),
            "xk" to Country("xk", "383", "Kosovo"),
            "ye" to Country("ye", "967", "Yemen"),
            "yt" to Country("yt", "262", "Mayotte"),
            "za" to Country("za", "27", "South Africa"),
            "zm" to Country("zm", "260", "Zambia"),
            "zw" to Country("zw", "263", "Zimbabwe"),
        )
        fun getCountryFromMap(nameCode: String): Country? {
            return countryMasterLibraryMap[nameCode]
        }

        fun getPhoneCode(nameCode: String): String?{
            return countryMasterLibraryMap[nameCode]?.phoneCode
        }
    }
}

private val libraryMasterCountriesEnglish = listOf(
    Country("ad", "376", "Andorra"),
    Country("ae", "971", "United Arab Emirates (UAE)"),
    Country("af", "93", "Afghanistan"),
    Country("ag", "1", "Antigua and Barbuda"),
    Country("ai", "1", "Anguilla"),
    Country("al", "355", "Albania"),
    Country("am", "374", "Armenia"),
    Country("ao", "244", "Angola"),
    Country("aq", "672", "Antarctica"),
    Country("ar", "54", "Argentina"),
    Country("as", "1", "American Samoa"),
    Country("at", "43", "Austria"),
    Country("au", "61", "Australia"),
    Country("aw", "297", "Aruba"),
    Country("ax", "358", "Åland Islands"),
    Country("az", "994", "Azerbaijan"),
    Country("ba", "387", "Bosnia And Herzegovina"),
    Country("bb", "1", "Barbados"),
    Country("bd", "880", "Bangladesh"),
    Country("be", "32", "Belgium"),
    Country("bf", "226", "Burkina Faso"),
    Country("bg", "359", "Bulgaria"),
    Country("bh", "973", "Bahrain"),
    Country("bi", "257", "Burundi"),
    Country("bj", "229", "Benin"),
    Country("bl", "590", "Saint Barthélemy"),
    Country("bm", "1", "Bermuda"),
    Country("bn", "673", "Brunei Darussalam"),
    Country("bo", "591", "Bolivia, Plurinational State Of"),
    Country("br", "55", "Brazil"),
    Country("bs", "1", "Bahamas"),
    Country("bt", "975", "Bhutan"),
    Country("bw", "267", "Botswana"),
    Country("by", "375", "Belarus"),
    Country("bz", "501", "Belize"),
    Country("ca", "1", "Canada"),
    Country("cc", "61", "Cocos (keeling) Islands"),
    Country("cd", "243", "Congo, The Democratic Republic Of The"),
    Country("cf", "236", "Central African Republic"),
    Country("cg", "242", "Congo"),
    Country("ch", "41", "Switzerland"),
    Country("ci", "225", "Côte D'ivoire"),
    Country("ck", "682", "Cook Islands"),
    Country("cl", "56", "Chile"),
    Country("cm", "237", "Cameroon"),
    Country("cn", "86", "China"),
    Country("co", "57", "Colombia"),
    Country("cr", "506", "Costa Rica"),
    Country("cu", "53", "Cuba"),
    Country("cv", "238", "Cape Verde"),
    Country("cw", "599", "Curaçao"),
    Country("cx", "61", "Christmas Island"),
    Country("cy", "357", "Cyprus"),
    Country("cz", "420", "Czech Republic"),
    Country("de", "49", "Germany"),
    Country("dj", "253", "Djibouti"),
    Country("dk", "45", "Denmark"),
    Country("dm", "1", "Dominica"),
    Country("do", "1", "Dominican Republic"),
    Country("dz", "213", "Algeria"),
    Country("ec", "593", "Ecuador"),
    Country("ee", "372", "Estonia"),
    Country("eg", "20", "Egypt"),
    Country("er", "291", "Eritrea"),
    Country("es", "34", "Spain"),
    Country("et", "251", "Ethiopia"),
    Country("fi", "358", "Finland"),
    Country("fj", "679", "Fiji"),
    Country("fk", "500", "Falkland Islands (malvinas)"),
    Country("fm", "691", "Micronesia, Federated States Of"),
    Country("fo", "298", "Faroe Islands"),
    Country("fr", "33", "France"),
    Country("ga", "241", "Gabon"),
    Country("gb", "44", "United Kingdom"),
    Country("gd", "1", "Grenada"),
    Country("ge", "995", "Georgia"),
    Country("gf", "594", "French Guyana"),
    Country("gh", "233", "Ghana"),
    Country("gi", "350", "Gibraltar"),
    Country("gl", "299", "Greenland"),
    Country("gm", "220", "Gambia"),
    Country("gn", "224", "Guinea"),
    Country("gp", "450", "Guadeloupe"),
    Country("gq", "240", "Equatorial Guinea"),
    Country("gr", "30", "Greece"),
    Country("gt", "502", "Guatemala"),
    Country("gu", "1", "Guam"),
    Country("gw", "245", "Guinea-bissau"),
    Country("gy", "592", "Guyana"),
    Country("hk", "852", "Hong Kong"),
    Country("hn", "504", "Honduras"),
    Country("hr", "385", "Croatia"),
    Country("ht", "509", "Haiti"),
    Country("hu", "36", "Hungary"),
    Country("id", "62", "Indonesia"),
    Country("ie", "353", "Ireland"),
    Country("il", "972", "Israel"),
    Country("im", "44", "Isle Of Man"),
    Country("is", "354", "Iceland"),
    Country("in", "91", "India"),
    Country("io", "246", "British Indian Ocean Territory"),
    Country("iq", "964", "Iraq"),
    Country("ir", "98", "Iran, Islamic Republic Of"),
    Country("it", "39", "Italy"),
    Country("je", "44", "Jersey "),
    Country("jm", "1", "Jamaica"),
    Country("jo", "962", "Jordan"),
    Country("jp", "81", "Japan"),
    Country("ke", "254", "Kenya"),
    Country("kg", "996", "Kyrgyzstan"),
    Country("kh", "855", "Cambodia"),
    Country("ki", "686", "Kiribati"),
    Country("km", "269", "Comoros"),
    Country("kn", "1", "Saint Kitts and Nevis"),
    Country("kp", "850", "North Korea"),
    Country("kr", "82", "South Korea"),
    Country("kw", "965", "Kuwait"),
    Country("ky", "1", "Cayman Islands"),
    Country("kz", "7", "Kazakhstan"),
    Country("la", "856", "Lao People's Democratic Republic"),
    Country("lb", "961", "Lebanon"),
    Country("lc", "1", "Saint Lucia"),
    Country("li", "423", "Liechtenstein"),
    Country("lk", "94", "Sri Lanka"),
    Country("lr", "231", "Liberia"),
    Country("ls", "266", "Lesotho"),
    Country("lt", "370", "Lithuania"),
    Country("lu", "352", "Luxembourg"),
    Country("lv", "371", "Latvia"),
    Country("ly", "218", "Libya"),
    Country("ma", "212", "Morocco"),
    Country("mc", "377", "Monaco"),
    Country("md", "373", "Moldova, Republic Of"),
    Country("me", "382", "Montenegro"),
    Country("mf", "590", "Saint Martin"),
    Country("mg", "261", "Madagascar"),
    Country("mh", "692", "Marshall Islands"),
    Country("mk", "389", "Macedonia (FYROM)"),
    Country("ml", "223", "Mali"),
    Country("mm", "95", "Myanmar"),
    Country("mn", "976", "Mongolia"),
    Country("mo", "853", "Macau"),
    Country("mp", "1", "Northern Mariana Islands"),
    Country("mq", "596", "Martinique"),
    Country("mr", "222", "Mauritania"),
    Country("ms", "1", "Montserrat"),
    Country("mt", "356", "Malta"),
    Country("mu", "230", "Mauritius"),
    Country("mv", "960", "Maldives"),
    Country("mw", "265", "Malawi"),
    Country("mx", "52", "Mexico"),
    Country("my", "60", "Malaysia"),
    Country("mz", "258", "Mozambique"),
    Country("na", "264", "Namibia"),
    Country("nc", "687", "New Caledonia"),
    Country("ne", "227", "Niger"),
    Country("nf", "672", "Norfolk Islands"),
    Country("ng", "234", "Nigeria"),
    Country("ni", "505", "Nicaragua"),
    Country("nl", "31", "Netherlands"),
    Country("no", "47", "Norway"),
    Country("np", "977", "Nepal"),
    Country("nr", "674", "Nauru"),
    Country("nu", "683", "Niue"),
    Country("nz", "64", "New Zealand"),
    Country("om", "968", "Oman"),
    Country("pa", "507", "Panama"),
    Country("pe", "51", "Peru"),
    Country("pf", "689", "French Polynesia"),
    Country("pg", "675", "Papua New Guinea"),
    Country("ph", "63", "Philippines"),
    Country("pk", "92", "Pakistan"),
    Country("pl", "48", "Poland"),
    Country("pm", "508", "Saint Pierre And Miquelon"),
    Country("pn", "870", "Pitcairn Islands"),
    Country("pr", "1", "Puerto Rico"),
    Country("ps", "970", "Palestine"),
    Country("pt", "351", "Portugal"),
    Country("pw", "680", "Palau"),
    Country("py", "595", "Paraguay"),
    Country("qa", "974", "Qatar"),
    Country("re", "262", "Réunion"),
    Country("ro", "40", "Romania"),
    Country("rs", "381", "Serbia"),
    Country("ru", "7", "Russian Federation"),
    Country("rw", "250", "Rwanda"),
    Country("sa", "966", "Saudi Arabia"),
    Country("sb", "677", "Solomon Islands"),
    Country("sc", "248", "Seychelles"),
    Country("sd", "249", "Sudan"),
    Country("se", "46", "Sweden"),
    Country("sg", "65", "Singapore"),
    Country("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"),
    Country("si", "386", "Slovenia"),
    Country("sk", "421", "Slovakia"),
    Country("sl", "232", "Sierra Leone"),
    Country("sm", "378", "San Marino"),
    Country("sn", "221", "Senegal"),
    Country("so", "252", "Somalia"),
    Country("sr", "597", "Suriname"),
    Country("ss", "211", "South Sudan"),
    Country("st", "239", "Sao Tome And Principe"),
    Country("sv", "503", "El Salvador"),
    Country("sx", "1", "Sint Maarten"),
    Country("sy", "963", "Syrian Arab Republic"),
    Country("sz", "268", "Swaziland"),
    Country("tc", "1", "Turks and Caicos Islands"),
    Country("td", "235", "Chad"),
    Country("tg", "228", "Togo"),
    Country("th", "66", "Thailand"),
    Country("tj", "992", "Tajikistan"),
    Country("tk", "690", "Tokelau"),
    Country("tl", "670", "Timor-leste"),
    Country("tm", "993", "Turkmenistan"),
    Country("tn", "216", "Tunisia"),
    Country("to", "676", "Tonga"),
    Country("tr", "90", "Turkey"),
    Country("tt", "1", "Trinidad &amp; Tobago"),
    Country("tv", "688", "Tuvalu"),
    Country("tw", "886", "Taiwan"),
    Country("tz", "255", "Tanzania, United Republic Of"),
    Country("ua", "380", "Ukraine"),
    Country("ug", "256", "Uganda"),
    Country("us", "1", "United States"),
    Country("uy", "598", "Uruguay"),
    Country("uz", "998", "Uzbekistan"),
    Country("va", "379", "Holy See (vatican City State)"),
    Country("vc", "1", "Saint Vincent &amp; The Grenadines"),
    Country("ve", "58", "Venezuela, Bolivarian Republic Of"),
    Country("vg", "1", "British Virgin Islands"),
    Country("vi", "1", "US Virgin Islands"),
    Country("vn", "84", "Vietnam"),
    Country("vu", "678", "Vanuatu"),
    Country("wf", "681", "Wallis And Futuna"),
    Country("ws", "685", "Samoa"),
    Country("xk", "383", "Kosovo"),
    Country("ye", "967", "Yemen"),
    Country("yt", "262", "Mayotte"),
    Country("za", "27", "South Africa"),
    Country("zm", "260", "Zambia"),
    Country("zw", "263", "Zimbabwe"),
)

fun Country.getFlagEmoji(): String {
    return when (nameCode) {
        "ad" -> "🇦🇩"
        "ae" -> "🇦🇪"
        "af" -> "🇦🇫"
        "ag" -> "🇦🇬"
        "ai" -> "🇦🇮"
        "al" -> "🇦🇱"
        "am" -> "🇦🇲"
        "ao" -> "🇦🇴"
        "aq" -> "🇦🇶"
        "ar" -> "🇦🇷"
        "as" -> "🇦🇸"
        "at" -> "🇦🇹"
        "au" -> "🇦🇺"
        "aw" -> "🇦🇼"
        "ax" -> "🇦🇽"
        "az" -> "🇦🇿"
        "ba" -> "🇧🇦"
        "bb" -> "🇧🇧"
        "bd" -> "🇧🇩"
        "be" -> "🇧🇪"
        "bf" -> "🇧🇫"
        "bg" -> "🇧🇬"
        "bh" -> "🇧🇭"
        "bi" -> "🇧🇮"
        "bj" -> "🇧🇯"
        "bl" -> "🇧🇱"
        "bm" -> "🇧🇲"
        "bn" -> "🇧🇳"
        "bo" -> "🇧🇴"
        "bq" -> "🇧🇶"
        "br" -> "🇧🇷"
        "bs" -> "🇧🇸"
        "bt" -> "🇧🇹"
        "bv" -> "🇧🇻"
        "bw" -> "🇧🇼"
        "by" -> "🇧🇾"
        "bz" -> "🇧🇿"
        "ca" -> "🇨🇦"
        "cc" -> "🇨🇨"
        "cd" -> "🇨🇩"
        "cf" -> "🇨🇫"
        "cg" -> "🇨🇬"
        "ch" -> "🇨🇭"
        "ci" -> "🇨🇮"
        "ck" -> "🇨🇰"
        "cl" -> "🇨🇱"
        "cm" -> "🇨🇲"
        "cn" -> "🇨🇳"
        "co" -> "🇨🇴"
        "cr" -> "🇨🇷"
        "cu" -> "🇨🇺"
        "cv" -> "🇨🇻"
        "cw" -> "🇨🇼"
        "cx" -> "🇨🇽"
        "cy" -> "🇨🇾"
        "cz" -> "🇨🇿"
        "de" -> "🇩🇪"
        "dj" -> "🇩🇯"
        "dk" -> "🇩🇰"
        "dm" -> "🇩🇲"
        "do" -> "🇩🇴"
        "dz" -> "🇩🇿"
        "ec" -> "🇪🇨"
        "ee" -> "🇪🇪"
        "eg" -> "🇪🇬"
        "eh" -> "🇪🇭"
        "er" -> "🇪🇷"
        "es" -> "🇪🇸"
        "et" -> "🇪🇹"
        "fi" -> "🇫🇮"
        "fj" -> "🇫🇯"
        "fk" -> "🇫🇰"
        "fm" -> "🇫🇲"
        "fo" -> "🇫🇴"
        "fr" -> "🇫🇷"
        "ga" -> "🇬🇦"
        "gb" -> "🇬🇧"
        "gd" -> "🇬🇩"
        "ge" -> "🇬🇪"
        "gf" -> "🇬🇫"
        "gg" -> "🇬🇬"
        "gh" -> "🇬🇭"
        "gi" -> "🇬🇮"
        "gl" -> "🇬🇱"
        "gm" -> "🇬🇲"
        "gn" -> "🇬🇳"
        "gp" -> "🇬🇵"
        "gq" -> "🇬🇶"
        "gr" -> "🇬🇷"
        "gs" -> "🇬🇸"
        "gt" -> "🇬🇹"
        "gu" -> "🇬🇺"
        "gw" -> "🇬🇼"
        "gy" -> "🇬🇾"
        "hk" -> "🇭🇰"
        "hm" -> "🇭🇲"
        "hn" -> "🇭🇳"
        "hr" -> "🇭🇷"
        "ht" -> "🇭🇹"
        "hu" -> "🇭🇺"
        "id" -> "🇮🇩"
        "ie" -> "🇮🇪"
        "il" -> "🇮🇱"
        "im" -> "🇮🇲"
        "in" -> "🇮🇳"
        "io" -> "🇮🇴"
        "iq" -> "🇮🇶"
        "ir" -> "🇮🇷"
        "is" -> "🇮🇸"
        "it" -> "🇮🇹"
        "je" -> "🇯🇪"
        "jm" -> "🇯🇲"
        "jo" -> "🇯🇴"
        "jp" -> "🇯🇵"
        "ke" -> "🇰🇪"
        "kg" -> "🇰🇬"
        "kh" -> "🇰🇭"
        "ki" -> "🇰🇮"
        "km" -> "🇰🇲"
        "kn" -> "🇰🇳"
        "kp" -> "🇰🇵"
        "kr" -> "🇰🇷"
        "kw" -> "🇰🇼"
        "ky" -> "🇰🇾"
        "kz" -> "🇰🇿"
        "la" -> "🇱🇦"
        "lb" -> "🇱🇧"
        "lc" -> "🇱🇨"
        "li" -> "🇱🇮"
        "lk" -> "🇱🇰"
        "lr" -> "🇱🇷"
        "ls" -> "🇱🇸"
        "lt" -> "🇱🇹"
        "lu" -> "🇱🇺"
        "lv" -> "🇱🇻"
        "ly" -> "🇱🇾"
        "ma" -> "🇲🇦"
        "mc" -> "🇲🇨"
        "md" -> "🇲🇩"
        "me" -> "🇲🇪"
        "mf" -> "🇲🇫"
        "mg" -> "🇲🇬"
        "mh" -> "🇲🇭"
        "mk" -> "🇲🇰"
        "ml" -> "🇲🇱"
        "mm" -> "🇲🇲"
        "mn" -> "🇲🇳"
        "mo" -> "🇲🇴"
        "mp" -> "🇲🇵"
        "mq" -> "🇲🇶"
        "mr" -> "🇲🇷"
        "ms" -> "🇲🇸"
        "mt" -> "🇲🇹"
        "mu" -> "🇲🇺"
        "mv" -> "🇲🇻"
        "mw" -> "🇲🇼"
        "mx" -> "🇲🇽"
        "my" -> "🇲🇾"
        "mz" -> "🇲🇿"
        "na" -> "🇳🇦"
        "nc" -> "🇳🇨"
        "ne" -> "🇳🇪"
        "nf" -> "🇳🇫"
        "ng" -> "🇳🇬"
        "ni" -> "🇳🇮"
        "nl" -> "🇳🇱"
        "no" -> "🇳🇴"
        "np" -> "🇳🇵"
        "nr" -> "🇳🇷"
        "nu" -> "🇳🇺"
        "nz" -> "🇳🇿"
        "om" -> "🇴🇲"
        "pa" -> "🇵🇦"
        "pe" -> "🇵🇪"
        "pf" -> "🇵🇫"
        "pg" -> "🇵🇬"
        "ph" -> "🇵🇭"
        "pk" -> "🇵🇰"
        "pl" -> "🇵🇱"
        "pm" -> "🇵🇲"
        "pn" -> "🇵🇳"
        "pr" -> "🇵🇷"
        "ps" -> "🇵🇸"
        "pt" -> "🇵🇹"
        "pw" -> "🇵🇼"
        "py" -> "🇵🇾"
        "qa" -> "🇶🇦"
        "re" -> "🇷🇪"
        "ro" -> "🇷🇴"
        "rs" -> "🇷🇸"
        "ru" -> "🇷🇺"
        "rw" -> "🇷🇼"
        "sa" -> "🇸🇦"
        "sb" -> "🇸🇧"
        "sc" -> "🇸🇨"
        "sd" -> "🇸🇩"
        "se" -> "🇸🇪"
        "sg" -> "🇸🇬"
        "sh" -> "🇸🇭"
        "si" -> "🇸🇮"
        "sj" -> "🇸🇯"
        "sk" -> "🇸🇰"
        "sl" -> "🇸🇱"
        "sm" -> "🇸🇲"
        "sn" -> "🇸🇳"
        "so" -> "🇸🇴"
        "sr" -> "🇸🇷"
        "ss" -> "🇸🇸"
        "st" -> "🇸🇹"
        "sv" -> "🇸🇻"
        "sx" -> "🇸🇽"
        "sy" -> "🇸🇾"
        "sz" -> "🇸🇿"
        "tc" -> "🇹🇨"
        "td" -> "🇹🇩"
        "tf" -> "🇹🇫"
        "tg" -> "🇹🇬"
        "th" -> "🇹🇭"
        "tj" -> "🇹🇯"
        "tk" -> "🇹🇰"
        "tl" -> "🇹🇱"
        "tm" -> "🇹🇲"
        "tn" -> "🇹🇳"
        "to" -> "🇹🇴"
        "tr" -> "🇹🇷"
        "tt" -> "🇹🇹"
        "tv" -> "🇹🇻"
        "tw" -> "🇹🇼"
        "tz" -> "🇹🇿"
        "ua" -> "🇺🇦"
        "ug" -> "🇺🇬"
        "um" -> "🇺🇲"
        "us" -> "🇺🇸"
        "uy" -> "🇺🇾"
        "uz" -> "🇺🇿"
        "va" -> "🇻🇦"
        "vc" -> "🇻🇨"
        "ve" -> "🇻🇪"
        "vg" -> "🇻🇬"
        "vi" -> "🇻🇮"
        "vn" -> "🇻🇳"
        "vu" -> "🇻🇺"
        "wf" -> "🇼🇫"
        "ws" -> "🇼🇸"
        "xk" -> "🇽🇰"
        "ye" -> "🇾🇪"
        "yt" -> "🇾🇹"
        "za" -> "🇿🇦"
        "zm" -> "🇿🇲"
        "zw" -> "🇿🇼"
        else -> " "
    }
}
